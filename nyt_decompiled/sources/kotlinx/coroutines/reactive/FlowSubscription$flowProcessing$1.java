package kotlinx.coroutines.reactive;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.reactive.FlowSubscription", f = "ReactiveFlow.kt", l = {205}, m = "flowProcessing")
/* loaded from: classes5.dex */
final class FlowSubscription$flowProcessing$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowSubscription<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowSubscription$flowProcessing$1(FlowSubscription<T> flowSubscription, by0<? super FlowSubscription$flowProcessing$1> by0Var) {
        super(by0Var);
        this.this$0 = flowSubscription;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object flowProcessing;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        flowProcessing = this.this$0.flowProcessing(this);
        return flowProcessing;
    }
}
