package com.retail.service.util;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * 服务管理
 *
 */
@SuppressWarnings("unused")
public interface IServiceManager {

    /**
     * 获取服务的实现类
     */
    <T> T get(@NonNull Class<T> cls);

    <T> List<T> getAll(@NonNull Class<T> cls);

    /**
     * 添加服务的实现类
     *
     * @param cls 接口Class对象
     * @param implClass 实现类Class对象
     */
    <T, E extends T> IServiceManager put(@NonNull Class<T> cls, @NonNull Class<E> implClass);

    /**
     * 替换服务的实现类
     *
     * @param cls 接口Class对象
     * @param implClass 实现类Class对象
     */
    <T, E extends T> boolean replace(@NonNull Class<T> cls, @NonNull Class<E> implClass);

    /**
     * 是否包含某个服务的实现类
     *
     * @param cls 接口Class对象
     */
    <T> boolean contains(@NonNull Class<T> cls);

    /**
     * 移除服务的实现类
     *
     * @param cls 接口Class对象
     */
    <T> void remove(@NonNull Class<T> cls);

    /**
     * 清理资源
     */
    void clear();
}
