package com.nytimes.android.libs.messagingarchitecture.betasettings.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.u14;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ScreenContentKt {
    public static final void a(final u14 u14Var, it2 it2Var, gt2 gt2Var, gt2 gt2Var2, final it2 it2Var2, Composer composer, final int i, final int i2) {
        zq3.h(u14Var, "lce");
        zq3.h(it2Var2, "onSuccessNotEmpty");
        Composer h = composer.h(-339021994);
        it2 a = (i2 & 2) != 0 ? ComposableSingletons$ScreenContentKt.a.a() : it2Var;
        gt2 b = (i2 & 4) != 0 ? ComposableSingletons$ScreenContentKt.a.b() : gt2Var;
        gt2 c = (i2 & 8) != 0 ? ComposableSingletons$ScreenContentKt.a.c() : gt2Var2;
        if (b.G()) {
            b.S(-339021994, i, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ScreenContent (ScreenContent.kt:12)");
        }
        if (u14Var instanceof u14.a) {
            h.z(1955810945);
            a.invoke(((u14.a) u14Var).b(), h, Integer.valueOf((i & ContentType.LONG_FORM_ON_DEMAND) | 8));
            h.R();
        } else if (zq3.c(u14Var, u14.b.b)) {
            h.z(1955810991);
            b.invoke(h, Integer.valueOf((i >> 6) & 14));
            h.R();
        } else if (u14Var instanceof u14.c) {
            h.z(1955811029);
            u14.c cVar = (u14.c) u14Var;
            if (((List) cVar.a()).isEmpty()) {
                h.z(1955811053);
                c.invoke(h, Integer.valueOf((i >> 9) & 14));
            } else {
                h.z(1955811075);
                it2Var2.invoke(cVar.a(), h, Integer.valueOf(((i >> 9) & ContentType.LONG_FORM_ON_DEMAND) | 8));
            }
            h.R();
            h.R();
        } else {
            h.z(1955811108);
            h.R();
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final it2 it2Var3 = a;
            final gt2 gt2Var3 = b;
            final gt2 gt2Var4 = c;
            k.a(new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ScreenContentKt$ScreenContent$1
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
                    ScreenContentKt.a(u14.this, it2Var3, gt2Var3, gt2Var4, it2Var2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
