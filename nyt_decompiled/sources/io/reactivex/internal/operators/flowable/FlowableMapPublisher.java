package io.reactivex.internal.operators.flowable;

import defpackage.g86;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableMap;

/* loaded from: classes5.dex */
public final class FlowableMapPublisher<T, U> extends Flowable<U> {
    final Function<? super T, ? extends U> mapper;
    final g86 source;

    public FlowableMapPublisher(g86 g86Var, Function<? super T, ? extends U> function) {
        this.source = g86Var;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(va8 va8Var) {
        this.source.subscribe(new FlowableMap.MapSubscriber(va8Var, this.mapper));
    }
}
