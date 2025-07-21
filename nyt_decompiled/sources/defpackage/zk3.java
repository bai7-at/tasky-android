package defpackage;

/* loaded from: classes.dex */
public abstract class zk3 {
    private static final String a;

    static {
        String i = h94.i("InputMerger");
        zq3.g(i, "tagWithPrefix(\"InputMerger\")");
        a = i;
    }

    public static final xk3 a(String str) {
        zq3.h(str, "className");
        try {
            Object newInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
            zq3.f(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (xk3) newInstance;
        } catch (Exception e) {
            h94.e().d(a, "Trouble instantiating " + str, e);
            return null;
        }
    }
}
