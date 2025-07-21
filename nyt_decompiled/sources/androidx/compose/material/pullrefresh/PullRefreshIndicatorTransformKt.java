package androidx.compose.material.pullrefresh;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.b;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ql0;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.xx1;
import defpackage.yv0;
import defpackage.zt7;
import defpackage.zu1;

/* loaded from: classes.dex */
public abstract class PullRefreshIndicatorTransformKt {
    public static final Modifier a(Modifier modifier, final PullRefreshState pullRefreshState, final boolean z) {
        return InspectableValueKt.b(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), b.a(androidx.compose.ui.draw.a.d(Modifier.a, new ss2() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1
            public final void b(yv0 yv0Var) {
                int b = ql0.a.b();
                zu1 i1 = yv0Var.i1();
                long b2 = i1.b();
                i1.c().t();
                i1.a().b(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, b);
                yv0Var.A1();
                i1.c().k();
                i1.d(b2);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((yv0) obj);
                return ww8.a;
            }
        }), new ss2() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(c cVar) {
                cVar.g(PullRefreshState.this.i() - zt7.g(cVar.b()));
                if (!z || PullRefreshState.this.k()) {
                    return;
                }
                float l = uo6.l(xx1.e().a(PullRefreshState.this.i() / PullRefreshState.this.l()), 0.0f, 1.0f);
                cVar.n(l);
                cVar.t(l);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((c) obj);
                return ww8.a;
            }
        }));
    }
}
