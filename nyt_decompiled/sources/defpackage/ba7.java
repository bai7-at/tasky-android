package defpackage;

import android.app.Application;
import androidx.lifecycle.n;
import androidx.lifecycle.q;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.d;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class ba7 {
    private static final List a = i.o(Application.class, n.class);
    private static final List b = i.e(n.class);

    public static final Constructor c(Class cls, List list) {
        zq3.h(cls, "modelClass");
        zq3.h(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        zq3.g(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            zq3.g(parameterTypes, "constructor.parameterTypes");
            List C0 = d.C0(parameterTypes);
            if (zq3.c(list, C0)) {
                zq3.f(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == C0.size() && C0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final q d(Class cls, Constructor constructor, Object... objArr) {
        zq3.h(cls, "modelClass");
        zq3.h(constructor, "constructor");
        zq3.h(objArr, "params");
        try {
            return (q) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
