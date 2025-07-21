package com.nytimes.android.features.games.gameshub.ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.a;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.ck3;
import defpackage.dk3;
import defpackage.du5;
import defpackage.du8;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.vt5;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public abstract class PlayTabInformationKt {
    public static final void a(final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(str, "title");
        zq3.h(str2, "subtitle");
        Composer h = composer.h(-1253006902);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(str2) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1253006902, i2, -1, "com.nytimes.android.features.games.gameshub.ui.components.GamesFooter (PlayTabInformation.kt:34)");
            }
            a.C0064a c0064a = new a.C0064a(0, 1, null);
            c0064a.i(str);
            dk3.b(c0064a, "sparkleIcon", null, 2, null);
            a o = c0064a.o();
            Map f = t.f(du8.a("sparkleIcon", new ck3(new vt5(ek8.g(30), ek8.g(30), du5.a.e(), null), ComposableSingletons$PlayTabInformationKt.a.a())));
            Modifier.a aVar = Modifier.a;
            float f2 = 24;
            Modifier m = PaddingKt.m(aVar, bu1.g(f2), bu1.g(16), bu1.g(f2), 0.0f, 8, null);
            eb5.a aVar2 = eb5.Companion;
            TextKt.d(o, m, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, f, null, aVar2.c(h, 8).I0(), h, 48, 0, 98300);
            TextKt.c(str2, PaddingKt.k(aVar, bu1.g(f2), 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(h, 8).H0(), h, ((i2 >> 3) & 14) | 48, 0, 65532);
            composer2 = h;
            SpacerKt.a(SizeKt.i(aVar, bu1.g(64)), composer2, 6);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.PlayTabInformationKt$GamesFooter$1
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
                    PlayTabInformationKt.a(str, str2, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(str, "title");
        zq3.h(str2, "subtitle");
        Composer h = composer.h(1992563644);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(str2) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(1992563644, i3, -1, "com.nytimes.android.features.games.gameshub.ui.components.GamesHeader (PlayTabInformation.kt:20)");
            }
            Modifier.a aVar = Modifier.a;
            float f = 24;
            Modifier m = PaddingKt.m(aVar, bu1.g(f), bu1.g(f), bu1.g(f), 0.0f, 8, null);
            eb5.a aVar2 = eb5.Companion;
            TextKt.c(str, m, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(h, 8).K0(), h, (i3 & 14) | 48, 0, 65532);
            composer2 = h;
            TextKt.c(str2, PaddingKt.k(aVar, bu1.g(f), 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(h, 8).J0(), composer2, ((i3 >> 3) & 14) | 48, 0, 65532);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.PlayTabInformationKt$GamesHeader$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i4) {
                    PlayTabInformationKt.b(str, str2, composer3, gt6.a(i | 1));
                }
            });
        }
    }
}
