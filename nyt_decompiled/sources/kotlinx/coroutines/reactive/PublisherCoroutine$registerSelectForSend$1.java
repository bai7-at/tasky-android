package kotlinx.coroutines.reactive;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.Mutex;

@fc1(c = "kotlinx.coroutines.reactive.PublisherCoroutine$registerSelectForSend$1", f = "Publish.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class PublisherCoroutine$registerSelectForSend$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ SelectInstance<?> $select;
    int label;
    final /* synthetic */ PublisherCoroutine<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PublisherCoroutine$registerSelectForSend$1(PublisherCoroutine<? super T> publisherCoroutine, SelectInstance<?> selectInstance, by0<? super PublisherCoroutine$registerSelectForSend$1> by0Var) {
        super(2, by0Var);
        this.this$0 = publisherCoroutine;
        this.$select = selectInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new PublisherCoroutine$registerSelectForSend$1(this.this$0, this.$select, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        Mutex mutex2;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mutex = ((PublisherCoroutine) this.this$0).mutex;
            this.label = 1;
            if (Mutex.DefaultImpls.lock$default(mutex, null, this, 1, null) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        SelectInstance<?> selectInstance = this.$select;
        CoroutineContext.a aVar = this.this$0;
        ww8 ww8Var = ww8.a;
        if (!selectInstance.trySelect(aVar, ww8Var)) {
            mutex2 = ((PublisherCoroutine) this.this$0).mutex;
            Mutex.DefaultImpls.unlock$default(mutex2, null, 1, null);
        }
        return ww8Var;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((PublisherCoroutine$registerSelectForSend$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
