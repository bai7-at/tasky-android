package defpackage;

/* loaded from: classes5.dex */
public abstract class q48 {
    private static boolean a(char c) {
        return c >= ' ' && c <= '~';
    }

    public static boolean b(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!a(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
