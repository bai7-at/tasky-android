package com.nytimes.android.features.games.gameshub.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dj7;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.gv1;
import defpackage.it2;
import defpackage.jj7;
import defpackage.jo7;
import defpackage.ju7;
import defpackage.jy7;
import defpackage.k48;
import defpackage.l74;
import defpackage.li8;
import defpackage.lj7;
import defpackage.m60;
import defpackage.ph8;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.rk6;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class SectionHeaderKt {
    public static final void a(final String str, final String str2, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        String str3;
        eb5.a aVar;
        float f;
        Composer composer3;
        zq3.h(qs2Var, "onClickSubtitleSubscription");
        Composer h = composer.h(-1710106971);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(str2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.C(qs2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i3 = i2;
        if ((i3 & 731) == 146 && h.i()) {
            h.K();
            composer3 = h;
        } else {
            if (b.G()) {
                b.S(-1710106971, i3, -1, "com.nytimes.android.features.games.gameshub.ui.components.SectionHeader (SectionHeader.kt:28)");
            }
            h.z(-483455358);
            Modifier.a aVar2 = Modifier.a;
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(aVar2);
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
            String str4 = str2 + k48.b(rk6.cd_play_tab_click_to_subscribe, h, 0);
            float f2 = 24;
            Modifier j = PaddingKt.j(aVar2, bu1.g(f2), bu1.g(12));
            eb5.a aVar3 = eb5.Companion;
            DividerKt.a(j, aVar3.a(h, 8).S(), bu1.g(2), 0.0f, h, 390, 8);
            h.z(836589592);
            if (str == null || h.d0(str)) {
                composer2 = h;
                str3 = str4;
                aVar = aVar3;
                f = f2;
            } else {
                String upperCase = str.toUpperCase(Locale.ROOT);
                zq3.g(upperCase, "toUpperCase(...)");
                aVar = aVar3;
                f = f2;
                composer2 = h;
                str3 = str4;
                TextKt.c(upperCase, PaddingKt.m(aVar2, bu1.g(f2), 0.0f, bu1.g(f2), bu1.g(8), 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.c(h, 8).p1(), composer2, 48, 0, 65532);
            }
            composer2.R();
            Composer composer4 = composer2;
            composer4.z(1532713360);
            if (str2 == null || h.d0(str2)) {
                composer3 = composer4;
            } else {
                a b2 = b(str2, composer4, (i3 >> 3) & 14);
                Modifier m = PaddingKt.m(aVar2, bu1.g(f), 0.0f, bu1.g(f), bu1.g(16), 2, null);
                composer4.z(836590150);
                final String str5 = str3;
                boolean S = composer4.S(str5);
                Object A = composer4.A();
                if (S || A == Composer.a.a()) {
                    A = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.SectionHeaderKt$SectionHeader$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(lj7 lj7Var) {
                            zq3.h(lj7Var, "$this$clearAndSetSemantics");
                            jj7.O(lj7Var, str5);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((lj7) obj);
                            return ww8.a;
                        }
                    };
                    composer4.q(A);
                }
                composer4.R();
                Modifier a5 = dj7.a(m, (ss2) A);
                j F = aVar.c(composer4, 8).F();
                composer4.z(836590300);
                boolean z = (i3 & 896) == 256;
                Object A2 = composer4.A();
                if (z || A2 == Composer.a.a()) {
                    A2 = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.SectionHeaderKt$SectionHeader$1$2$1
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Number) obj).intValue());
                            return ww8.a;
                        }

                        public final void invoke(int i4) {
                            qs2.this.mo865invoke();
                        }
                    };
                    composer4.q(A2);
                }
                composer4.R();
                composer3 = composer4;
                ClickableTextKt.a(b2, a5, F, false, 0, 0, null, (ss2) A2, composer4, 0, 120);
            }
            composer3.R();
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
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.SectionHeaderKt$SectionHeader$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer5, int i4) {
                    SectionHeaderKt.a(str, str2, qs2Var, composer5, gt6.a(i | 1));
                }
            });
        }
    }

    public static final a b(String str, Composer composer, int i) {
        composer.z(314578792);
        if (b.G()) {
            b.S(314578792, i, -1, "com.nytimes.android.features.games.gameshub.ui.components.buildSectionSubtitle (SectionHeader.kt:64)");
        }
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        if (str == null || !h.P(str, "subscribe to Games", false, 2, null)) {
            c0064a.append(str);
        } else {
            int b0 = h.b0(str, "subscribe to Games", 0, false, 6, null);
            int V = h.V(str) + 1;
            c0064a.i(str);
            c0064a.c(new jy7(0L, 0L, (o) null, (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, ph8.b.d(), (jo7) null, (f) null, (gv1) null, 61439, (DefaultConstructorMarker) null), b0, V);
        }
        a o = c0064a.o();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o;
    }
}
