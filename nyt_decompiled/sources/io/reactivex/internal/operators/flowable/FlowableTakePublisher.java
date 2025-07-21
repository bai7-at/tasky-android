package io.reactivex.internal.operators.flowable;

import defpackage.g86;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableTake;

/* loaded from: classes5.dex */
public final class FlowableTakePublisher<T> extends Flowable<T> {
    final long limit;
    final g86 source;

    public FlowableTakePublisher(g86 g86Var, long j) {
        this.source = g86Var;
        this.limit = j;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(va8 va8Var) {
        this.source.subscribe(new FlowableTake.TakeSubscriber(va8Var, this.limit));
    }
}
