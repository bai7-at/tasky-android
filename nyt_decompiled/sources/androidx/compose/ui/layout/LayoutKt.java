package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes.dex */
public abstract class LayoutKt {
    public static final void a(Modifier modifier, final gt2 gt2Var, final rg4 rg4Var, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(1949933075);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.C(gt2Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(rg4Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i3 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1949933075, i3, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:246)");
            }
            int a = cs0.a(h, 0);
            Modifier d = ComposedModifierKt.d(h, modifier);
            et0 o = h.o();
            qs2 a2 = LayoutNode.j0.a();
            int i5 = ((i3 << 3) & 896) | 6;
            h.z(-692256719);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a2);
            } else {
                h.p();
            }
            Composer a3 = Updater.a(h);
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            Updater.c(a3, rg4Var, companion.e());
            Updater.c(a3, o, companion.g());
            Updater.b(a3, new ss2() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                public final void b(LayoutNode layoutNode) {
                    layoutNode.p1(true);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((LayoutNode) obj);
                    return ww8.a;
                }
            });
            Updater.c(a3, d, companion.f());
            gt2 b = companion.b();
            if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
                a3.q(Integer.valueOf(a));
                a3.v(Integer.valueOf(a), b);
            }
            gt2Var.invoke(h, Integer.valueOf((i5 >> 6) & 14));
            h.t();
            h.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        final Modifier modifier2 = modifier;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$2
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
                    LayoutKt.a(Modifier.this, gt2Var, rg4Var, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final it2 b(final Modifier modifier) {
        return zr0.c(-55743822, true, new it2() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOfWithCompositionLocalInjection$1
            {
                super(3);
            }

            public final void b(Composer composer, Composer composer2, int i) {
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-55743822, i, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:226)");
                }
                int a = cs0.a(composer2, 0);
                Modifier e = ComposedModifierKt.e(composer2, Modifier.this);
                composer.z(509942095);
                Composer a2 = Updater.a(composer);
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                Updater.c(a2, e, companion.f());
                gt2 b = companion.b();
                if (a2.f() || !zq3.c(a2.A(), Integer.valueOf(a))) {
                    a2.q(Integer.valueOf(a));
                    a2.v(Integer.valueOf(a), b);
                }
                composer.R();
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b(((ju7) obj).f(), (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        });
    }

    public static final it2 c(final Modifier modifier) {
        return zr0.c(-1586257396, true, new it2() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOf$1
            {
                super(3);
            }

            public final void b(Composer composer, Composer composer2, int i) {
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-1586257396, i, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:203)");
                }
                int a = cs0.a(composer2, 0);
                Modifier d = ComposedModifierKt.d(composer2, Modifier.this);
                composer.z(509942095);
                Composer a2 = Updater.a(composer);
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                Updater.c(a2, d, companion.f());
                gt2 b = companion.b();
                if (a2.f() || !zq3.c(a2.A(), Integer.valueOf(a))) {
                    a2.q(Integer.valueOf(a));
                    a2.v(Integer.valueOf(a), b);
                }
                composer.R();
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b(((ju7) obj).f(), (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        });
    }
}
