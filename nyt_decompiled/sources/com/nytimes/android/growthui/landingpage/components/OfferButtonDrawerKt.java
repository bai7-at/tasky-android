package com.nytimes.android.growthui.landingpage.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
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
import com.nytimes.android.growthui.R;
import com.nytimes.android.growthui.common.components.ErrorMessageKt;
import com.nytimes.android.growthui.common.components.OfferButtonKt;
import defpackage.ap0;
import defpackage.bd5;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zc5;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class OfferButtonDrawerKt {
    public static final void a(Modifier modifier, final bd5 bd5Var, final ss2 ss2Var, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        zq3.h(bd5Var, "offersState");
        zq3.h(ss2Var, "onClick");
        Composer h = composer.h(30248192);
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
            i3 |= h.S(bd5Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(ss2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i3 & 731) == 146 && h.i()) {
            h.K();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(30248192, i3, -1, "com.nytimes.android.growthui.landingpage.components.OfferButtonDrawer (OfferButtonDrawer.kt:30)");
            }
            float f = 0.0f;
            Modifier j = PaddingKt.j(SizeKt.h(androidx.compose.animation.b.b(modifier3, null, null, 3, null), 0.0f, 1, null), bu1.g(20), bu1.g(10));
            Alignment.b g = Alignment.a.g();
            h.z(-483455358);
            rg4 a = d.a(Arrangement.a.g(), g, h, 48);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(j);
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
            if (bd5Var instanceof bd5.b) {
                h.z(1459130203);
                ErrorMessageKt.a(null, k48.b(R.string.growthui_cannot_connect, h, 0), k48.b(R.string.growthui_check_network, h, 0), h, 0, 1);
                h.R();
            } else if (bd5Var instanceof bd5.c) {
                h.z(1459397578);
                for (final zc5 zc5Var : ((bd5.c) bd5Var).b()) {
                    Modifier h2 = SizeKt.h(Modifier.a, f, 1, null);
                    String c = zc5Var.c();
                    h.z(-1883229030);
                    boolean S = h.S(ss2Var) | h.S(zc5Var);
                    Object A = h.A();
                    if (S || A == Composer.a.a()) {
                        A = new qs2() { // from class: com.nytimes.android.growthui.landingpage.components.OfferButtonDrawerKt$OfferButtonDrawer$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m555invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m555invoke() {
                                ss2.this.invoke(zc5Var);
                            }
                        };
                        h.q(A);
                    }
                    h.R();
                    OfferButtonKt.a(h2, zc5Var, c, (qs2) A, h, 6, 0);
                    f = f;
                }
                h.R();
            } else {
                h.z(1459736160);
                h.R();
            }
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
            k.a(new gt2() { // from class: com.nytimes.android.growthui.landingpage.components.OfferButtonDrawerKt$OfferButtonDrawer$2
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
                    OfferButtonDrawerKt.a(Modifier.this, bd5Var, ss2Var, composer2, i | 1, i2);
                }
            });
        }
    }
}
