package kotlinx.coroutines.rx2;

import defpackage.gt2;
import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeOnSubscribe;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxMaybeKt;

/* loaded from: classes5.dex */
public final class RxMaybeKt {
    public static final <T> Maybe<T> rxMaybe(CoroutineContext coroutineContext, gt2 gt2Var) {
        if (coroutineContext.get(Job.Key) == null) {
            return rxMaybeInternal(GlobalScope.INSTANCE, coroutineContext, gt2Var);
        }
        throw new IllegalArgumentException(("Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ Maybe rxMaybe$default(CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return rxMaybe(coroutineContext, gt2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Maybe<T> rxMaybeInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final gt2 gt2Var) {
        return Maybe.create(new MaybeOnSubscribe() { // from class: v47
            @Override // io.reactivex.MaybeOnSubscribe
            public final void subscribe(MaybeEmitter maybeEmitter) {
                RxMaybeKt.rxMaybeInternal$lambda$1(CoroutineScope.this, coroutineContext, gt2Var, maybeEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rxMaybeInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, gt2 gt2Var, MaybeEmitter maybeEmitter) {
        RxMaybeCoroutine rxMaybeCoroutine = new RxMaybeCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), maybeEmitter);
        maybeEmitter.setCancellable(new RxCancellable(rxMaybeCoroutine));
        rxMaybeCoroutine.start(CoroutineStart.DEFAULT, rxMaybeCoroutine, gt2Var);
    }

    public static /* synthetic */ Maybe rxMaybe$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return rxMaybeInternal(coroutineScope, coroutineContext, gt2Var);
    }
}
