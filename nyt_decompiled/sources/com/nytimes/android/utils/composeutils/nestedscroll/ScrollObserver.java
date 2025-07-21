package com.nytimes.android.utils.composeutils.nestedscroll;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import defpackage.cc7;
import defpackage.d35;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.x08;

/* loaded from: classes4.dex */
public final class ScrollObserver implements d35 {
    public static final int g = 0;
    private final float a;
    private final float b;
    private final sy4 c;
    private final sy4 d;
    private final x08 e;
    private final x08 f;

    public ScrollObserver(float f, float f2) {
        this.a = f;
        this.b = f2;
        Float valueOf = Float.valueOf(0.0f);
        this.c = b0.e(valueOf, null, 2, null);
        this.d = b0.e(valueOf, null, 2, null);
        this.e = y.d(new qs2() { // from class: com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver$toolbarHeightPx$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float mo865invoke() {
                float f3;
                f3 = ScrollObserver.this.a;
                return Float.valueOf(f3 + ScrollObserver.this.h());
            }
        });
        this.f = y.d(new qs2() { // from class: com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver$toolTipMessageHeightPx$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float mo865invoke() {
                float f3;
                f3 = ScrollObserver.this.b;
                return Float.valueOf(f3 + ScrollObserver.this.f());
            }
        });
    }

    private final float d(Composer composer, int i) {
        composer.z(-964567736);
        if (b.G()) {
            b.S(-964567736, i, -1, "com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver.<get-initialToolbarHeightDp> (ScrollObserver.kt:26)");
        }
        float X0 = ((fm1) composer.m(CompositionLocalsKt.e())).X0(this.a);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return X0;
    }

    public final void a(Composer composer, final int i) {
        int i2;
        Composer h = composer.h(705277641);
        if ((i & 14) == 0) {
            i2 = (h.S(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(705277641, i2, -1, "com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver.TopToolbarSpacer (ScrollObserver.kt:56)");
            }
            SpacerKt.a(SizeKt.i(Modifier.a, d(h, i2 & 14)), h, 0);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver$TopToolbarSpacer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    ScrollObserver.this.a(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public final float e() {
        return ((Number) this.f.getValue()).floatValue();
    }

    public final float f() {
        return ((Number) this.d.getValue()).floatValue();
    }

    public final float g() {
        return ((Number) this.e.getValue()).floatValue();
    }

    public final float h() {
        return ((Number) this.c.getValue()).floatValue();
    }

    public final void i(float f) {
        this.d.setValue(Float.valueOf(f));
    }

    public final void j(float f) {
        this.c.setValue(Float.valueOf(f));
    }

    @Override // defpackage.d35
    public long r0(long j, long j2, int i) {
        float h = h() + (fd5.p(j) / 2.0f);
        j(uo6.l(h, -this.a, 0.0f));
        i(uo6.h(h, 5.0f));
        return fd5.b.c();
    }
}
