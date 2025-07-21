package androidx.compose.ui.graphics.colorspace;

import defpackage.hf3;
import defpackage.uo6;
import defpackage.wn0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class h extends c {
    public static final a e = new a(null);
    private static final float[] f;
    private static final float[] g;
    private static final float[] h;
    private static final float[] i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        float[] b = androidx.compose.ui.graphics.colorspace.a.b.a().b();
        hf3 hf3Var = hf3.a;
        float[] k = d.k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.e(b, hf3Var.b().c(), hf3Var.e().c()));
        f = k;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        g = fArr;
        h = d.j(k);
        i = d.j(fArr);
    }

    public h(String str, int i2) {
        super(str, b.a.a(), i2, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float c(int i2) {
        return i2 == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float d(int i2) {
        return i2 == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long h(float f2, float f3, float f4) {
        float l = uo6.l(f2, 0.0f, 1.0f);
        float l2 = uo6.l(f3, -0.5f, 0.5f);
        float l3 = uo6.l(f4, -0.5f, 0.5f);
        float[] fArr = i;
        float n = d.n(fArr, l, l2, l3);
        float o = d.o(fArr, l, l2, l3);
        float p = d.p(fArr, l, l2, l3);
        float f5 = n * n * n;
        float f6 = o * o * o;
        float f7 = p * p * p;
        float[] fArr2 = h;
        float n2 = d.n(fArr2, f5, f6, f7);
        float o2 = d.o(fArr2, f5, f6, f7);
        return (Float.floatToRawIntBits(n2) << 32) | (4294967295L & Float.floatToRawIntBits(o2));
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float i(float f2, float f3, float f4) {
        float l = uo6.l(f2, 0.0f, 1.0f);
        float l2 = uo6.l(f3, -0.5f, 0.5f);
        float l3 = uo6.l(f4, -0.5f, 0.5f);
        float[] fArr = i;
        float n = d.n(fArr, l, l2, l3);
        float o = d.o(fArr, l, l2, l3);
        float p = d.p(fArr, l, l2, l3);
        float f5 = p * p * p;
        return d.p(h, n * n * n, o * o * o, f5);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long j(float f2, float f3, float f4, float f5, c cVar) {
        float[] fArr = f;
        float n = d.n(fArr, f2, f3, f4);
        float o = d.o(fArr, f2, f3, f4);
        float p = d.p(fArr, f2, f3, f4);
        double d = 0.33333334f;
        float signum = Math.signum(n) * ((float) Math.pow(Math.abs(n), d));
        float signum2 = Math.signum(o) * ((float) Math.pow(Math.abs(o), d));
        float signum3 = Math.signum(p) * ((float) Math.pow(Math.abs(p), d));
        float[] fArr2 = g;
        return wn0.a(d.n(fArr2, signum, signum2, signum3), d.o(fArr2, signum, signum2, signum3), d.p(fArr2, signum, signum2, signum3), f5, cVar);
    }
}
