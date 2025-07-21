package androidx.lifecycle;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", l = {375}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LifecycleCoroutineScope$launchWhenResumed$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $block;
    int label;
    final /* synthetic */ LifecycleCoroutineScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifecycleCoroutineScope$launchWhenResumed$1(LifecycleCoroutineScope lifecycleCoroutineScope, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = lifecycleCoroutineScope;
        this.$block = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LifecycleCoroutineScope$launchWhenResumed$1(this.this$0, this.$block, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            Lifecycle a = this.this$0.a();
            gt2 gt2Var = this.$block;
            this.label = 1;
            if (PausingDispatcherKt.b(a, gt2Var, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LifecycleCoroutineScope$launchWhenResumed$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
