package defpackage;

/* loaded from: classes.dex */
public final class jg4 {
    public static final jg4 a = new jg4();

    private jg4() {
    }

    public final float a(float f, float f2, float f3, float f4, float f5) {
        return b(f, f2, Math.max(0.0f, Math.min(1.0f, c(f3, f4, f5))));
    }

    public final float b(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public final float c(float f, float f2, float f3) {
        if (f == f2) {
            return 0.0f;
        }
        return (f3 - f) / (f2 - f);
    }
}
