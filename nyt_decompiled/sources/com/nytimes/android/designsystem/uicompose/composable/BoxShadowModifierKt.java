package com.nytimes.android.designsystem.uicompose.composable;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.a;
import defpackage.ao5;
import defpackage.fv1;
import defpackage.nn0;
import defpackage.ph0;
import defpackage.ss2;
import defpackage.uf;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt7;

/* loaded from: classes4.dex */
public abstract class BoxShadowModifierKt {
    public static final Modifier a(Modifier modifier, final long j, final float f, final float f2, final float f3, final float f4, final float f5) {
        zq3.h(modifier, "$this$drawColoredShadow");
        return a.b(modifier, new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.BoxShadowModifierKt$drawColoredShadow$1
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
                int argb = Color.toArgb(nn0.r(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                int argb2 = Color.toArgb(nn0.r(j, f, 0.0f, 0.0f, 0.0f, 14, null));
                float f6 = f3;
                float f7 = f5;
                float f8 = f4;
                float f9 = f2;
                ph0 c = fv1Var.i1().c();
                ao5 a = uf.a();
                Paint p = a.p();
                p.setColor(argb);
                p.setShadowLayer(fv1Var.f1(f6), fv1Var.f1(f7), fv1Var.f1(f8), argb2);
                c.q(0.0f, 0.0f, zt7.i(fv1Var.b()), zt7.g(fv1Var.b()), fv1Var.f1(f9), fv1Var.f1(f9), a);
            }
        });
    }
}
