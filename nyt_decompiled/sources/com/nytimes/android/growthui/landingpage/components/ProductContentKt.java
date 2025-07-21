package com.nytimes.android.growthui.landingpage.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.growthui.common.components.TermsKt;
import com.nytimes.android.growthui.common.components.ValuePropsKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.oh3;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class ProductContentKt {
    public static final void a(Modifier modifier, final oh3 oh3Var, final String str, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composer2;
        zq3.h(oh3Var, "valueProps");
        zq3.h(str, "terms");
        Composer h = composer.h(923749054);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(oh3Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(str) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i5 = i3;
        if ((i5 & 731) == 146 && h.i()) {
            h.K();
            modifier3 = modifier2;
            composer2 = h;
        } else {
            modifier3 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(923749054, i5, -1, "com.nytimes.android.growthui.landingpage.components.ProductContent (ProductContent.kt:25)");
            }
            h.z(-483455358);
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
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
            Modifier.a aVar = Modifier.a;
            float f = 25;
            SpacerKt.a(SizeKt.i(aVar, bu1.g(f)), h, 6);
            ValuePropsKt.b(null, oh3Var, 0L, h, i5 & ContentType.LONG_FORM_ON_DEMAND, 5);
            composer2 = h;
            DividerKt.a(PaddingKt.m(aVar, 0.0f, bu1.g(f), 0.0f, bu1.g(10), 5, null), 0L, 0.0f, 0.0f, composer2, 6, 14);
            TermsKt.a(PaddingKt.i(aVar, bu1.g(20)), str, composer2, ((i5 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 6, 0);
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            final Modifier modifier4 = modifier3;
            k.a(new gt2() { // from class: com.nytimes.android.growthui.landingpage.components.ProductContentKt$ProductContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i6) {
                    ProductContentKt.a(Modifier.this, oh3Var, str, composer3, i | 1, i2);
                }
            });
        }
    }
}
