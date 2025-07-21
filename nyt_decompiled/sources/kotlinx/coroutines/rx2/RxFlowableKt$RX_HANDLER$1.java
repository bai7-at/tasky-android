package kotlinx.coroutines.rx2;

import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class RxFlowableKt$RX_HANDLER$1 extends FunctionReferenceImpl implements gt2 {
    public static final RxFlowableKt$RX_HANDLER$1 INSTANCE = new RxFlowableKt$RX_HANDLER$1();

    RxFlowableKt$RX_HANDLER$1() {
        super(2, RxCancellableKt.class, "handleUndeliverableException", "handleUndeliverableException(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", 1);
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Throwable) obj, (CoroutineContext) obj2);
        return ww8.a;
    }

    public final void invoke(Throwable th, CoroutineContext coroutineContext) {
        RxCancellableKt.handleUndeliverableException(th, coroutineContext);
    }
}
