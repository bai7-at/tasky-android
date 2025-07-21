package io.reactivex.internal.operators.flowable;

import defpackage.g86;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;

/* loaded from: classes5.dex */
public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends g86> mapper;
    final int prefetch;
    final g86 source;

    public FlowableConcatMapPublisher(g86 g86Var, Function<? super T, ? extends g86> function, int i, ErrorMode errorMode) {
        this.source = g86Var;
        this.mapper = function;
        this.prefetch = i;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(va8 va8Var) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, va8Var, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableConcatMap.subscribe(va8Var, this.mapper, this.prefetch, this.errorMode));
    }
}
