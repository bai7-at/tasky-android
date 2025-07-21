package kotlinx.coroutines.reactive;

import defpackage.it2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class PublisherCoroutine$onSend$2 extends FunctionReferenceImpl implements it2 {
    public static final PublisherCoroutine$onSend$2 INSTANCE = new PublisherCoroutine$onSend$2();

    PublisherCoroutine$onSend$2() {
        super(3, PublisherCoroutine.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.it2
    public final Object invoke(PublisherCoroutine<?> publisherCoroutine, Object obj, Object obj2) {
        Object processResultSelectSend;
        processResultSelectSend = publisherCoroutine.processResultSelectSend(obj, obj2);
        return processResultSelectSend;
    }
}
