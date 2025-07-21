package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import defpackage.hs7;

/* loaded from: classes.dex */
public abstract class i {
    private static final hs7 a = new hs7();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) {
        hs7 hs7Var = a;
        hs7 hs7Var2 = (hs7) hs7Var.get(classLoader);
        if (hs7Var2 == null) {
            hs7Var2 = new hs7();
            hs7Var.put(classLoader, hs7Var2);
        }
        Class cls = (Class) hs7Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        hs7Var2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    public abstract Fragment a(ClassLoader classLoader, String str);
}
