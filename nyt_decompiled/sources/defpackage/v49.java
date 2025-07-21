package defpackage;

/* loaded from: classes.dex */
public abstract class v49 {
    public static final long a(float f, float f2) {
        return u49.c((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
