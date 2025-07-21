package defpackage;

/* loaded from: classes.dex */
public abstract class g01 {
    public static final long a(float f, float f2) {
        return f01.b((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static /* synthetic */ long b(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return a(f, f2);
    }
}
