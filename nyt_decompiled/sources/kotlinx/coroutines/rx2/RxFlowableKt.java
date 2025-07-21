package kotlinx.coroutines.rx2;

import defpackage.gt2;
import io.reactivex.Flowable;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.reactive.PublishKt;

/* loaded from: classes5.dex */
public final class RxFlowableKt {
    private static final gt2 RX_HANDLER = RxFlowableKt$RX_HANDLER$1.INSTANCE;

    public static final <T> Flowable<T> rxFlowable(CoroutineContext coroutineContext, gt2 gt2Var) {
        if (coroutineContext.get(Job.Key) == null) {
            return Flowable.fromPublisher(PublishKt.publishInternal(GlobalScope.INSTANCE, coroutineContext, RX_HANDLER, gt2Var));
        }
        throw new IllegalArgumentException(("Flowable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ Flowable rxFlowable$default(CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return rxFlowable(coroutineContext, gt2Var);
    }

    public static /* synthetic */ Flowable rxFlowable$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return rxFlowable(coroutineScope, coroutineContext, gt2Var);
    }

    public static final /* synthetic */ Flowable rxFlowable(CoroutineScope coroutineScope, CoroutineContext coroutineContext, gt2 gt2Var) {
        return Flowable.fromPublisher(PublishKt.publishInternal(coroutineScope, coroutineContext, RX_HANDLER, gt2Var));
    }
}
