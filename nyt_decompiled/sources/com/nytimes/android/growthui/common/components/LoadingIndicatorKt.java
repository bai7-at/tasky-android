package com.nytimes.android.growthui.common.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.ProgressIndicatorKt;
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
import defpackage.ap0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ww8;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public abstract class LoadingIndicatorKt {
    public static final void a(Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(1568866821);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = 2 & i2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.e(j) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (i5 != 0) {
                j = nn0.b.g();
            }
            if (b.G()) {
                b.S(1568866821, i3, -1, "com.nytimes.android.growthui.common.components.LoadingIndicator (LoadingIndicator.kt:16)");
            }
            Modifier f = SizeKt.f(Modifier.a, 0.0f, 1, null);
            Arrangement.f b = Arrangement.a.b();
            Alignment.b g = Alignment.a.g();
            h.z(-483455358);
            rg4 a = d.a(b, g, h, 54);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b2 = LayoutKt.b(f);
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
            ProgressIndicatorKt.b(modifier, j, 0.0f, h, i3 & WebSocketProtocol.PAYLOAD_SHORT, 4);
            h.R();
            h.R();
            h.t();
            h.R();
            h.R();
            if (b.G()) {
                b.R();
            }
        }
        final Modifier modifier2 = modifier;
        final long j2 = j;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.growthui.common.components.LoadingIndicatorKt$LoadingIndicator$2
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
                    LoadingIndicatorKt.a(Modifier.this, j2, composer2, i | 1, i2);
                }
            });
        }
    }
}
