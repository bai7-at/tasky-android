package androidx.compose.ui.graphics.colorspace;

import defpackage.uo6;
import defpackage.wn0;

/* loaded from: classes.dex */
public final class j extends c {
    public j(String str, int i) {
        super(str, b.a.c(), i, null);
    }

    private final float k(float f) {
        return uo6.l(f, -2.0f, 2.0f);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float c(int i) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float d(int i) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long h(float f, float f2, float f3) {
        float k = k(f);
        float k2 = k(f2);
        return (Float.floatToRawIntBits(k) << 32) | (4294967295L & Float.floatToRawIntBits(k2));
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float i(float f, float f2, float f3) {
        return k(f3);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long j(float f, float f2, float f3, float f4, c cVar) {
        return wn0.a(k(f), k(f2), k(f3), f4, cVar);
    }
}
