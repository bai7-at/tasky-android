package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bu1;
import defpackage.fv0;
import defpackage.gm5;
import defpackage.hm5;
import defpackage.it2;
import defpackage.j75;
import defpackage.qg4;
import defpackage.rl0;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class AndroidOverscroll_androidKt {
    private static final Modifier a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? androidx.compose.ui.layout.d.a(androidx.compose.ui.layout.d.a(Modifier.a, new it2() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1
            public final sg4 b(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
                final l W = qg4Var.W(j);
                final int l0 = fVar.l0(bu1.g(rl0.b() * 2));
                return androidx.compose.ui.layout.f.J(fVar, uo6.d(W.B0() - l0, 0), uo6.d(W.x0() - l0, 0), null, new ss2() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(l.a aVar) {
                        l lVar = l.this;
                        l.a.r(aVar, lVar, ((-l0) / 2) - ((lVar.F0() - l.this.B0()) / 2), ((-l0) / 2) - ((l.this.v0() - l.this.x0()) / 2), 0.0f, null, 12, null);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((l.a) obj);
                        return ww8.a;
                    }
                }, 4, null);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((androidx.compose.ui.layout.f) obj, (qg4) obj2, ((fv0) obj3).t());
            }
        }), new it2() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$2
            public final sg4 b(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
                final l W = qg4Var.W(j);
                final int l0 = fVar.l0(bu1.g(rl0.b() * 2));
                return androidx.compose.ui.layout.f.J(fVar, W.F0() + l0, W.v0() + l0, null, new ss2() { // from class: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(l.a aVar) {
                        l lVar = l.this;
                        int i = l0;
                        l.a.f(aVar, lVar, i / 2, i / 2, 0.0f, 4, null);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((l.a) obj);
                        return ww8.a;
                    }
                }, 4, null);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((androidx.compose.ui.layout.f) obj, (qg4) obj2, ((fv0) obj3).t());
            }
        }) : Modifier.a;
    }

    public static final hm5 b(Composer composer, int i) {
        hm5 hm5Var;
        composer.z(-1476348564);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1476348564, i, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:64)");
        }
        Context context = (Context) composer.m(AndroidCompositionLocals_androidKt.g());
        gm5 gm5Var = (gm5) composer.m(OverscrollConfiguration_androidKt.a());
        if (gm5Var != null) {
            composer.z(511388516);
            boolean S = composer.S(context) | composer.S(gm5Var);
            Object A = composer.A();
            if (S || A == Composer.a.a()) {
                A = new AndroidEdgeEffectOverscrollEffect(context, gm5Var);
                composer.q(A);
            }
            composer.R();
            hm5Var = (hm5) A;
        } else {
            hm5Var = j75.a;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return hm5Var;
    }
}
