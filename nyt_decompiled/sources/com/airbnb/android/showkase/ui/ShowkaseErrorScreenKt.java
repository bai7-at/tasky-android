package com.airbnb.android.showkase.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.SnackbarKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ap0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.rq1;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public abstract class ShowkaseErrorScreenKt {
    public static final void a(final String str, Composer composer, final int i) {
        final int i2;
        Composer composer2;
        zq3.h(str, "errorText");
        Composer h = composer.h(594388046);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(594388046, i2, -1, "com.airbnb.android.showkase.ui.ShowkaseErrorScreen (ShowkaseErrorScreen.kt:13)");
            }
            Arrangement.f b = Arrangement.a.b();
            Modifier.a aVar = Modifier.a;
            Modifier d = SizeKt.d(aVar, 0.0f, 1, null);
            h.z(-483455358);
            rg4 a = d.a(b, Alignment.a.k(), h, 6);
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
            composer2 = h;
            SnackbarKt.c(PaddingKt.i(aVar, rq1.c()), null, false, null, 0L, 0L, 0.0f, zr0.b(h, 419974943, true, new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseErrorScreenKt$ShowkaseErrorScreen$1$1
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
                        b.S(419974943, i3, -1, "com.airbnb.android.showkase.ui.ShowkaseErrorScreen.<anonymous>.<anonymous> (ShowkaseErrorScreen.kt:17)");
                    }
                    TextKt.e(str, PaddingKt.i(Modifier.a, rq1.a()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, (i2 & 14) | 48, 0, 65532);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, 12582918, WebSocketProtocol.PAYLOAD_SHORT);
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
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseErrorScreenKt$ShowkaseErrorScreen$2
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
                ShowkaseErrorScreenKt.a(str, composer3, i | 1);
            }
        });
    }
}
