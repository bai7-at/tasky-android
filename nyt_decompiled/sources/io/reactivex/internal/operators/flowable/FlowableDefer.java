package io.reactivex.internal.operators.flowable;

import defpackage.g86;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class FlowableDefer<T> extends Flowable<T> {
    final Callable<? extends g86> supplier;

    public FlowableDefer(Callable<? extends g86> callable) {
        this.supplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(va8 va8Var) {
        try {
            ((g86) ObjectHelper.requireNonNull(this.supplier.call(), "The publisher supplied is null")).subscribe(va8Var);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, va8Var);
        }
    }
}
