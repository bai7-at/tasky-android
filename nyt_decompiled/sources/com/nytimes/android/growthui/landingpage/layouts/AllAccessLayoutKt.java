package com.nytimes.android.growthui.landingpage.layouts;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.growthui.common.components.HtmlTextKt;
import com.nytimes.android.growthui.common.components.IconRowKt;
import com.nytimes.android.growthui.common.components.TermsKt;
import com.nytimes.android.growthui.common.components.ValuePropsKt;
import com.nytimes.android.growthui.common.components.utils.ModifierExtensionsKt;
import com.nytimes.android.growthui.landingpage.components.AllAccessHeadlineKt;
import com.nytimes.android.growthui.landingpage.components.OfferButtonDrawerKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.c74;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d46;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.zo0;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class AllAccessLayoutKt {
    public static final void a(Modifier modifier, final d46 d46Var, final String str, final ss2 ss2Var, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Modifier a;
        zq3.h(d46Var, "product");
        zq3.h(str, "terms");
        zq3.h(ss2Var, "onOfferClick");
        Composer h = composer.h(-1938488861);
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
            i3 |= h.S(d46Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(str) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.S(ss2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        int i5 = i3;
        if ((i5 & 5851) == 1170 && h.i()) {
            h.K();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(-1938488861, i5, -1, "com.nytimes.android.growthui.landingpage.layouts.AllAccessLayout (AllAccessLayout.kt:39)");
            }
            Modifier f = SizeKt.f(modifier4, 0.0f, 1, null);
            c74 c74Var = c74.a;
            Modifier d = BackgroundKt.d(f, c74Var.a(h, 6).h().c(), null, 2, null);
            h.z(-483455358);
            Arrangement arrangement = Arrangement.a;
            Arrangement.m g = arrangement.g();
            Alignment.a aVar = Alignment.a;
            Modifier modifier5 = modifier4;
            rg4 a2 = d.a(g, aVar.k(), h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 b = LayoutKt.b(d);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a3);
            } else {
                h.p();
            }
            h.H();
            Composer a4 = Updater.a(h);
            Updater.c(a4, a2, companion.e());
            Updater.c(a4, fm1Var, companion.c());
            Updater.c(a4, layoutDirection, companion.d());
            Updater.c(a4, r99Var, companion.h());
            h.c();
            b.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-1163856341);
            ap0 ap0Var = ap0.a;
            Modifier.a aVar2 = Modifier.a;
            float f2 = 20;
            Modifier b2 = zo0.b(ap0Var, PaddingKt.k(ScrollKt.f(aVar2, ScrollKt.c(0, h, 0, 1), false, null, false, 14, null), bu1.g(f2), 0.0f, 2, null), 1.0f, false, 2, null);
            Alignment.b g2 = aVar.g();
            h.z(-483455358);
            rg4 a5 = d.a(arrangement.g(), g2, h, 48);
            h.z(-1323940314);
            fm1 fm1Var2 = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection2 = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var2 = (r99) h.m(CompositionLocalsKt.p());
            qs2 a6 = companion.a();
            it2 b3 = LayoutKt.b(b2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a6);
            } else {
                h.p();
            }
            h.H();
            Composer a7 = Updater.a(h);
            Updater.c(a7, a5, companion.e());
            Updater.c(a7, fm1Var2, companion.c());
            Updater.c(a7, layoutDirection2, companion.d());
            Updater.c(a7, r99Var2, companion.h());
            h.c();
            b3.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-1163856341);
            AllAccessHeadlineKt.a(null, d46Var.b().a(), d46Var.b().c(), null, h, 0, 9);
            float f3 = 24;
            float f4 = 12;
            DividerKt.a(PaddingKt.l(aVar2, bu1.g(f4), bu1.g(f3), bu1.g(f4), bu1.g(18)), c74Var.a(h, 6).k(), 0.0f, 0.0f, h, 0, 12);
            ValuePropsKt.b(null, d46Var.f(), c74Var.a(h, 6).b(), h, 0, 1);
            float f5 = 16;
            IconRowKt.a(SizeKt.h(PaddingKt.m(aVar2, bu1.g(f2), bu1.g(f5), 0.0f, 0.0f, 12, null), 0.0f, 1, null), d46Var.c(), bu1.g(32), arrangement.o(bu1.g(f5), aVar.k()), h, 3456, 0);
            Modifier h2 = SizeKt.h(aVar2, 0.0f, 1, null);
            float g3 = bu1.g(f3);
            modifier3 = modifier5;
            HtmlTextKt.a(PaddingKt.j(h2, bu1.g(22), g3), d46Var.a(), 14.0f, wn0.k(c74Var.a(h, 6).c()), h, 384);
            DividerKt.a(PaddingKt.k(aVar2, bu1.g(f4), 0.0f, 2, null), c74Var.a(h, 6).k(), 0.0f, 0.0f, h, 6, 12);
            TermsKt.a(PaddingKt.i(aVar2, bu1.g(f4)), str, h, ((i5 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 6, 0);
            h.R();
            h.R();
            h.t();
            h.R();
            h.R();
            a = ModifierExtensionsKt.a(SizeKt.w(aVar2, aVar.a(), false, 2, null), (r17 & 1) != 0 ? nn0.b.a() : c74Var.a(h, 6).i(), (r17 & 2) != 0 ? bu1.g(0) : 0.0f, (r17 & 4) != 0 ? bu1.g(0) : bu1.g(4), (r17 & 8) != 0 ? bu1.g(0) : bu1.g(-2), (r17 & 16) != 0 ? bu1.g(0) : 0.0f, (r17 & 32) != 0 ? bu1.g(0.0f) : 0.0f, (r17 & 64) != 0 ? Modifier.a : null);
            OfferButtonDrawerKt.a(BackgroundKt.d(SizeKt.h(a, 0.0f, 1, null), c74Var.a(h, 6).h().n(), null, 2, null), d46Var.d(), ss2Var, h, (i5 >> 3) & 896, 0);
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
            final Modifier modifier6 = modifier3;
            k.a(new gt2() { // from class: com.nytimes.android.growthui.landingpage.layouts.AllAccessLayoutKt$AllAccessLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    AllAccessLayoutKt.a(Modifier.this, d46Var, str, ss2Var, composer2, i | 1, i2);
                }
            });
        }
    }
}
