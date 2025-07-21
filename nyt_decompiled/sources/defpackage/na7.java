package defpackage;

/* loaded from: classes.dex */
public abstract class na7 {
    public static final long a(float f, float f2) {
        return ma7.a((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static final long b(long j, long j2) {
        return du7.a(zt7.i(j) * ma7.b(j2), zt7.g(j) * ma7.c(j2));
    }
}
