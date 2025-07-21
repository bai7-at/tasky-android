package com.nytimes.android.growthui.common.components.utils;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.a;
import defpackage.ao5;
import defpackage.bu1;
import defpackage.fv1;
import defpackage.ph0;
import defpackage.ss2;
import defpackage.uf;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt7;

/* loaded from: classes4.dex */
public abstract class ModifierExtensionsKt {
    public static final Modifier a(Modifier modifier, final long j, final float f, final float f2, final float f3, final float f4, final float f5, Modifier modifier2) {
        zq3.h(modifier, "$this$shadow");
        zq3.h(modifier2, "modifier");
        return modifier.h(a.b(modifier2, new ss2() { // from class: com.nytimes.android.growthui.common.components.utils.ModifierExtensionsKt$shadow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((fv1) obj);
                return ww8.a;
            }

            public final void invoke(fv1 fv1Var) {
                zq3.h(fv1Var, "$this$drawBehind");
                float f6 = f5;
                float f7 = f4;
                float f8 = f3;
                float f9 = f2;
                long j2 = j;
                float f10 = f;
                ph0 c = fv1Var.i1().c();
                ao5 a = uf.a();
                Paint p = a.p();
                float f1 = fv1Var.f1(f6);
                float f11 = 0.0f - f1;
                float f12 = fv1Var.f1(f7) + f11;
                float f13 = f11 + fv1Var.f1(f8);
                float i = zt7.i(fv1Var.b()) + f1;
                float g = zt7.g(fv1Var.b()) + f1;
                if (!bu1.j(f9, bu1.g(0))) {
                    p.setMaskFilter(new BlurMaskFilter(fv1Var.f1(f9), BlurMaskFilter.Blur.NORMAL));
                }
                p.setColor(wn0.k(j2));
                c.q(f12, f13, i, g, fv1Var.f1(f10), fv1Var.f1(f10), a);
            }
        }));
    }
}
