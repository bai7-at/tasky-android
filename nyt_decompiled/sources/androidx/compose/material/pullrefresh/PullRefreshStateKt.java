package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.y;
import androidx.compose.ui.platform.CompositionLocalsKt;
import defpackage.bu1;
import defpackage.fm1;
import defpackage.i86;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.x08;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public abstract class PullRefreshStateKt {
    public static final PullRefreshState a(final boolean z, qs2 qs2Var, float f, float f2, Composer composer, int i, int i2) {
        composer.z(-174977512);
        if ((i2 & 4) != 0) {
            f = i86.a.a();
        }
        if ((i2 & 8) != 0) {
            f2 = i86.a.b();
        }
        if (b.G()) {
            b.S(-174977512, i, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
        }
        if (bu1.f(f, bu1.g(0)) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        composer.z(773894976);
        composer.z(-492369756);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            Object eVar = new e(py1.j(EmptyCoroutineContext.a, composer));
            composer.q(eVar);
            A = eVar;
        }
        composer.R();
        CoroutineScope a = ((e) A).a();
        composer.R();
        x08 o = y.o(qs2Var, composer, (i >> 3) & 14);
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
        fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
        ref$FloatRef.element = fm1Var.f1(f);
        ref$FloatRef2.element = fm1Var.f1(f2);
        composer.z(1157296644);
        boolean S = composer.S(a);
        Object A2 = composer.A();
        if (S || A2 == aVar.a()) {
            A2 = new PullRefreshState(a, o, ref$FloatRef2.element, ref$FloatRef.element);
            composer.q(A2);
        }
        composer.R();
        final PullRefreshState pullRefreshState = (PullRefreshState) A2;
        py1.h(new qs2() { // from class: androidx.compose.material.pullrefresh.PullRefreshStateKt$rememberPullRefreshState$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m45invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m45invoke() {
                PullRefreshState.this.t(z);
                PullRefreshState.this.v(ref$FloatRef.element);
                PullRefreshState.this.u(ref$FloatRef2.element);
            }
        }, composer, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return pullRefreshState;
    }
}
