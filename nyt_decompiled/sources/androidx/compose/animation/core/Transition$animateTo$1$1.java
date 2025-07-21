package androidx.compose.animation.core;

import androidx.compose.runtime.m;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", l = {649}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class Transition$animateTo$1$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Transition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Transition$animateTo$1$1(Transition transition, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        Transition$animateTo$1$1 transition$animateTo$1$1 = new Transition$animateTo$1$1(this.this$0, by0Var);
        transition$animateTo$1$1.L$0 = obj;
        return transition$animateTo$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        ss2 ss2Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            f.b(obj);
        }
        do {
            final float o = SuspendAnimationKt.o(coroutineScope.getCoroutineContext());
            final Transition transition = this.this$0;
            ss2Var = new ss2() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke(((Number) obj2).longValue());
                    return ww8.a;
                }

                public final void invoke(long j) {
                    if (Transition.this.r()) {
                        return;
                    }
                    Transition.this.t(j, o);
                }
            };
            this.L$0 = coroutineScope;
            this.label = 1;
        } while (m.c(ss2Var, this) != h);
        return h;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((Transition$animateTo$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
