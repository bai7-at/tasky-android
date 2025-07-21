package com.nytimes.android.libs.messagingarchitecture.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.j;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.composable.ButtonKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dk8;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.m37;
import defpackage.n37;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class MessageTooltipMediumContentKt {
    public static final void a(final a aVar, final String str, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        int i3;
        Modifier.a aVar2;
        n37 n37Var;
        Composer composer2;
        Composer composer3;
        zq3.h(aVar, "text");
        zq3.h(qs2Var, "onClickClose");
        Composer h = composer.h(60223109);
        if ((i & 14) == 0) {
            i2 = (h.S(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.C(qs2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i4 = i2;
        if ((i4 & 731) == 146 && h.i()) {
            h.K();
            composer3 = h;
        } else {
            if (b.G()) {
                b.S(60223109, i4, -1, "com.nytimes.android.libs.messagingarchitecture.composable.MessageTooltipMediumContent (MessageTooltipMediumContent.kt:24)");
            }
            Modifier.a aVar3 = Modifier.a;
            Modifier h2 = SizeKt.h(aVar3, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.a;
            Arrangement.e c = arrangement.c();
            h.z(693286680);
            Alignment.a aVar4 = Alignment.a;
            rg4 a = m.a(c, aVar4.l(), h, 6);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c2 = LayoutKt.c(h2);
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
            c2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            n37 n37Var2 = n37.a;
            Modifier b2 = m37.b(n37Var2, aVar3, 1.0f, false, 2, null);
            h.z(-483455358);
            rg4 a5 = d.a(arrangement.g(), aVar4.k(), h, 0);
            h.z(-1323940314);
            int a6 = cs0.a(h, 0);
            et0 o2 = h.o();
            qs2 a7 = companion.a();
            it2 c3 = LayoutKt.c(b2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a7);
            } else {
                h.p();
            }
            Composer a8 = Updater.a(h);
            Updater.c(a8, a5, companion.e());
            Updater.c(a8, o2, companion.g());
            gt2 b3 = companion.b();
            if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                a8.q(Integer.valueOf(a6));
                a8.v(Integer.valueOf(a6), b3);
            }
            c3.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            h.z(-1487272710);
            if (str != null) {
                i3 = i4;
                aVar2 = aVar3;
                n37Var = n37Var2;
                composer2 = h;
                TextKt.c(str, PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, bu1.g(4), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).m1(), composer2, ((i4 >> 3) & 14) | 48, 0, 65532);
            } else {
                i3 = i4;
                aVar2 = aVar3;
                n37Var = n37Var2;
                composer2 = h;
            }
            composer2.R();
            eb5.a aVar5 = eb5.Companion;
            Composer composer4 = composer2;
            j q0 = aVar5.c(composer4, 8).q0();
            long p = aVar5.c(composer4, 8).q0().p();
            ek8.b(p);
            TextKt.d(aVar, null, 0L, 0L, null, null, null, 0L, null, null, ek8.j(dk8.f(p), (float) (dk8.h(p) * 1.3d)), 0, false, 0, 0, null, null, q0, composer2, i3 & 14, 0, 130046);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            composer3 = composer2;
            ButtonKt.c(bu1.g(16), bu1.g(0), aVar5.a(composer3, 8).r(), qs2Var, n37Var.c(aVar2, aVar4.l()), 0, 0, composer3, ((i3 << 3) & 7168) | 54, 96);
            composer3.R();
            composer3.t();
            composer3.R();
            composer3.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer3.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.composable.MessageTooltipMediumContentKt$MessageTooltipMediumContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer5, int i5) {
                    MessageTooltipMediumContentKt.a(a.this, str, qs2Var, composer5, gt6.a(i | 1));
                }
            });
        }
    }
}
