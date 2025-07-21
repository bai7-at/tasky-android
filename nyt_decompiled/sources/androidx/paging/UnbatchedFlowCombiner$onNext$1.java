package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", l = {190, 230, 207}, m = "onNext")
/* loaded from: classes.dex */
final class UnbatchedFlowCombiner$onNext$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UnbatchedFlowCombiner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnbatchedFlowCombiner$onNext$1(UnbatchedFlowCombiner unbatchedFlowCombiner, by0 by0Var) {
        super(by0Var);
        this.this$0 = unbatchedFlowCombiner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(0, null, this);
    }
}
