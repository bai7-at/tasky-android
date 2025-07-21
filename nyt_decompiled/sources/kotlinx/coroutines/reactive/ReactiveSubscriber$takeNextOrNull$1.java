package kotlinx.coroutines.reactive;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.reactive.ReactiveSubscriber", f = "ReactiveFlow.kt", l = {125}, m = "takeNextOrNull")
/* loaded from: classes5.dex */
final class ReactiveSubscriber$takeNextOrNull$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReactiveSubscriber<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactiveSubscriber$takeNextOrNull$1(ReactiveSubscriber<T> reactiveSubscriber, by0<? super ReactiveSubscriber$takeNextOrNull$1> by0Var) {
        super(by0Var);
        this.this$0 = reactiveSubscriber;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.takeNextOrNull(this);
    }
}
