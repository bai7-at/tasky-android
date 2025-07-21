package defpackage;

/* loaded from: classes.dex */
public abstract class du7 {
    public static final long a(float f, float f2) {
        return zt7.d((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static final long b(long j) {
        return hd5.a(zt7.i(j) / 2.0f, zt7.g(j) / 2.0f);
    }

    public static final kt6 c(long j) {
        return nt6.b(fd5.b.c(), j);
    }
}
