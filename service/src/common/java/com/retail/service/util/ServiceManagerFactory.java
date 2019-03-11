package com.retail.service.util;

import android.support.annotation.NonNull;

import java.util.List;


/**
 * 服务管理工厂类
 *
 */

@SuppressWarnings("unused")
public final class ServiceManagerFactory implements IServiceManager {

    private static final ServiceManagerFactory INSTANCE = new ServiceManagerFactory();

    private final IServiceManager mServiceManagerDelegate;

    public static ServiceManagerFactory getInstance() {
        return INSTANCE;
    }

    private ServiceManagerFactory() {
        mServiceManagerDelegate = ClassUtil.newInstance(ServiceManagerImpl.class);
        init();
    }

    public void init() {}

    @Override
    public <T> T get(@NonNull Class<T> cls) {
        return mServiceManagerDelegate.get(cls);
    }

    @Override
    public <T> List<T> getAll(@NonNull Class<T> cls) {
        return mServiceManagerDelegate.getAll(cls);
    }

    @Override
    public <T, E extends T> IServiceManager put(@NonNull Class<T> cls, @NonNull Class<E> implClass) {
        mServiceManagerDelegate.put(cls, implClass);
        return this;
    }

    @Override
    public <T, E extends T> boolean replace(@NonNull Class<T> cls, @NonNull Class<E> implClass) {
        return mServiceManagerDelegate.replace(cls, implClass);
    }

    @Override
    public <T> boolean contains(@NonNull Class<T> cls) {
        return mServiceManagerDelegate.contains(cls);
    }

    @Override
    public <T> void remove(@NonNull Class<T> cls) {
        mServiceManagerDelegate.remove(cls);
    }

    @Override
    public void clear() {
        mServiceManagerDelegate.clear();
    }
}
