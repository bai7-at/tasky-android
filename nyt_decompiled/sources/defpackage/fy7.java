package defpackage;

/* loaded from: classes5.dex */
public abstract class fy7 {
    public static String a(long j) {
        if (j == 0) {
            return b();
        }
        char[] a = ah8.a(16);
        zk5.g(j, a, 0);
        return new String(a, 0, 16);
    }

    public static String b() {
        return "0000000000000000";
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence != null && charSequence.length() == 16 && !"0000000000000000".contentEquals(charSequence) && zk5.f(charSequence);
    }
}
