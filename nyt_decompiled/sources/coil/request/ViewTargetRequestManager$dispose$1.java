package coil.request;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ViewTargetRequestManager$dispose$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ ViewTargetRequestManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewTargetRequestManager$dispose$1(ViewTargetRequestManager viewTargetRequestManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = viewTargetRequestManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ViewTargetRequestManager$dispose$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.this$0.c(null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ViewTargetRequestManager$dispose$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
