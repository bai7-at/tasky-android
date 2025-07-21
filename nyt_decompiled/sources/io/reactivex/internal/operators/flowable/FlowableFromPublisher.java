package io.reactivex.internal.operators.flowable;

import defpackage.g86;
import defpackage.va8;
import io.reactivex.Flowable;

/* loaded from: classes5.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {
    final g86 publisher;

    public FlowableFromPublisher(g86 g86Var) {
        this.publisher = g86Var;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(va8 va8Var) {
        this.publisher.subscribe(va8Var);
    }
}
