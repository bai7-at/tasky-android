package com.nytimes.android.growthui.postauth.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.growthui.R;
import com.nytimes.android.growthui.common.components.ErrorMessageKt;
import com.nytimes.android.growthui.common.components.NYTButtonKt;
import defpackage.ap0;
import defpackage.bd5;
import defpackage.bu1;
import defpackage.c74;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.ek8;
import defpackage.fm1;
import defpackage.gn2;
import defpackage.gt2;
import defpackage.it2;
import defpackage.jo7;
import defpackage.ju7;
import defpackage.jy7;
import defpackage.k48;
import defpackage.l74;
import defpackage.li8;
import defpackage.m26;
import defpackage.m60;
import defpackage.o06;
import defpackage.ph8;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zc5;
import defpackage.zq3;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class PostAuthPurchaseSectionKt {
    public static final void a(final o06 o06Var, final ss2 ss2Var, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(o06Var, "postAuthPurchaseData");
        zq3.h(ss2Var, "onOfferClick");
        zq3.h(qs2Var, "onContinueClick");
        Composer h = composer.h(-16288082);
        if ((i & 14) == 0) {
            i2 = (h.S(o06Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(ss2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(qs2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i3 = i2;
        if ((i3 & 731) == 146 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-16288082, i3, -1, "com.nytimes.android.growthui.postauth.components.PostAuthPurchaseSection (PostAuthPurchaseSection.kt:35)");
            }
            Modifier.a aVar = Modifier.a;
            c74 c74Var = c74.a;
            Modifier d = BackgroundKt.d(aVar, c74Var.a(h, 6).a(), null, 2, null);
            h.z(-483455358);
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(d);
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
            bd5 b2 = o06Var.b();
            if (b2 instanceof bd5.b) {
                h.z(1026567725);
                ErrorMessageKt.a(SizeKt.h(aVar, 0.0f, 1, null), k48.b(R.string.growthui_cannot_connect, h, 0), k48.b(R.string.growthui_check_network, h, 0), h, 6, 0);
                NYTButtonKt.a(null, qs2Var, o06Var.a(), false, h, ((i3 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 3072, 1);
                h.R();
                composer2 = h;
            } else if (b2 instanceof bd5.c) {
                h.z(1027113449);
                final zc5 zc5Var = (zc5) i.k0(((bd5.c) o06Var.b()).b());
                TextKt.b(m26.b(null, zc5Var.d(), new jy7(c74Var.a(h, 6).b(), ek8.g(18), o.b.g(), (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, 16376, (DefaultConstructorMarker) null), h, 0, 1), null, 0L, 0L, null, null, gn2.b(), 0L, null, null, 0L, 0, false, 0, null, null, null, h, 1572864, 0, 131006);
                SpacerKt.a(SizeKt.i(aVar, bu1.g(4)), h, 6);
                TextKt.b(m26.a(zc5Var.d(), o06Var.c(), h, 0, 0), null, c74Var.a(h, 6).c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, c74Var.b(h, 6).m(), h, 0, 0, 65530);
                SpacerKt.a(SizeKt.i(aVar, bu1.g(20)), h, 6);
                h.z(1280093260);
                boolean S = h.S(ss2Var) | h.S(zc5Var);
                Object A = h.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.growthui.postauth.components.PostAuthPurchaseSectionKt$PostAuthPurchaseSection$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m563invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m563invoke() {
                            ss2.this.invoke(zc5Var);
                        }
                    };
                    h.q(A);
                }
                h.R();
                NYTButtonKt.a(null, (qs2) A, o06Var.d(), true, h, 3072, 1);
                SpacerKt.a(SizeKt.i(aVar, bu1.g(16)), h, 6);
                String a4 = o06Var.a();
                int i4 = ((i3 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 3072;
                composer2 = h;
                NYTButtonKt.a(null, qs2Var, a4, false, h, i4, 1);
                composer2.R();
            } else {
                composer2 = h;
                composer2.z(1028603309);
                composer2.R();
            }
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
            k.a(new gt2() { // from class: com.nytimes.android.growthui.postauth.components.PostAuthPurchaseSectionKt$PostAuthPurchaseSection$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i5) {
                    PostAuthPurchaseSectionKt.a(o06.this, ss2Var, qs2Var, composer3, i | 1);
                }
            });
        }
    }
}
