package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qu1;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {660}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DefaultDraggableState$drag$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ DefaultDraggableState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultDraggableState$drag$2(DefaultDraggableState defaultDraggableState, MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = defaultDraggableState;
        this.$dragPriority = mutatePriority;
        this.$block = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DefaultDraggableState$drag$2(this.this$0, this.$dragPriority, this.$block, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        qu1 qu1Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mutatorMutex = this.this$0.c;
            qu1Var = this.this$0.b;
            MutatePriority mutatePriority = this.$dragPriority;
            gt2 gt2Var = this.$block;
            this.label = 1;
            if (mutatorMutex.f(qu1Var, mutatePriority, gt2Var, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DefaultDraggableState$drag$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
