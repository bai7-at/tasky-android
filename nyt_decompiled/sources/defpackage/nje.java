package defpackage;

/* loaded from: classes3.dex */
public abstract class nje {
    public static char a(long j) {
        char c = (char) j;
        tge.g(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    public static char b(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }
}
