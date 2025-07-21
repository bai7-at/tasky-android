package defpackage;

/* loaded from: classes5.dex */
public abstract class bp8 {
    public static String a(long j, long j2) {
        if (j == 0 && j2 == 0) {
            return b();
        }
        char[] a = ah8.a(32);
        zk5.g(j, a, 0);
        zk5.g(j2, a, 16);
        return new String(a, 0, 32);
    }

    public static String b() {
        return "00000000000000000000000000000000";
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence != null && charSequence.length() == 32 && !"00000000000000000000000000000000".contentEquals(charSequence) && zk5.f(charSequence);
    }
}
