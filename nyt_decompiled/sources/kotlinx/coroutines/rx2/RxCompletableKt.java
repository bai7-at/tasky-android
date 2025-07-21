package kotlinx.coroutines.rx2;

import defpackage.gt2;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxCompletableKt;

/* loaded from: classes5.dex */
public final class RxCompletableKt {
    public static final Completable rxCompletable(CoroutineContext coroutineContext, gt2 gt2Var) {
        if (coroutineContext.get(Job.Key) == null) {
            return rxCompletableInternal(GlobalScope.INSTANCE, coroutineContext, gt2Var);
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it. Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ Completable rxCompletable$default(CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return rxCompletable(coroutineContext, gt2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Completable rxCompletableInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final gt2 gt2Var) {
        return Completable.create(new CompletableOnSubscribe() { // from class: l47
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(CompletableEmitter completableEmitter) {
                RxCompletableKt.rxCompletableInternal$lambda$1(CoroutineScope.this, coroutineContext, gt2Var, completableEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rxCompletableInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, gt2 gt2Var, CompletableEmitter completableEmitter) {
        RxCompletableCoroutine rxCompletableCoroutine = new RxCompletableCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), completableEmitter);
        completableEmitter.setCancellable(new RxCancellable(rxCompletableCoroutine));
        rxCompletableCoroutine.start(CoroutineStart.DEFAULT, rxCompletableCoroutine, gt2Var);
    }

    public static /* synthetic */ Completable rxCompletable$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return rxCompletableInternal(coroutineScope, coroutineContext, gt2Var);
    }
}
