package com.nytimes.android.growthui.common.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.ek8;
import defpackage.fm1;
import defpackage.gn2;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class ErrorMessageKt {
    public static final void a(Modifier modifier, final String str, final String str2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        zq3.h(str, "title");
        zq3.h(str2, "message");
        Composer h = composer.h(1658715612);
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
            i3 |= h.S(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(str2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i5 = i3;
        if ((i5 & 731) == 146 && h.i()) {
            h.K();
            modifier3 = modifier2;
            composer2 = h;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(1658715612, i5, -1, "com.nytimes.android.growthui.common.components.ErrorMessage (ErrorMessage.kt:18)");
            }
            h.z(-483455358);
            Arrangement.m g = Arrangement.a.g();
            Alignment.a aVar = Alignment.a;
            rg4 a = d.a(g, aVar.k(), h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(modifier4);
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
            Modifier.a aVar2 = Modifier.a;
            float f = 16;
            composer2 = h;
            TextKt.e(str, PaddingKt.m(ap0Var.c(aVar2, aVar.g()), 0.0f, bu1.g(f), 0.0f, 0.0f, 13, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, new j(0L, ek8.g(13), o.b.g(), null, null, gn2.b(), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262105, null), composer2, (i5 >> 3) & 14, 0, 32764);
            TextKt.e(str2, PaddingKt.m(ap0Var.c(aVar2, aVar.g()), 0.0f, bu1.g(8), 0.0f, bu1.g(f), 5, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, new j(0L, ek8.g(13), null, null, null, gn2.b(), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262109, null), composer2, (i5 >> 6) & 14, 0, 32764);
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
            modifier3 = modifier4;
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.growthui.common.components.ErrorMessageKt$ErrorMessage$2
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
                    ErrorMessageKt.a(Modifier.this, str, str2, composer3, i | 1, i2);
                }
            });
        }
    }
}
