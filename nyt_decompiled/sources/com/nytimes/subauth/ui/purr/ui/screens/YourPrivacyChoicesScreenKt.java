package com.nytimes.subauth.ui.purr.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.navigation.NavController;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.subauth.ui.purr.ui.compose.PurrComposeUIKt;
import com.nytimes.subauth.ui.purr.ui.compose.TextFieldsKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.bv8;
import defpackage.cc7;
import defpackage.cf6;
import defpackage.cs0;
import defpackage.dh8;
import defpackage.do5;
import defpackage.eb0;
import defpackage.fb0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.m36;
import defpackage.mm6;
import defpackage.n37;
import defpackage.qm9;
import defpackage.qs2;
import defpackage.r81;
import defpackage.r99;
import defpackage.rg4;
import defpackage.uh8;
import defpackage.ve0;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class YourPrivacyChoicesScreenKt {
    public static final void a(final x08 x08Var, final qs2 qs2Var, final NavController navController, Composer composer, final int i) {
        j b;
        Composer composer2;
        zq3.h(x08Var, TransferTable.COLUMN_STATE);
        zq3.h(qs2Var, "onOptOutClick");
        zq3.h(navController, "navController");
        Composer h = composer.h(-526734072);
        if (b.G()) {
            b.S(-526734072, i, -1, "com.nytimes.subauth.ui.purr.ui.screens.YourPrivacyChoicesScreen (YourPrivacyChoicesScreen.kt:45)");
        }
        Modifier.a aVar = Modifier.a;
        m36 m36Var = m36.a;
        Modifier d = SizeKt.d(BackgroundKt.d(aVar, m36Var.a(h, 6).b().c(), null, 2, null), 0.0f, 1, null);
        h.z(-483455358);
        Arrangement arrangement = Arrangement.a;
        Arrangement.m g = arrangement.g();
        Alignment.a aVar2 = Alignment.a;
        rg4 a = d.a(g, aVar2.k(), h, 0);
        h.z(-1323940314);
        fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
        r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a2 = companion.a();
        it2 b2 = LayoutKt.b(d);
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
        b2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        h.z(-1163856341);
        ap0 ap0Var = ap0.a;
        PurrComposeUIKt.a(mm6.your_privacy_choices, navController, h, 64);
        int i2 = mm6.opt_out;
        b = r20.b((r42 & 1) != 0 ? r20.a.i() : m36Var.a(h, 6).b().j(), (r42 & 2) != 0 ? r20.a.m() : 0L, (r42 & 4) != 0 ? r20.a.p() : o.b.a(), (r42 & 8) != 0 ? r20.a.n() : null, (r42 & 16) != 0 ? r20.a.o() : null, (r42 & 32) != 0 ? r20.a.k() : null, (r42 & 64) != 0 ? r20.a.l() : null, (r42 & 128) != 0 ? r20.a.q() : 0L, (r42 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r20.a.g() : null, (r42 & 512) != 0 ? r20.a.w() : null, (r42 & 1024) != 0 ? r20.a.r() : null, (r42 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r20.a.f() : 0L, (r42 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r20.a.u() : null, (r42 & 8192) != 0 ? r20.a.t() : null, (r42 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dh8.h(r20.b.h()) : null, (r42 & 32768) != 0 ? uh8.g(r20.b.i()) : null, (r42 & 65536) != 0 ? r20.b.e() : 0L, (r42 & 131072) != 0 ? bv8.b().b.j() : null);
        TextFieldsKt.a(null, i2, 0L, b, h, 0, 5);
        TextFieldsKt.b(null, mm6.privacy_choices_body, 0L, h, 0, 5);
        if (((qm9) x08Var.getValue()).a()) {
            h.z(1649528029);
            float f = 16;
            SpacerKt.a(PaddingKt.i(aVar, bu1.g(f)), h, 6);
            Modifier c = ap0Var.c(SizeKt.s(PaddingKt.j(BackgroundKt.d(aVar, m36Var.a(h, 6).m(), null, 2, null), bu1.g(20), bu1.g(12)), bu1.g(310)), aVar2.g());
            Arrangement.f b3 = arrangement.b();
            Alignment.c i3 = aVar2.i();
            h.z(693286680);
            rg4 a4 = m.a(b3, i3, h, 54);
            h.z(-1323940314);
            fm1 fm1Var2 = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection2 = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var2 = (r99) h.m(CompositionLocalsKt.p());
            qs2 a5 = companion.a();
            it2 b4 = LayoutKt.b(c);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a5);
            } else {
                h.p();
            }
            h.H();
            Composer a6 = Updater.a(h);
            Updater.c(a6, a4, companion.e());
            Updater.c(a6, fm1Var2, companion.c());
            Updater.c(a6, layoutDirection2, companion.d());
            Updater.c(a6, r99Var2, companion.h());
            h.c();
            b4.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-678309503);
            n37 n37Var = n37.a;
            ImageKt.b(do5.d(r81.a(h, 0) ? cf6.greencheckdark : cf6.greencheck, h, 0), "", PaddingKt.m(aVar, bu1.g(7), bu1.g(4), 0.0f, 0.0f, 12, null), null, null, 0.0f, null, h, 440, 120);
            TextFieldsKt.b(null, mm6.opted_out_confirmation, 0L, h, 0, 5);
            h.R();
            h.R();
            h.t();
            h.R();
            h.R();
            if (((qm9) x08Var.getValue()).b()) {
                SpacerKt.a(PaddingKt.i(aVar, bu1.g(f)), h, 6);
                TextFieldsKt.b(null, mm6.pref_may_be_forgotten, 0L, h, 0, 5);
            }
            h.R();
            composer2 = h;
        } else {
            h.z(1650656274);
            ve0 j = androidx.compose.material.a.a.j(m36Var.a(h, 6).b().c(), m36Var.a(h, 6).b().j(), 0L, h, androidx.compose.material.a.l << 9, 4);
            eb0 a7 = fb0.a(bu1.g(1), m36Var.a(h, 6).b().j());
            Modifier i4 = PaddingKt.i(SizeKt.h(aVar, 0.0f, 1, null), bu1.g(22));
            h.z(-500941497);
            boolean S = h.S(qs2Var);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.YourPrivacyChoicesScreenKt$YourPrivacyChoicesScreen$1$2$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m816invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m816invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A);
            }
            h.R();
            composer2 = h;
            ButtonKt.c((qs2) A, i4, false, null, null, null, a7, j, null, ComposableSingletons$YourPrivacyChoicesScreenKt.a.a(), h, 805306416, 316);
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
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.YourPrivacyChoicesScreenKt$YourPrivacyChoicesScreen$2
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
                    YourPrivacyChoicesScreenKt.a(x08.this, qs2Var, navController, composer3, i | 1);
                }
            });
        }
    }
}
