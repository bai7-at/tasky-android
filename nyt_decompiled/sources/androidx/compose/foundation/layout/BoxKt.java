package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.in3;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BoxKt {
    private static final rg4 a = new BoxMeasurePolicy(Alignment.a.o(), false);
    private static final rg4 b = new rg4() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1
        @Override // defpackage.rg4
        public final sg4 d(androidx.compose.ui.layout.f fVar, List list, long j) {
            return androidx.compose.ui.layout.f.J(fVar, fv0.p(j), fv0.o(j), null, new ss2() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1.1
                public final void b(l.a aVar) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((l.a) obj);
                    return ww8.a;
                }
            }, 4, null);
        }
    };

    public static final void a(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-211209833);
        if ((i & 14) == 0) {
            i2 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-211209833, i2, -1, "androidx.compose.foundation.layout.Box (Box.kt:207)");
            }
            rg4 rg4Var = b;
            h.z(544976794);
            int a2 = cs0.a(h, 0);
            Modifier d = ComposedModifierKt.d(h, modifier);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            final qs2 a3 = companion.a();
            h.z(1405779621);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(new qs2() { // from class: androidx.compose.foundation.layout.BoxKt$Box$$inlined$Layout$1
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
            Updater.c(a4, rg4Var, companion.e());
            Updater.c(a4, o, companion.g());
            Updater.c(a4, d, companion.f());
            gt2 b2 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b2);
            }
            h.t();
            h.R();
            h.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.layout.BoxKt$Box$2
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
                    BoxKt.a(Modifier.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final b d(qg4 qg4Var) {
        Object d = qg4Var.d();
        if (d instanceof b) {
            return (b) d;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(qg4 qg4Var) {
        b d = d(qg4Var);
        if (d != null) {
            return d.f2();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(l.a aVar, androidx.compose.ui.layout.l lVar, qg4 qg4Var, LayoutDirection layoutDirection, int i, int i2, Alignment alignment) {
        Alignment e2;
        b d = d(qg4Var);
        l.a.h(aVar, lVar, ((d == null || (e2 = d.e2()) == null) ? alignment : e2).a(in3.a(lVar.F0(), lVar.v0()), in3.a(i, i2), layoutDirection), 0.0f, 2, null);
    }

    public static final rg4 g(Alignment alignment, boolean z, Composer composer, int i) {
        rg4 rg4Var;
        composer.z(56522820);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(56522820, i, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:84)");
        }
        if (!zq3.c(alignment, Alignment.a.o()) || z) {
            Boolean valueOf = Boolean.valueOf(z);
            composer.z(511388516);
            boolean S = composer.S(valueOf) | composer.S(alignment);
            Object A = composer.A();
            if (S || A == Composer.a.a()) {
                A = new BoxMeasurePolicy(alignment, z);
                composer.q(A);
            }
            composer.R();
            rg4Var = (rg4) A;
        } else {
            rg4Var = a;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return rg4Var;
    }
}
