package com.nytimes.android.deeplink;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.comscore.streaming.ContentType;
import com.nytimes.android.logging.NYTLogger;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.qb5;
import defpackage.s5;
import defpackage.ww8;
import defpackage.z12;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class NytUriHandlerKt {
    public static final void a(final gt2 gt2Var, Composer composer, final int i) {
        int i2;
        zq3.h(gt2Var, "content");
        Composer h = composer.h(-1512097986);
        if ((i & 14) == 0) {
            i2 = (h.C(gt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1512097986, i2, -1, "com.nytimes.android.deeplink.ProvideNytUriHandler (NytUriHandler.kt:99)");
            }
            ComponentActivity d = s5.d(h, 0);
            h.z(1325460199);
            Object A = h.A();
            if (A == Composer.a.a()) {
                A = null;
                if (d != null) {
                    try {
                        A = b(d);
                    } catch (Exception e) {
                        NYTLogger.i(e, "No NytUriHandler found! Is this a preview?", new Object[0]);
                    }
                }
                h.q(A);
            }
            NytUriHandler nytUriHandler = (NytUriHandler) A;
            h.R();
            if (nytUriHandler != null) {
                h.z(1325460441);
                CompositionLocalKt.a(CompositionLocalsKt.o().c(nytUriHandler), gt2Var, h, ((i2 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 8);
                h.R();
            } else {
                h.z(1325460546);
                gt2Var.invoke(h, Integer.valueOf(i2 & 14));
                h.R();
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.deeplink.NytUriHandlerKt$ProvideNytUriHandler$1
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
                    NytUriHandlerKt.a(gt2.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final NytUriHandler b(Activity activity) {
        zq3.h(activity, "<this>");
        return ((qb5) z12.a(activity, qb5.class)).U();
    }
}
