package defpackage;

/* loaded from: classes5.dex */
public abstract class hl8 {

    public static final class a extends Thread {
        final /* synthetic */ qs2 a;

        a(qs2 qs2Var) {
            this.a = qs2Var;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.a.mo865invoke();
        }
    }

    public static final Thread a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, qs2 qs2Var) {
        zq3.h(qs2Var, "block");
        a aVar = new a(qs2Var);
        if (z2) {
            aVar.setDaemon(true);
        }
        if (i > 0) {
            aVar.setPriority(i);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z) {
            aVar.start();
        }
        return aVar;
    }

    public static /* synthetic */ Thread b(boolean z, boolean z2, ClassLoader classLoader, String str, int i, qs2 qs2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        ClassLoader classLoader2 = (i2 & 4) != 0 ? null : classLoader;
        String str2 = (i2 & 8) != 0 ? null : str;
        if ((i2 & 16) != 0) {
            i = -1;
        }
        return a(z3, z4, classLoader2, str2, i, qs2Var);
    }
}
