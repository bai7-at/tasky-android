package kotlinx.coroutines.rx2;

import defpackage.it2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class RxObservableCoroutine$onSend$2 extends FunctionReferenceImpl implements it2 {
    public static final RxObservableCoroutine$onSend$2 INSTANCE = new RxObservableCoroutine$onSend$2();

    RxObservableCoroutine$onSend$2() {
        super(3, RxObservableCoroutine.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.it2
    public final Object invoke(RxObservableCoroutine<?> rxObservableCoroutine, Object obj, Object obj2) {
        Object processResultSelectSend;
        processResultSelectSend = rxObservableCoroutine.processResultSelectSend(obj, obj2);
        return processResultSelectSend;
    }
}
