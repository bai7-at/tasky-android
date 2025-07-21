package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.t26;
import defpackage.uo6;
import defpackage.x08;
import defpackage.yx4;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class PullRefreshState {
    public static final int j = 8;
    private final CoroutineScope a;
    private final x08 b;
    private final yx4 g;
    private final yx4 h;
    private final x08 c = y.d(new qs2() { // from class: androidx.compose.material.pullrefresh.PullRefreshState$adjustedDistancePulled$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float mo865invoke() {
            float h;
            h = PullRefreshState.this.h();
            return Float.valueOf(h * 0.5f);
        }
    });
    private final sy4 d = b0.e(Boolean.FALSE, null, 2, null);
    private final yx4 e = t26.a(0.0f);
    private final yx4 f = t26.a(0.0f);
    private final MutatorMutex i = new MutatorMutex();

    public PullRefreshState(CoroutineScope coroutineScope, x08 x08Var, float f, float f2) {
        this.a = coroutineScope;
        this.b = x08Var;
        this.g = t26.a(f2);
        this.h = t26.a(f);
    }

    private final Job e(float f) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new PullRefreshState$animateIndicatorTo$1(this, f, null), 3, null);
        return launch$default;
    }

    private final float f() {
        if (g() <= l()) {
            return g();
        }
        float l = uo6.l(Math.abs(j()) - 1.0f, 0.0f, 2.0f);
        return l() + (l() * (l - (((float) Math.pow(l, 2)) / 4)));
    }

    private final float g() {
        return ((Number) this.c.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float h() {
        return this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float m() {
        return this.e.a();
    }

    private final boolean n() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    private final float o() {
        return this.h.a();
    }

    private final float p() {
        return this.g.a();
    }

    private final void s(float f) {
        this.f.r(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(float f) {
        this.e.r(f);
    }

    private final void x(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    private final void y(float f) {
        this.h.r(f);
    }

    private final void z(float f) {
        this.g.r(f);
    }

    public final float i() {
        return m();
    }

    public final float j() {
        return g() / l();
    }

    public final boolean k() {
        return n();
    }

    public final float l() {
        return p();
    }

    public final float q(float f) {
        if (n()) {
            return 0.0f;
        }
        float c = uo6.c(h() + f, 0.0f);
        float h = c - h();
        s(c);
        w(f());
        return h;
    }

    public final float r(float f) {
        if (k()) {
            return 0.0f;
        }
        if (g() > l()) {
            ((qs2) this.b.getValue()).mo865invoke();
        }
        e(0.0f);
        if (h() == 0.0f || f < 0.0f) {
            f = 0.0f;
        }
        s(0.0f);
        return f;
    }

    public final void t(boolean z) {
        if (n() != z) {
            x(z);
            s(0.0f);
            e(z ? o() : 0.0f);
        }
    }

    public final void u(float f) {
        if (o() == f) {
            return;
        }
        y(f);
        if (k()) {
            e(f);
        }
    }

    public final void v(float f) {
        z(f);
    }
}
