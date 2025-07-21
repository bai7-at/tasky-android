package kotlinx.coroutines.reactive;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.reactive.PublisherCoroutine", f = "Publish.kt", l = {128}, m = "send")
/* loaded from: classes5.dex */
final class PublisherCoroutine$send$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PublisherCoroutine<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PublisherCoroutine$send$1(PublisherCoroutine<? super T> publisherCoroutine, by0<? super PublisherCoroutine$send$1> by0Var) {
        super(by0Var);
        this.this$0 = publisherCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.send(null, this);
    }
}
