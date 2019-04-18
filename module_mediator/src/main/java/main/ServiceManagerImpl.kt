package main

import java.util.ArrayList
import java.util.HashMap

/**
 * 服务管理实现类
 */
@Suppress("UNCHECKED_CAST")
class ServiceManagerImpl : IServiceManager, IService {

    private val mServiceClassMap = HashMap<String, Class<*>>()
    private val mServiceInstanceMap = HashMap<String, Any>()

    override val name: String
        get() = javaClass.name


    override fun <T> get(cls: Class<T>): T? {
        val className = cls.name
        if (mServiceInstanceMap.containsKey(className)) {
            return mServiceInstanceMap[className] as T?
        }
        val cla = mServiceClassMap[className] ?: return null
        val obj = ClassUtil.newInstance(cla)
        mServiceInstanceMap[className] = obj!!
        return obj as T
    }

    override fun <T> getAll(cls: Class<T>): List<T> {
        val list = ArrayList<T>()
        for ((_, value) in mServiceInstanceMap) {
            if (cls.isAssignableFrom(value.javaClass)) {
                list.add(value as T)
            }
        }
        return list
    }

    override fun <T, E : T> put(cls: Class<T>, implClass: Class<E>): IServiceManager {
        if (!cls.isInterface) {
            throw IllegalArgumentException("ServiceManager put方法的key必须是接口，而不应该是：$cls")
        }
        if (mServiceClassMap.containsKey(cls.name)) {
            throw ClassCastException(cls.name + ",该类已经存在，请不要重复注册")
        }

        mServiceClassMap[cls.name] = implClass
        return this
    }

    override fun <T, E : T> replace(cls: Class<T>, implClass: Class<E>): Boolean {
        if (contains(cls)) {
            remove(cls)
            put(cls, implClass)
            return true
        }
        return false
    }

    override fun <T> contains(cls: Class<T>): Boolean {
        return mServiceClassMap.containsKey(cls.name)
    }

    override fun <T> remove(cls: Class<T>) {
        mServiceInstanceMap.remove(cls.name)
        mServiceClassMap.remove(cls.name)
    }

    override fun clear() {
        mServiceInstanceMap.clear()
        mServiceClassMap.clear()
    }
}
