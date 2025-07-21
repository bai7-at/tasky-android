package io.reactivex.internal.operators.parallel;

import defpackage.g86;
import defpackage.va8;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;

/* loaded from: classes5.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {
    final boolean delayError;
    final Function<? super T, ? extends g86> mapper;
    final int maxConcurrency;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends g86> function, boolean z, int i, int i2) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.delayError = z;
        this.maxConcurrency = i;
        this.prefetch = i2;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(va8[] va8VarArr) {
        if (validate(va8VarArr)) {
            int length = va8VarArr.length;
            va8[] va8VarArr2 = new va8[length];
            for (int i = 0; i < length; i++) {
                va8VarArr2[i] = FlowableFlatMap.subscribe(va8VarArr[i], this.mapper, this.delayError, this.maxConcurrency, this.prefetch);
            }
            this.source.subscribe(va8VarArr2);
        }
    }
}
