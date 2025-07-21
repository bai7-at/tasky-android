package com.nytimes.subauth.ui.ui.screens.regilite;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.i;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.LayoutDirection;
import com.nytimes.subauth.ui.login.SubauthLoginViewModel;
import com.nytimes.subauth.ui.models.CtaButtonStatus;
import com.nytimes.subauth.ui.ui.widgets.CtaButtonWithProgressKt;
import com.nytimes.subauth.ui.ui.widgets.NoticesTextKt;
import com.nytimes.subauth.ui.ui.widgets.TextFieldsKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.mm6;
import defpackage.qs2;
import defpackage.r54;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zo0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class CreateNewPasswordScreenKt {
    public static final void a(Modifier modifier, final SubauthLoginViewModel subauthLoginViewModel, final boolean z, final boolean z2, final gt2 gt2Var, String str, ss2 ss2Var, Composer composer, final int i, final int i2) {
        zq3.h(subauthLoginViewModel, "viewModel");
        zq3.h(gt2Var, "onWebItem");
        Composer h = composer.h(1253479276);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.a : modifier;
        String str2 = (i2 & 32) != 0 ? null : str;
        ss2 ss2Var2 = (i2 & 64) != 0 ? new ss2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.CreateNewPasswordScreenKt$CreateNewPasswordScreen$1
            public final void invoke(String str3) {
                zq3.h(str3, "it");
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }
        } : ss2Var;
        if (b.G()) {
            b.S(1253479276, i, -1, "com.nytimes.subauth.ui.ui.screens.regilite.CreateNewPasswordScreen (CreateNewPasswordScreen.kt:43)");
        }
        x08 b = y.b(subauthLoginViewModel.Y(), null, h, 8, 1);
        r54 b2 = b(b);
        zq3.f(b2, "null cannot be cast to non-null type com.nytimes.subauth.ui.login.helpers.LireScreenState.CreateNewPasswordScreen");
        final String f = ((r54.c) b2).f();
        r54 b3 = b(b);
        zq3.f(b3, "null cannot be cast to non-null type com.nytimes.subauth.ui.login.helpers.LireScreenState.CreateNewPasswordScreen");
        final String g = ((r54.c) b3).g();
        r54 b4 = b(b);
        zq3.f(b4, "null cannot be cast to non-null type com.nytimes.subauth.ui.login.helpers.LireScreenState.CreateNewPasswordScreen");
        boolean h2 = ((r54.c) b4).h();
        x08 b5 = y.b(subauthLoginViewModel.l0(), null, h, 8, 1);
        h.z(954734608);
        Object A = h.A();
        if (A == Composer.a.a()) {
            A = b0.e(new TextFieldValue(str2 == null ? "" : str2, 0L, (i) null, 6, (DefaultConstructorMarker) null), null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        float f2 = 24;
        Modifier a = WindowInsetsPadding_androidKt.a(PaddingKt.k(modifier2, 0.0f, bu1.g(f2), 1, null));
        h.z(-483455358);
        Arrangement arrangement = Arrangement.a;
        Arrangement.m g2 = arrangement.g();
        Alignment.a aVar = Alignment.a;
        rg4 a2 = d.a(g2, aVar.k(), h, 0);
        h.z(-1323940314);
        fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
        r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 b6 = LayoutKt.b(a);
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
        final String str3 = str2;
        Updater.c(a4, a2, companion.e());
        Updater.c(a4, fm1Var, companion.c());
        Updater.c(a4, layoutDirection, companion.d());
        Updater.c(a4, r99Var, companion.h());
        h.c();
        b6.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        h.z(-1163856341);
        ap0 ap0Var = ap0.a;
        Modifier.a aVar2 = Modifier.a;
        Modifier b7 = zo0.b(ap0Var, aVar2, 1.0f, false, 2, null);
        h.z(-483455358);
        rg4 a5 = d.a(arrangement.g(), aVar.k(), h, 0);
        h.z(-1323940314);
        fm1 fm1Var2 = (fm1) h.m(CompositionLocalsKt.e());
        LayoutDirection layoutDirection2 = (LayoutDirection) h.m(CompositionLocalsKt.j());
        r99 r99Var2 = (r99) h.m(CompositionLocalsKt.p());
        final Modifier modifier3 = modifier2;
        qs2 a6 = companion.a();
        it2 b8 = LayoutKt.b(b7);
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
        b8.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        h.z(-1163856341);
        d(g, h2, h, 0, 0);
        SpacerKt.a(SizeKt.i(aVar2, bu1.g(40)), h, 6);
        int i3 = i >> 6;
        TextFieldsKt.d(SizeKt.h(aVar2, 0.0f, 1, null), sy4Var, null, !c(b5), ss2Var2, new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.CreateNewPasswordScreenKt$CreateNewPasswordScreen$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m846invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m846invoke() {
                SubauthLoginViewModel.this.B0(g, ((TextFieldValue) sy4Var.getValue()).h(), f);
            }
        }, h, (57344 & i3) | 54, 4);
        h.z(-994563793);
        if (z) {
            NoticesTextKt.a(z2, PaddingKt.m(ap0Var.c(SizeKt.h(aVar2, 0.0f, 1, null), aVar.g()), 0.0f, bu1.g(f2), 0.0f, bu1.g(20), 5, null), gt2Var, h, ((i >> 9) & 14) | (i3 & 896), 0);
        }
        h.R();
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        CtaButtonWithProgressKt.a(SizeKt.h(aVar2, 0.0f, 1, null), k48.b(mm6.subauth_set_password, h, 0), ((TextFieldValue) sy4Var.getValue()).h().length() == 0 ? CtaButtonStatus.DISABLED : c(b5) ? CtaButtonStatus.LOADING : CtaButtonStatus.ENABLED, null, new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.CreateNewPasswordScreenKt$CreateNewPasswordScreen$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m847invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m847invoke() {
                SubauthLoginViewModel.this.B0(g, ((TextFieldValue) sy4Var.getValue()).h(), f);
            }
        }, 0L, 0L, 0L, 0L, 0L, 0L, null, h, 6, 0, 4072);
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final ss2 ss2Var3 = ss2Var2;
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.CreateNewPasswordScreenKt$CreateNewPasswordScreen$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    CreateNewPasswordScreenKt.a(Modifier.this, subauthLoginViewModel, z, z2, gt2Var, str3, ss2Var3, composer2, i | 1, i2);
                }
            });
        }
    }

    private static final r54 b(x08 x08Var) {
        return (r54) x08Var.getValue();
    }

    private static final boolean c(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r42, boolean r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.screens.regilite.CreateNewPasswordScreenKt.d(java.lang.String, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}
