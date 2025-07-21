package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class cl2 implements uk2 {
    private final float a;
    private final float b;
    private final float c;
    private final oz7 d;

    public cl2(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        oz7 oz7Var = new oz7(1.0f);
        oz7Var.d(f);
        oz7Var.f(f2);
        this.d = oz7Var;
    }

    @Override // defpackage.uk2
    public float b(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.uk2
    public float c(long j, float f, float f2, float f3) {
        this.d.e(f2);
        return yv4.b(this.d.g(f, f3, j / 1000000));
    }

    @Override // defpackage.uk2
    public float d(long j, float f, float f2, float f3) {
        this.d.e(f2);
        return yv4.c(this.d.g(f, f3, j / 1000000));
    }

    @Override // defpackage.uk2
    public long e(float f, float f2, float f3) {
        float b = this.d.b();
        float a = this.d.a();
        float f4 = this.c;
        return nz7.b(b, a, f3 / f4, (f - f2) / f4, 1.0f) * 1000000;
    }

    public /* synthetic */ cl2(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : f3);
    }
}
