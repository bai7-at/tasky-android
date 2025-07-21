package kotlinx.coroutines.channels;

import defpackage.by0;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* loaded from: classes5.dex */
final class LazyBroadcastCoroutine<E> extends BroadcastCoroutine<E> {
    private final by0<ww8> continuation;

    public LazyBroadcastCoroutine(CoroutineContext coroutineContext, BroadcastChannel<E> broadcastChannel, gt2 gt2Var) {
        super(coroutineContext, broadcastChannel, false);
        this.continuation = a.b(gt2Var, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void onStart() {
        CancellableKt.startCoroutineCancellable(this.continuation, this);
    }

    @Override // kotlinx.coroutines.channels.BroadcastCoroutine, kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        ReceiveChannel<E> openSubscription = get_channel().openSubscription();
        start();
        return openSubscription;
    }
}
