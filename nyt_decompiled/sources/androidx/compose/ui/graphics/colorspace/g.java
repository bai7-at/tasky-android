package androidx.compose.ui.graphics.colorspace;

import defpackage.hf3;
import defpackage.uo6;
import defpackage.wn0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class g extends c {
    public static final a e = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(String str, int i) {
        super(str, b.a.a(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float c(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float d(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long h(float f, float f2, float f3) {
        float l = (uo6.l(f, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float l2 = (uo6.l(f2, -128.0f, 128.0f) * 0.002f) + l;
        float f4 = l2 > 0.20689656f ? l2 * l2 * l2 : (l2 - 0.13793103f) * 0.12841855f;
        float f5 = l > 0.20689656f ? l * l * l : (l - 0.13793103f) * 0.12841855f;
        float f6 = f4 * hf3.a.c()[0];
        return (Float.floatToRawIntBits(f5 * r2.c()[1]) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float i(float f, float f2, float f3) {
        float l = ((uo6.l(f, 0.0f, 100.0f) + 16.0f) / 116.0f) - (uo6.l(f3, -128.0f, 128.0f) * 0.005f);
        return (l > 0.20689656f ? l * l * l : 0.12841855f * (l - 0.13793103f)) * hf3.a.c()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long j(float f, float f2, float f3, float f4, c cVar) {
        hf3 hf3Var = hf3.a;
        float f5 = f / hf3Var.c()[0];
        float f6 = f2 / hf3Var.c()[1];
        float f7 = f3 / hf3Var.c()[2];
        float pow = f5 > 0.008856452f ? (float) Math.pow(f5, 0.33333334f) : (f5 * 7.787037f) + 0.13793103f;
        float pow2 = f6 > 0.008856452f ? (float) Math.pow(f6, 0.33333334f) : (f6 * 7.787037f) + 0.13793103f;
        return wn0.a(uo6.l((116.0f * pow2) - 16.0f, 0.0f, 100.0f), uo6.l((pow - pow2) * 500.0f, -128.0f, 128.0f), uo6.l((pow2 - (f7 > 0.008856452f ? (float) Math.pow(f7, 0.33333334f) : (f7 * 7.787037f) + 0.13793103f)) * 200.0f, -128.0f, 128.0f), f4, cVar);
    }
}
