package com.nytimes.android.growthui.landingpage.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.comscore.streaming.ContentType;
import com.nytimes.android.growthui.R;
import com.nytimes.android.growthui.common.components.HeadlineKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.c74;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.do5;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.n73;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class LandingPageHeaderKt {
    public static final void a(Modifier modifier, final n73 n73Var, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        zq3.h(n73Var, "header");
        Composer h = composer.h(-986715370);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (h.S(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((2 & i2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(n73Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(-986715370, i3, -1, "com.nytimes.android.growthui.landingpage.components.LandingPageHeader (LandingPageHeader.kt:25)");
            }
            Alignment.b g = Alignment.a.g();
            h.z(-483455358);
            rg4 a = d.a(Arrangement.a.g(), g, h, 48);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(modifier3);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a2);
            } else {
                h.p();
            }
            h.H();
            Composer a3 = Updater.a(h);
            Updater.c(a3, a, companion.e());
            Updater.c(a3, fm1Var, companion.c());
            Updater.c(a3, layoutDirection, companion.d());
            Updater.c(a3, r99Var, companion.h());
            h.c();
            b.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-1163856341);
            ap0 ap0Var = ap0.a;
            Integer b2 = n73Var.b();
            h.z(2075938312);
            if (b2 != null) {
                IconKt.b(do5.d(b2.intValue(), h, 0), k48.b(R.string.app_logo_description, h, 0), SizeKt.y(PaddingKt.i(modifier3, bu1.g(10)), null, false, 3, null), c74.a.a(h, 6).g(), h, 8, 0);
            }
            h.R();
            HeadlineKt.a(null, n73Var.a(), n73Var.c(), null, h, 0, 9);
            h.R();
            h.R();
            h.t();
            h.R();
            h.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.growthui.landingpage.components.LandingPageHeaderKt$LandingPageHeader$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    LandingPageHeaderKt.a(Modifier.this, n73Var, composer2, i | 1, i2);
                }
            });
        }
    }
}
