package defpackage;

/* loaded from: classes3.dex */
public abstract class wj0 {
    public static char a(long j) {
        char c = (char) j;
        b16.g(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    public static boolean b(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public static char c(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }
}
