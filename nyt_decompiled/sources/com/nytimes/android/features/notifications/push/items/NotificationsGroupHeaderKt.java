package com.nytimes.android.features.notifications.push.items;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.j;
import com.nytimes.android.features.notifications.push.NotificationsPermissionProviderKt;
import com.nytimes.android.features.notifications.push.e;
import com.nytimes.piano.PianoSpacing;
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
import defpackage.pb;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class NotificationsGroupHeaderKt {
    public static final void a(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(str, "groupTitle");
        Composer h = composer.h(-1600460905);
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
                b.S(-1600460905, i2, -1, "com.nytimes.android.features.notifications.push.items.NotificationsGroupHeader (NotificationsGroupHeader.kt:19)");
            }
            float a = ((e) h.m(NotificationsPermissionProviderKt.b())).a();
            h.z(-483455358);
            Modifier.a aVar = Modifier.a;
            rg4 a2 = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            int a3 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a4 = companion.a();
            it2 c = LayoutKt.c(aVar);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a4);
            } else {
                h.p();
            }
            Composer a5 = Updater.a(h);
            Updater.c(a5, a2, companion.e());
            Updater.c(a5, o, companion.g());
            gt2 b = companion.b();
            if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                a5.q(Integer.valueOf(a3));
                a5.v(Integer.valueOf(a3), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            Modifier a6 = pb.a(aVar, a);
            eb5.a aVar2 = eb5.Companion;
            DividerKt.a(a6, aVar2.a(h, 8).l(), bu1.g(2), 0.0f, h, 384, 8);
            PianoSpacing pianoSpacing = PianoSpacing.spacing_1;
            SpacerKt.a(SizeKt.i(aVar, bu1.g(pianoSpacing.getInDp())), h, 0);
            Modifier k = PaddingKt.k(pb.a(aVar, a), 0.0f, bu1.g(pianoSpacing.getInDp()), 1, null);
            j r0 = aVar2.c(h, 8).r0();
            String upperCase = str.toUpperCase(Locale.ROOT);
            zq3.g(upperCase, "toUpperCase(...)");
            composer2 = h;
            TextKt.c(upperCase, k, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0, composer2, 0, 0, 65532);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k2 = composer2.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.features.notifications.push.items.NotificationsGroupHeaderKt$NotificationsGroupHeader$2
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
                    NotificationsGroupHeaderKt.a(str, composer3, gt6.a(i | 1));
                }
            });
        }
    }
}
