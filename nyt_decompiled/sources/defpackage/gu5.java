package defpackage;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes5.dex */
public abstract class gu5 {
    private static final int a;
    private static final boolean b;

    static class a implements PrivilegedAction {
        a() {
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClassLoader run() {
            return ClassLoader.getSystemClassLoader();
        }
    }

    static {
        int d = d();
        a = d;
        b = d != 0;
    }

    public static int a() {
        return a;
    }

    static ClassLoader b() {
        return System.getSecurityManager() == null ? ClassLoader.getSystemClassLoader() : (ClassLoader) AccessController.doPrivileged(new a());
    }

    public static boolean c() {
        return b;
    }

    private static int d() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION", true, b()).getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
