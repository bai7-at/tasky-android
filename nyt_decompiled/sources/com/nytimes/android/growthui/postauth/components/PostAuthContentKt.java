package com.nytimes.android.growthui.postauth.components;

import androidx.compose.foundation.BackgroundKt;
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
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.c74;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.ei0;
import defpackage.fb0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.j06;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public abstract class PostAuthContentKt {
    public static final void a(final j06 j06Var, final qs2 qs2Var, final ss2 ss2Var, final qs2 qs2Var2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(j06Var, "config");
        zq3.h(qs2Var, "onToggleClick");
        zq3.h(ss2Var, "onOfferClick");
        zq3.h(qs2Var2, "onContinueClick");
        Composer h = composer.h(1323777799);
        if ((i & 14) == 0) {
            i2 = (h.S(j06Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(qs2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(ss2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.S(qs2Var2) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i2 & 5851) == 1170 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(1323777799, i2, -1, "com.nytimes.android.growthui.postauth.components.PostAuthContent (PostAuthContent.kt:27)");
            }
            composer2 = h;
            ei0.a(null, null, 0L, 0L, fb0.a(bu1.g(1), c74.a.a(h, 6).j()), bu1.g(10), zr0.b(h, 633653508, true, new gt2() { // from class: com.nytimes.android.growthui.postauth.components.PostAuthContentKt$PostAuthContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(633653508, i3, -1, "com.nytimes.android.growthui.postauth.components.PostAuthContent.<anonymous> (PostAuthContent.kt:32)");
                    }
                    Modifier.a aVar = Modifier.a;
                    c74 c74Var = c74.a;
                    Modifier i4 = PaddingKt.i(BackgroundKt.d(aVar, c74Var.a(composer3, 6).h().c(), null, 2, null), bu1.g(20));
                    j06 j06Var2 = j06.this;
                    qs2 qs2Var3 = qs2Var;
                    ss2 ss2Var2 = ss2Var;
                    qs2 qs2Var4 = qs2Var2;
                    composer3.z(-483455358);
                    rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), composer3, 0);
                    composer3.z(-1323940314);
                    fm1 fm1Var = (fm1) composer3.m(CompositionLocalsKt.e());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.m(CompositionLocalsKt.j());
                    r99 r99Var = (r99) composer3.m(CompositionLocalsKt.p());
                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                    qs2 a2 = companion.a();
                    it2 b = LayoutKt.b(i4);
                    if (composer3.j() == null) {
                        cs0.c();
                    }
                    composer3.G();
                    if (composer3.f()) {
                        composer3.D(a2);
                    } else {
                        composer3.p();
                    }
                    composer3.H();
                    Composer a3 = Updater.a(composer3);
                    Updater.c(a3, a, companion.e());
                    Updater.c(a3, fm1Var, companion.c());
                    Updater.c(a3, layoutDirection, companion.d());
                    Updater.c(a3, r99Var, companion.h());
                    composer3.c();
                    b.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                    composer3.z(2058660585);
                    composer3.z(-1163856341);
                    ap0 ap0Var = ap0.a;
                    PostAuthInfoSectionKt.a(j06Var2.d(), qs2Var3, composer3, 0);
                    DividerKt.a(null, c74Var.a(composer3, 6).j(), 0.0f, 0.0f, composer3, 0, 13);
                    SpacerKt.a(SizeKt.i(aVar, bu1.g(24)), composer3, 6);
                    PostAuthPurchaseSectionKt.a(j06Var2.e(), ss2Var2, qs2Var4, composer3, 0);
                    composer3.R();
                    composer3.R();
                    composer3.t();
                    composer3.R();
                    composer3.R();
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, 1769472, 15);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.growthui.postauth.components.PostAuthContentKt$PostAuthContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    PostAuthContentKt.a(j06.this, qs2Var, ss2Var, qs2Var2, composer3, i | 1);
                }
            });
        }
    }
}
