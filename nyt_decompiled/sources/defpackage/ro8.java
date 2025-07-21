package defpackage;

/* loaded from: classes.dex */
public abstract class ro8 {
    public static void a(String str, int i) {
        vo8.a(f(str), i);
    }

    public static void b(String str) {
        uo8.a(f(str));
    }

    public static void c(String str, int i) {
        vo8.b(f(str), i);
    }

    public static void d() {
        uo8.b();
    }

    public static boolean e() {
        return vo8.c();
    }

    private static String f(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
