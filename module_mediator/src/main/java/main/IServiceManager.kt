package main

/**
 * 服务管理
 *
 */
interface IServiceManager {

    /**
     * 获取服务的实现类
     */
    operator fun <T> get(cls: Class<T>): T?

    fun <T> getAll(cls: Class<T>): List<T>

    /**
     * 添加服务的实现类
     *
     * @param cls 接口Class对象
     * @param implClass 实现类Class对象
     */
    fun <T, E : T> put(cls: Class<T>, implClass: Class<E>): IServiceManager

    /**
     * 替换服务的实现类
     *
     * @param cls 接口Class对象
     * @param implClass 实现类Class对象
     */
    fun <T, E : T> replace(cls: Class<T>, implClass: Class<E>): Boolean

    /**
     * 是否包含某个服务的实现类
     *
     * @param cls 接口Class对象
     */
    operator fun <T> contains(cls: Class<T>): Boolean

    /**
     * 移除服务的实现类
     *
     * @param cls 接口Class对象
     */
    fun <T> remove(cls: Class<T>)

    /**
     * 清理资源
     */
    fun clear()
}
