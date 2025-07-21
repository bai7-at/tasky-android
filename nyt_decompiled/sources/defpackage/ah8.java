package defpackage;

/* loaded from: classes5.dex */
public abstract class ah8 {
    private static final ThreadLocal a = new ThreadLocal();

    public static char[] a(int i) {
        ThreadLocal threadLocal = a;
        char[] cArr = (char[]) threadLocal.get();
        if (cArr != null && cArr.length >= i) {
            return cArr;
        }
        char[] cArr2 = new char[i];
        threadLocal.set(cArr2);
        return cArr2;
    }
}
