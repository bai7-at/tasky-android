package io.reactivex.subscribers;

import defpackage.hb8;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;

/* loaded from: classes5.dex */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {
    hb8 upstream;

    protected final void cancel() {
        hb8 hb8Var = this.upstream;
        this.upstream = SubscriptionHelper.CANCELLED;
        hb8Var.cancel();
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public abstract /* synthetic */ void onNext(Object obj);

    protected void onStart() {
        request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public final void onSubscribe(hb8 hb8Var) {
        if (EndConsumerHelper.validate(this.upstream, hb8Var, getClass())) {
            this.upstream = hb8Var;
            onStart();
        }
    }

    protected final void request(long j) {
        hb8 hb8Var = this.upstream;
        if (hb8Var != null) {
            hb8Var.request(j);
        }
    }
}
