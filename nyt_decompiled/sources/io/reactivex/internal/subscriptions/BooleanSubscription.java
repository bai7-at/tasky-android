package io.reactivex.internal.subscriptions;

import defpackage.hb8;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class BooleanSubscription extends AtomicBoolean implements hb8 {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // defpackage.hb8
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // defpackage.hb8
    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
