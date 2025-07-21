package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.b0;
import defpackage.ph2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.t26;
import defpackage.vm3;
import defpackage.wk2;
import defpackage.wm3;
import defpackage.ww8;
import defpackage.yx4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class LazyLayoutAnimation {
    public static final a m = new a(null);
    public static final int n = 8;
    private static final long o = wm3.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
    private final CoroutineScope a;
    private ph2 b;
    private ph2 c;
    private final sy4 d;
    private final sy4 e;
    private long f;
    private final Animatable g;
    private final Animatable h;
    private final sy4 i;
    private final yx4 j;
    private final ss2 k;
    private long l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return LazyLayoutAnimation.o;
        }

        private a() {
        }
    }

    public LazyLayoutAnimation(CoroutineScope coroutineScope) {
        this.a = coroutineScope;
        Boolean bool = Boolean.FALSE;
        this.d = b0.e(bool, null, 2, null);
        this.e = b0.e(bool, null, 2, null);
        long j = o;
        this.f = j;
        vm3.a aVar = vm3.b;
        this.g = new Animatable(vm3.b(aVar.a()), VectorConvertersKt.f(aVar), null, null, 12, null);
        this.h = new Animatable(Float.valueOf(1.0f), VectorConvertersKt.d(wk2.a), null, null, 12, null);
        this.i = b0.e(vm3.b(aVar.a()), null, 2, null);
        this.j = t26.a(1.0f);
        this.k = new ss2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$layerBlock$1
            {
                super(1);
            }

            public final void b(androidx.compose.ui.graphics.c cVar) {
                cVar.c(LazyLayoutAnimation.this.o());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((androidx.compose.ui.graphics.c) obj);
                return ww8.a;
            }
        };
        this.l = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(long j) {
        this.i.setValue(vm3.b(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(float f) {
        this.j.r(f);
    }

    public final void h() {
        ph2 ph2Var = this.b;
        if (p() || ph2Var == null) {
            return;
        }
        r(true);
        y(0.0f);
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new LazyLayoutAnimation$animateAppearance$1(this, ph2Var, null), 3, null);
    }

    public final void i(long j) {
        ph2 ph2Var = this.c;
        if (ph2Var == null) {
            return;
        }
        long m2 = m();
        long a2 = wm3.a(vm3.j(m2) - vm3.j(j), vm3.k(m2) - vm3.k(j));
        v(a2);
        u(true);
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new LazyLayoutAnimation$animatePlacementDelta$1(this, ph2Var, a2, null), 3, null);
    }

    public final void j() {
        if (q()) {
            BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new LazyLayoutAnimation$cancelPlacementAnimation$1(this, null), 3, null);
        }
    }

    public final ss2 k() {
        return this.k;
    }

    public final long l() {
        return this.l;
    }

    public final long m() {
        return ((vm3) this.i.getValue()).n();
    }

    public final long n() {
        return this.f;
    }

    public final float o() {
        return this.j.a();
    }

    public final boolean p() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final void s(ph2 ph2Var) {
        this.b = ph2Var;
    }

    public final void t(long j) {
        this.l = j;
    }

    public final void w(ph2 ph2Var) {
        this.c = ph2Var;
    }

    public final void x(long j) {
        this.f = j;
    }

    public final void z() {
        if (q()) {
            u(false);
            BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new LazyLayoutAnimation$stopAnimations$1(this, null), 3, null);
        }
        if (p()) {
            r(false);
            BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new LazyLayoutAnimation$stopAnimations$2(this, null), 3, null);
        }
        v(vm3.b.a());
        this.f = o;
        y(1.0f);
    }
}
