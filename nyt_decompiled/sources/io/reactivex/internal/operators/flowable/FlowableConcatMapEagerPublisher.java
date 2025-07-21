package io.reactivex.internal.operators.flowable;

import defpackage.g86;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.util.ErrorMode;

/* loaded from: classes5.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends g86> mapper;
    final int maxConcurrency;
    final int prefetch;
    final g86 source;

    public FlowableConcatMapEagerPublisher(g86 g86Var, Function<? super T, ? extends g86> function, int i, int i2, ErrorMode errorMode) {
        this.source = g86Var;
        this.mapper = function;
        this.maxConcurrency = i;
        this.prefetch = i2;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(va8 va8Var) {
        this.source.subscribe(new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(va8Var, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }
}
