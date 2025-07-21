package androidx.compose.foundation;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qc0;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", f = "Focusable.kt", l = {238}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FocusableNode$onFocusEvent$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ FocusableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusableNode$onFocusEvent$1(FocusableNode focusableNode, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = focusableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FocusableNode$onFocusEvent$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qc0 qc0Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            qc0Var = this.this$0.y;
            this.label = 1;
            if (qc0.b(qc0Var, null, this, 1, null) == h) {
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
        return ((FocusableNode$onFocusEvent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
