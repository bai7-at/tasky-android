package io.reactivex.internal.operators.flowable;

import defpackage.g86;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* loaded from: classes5.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends g86> mapper;
    final int maxConcurrency;
    final g86 source;

    public FlowableFlatMapPublisher(g86 g86Var, Function<? super T, ? extends g86> function, boolean z, int i, int i2) {
        this.source = g86Var;
        this.mapper = function;
        this.delayErrors = z;
        this.maxConcurrency = i;
        this.bufferSize = i2;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(va8 va8Var) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, va8Var, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableFlatMap.subscribe(va8Var, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
