package io.reactivex.internal.subscriptions;

import defpackage.hb8;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class SubscriptionArbiter extends AtomicInteger implements hb8 {
    private static final long serialVersionUID = -2189523197179400958L;
    hb8 actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<hb8> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public SubscriptionArbiter(boolean z) {
        this.cancelOnReplace = z;
    }

    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        drain();
    }

    final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    final void drainLoop() {
        int i = 1;
        long j = 0;
        hb8 hb8Var = null;
        do {
            hb8 hb8Var2 = this.missedSubscription.get();
            if (hb8Var2 != null) {
                hb8Var2 = this.missedSubscription.getAndSet(null);
            }
            long j2 = this.missedRequested.get();
            if (j2 != 0) {
                j2 = this.missedRequested.getAndSet(0L);
            }
            long j3 = this.missedProduced.get();
            if (j3 != 0) {
                j3 = this.missedProduced.getAndSet(0L);
            }
            hb8 hb8Var3 = this.actual;
            if (this.cancelled) {
                if (hb8Var3 != null) {
                    hb8Var3.cancel();
                    this.actual = null;
                }
                if (hb8Var2 != null) {
                    hb8Var2.cancel();
                }
            } else {
                long j4 = this.requested;
                if (j4 != Long.MAX_VALUE) {
                    j4 = BackpressureHelper.addCap(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            SubscriptionHelper.reportMoreProduced(j4);
                            j4 = 0;
                        }
                    }
                    this.requested = j4;
                }
                if (hb8Var2 != null) {
                    if (hb8Var3 != null && this.cancelOnReplace) {
                        hb8Var3.cancel();
                    }
                    this.actual = hb8Var2;
                    if (j4 != 0) {
                        j = BackpressureHelper.addCap(j, j4);
                        hb8Var = hb8Var2;
                    }
                } else if (hb8Var3 != null && j2 != 0) {
                    j = BackpressureHelper.addCap(j, j2);
                    hb8Var = hb8Var3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            hb8Var.request(j);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedProduced, j);
            drain();
            return;
        }
        long j2 = this.requested;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                SubscriptionHelper.reportMoreProduced(j3);
                j3 = 0;
            }
            this.requested = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        drainLoop();
    }

    @Override // defpackage.hb8
    public final void request(long j) {
        if (!SubscriptionHelper.validate(j) || this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedRequested, j);
            drain();
            return;
        }
        long j2 = this.requested;
        if (j2 != Long.MAX_VALUE) {
            long addCap = BackpressureHelper.addCap(j2, j);
            this.requested = addCap;
            if (addCap == Long.MAX_VALUE) {
                this.unbounded = true;
            }
        }
        hb8 hb8Var = this.actual;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (hb8Var != null) {
            hb8Var.request(j);
        }
    }

    public final void setSubscription(hb8 hb8Var) {
        if (this.cancelled) {
            hb8Var.cancel();
            return;
        }
        ObjectHelper.requireNonNull(hb8Var, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            hb8 andSet = this.missedSubscription.getAndSet(hb8Var);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            drain();
            return;
        }
        hb8 hb8Var2 = this.actual;
        if (hb8Var2 != null && this.cancelOnReplace) {
            hb8Var2.cancel();
        }
        this.actual = hb8Var;
        long j = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j != 0) {
            hb8Var.request(j);
        }
    }
}
