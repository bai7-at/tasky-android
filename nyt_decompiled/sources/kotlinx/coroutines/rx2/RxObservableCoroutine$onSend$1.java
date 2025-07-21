package kotlinx.coroutines.rx2;

import defpackage.it2;
import defpackage.ww8;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.SelectInstance;

/* loaded from: classes5.dex */
/* synthetic */ class RxObservableCoroutine$onSend$1 extends FunctionReferenceImpl implements it2 {
    public static final RxObservableCoroutine$onSend$1 INSTANCE = new RxObservableCoroutine$onSend$1();

    RxObservableCoroutine$onSend$1() {
        super(3, RxObservableCoroutine.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RxObservableCoroutine<?>) obj, (SelectInstance<?>) obj2, obj3);
        return ww8.a;
    }

    public final void invoke(RxObservableCoroutine<?> rxObservableCoroutine, SelectInstance<?> selectInstance, Object obj) {
        rxObservableCoroutine.registerSelectForSend(selectInstance, obj);
    }
}
