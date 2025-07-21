package io.reactivex.internal.operators.parallel;

import defpackage.g86;
import defpackage.va8;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.parallel.ParallelFlowable;

/* loaded from: classes5.dex */
public final class ParallelConcatMap<T, R> extends ParallelFlowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends g86> mapper;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelConcatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends g86> function, int i, ErrorMode errorMode) {
        this.source = parallelFlowable;
        this.mapper = (Function) ObjectHelper.requireNonNull(function, "mapper");
        this.prefetch = i;
        this.errorMode = (ErrorMode) ObjectHelper.requireNonNull(errorMode, "errorMode");
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
                va8VarArr2[i] = FlowableConcatMap.subscribe(va8VarArr[i], this.mapper, this.prefetch, this.errorMode);
            }
            this.source.subscribe(va8VarArr2);
        }
    }
}
