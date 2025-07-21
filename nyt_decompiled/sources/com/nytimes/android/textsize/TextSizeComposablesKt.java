package com.nytimes.android.textsize;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.RadioButtonKt;
import androidx.compose.material.SwitchKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.j;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.font.FontScale;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
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
import defpackage.n37;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.ym2;
import defpackage.zq3;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public abstract class TextSizeComposablesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer h = composer.h(2049283145);
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
        if ((i3 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(2049283145, i3, -1, "com.nytimes.android.textsize.PreviewText (TextSizeComposables.kt:135)");
            }
            h.z(-483455358);
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(modifier3);
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
            eb5.a aVar = eb5.Companion;
            TextKt.c("Welcome to The New York Times", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.c(h, 8).U(), h, 6, 0, 65534);
            TextKt.c("The aim of The New York Times is to “give the news, all the news, in concise and attractive form … to give the news impartially, without fear or favor.”", PaddingKt.k(Modifier.a, 0.0f, bu1.g(8), 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.c(h, 8).a1(), h, 54, 0, 65532);
            j Z0 = aVar.c(h, 8).Z0();
            composer2 = h;
            TextKt.c("—Adolph S. Ochs, Aug. 18, 1896", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Z0, composer2, 6, 0, 65534);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
            modifier2 = modifier3;
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.textsize.TextSizeComposablesKt$PreviewText$2
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
                    TextSizeComposablesKt.a(Modifier.this, composer3, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final boolean z, final FontScale fontScale, final FontScale fontScale2, final ss2 ss2Var, Composer composer, final int i) {
        int i2;
        j c1;
        boolean z2;
        int i3;
        Composer composer2;
        Composer h = composer.h(-240490693);
        if ((i & 14) == 0) {
            i2 = (h.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(fontScale) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(fontScale2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.C(ss2Var) ? 2048 : 1024;
        }
        if ((i2 & 5851) == 1170 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-240490693, i2, -1, "com.nytimes.android.textsize.RadioSelection (TextSizeComposables.kt:50)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier h2 = SizeKt.h(aVar, 0.0f, 1, null);
            boolean z3 = !z;
            boolean z4 = fontScale == fontScale2;
            h.z(-1765039495);
            int i4 = i2 & 7168;
            boolean z5 = i4 == 2048;
            int i5 = i2 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z6 = z5 | (i5 == 32);
            Object A = h.A();
            if (z6 || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.android.textsize.TextSizeComposablesKt$RadioSelection$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m760invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m760invoke() {
                        ss2.this.invoke(fontScale);
                    }
                };
                h.q(A);
            }
            h.R();
            Modifier d = ModifierUtilsKt.d(PaddingKt.k(SelectableKt.c(h2, z4, z3, null, (qs2) A, 4, null), 0.0f, bu1.g(12), 1, null), fontScale.name());
            h.z(693286680);
            Arrangement.e f = Arrangement.a.f();
            Alignment.a aVar2 = Alignment.a;
            rg4 a = m.a(f, aVar2.l(), h, 0);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(d);
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
            n37 n37Var = n37.a;
            if (z) {
                h.z(-1780924313);
                c1 = eb5.Companion.c(h, 8).d1();
                h.R();
            } else {
                h.z(-1780924227);
                c1 = eb5.Companion.c(h, 8).c1();
                h.R();
            }
            j jVar = c1;
            float f2 = 20;
            Modifier n = SizeKt.n(aVar, bu1.g(f2));
            boolean z7 = fontScale == fontScale2;
            boolean z8 = !z;
            h.z(-1780924023);
            if (i4 == 2048) {
                i3 = 32;
                z2 = true;
            } else {
                z2 = false;
                i3 = 32;
            }
            boolean z9 = z2 | (i5 == i3);
            Object A2 = h.A();
            if (z9 || A2 == Composer.a.a()) {
                A2 = new qs2() { // from class: com.nytimes.android.textsize.TextSizeComposablesKt$RadioSelection$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m761invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m761invoke() {
                        ss2.this.invoke(fontScale);
                    }
                };
                h.q(A2);
            }
            h.R();
            RadioButtonKt.a(z7, (qs2) A2, n, z8, null, null, h, 384, 48);
            composer2 = h;
            TextKt.c(fontScale.name(), n37Var.c(PaddingKt.m(aVar, bu1.g(f2), 0.0f, 0.0f, 0.0f, 14, null), aVar2.i()), 0L, ym2.b(18, h, 6), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar, composer2, 0, 0, 65524);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.textsize.TextSizeComposablesKt$RadioSelection$3
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
                    TextSizeComposablesKt.b(z, fontScale, fontScale2, ss2Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final boolean z, final ss2 ss2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(-1586801560);
        if ((i & 14) == 0) {
            i2 = (h.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(ss2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1586801560, i2, -1, "com.nytimes.android.textsize.SwitchSelection (TextSizeComposables.kt:89)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier d = ModifierUtilsKt.d(PaddingKt.m(SizeKt.h(aVar, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bu1.g(16), 7, null), "Use System Settings");
            Arrangement.f d2 = Arrangement.a.d();
            h.z(693286680);
            Alignment.a aVar2 = Alignment.a;
            rg4 a = m.a(d2, aVar2.l(), h, 6);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(d);
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
            n37 n37Var = n37.a;
            TextKt.c("Use System Settings", n37Var.c(aVar, aVar2.i()), 0L, ym2.b(18, h, 6), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).c1(), h, 6, 0, 65524);
            Modifier c2 = n37Var.c(aVar, aVar2.i());
            h.z(-33948573);
            boolean z2 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object A = h.A();
            if (z2 || A == Composer.a.a()) {
                A = new ss2() { // from class: com.nytimes.android.textsize.TextSizeComposablesKt$SwitchSelection$1$1$1
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return ww8.a;
                    }

                    public final void invoke(boolean z3) {
                        ss2.this.invoke(Boolean.valueOf(z3));
                    }
                };
                h.q(A);
            }
            h.R();
            composer2 = h;
            SwitchKt.a(z, (ss2) A, c2, false, null, null, h, i2 & 14, 56);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            d(composer2, 0);
            SpacerKt.a(SizeKt.i(aVar, bu1.g(20)), composer2, 6);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.textsize.TextSizeComposablesKt$SwitchSelection$2
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
                    TextSizeComposablesKt.c(z, ss2Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Composer composer, final int i) {
        Composer h = composer.h(-1103334245);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1103334245, i, -1, "com.nytimes.android.textsize.TextDivider (TextSizeComposables.kt:114)");
            }
            DividerKt.a(null, eb5.Companion.a(h, 8).W(), bu1.g(1), 0.0f, h, 384, 9);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.textsize.TextSizeComposablesKt$TextDivider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    TextSizeComposablesKt.d(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void e(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer h = composer.h(56490519);
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
        if ((i3 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(56490519, i3, -1, "com.nytimes.android.textsize.TextSizePreviewSection (TextSizeComposables.kt:122)");
            }
            h.z(-483455358);
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(modifier3);
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
            j b1 = eb5.Companion.c(h, 8).b1();
            Modifier.a aVar = Modifier.a;
            TextKt.c("Preview", PaddingKt.m(aVar, 0.0f, 0.0f, 0.0f, bu1.g(4), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b1, h, 54, 0, 65532);
            composer2 = h;
            d(composer2, 0);
            a(PaddingKt.k(aVar, 0.0f, bu1.g(24), 1, null), composer2, 6, 0);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
            modifier2 = modifier3;
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.textsize.TextSizeComposablesKt$TextSizePreviewSection$2
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
                    TextSizeComposablesKt.e(Modifier.this, composer3, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void f(final FontScale[] fontScaleArr, final FontScale fontScale, final ss2 ss2Var, final boolean z, final ss2 ss2Var2, Modifier modifier, Composer composer, final int i, final int i2) {
        zq3.h(fontScaleArr, "options");
        zq3.h(fontScale, "fontScaleSelection");
        zq3.h(ss2Var, "onOptionSelected");
        zq3.h(ss2Var2, "onSystemSelected");
        Composer h = composer.h(162974011);
        final Modifier modifier2 = (i2 & 32) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(162974011, i, -1, "com.nytimes.android.textsize.TextSizeToggles (TextSizeComposables.kt:34)");
        }
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(modifier2);
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
        int i3 = i >> 9;
        int i4 = i3 & 14;
        c(z, ss2Var2, h, i3 & WebSocketProtocol.PAYLOAD_SHORT);
        h.z(-1055335750);
        for (FontScale fontScale2 : fontScaleArr) {
            int i5 = i << 3;
            b(z, fontScale2, fontScale, ss2Var, h, (i5 & 896) | i4 | (i5 & 7168));
        }
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
            k.a(new gt2() { // from class: com.nytimes.android.textsize.TextSizeComposablesKt$TextSizeToggles$2
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
                    TextSizeComposablesKt.f(fontScaleArr, fontScale, ss2Var, z, ss2Var2, modifier2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
