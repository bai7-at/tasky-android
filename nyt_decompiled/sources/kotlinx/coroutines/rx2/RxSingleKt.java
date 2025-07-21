package kotlinx.coroutines.rx2;

import defpackage.gt2;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxSingleKt;

/* loaded from: classes5.dex */
public final class RxSingleKt {
    public static final <T> Single<T> rxSingle(CoroutineContext coroutineContext, gt2 gt2Var) {
        if (coroutineContext.get(Job.Key) == null) {
            return rxSingleInternal(GlobalScope.INSTANCE, coroutineContext, gt2Var);
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ Single rxSingle$default(CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return rxSingle(coroutineContext, gt2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Single<T> rxSingleInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final gt2 gt2Var) {
        return Single.create(new SingleOnSubscribe() { // from class: b57
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                RxSingleKt.rxSingleInternal$lambda$1(CoroutineScope.this, coroutineContext, gt2Var, singleEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rxSingleInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, gt2 gt2Var, SingleEmitter singleEmitter) {
        RxSingleCoroutine rxSingleCoroutine = new RxSingleCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), singleEmitter);
        singleEmitter.setCancellable(new RxCancellable(rxSingleCoroutine));
        rxSingleCoroutine.start(CoroutineStart.DEFAULT, rxSingleCoroutine, gt2Var);
    }

    public static /* synthetic */ Single rxSingle$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return rxSingleInternal(coroutineScope, coroutineContext, gt2Var);
    }
}
