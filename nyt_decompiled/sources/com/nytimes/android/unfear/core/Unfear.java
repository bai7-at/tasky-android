package com.nytimes.android.unfear.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class Unfear {
    public static final Unfear a = new Unfear();

    private Unfear() {
    }

    private final UnfearConverter b(Composer composer, int i) {
        composer.z(-548668421);
        if (b.G()) {
            b.S(-548668421, i, -1, "com.nytimes.android.unfear.core.Unfear.<get-converter> (Unfear.kt:10)");
        }
        UnfearConverter unfearConverter = (UnfearConverter) composer.m(UnfearKt.a());
        if (b.G()) {
            b.R();
        }
        composer.R();
        return unfearConverter;
    }

    public final void a(final Object obj, final Modifier modifier, Composer composer, final int i) {
        zq3.h(obj, "obj");
        zq3.h(modifier, "modifier");
        Composer h = composer.h(1900757898);
        if (b.G()) {
            b.S(1900757898, i, -1, "com.nytimes.android.unfear.core.Unfear.draw (Unfear.kt:13)");
        }
        b(h, (i >> 6) & 14).c(obj, modifier, h, (i & ContentType.LONG_FORM_ON_DEMAND) | 520);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.unfear.core.Unfear$draw$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    Unfear.this.a(obj, modifier, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
