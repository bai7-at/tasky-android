package defpackage;

/* loaded from: classes.dex */
public abstract class pz7 {
    private static final float a = Float.MAX_VALUE;

    public static final long a(float f, float f2) {
        return yv4.a((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static final float b() {
        return a;
    }
}
