package defpackage;

import androidx.compose.animation.core.VectorConvertersKt;

/* loaded from: classes.dex */
public final class el2 implements uk2 {
    private final int a;
    private final int b;
    private final vx1 c;

    public el2(int i, int i2, vx1 vx1Var) {
        this.a = i;
        this.b = i2;
        this.c = vx1Var;
    }

    private final long f(long j) {
        return uo6.o(j - this.b, 0L, this.a);
    }

    @Override // defpackage.uk2
    public float c(long j, float f, float f2, float f3) {
        long f4 = f(j / 1000000);
        int i = this.a;
        return VectorConvertersKt.k(f, f2, this.c.a(uo6.l(i == 0 ? 1.0f : f4 / i, 0.0f, 1.0f)));
    }

    @Override // defpackage.uk2
    public float d(long j, float f, float f2, float f3) {
        long f4 = f(j / 1000000);
        if (f4 < 0) {
            return 0.0f;
        }
        if (f4 == 0) {
            return f3;
        }
        return (c(f4 * 1000000, f, f2, f3) - c((f4 - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.uk2
    public long e(float f, float f2, float f3) {
        return (this.b + this.a) * 1000000;
    }
}
