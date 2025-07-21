package androidx.compose.foundation;

import defpackage.bo3;
import defpackage.by0;
import defpackage.dy4;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", l = {311}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FocusableInteractionNode$emitWithFallback$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ bo3 $interaction;
    final /* synthetic */ dy4 $this_emitWithFallback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusableInteractionNode$emitWithFallback$1(dy4 dy4Var, bo3 bo3Var, by0 by0Var) {
        super(2, by0Var);
        this.$this_emitWithFallback = dy4Var;
        this.$interaction = bo3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FocusableInteractionNode$emitWithFallback$1(this.$this_emitWithFallback, this.$interaction, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            dy4 dy4Var = this.$this_emitWithFallback;
            bo3 bo3Var = this.$interaction;
            this.label = 1;
            if (dy4Var.a(bo3Var, this) == h) {
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
        return ((FocusableInteractionNode$emitWithFallback$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
