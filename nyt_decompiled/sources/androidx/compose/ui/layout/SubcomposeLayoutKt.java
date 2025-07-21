package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class SubcomposeLayoutKt {
    private static final a a = new a();

    public static final class a {
        a() {
        }

        public String toString() {
            return "ReusedSlotId";
        }
    }

    public static final void a(final Modifier modifier, final gt2 gt2Var, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(-1298353104);
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
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1298353104, i3, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:74)");
            }
            h.z(-492369756);
            Object A = h.A();
            if (A == Composer.a.a()) {
                A = new SubcomposeLayoutState();
                h.q(A);
            }
            h.R();
            SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) A;
            int i5 = i3 << 3;
            b(subcomposeLayoutState, modifier, gt2Var, h, (i5 & ContentType.LONG_FORM_ON_DEMAND) | 8 | (i5 & 896), 0);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2
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
                    SubcomposeLayoutKt.a(Modifier.this, gt2Var, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void b(final SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, final gt2 gt2Var, Composer composer, final int i, final int i2) {
        Composer h = composer.h(-511989831);
        if ((i2 & 2) != 0) {
            modifier = Modifier.a;
        }
        final Modifier modifier2 = modifier;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-511989831, i, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:108)");
        }
        int a2 = cs0.a(h, 0);
        androidx.compose.runtime.c d = cs0.d(h, 0);
        Modifier d2 = ComposedModifierKt.d(h, modifier2);
        et0 o = h.o();
        final qs2 a3 = LayoutNode.j0.a();
        h.z(1405779621);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(new qs2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$$inlined$ReusableComposeNode$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Object mo865invoke() {
                    return qs2.this.mo865invoke();
                }
            });
        } else {
            h.p();
        }
        Composer a4 = Updater.a(h);
        Updater.c(a4, subcomposeLayoutState, subcomposeLayoutState.g());
        Updater.c(a4, d, subcomposeLayoutState.e());
        Updater.c(a4, gt2Var, subcomposeLayoutState.f());
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        Updater.c(a4, o, companion.g());
        Updater.c(a4, d2, companion.f());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        h.t();
        h.R();
        if (!h.i()) {
            py1.h(new qs2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m72invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m72invoke() {
                    SubcomposeLayoutState.this.d();
                }
            }, h, 0);
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    SubcomposeLayoutKt.b(SubcomposeLayoutState.this, modifier2, gt2Var, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
