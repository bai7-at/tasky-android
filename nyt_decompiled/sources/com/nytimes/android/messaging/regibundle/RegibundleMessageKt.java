package com.nytimes.android.messaging.regibundle;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
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
import com.comscore.streaming.ContentType;
import com.nytimes.android.messaging.regibundle.models.RegibundleData;
import com.nytimes.android.messaging.regibundle.models.RegibundleDataKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class RegibundleMessageKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r32, final java.lang.String r33, final java.lang.String r34, final defpackage.qs2 r35, androidx.compose.ui.Modifier r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.messaging.regibundle.RegibundleMessageKt.a(java.lang.String, java.lang.String, java.lang.String, qs2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r35, final boolean r36, final defpackage.qs2 r37, final defpackage.qs2 r38, androidx.compose.ui.Modifier r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.messaging.regibundle.RegibundleMessageKt.b(java.lang.String, boolean, qs2, qs2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(final boolean z, final String str, final RegibundleData regibundleData, Modifier modifier, qs2 qs2Var, qs2 qs2Var2, qs2 qs2Var3, qs2 qs2Var4, Composer composer, final int i, final int i2) {
        Modifier.a aVar;
        zq3.h(str, "pricingMessage");
        zq3.h(regibundleData, "regibundleData");
        Composer h = composer.h(-965039810);
        Modifier modifier2 = (i2 & 8) != 0 ? Modifier.a : modifier;
        qs2 qs2Var5 = (i2 & 16) != 0 ? new qs2() { // from class: com.nytimes.android.messaging.regibundle.RegibundleMessageKt$RegibundleScreen$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m610invoke() {
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m610invoke();
                return ww8.a;
            }
        } : qs2Var;
        qs2 qs2Var6 = (i2 & 32) != 0 ? new qs2() { // from class: com.nytimes.android.messaging.regibundle.RegibundleMessageKt$RegibundleScreen$2
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m611invoke() {
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m611invoke();
                return ww8.a;
            }
        } : qs2Var2;
        qs2 qs2Var7 = (i2 & 64) != 0 ? new qs2() { // from class: com.nytimes.android.messaging.regibundle.RegibundleMessageKt$RegibundleScreen$3
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m612invoke() {
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m612invoke();
                return ww8.a;
            }
        } : qs2Var3;
        qs2 qs2Var8 = (i2 & 128) != 0 ? new qs2() { // from class: com.nytimes.android.messaging.regibundle.RegibundleMessageKt$RegibundleScreen$4
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m613invoke() {
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m613invoke();
                return ww8.a;
            }
        } : qs2Var4;
        if (b.G()) {
            b.S(-965039810, i, -1, "com.nytimes.android.messaging.regibundle.RegibundleScreen (RegibundleMessage.kt:47)");
        }
        Modifier f = ScrollKt.f(modifier2, ScrollKt.c(0, h, 0, 1), false, null, false, 14, null);
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(f);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a3);
        } else {
            h.p();
        }
        Composer a4 = Updater.a(h);
        Updater.c(a4, a, companion.e());
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        int i3 = i >> 6;
        b(regibundleData.getLoginText(), z, qs2Var5, qs2Var8, null, h, ((i << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i3 & 896) | ((i >> 12) & 7168), 16);
        Modifier.a aVar2 = Modifier.a;
        float f2 = 1;
        Modifier h2 = SizeKt.h(SizeKt.i(aVar2, bu1.g(f2)), 0.0f, 1, null);
        eb5.a aVar3 = eb5.Companion;
        BoxKt.a(BackgroundKt.d(h2, aVar3.a(h, 8).W(), null, 2, null), h, 0);
        h.z(-545910614);
        if (z) {
            aVar = aVar2;
            a(regibundleData.getRegistration().getHeader(), regibundleData.getRegistration().getText(), regibundleData.getRegistration().getButtonText(), qs2Var6, PaddingKt.i(aVar2, bu1.g(40)), h, (i3 & 7168) | 24576, 0);
            BoxKt.a(BackgroundKt.d(PaddingKt.k(SizeKt.h(SizeKt.i(aVar, bu1.g(f2)), 0.0f, 1, null), bu1.g(24), 0.0f, 2, null), aVar3.a(h, 8).W(), null, 2, null), h, 0);
        } else {
            aVar = aVar2;
        }
        h.R();
        d(str, RegibundleDataKt.currentSubscriptionValues(regibundleData).getText(), RegibundleDataKt.currentSubscriptionValues(regibundleData).getButtonText(), qs2Var7, PaddingKt.i(aVar, bu1.g(40)), h, ((i >> 3) & 14) | 24576 | ((i >> 9) & 7168), 0);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            final qs2 qs2Var9 = qs2Var5;
            final qs2 qs2Var10 = qs2Var6;
            final qs2 qs2Var11 = qs2Var7;
            final qs2 qs2Var12 = qs2Var8;
            k.a(new gt2() { // from class: com.nytimes.android.messaging.regibundle.RegibundleMessageKt$RegibundleScreen$6
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
                    RegibundleMessageKt.c(z, str, regibundleData, modifier3, qs2Var9, qs2Var10, qs2Var11, qs2Var12, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r32, final java.lang.String r33, final java.lang.String r34, final defpackage.qs2 r35, androidx.compose.ui.Modifier r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.messaging.regibundle.RegibundleMessageKt.d(java.lang.String, java.lang.String, java.lang.String, qs2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
