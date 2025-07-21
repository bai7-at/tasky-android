package kotlinx.coroutines.reactive;

import defpackage.it2;
import defpackage.ww8;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.SelectInstance;

/* loaded from: classes5.dex */
/* synthetic */ class PublisherCoroutine$onSend$1 extends FunctionReferenceImpl implements it2 {
    public static final PublisherCoroutine$onSend$1 INSTANCE = new PublisherCoroutine$onSend$1();

    PublisherCoroutine$onSend$1() {
        super(3, PublisherCoroutine.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PublisherCoroutine<?>) obj, (SelectInstance<?>) obj2, obj3);
        return ww8.a;
    }

    public final void invoke(PublisherCoroutine<?> publisherCoroutine, SelectInstance<?> selectInstance, Object obj) {
        publisherCoroutine.registerSelectForSend(selectInstance, obj);
    }
}
