package io.reactivex.internal.operators.flowable;

import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.internal.subscriptions.EmptySubscription;

/* loaded from: classes5.dex */
public final class FlowableNever extends Flowable<Object> {
    public static final Flowable<Object> INSTANCE = new FlowableNever();

    private FlowableNever() {
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(va8 va8Var) {
        va8Var.onSubscribe(EmptySubscription.INSTANCE);
    }
}
