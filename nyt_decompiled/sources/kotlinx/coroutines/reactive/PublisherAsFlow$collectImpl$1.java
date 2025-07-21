package kotlinx.coroutines.reactive;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.reactive.PublisherAsFlow", f = "ReactiveFlow.kt", l = {94, 96}, m = "collectImpl")
/* loaded from: classes5.dex */
final class PublisherAsFlow$collectImpl$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PublisherAsFlow<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PublisherAsFlow$collectImpl$1(PublisherAsFlow<T> publisherAsFlow, by0<? super PublisherAsFlow$collectImpl$1> by0Var) {
        super(by0Var);
        this.this$0 = publisherAsFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object collectImpl;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        collectImpl = this.this$0.collectImpl(null, null, this);
        return collectImpl;
    }
}
