package main

import android.app.Activity
import android.support.v4.app.Fragment
import android.view.View

import java.lang.reflect.Constructor
import java.lang.reflect.InvocationTargetException

/**
 * 类工具
 */
object ClassUtil {

    @Suppress("UNCHECKED_CAST")
    fun <T> newInstance(clazz: Class<T>): T? {
        var instance: T? = null
        val cs = clazz.declaredConstructors
        try {

            instance = cs[0].newInstance() as T
        } catch (e: InstantiationException) {
            e.printStackTrace()
        } catch (e: InvocationTargetException) {
            e.printStackTrace()
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        }

        return instance
    }

    fun isAndroidUiClass(targetClass: Class<*>): Boolean {
        return (Activity::class.java.isAssignableFrom(targetClass)
                || View::class.java.isAssignableFrom(targetClass)
                || Fragment::class.java.isAssignableFrom(targetClass)
                || android.app.Fragment::class.java.isAssignableFrom(targetClass))
    }
}