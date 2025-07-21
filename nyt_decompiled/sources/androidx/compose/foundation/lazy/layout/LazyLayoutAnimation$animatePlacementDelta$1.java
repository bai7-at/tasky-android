package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ph2;
import defpackage.qz7;
import defpackage.ss2;
import defpackage.vm3;
import defpackage.wm3;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1", f = "LazyLayoutAnimation.kt", l = {127, 133}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LazyLayoutAnimation$animatePlacementDelta$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ph2 $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutAnimation$animatePlacementDelta$1(LazyLayoutAnimation lazyLayoutAnimation, ph2 ph2Var, long j, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = lazyLayoutAnimation;
        this.$spec = ph2Var;
        this.$totalDelta = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LazyLayoutAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        ph2 ph2Var;
        ph2 ph2Var2;
        Animatable animatable2;
        Animatable animatable3;
        Animatable animatable4;
        Animatable animatable5;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            animatable = this.this$0.g;
            if (animatable.p()) {
                ph2 ph2Var3 = this.$spec;
                ph2Var = ph2Var3 instanceof qz7 ? (qz7) ph2Var3 : LazyLayoutAnimationKt.a;
            } else {
                ph2Var = this.$spec;
            }
            ph2Var2 = ph2Var;
            animatable2 = this.this$0.g;
            if (!animatable2.p()) {
                animatable3 = this.this$0.g;
                vm3 b = vm3.b(this.$totalDelta);
                this.L$0 = ph2Var2;
                this.label = 1;
                if (animatable3.t(b, this) == h) {
                    return h;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
                this.this$0.u(false);
                return ww8.a;
            }
            ph2Var2 = (ph2) this.L$0;
            kotlin.f.b(obj);
        }
        ph2 ph2Var4 = ph2Var2;
        animatable4 = this.this$0.g;
        long n = ((vm3) animatable4.m()).n();
        long j = this.$totalDelta;
        final long a = wm3.a(vm3.j(n) - vm3.j(j), vm3.k(n) - vm3.k(j));
        animatable5 = this.this$0.g;
        vm3 b2 = vm3.b(a);
        final LazyLayoutAnimation lazyLayoutAnimation = this.this$0;
        ss2 ss2Var = new ss2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Animatable animatable6) {
                LazyLayoutAnimation lazyLayoutAnimation2 = LazyLayoutAnimation.this;
                long n2 = ((vm3) animatable6.m()).n();
                long j2 = a;
                lazyLayoutAnimation2.v(wm3.a(vm3.j(n2) - vm3.j(j2), vm3.k(n2) - vm3.k(j2)));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                b((Animatable) obj2);
                return ww8.a;
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (Animatable.f(animatable5, b2, ph2Var4, null, ss2Var, this, 4, null) == h) {
            return h;
        }
        this.this$0.u(false);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LazyLayoutAnimation$animatePlacementDelta$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
