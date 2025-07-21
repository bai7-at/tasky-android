package defpackage;

/* loaded from: classes3.dex */
public abstract class px8 {
    public static byte a(long j) {
        b16.g((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static int b(byte b) {
        return b & 255;
    }
}
