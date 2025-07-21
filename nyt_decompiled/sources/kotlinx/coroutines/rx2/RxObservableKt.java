package kotlinx.coroutines.rx2;

import defpackage.gt2;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxObservableKt;

/* loaded from: classes5.dex */
public final class RxObservableKt {
    private static final int CLOSED = -1;
    private static final int OPEN = 0;
    private static final int SIGNALLED = -2;

    public static final <T> Observable<T> rxObservable(CoroutineContext coroutineContext, gt2 gt2Var) {
        if (coroutineContext.get(Job.Key) == null) {
            return rxObservableInternal(GlobalScope.INSTANCE, coroutineContext, gt2Var);
        }
        throw new IllegalArgumentException(("Observable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ Observable rxObservable$default(CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return rxObservable(coroutineContext, gt2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Observable<T> rxObservableInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final gt2 gt2Var) {
        return Observable.create(new ObservableOnSubscribe() { // from class: w47
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                RxObservableKt.rxObservableInternal$lambda$1(CoroutineScope.this, coroutineContext, gt2Var, observableEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rxObservableInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, gt2 gt2Var, ObservableEmitter observableEmitter) {
        RxObservableCoroutine rxObservableCoroutine = new RxObservableCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), observableEmitter);
        observableEmitter.setCancellable(new RxCancellable(rxObservableCoroutine));
        rxObservableCoroutine.start(CoroutineStart.DEFAULT, rxObservableCoroutine, gt2Var);
    }

    public static /* synthetic */ Observable rxObservable$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return rxObservableInternal(coroutineScope, coroutineContext, gt2Var);
    }
}
