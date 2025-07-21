package io.reactivex.internal.subscriptions;

import defpackage.va8;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;

/* loaded from: classes5.dex */
public enum EmptySubscription implements QueueSubscription<Object> {
    INSTANCE;

    public static void complete(va8 va8Var) {
        va8Var.onSubscribe(INSTANCE);
        va8Var.onComplete();
    }

    public static void error(Throwable th, va8 va8Var) {
        va8Var.onSubscribe(INSTANCE);
        va8Var.onError(th);
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, defpackage.hb8
    public void cancel() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public Object poll() {
        return null;
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, defpackage.hb8
    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
