package io.reactivex.internal.operators.parallel;

import defpackage.g86;
import defpackage.va8;
import io.reactivex.parallel.ParallelFlowable;

/* loaded from: classes5.dex */
public final class ParallelFromArray<T> extends ParallelFlowable<T> {
    final g86[] sources;

    public ParallelFromArray(g86[] g86VarArr) {
        this.sources = g86VarArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.sources.length;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(va8[] va8VarArr) {
        if (validate(va8VarArr)) {
            int length = va8VarArr.length;
            for (int i = 0; i < length; i++) {
                this.sources[i].subscribe(va8VarArr[i]);
            }
        }
    }
}
