package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class si3 {
    public static final si3 a = new si3();

    private si3() {
    }

    public static final Class a(String str) {
        if (c11.d(si3.class)) {
            return null;
        }
        try {
            zq3.h(str, "className");
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            c11.b(th, si3.class);
            return null;
        }
    }

    public static final Class b(Context context, String str) {
        if (c11.d(si3.class)) {
            return null;
        }
        try {
            zq3.h(context, "context");
            zq3.h(str, "className");
            try {
                return context.getClassLoader().loadClass(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            c11.b(th, si3.class);
            return null;
        }
    }

    public static final Method c(Class cls, String str, Class... clsArr) {
        if (c11.d(si3.class)) {
            return null;
        }
        try {
            zq3.h(cls, "clazz");
            zq3.h(str, "methodName");
            zq3.h(clsArr, "args");
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            c11.b(th, si3.class);
            return null;
        }
    }

    public static final Method d(Class cls, String str, Class... clsArr) {
        if (c11.d(si3.class)) {
            return null;
        }
        try {
            zq3.h(cls, "clazz");
            zq3.h(str, "methodName");
            zq3.h(clsArr, "args");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            c11.b(th, si3.class);
            return null;
        }
    }

    public static final Object e(Class cls, Method method, Object obj, Object... objArr) {
        if (c11.d(si3.class)) {
            return null;
        }
        try {
            zq3.h(cls, "clazz");
            zq3.h(method, "method");
            zq3.h(objArr, "args");
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            c11.b(th, si3.class);
            return null;
        }
    }
}
