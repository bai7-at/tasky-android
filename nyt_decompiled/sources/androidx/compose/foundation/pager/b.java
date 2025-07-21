package androidx.compose.foundation.pager;

import defpackage.ci;
import defpackage.di;
import defpackage.uc0;

/* loaded from: classes.dex */
final class b implements uc0 {
    private final PagerState b;
    private final ci c = di.i(0.0f, 0.0f, null, 7, null);

    public b(PagerState pagerState) {
        this.b = pagerState;
    }

    @Override // defpackage.uc0
    public float a(float f, float f2, float f3) {
        if (f >= f3 || f < 0.0f) {
            return f;
        }
        if ((f2 > f3 || f2 + f <= f3) && Math.abs(this.b.x()) == 0.0f) {
            return 0.0f;
        }
        return f;
    }

    @Override // defpackage.uc0
    public ci b() {
        return this.c;
    }
}
