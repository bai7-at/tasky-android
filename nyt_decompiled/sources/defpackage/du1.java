package defpackage;

/* loaded from: classes.dex */
public abstract class du1 {
    public static final long a(float f, float f2) {
        return eu1.d((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static final long b(float f, float f2) {
        return fu1.d((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static final float c(float f, float f2, float f3) {
        return bu1.g(cg4.a(f, f2, f3));
    }
}
