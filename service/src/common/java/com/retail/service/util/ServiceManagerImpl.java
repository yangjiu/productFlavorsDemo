package com.retail.service.util;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务管理实现类
 *
 */
@SuppressWarnings("unused")
public final class ServiceManagerImpl implements IServiceManager, IService {

    private final Map<String, Class<?>> mServiceClassMap = new HashMap<>();
    private final Map<String, Object> mServiceInstanceMap = new HashMap<>();

    @Override
    @SuppressWarnings("unchecked")
    public <T> T get(@NonNull Class<T> cls) {
        final String className = cls.getName();
        if (mServiceInstanceMap.containsKey(className)) {
            return (T) mServiceInstanceMap.get(className);
        }
        Class<?> _class = mServiceClassMap.get(className);
        if (null == _class) {
            return null;
        }
        Object obj = ClassUtil.newInstance(_class);
        // add lifecycle ？
//        if (obj instanceof LifecycleObserver) {
//            if (AppUtil.getLastLifecycleOwner() != null) {
//                AppUtil.getLastLifecycleOwner().getLifecycle().addObserver((LifecycleObserver) obj);
//            }
//        }
        mServiceInstanceMap.put(className, obj);
        return (T) obj;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> List<T> getAll(@NonNull Class<T> cls) {
        List<T> list = new ArrayList<>();
        for (Map.Entry<String, Object> entry : mServiceInstanceMap.entrySet()) {
            if (cls.isAssignableFrom(entry.getValue().getClass())) {
                list.add((T) entry.getValue());
            }
        }
        return list;
    }

    @Override
    public <T, E extends T> IServiceManager put(@NonNull Class<T> cls, @NonNull Class<E> implClass) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("ServiceManager put方法的key必须是接口，而不应该是：" + cls);
        }
        mServiceClassMap.put(cls.getName(), implClass);
        return this;
    }

    @Override
    public <T, E extends T> boolean replace(@NonNull Class<T> cls, @NonNull Class<E> implClass) {
        if (contains(cls)) {
            remove(cls);
            put(cls, implClass);
            return true;
        }
        return false;
    }

    @Override
    public <T> boolean contains(@NonNull Class<T> cls) {
        return mServiceClassMap.containsKey(cls.getName());
    }

    @Override
    public <T> void remove(@NonNull Class<T> cls) {
        mServiceInstanceMap.remove(cls.getName());
        mServiceClassMap.remove(cls.getName());
    }

    @Override
    public void clear() {
        mServiceInstanceMap.clear();
        mServiceClassMap.clear();
    }

    @Override
    public String getName() {
        return getClass().getName();
    }
}
