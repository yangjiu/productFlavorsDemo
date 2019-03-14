package main;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 类工具
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class ClassUtil {

    private ClassUtil() { }

    public static <T> T newInstance(Class<T> clazz) {
        T instance = null;
        Constructor<?>[] cs = clazz.getDeclaredConstructors();
        try {
            //noinspection unchecked
            instance = (T) cs[0].newInstance();
        } catch (InstantiationException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public static boolean isAndroidUiClass(Class targetClass) {
        return Activity.class.isAssignableFrom(targetClass)
                || View.class.isAssignableFrom(targetClass)
                || Fragment.class.isAssignableFrom(targetClass)
                || android.app.Fragment.class.isAssignableFrom(targetClass);
    }
}