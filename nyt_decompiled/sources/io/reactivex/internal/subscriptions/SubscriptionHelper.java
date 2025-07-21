package io.reactivex.internal.subscriptions;

import defpackage.hb8;
import defpackage.kz4;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public enum SubscriptionHelper implements hb8 {
    CANCELLED;

    public static void deferredRequest(AtomicReference<hb8> atomicReference, AtomicLong atomicLong, long j) {
        hb8 hb8Var = atomicReference.get();
        if (hb8Var != null) {
            hb8Var.request(j);
            return;
        }
        if (validate(j)) {
            BackpressureHelper.add(atomicLong, j);
            hb8 hb8Var2 = atomicReference.get();
            if (hb8Var2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    hb8Var2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<hb8> atomicReference, AtomicLong atomicLong, hb8 hb8Var) {
        if (!setOnce(atomicReference, hb8Var)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        hb8Var.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<hb8> atomicReference, hb8 hb8Var) {
        hb8 hb8Var2;
        do {
            hb8Var2 = atomicReference.get();
            if (hb8Var2 == CANCELLED) {
                if (hb8Var == null) {
                    return false;
                }
                hb8Var.cancel();
                return false;
            }
        } while (!kz4.a(atomicReference, hb8Var2, hb8Var));
        return true;
    }

    public static void reportMoreProduced(long j) {
        RxJavaPlugins.onError(new ProtocolViolationException("More produced than requested: " + j));
    }

    public static void reportSubscriptionSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<hb8> atomicReference, hb8 hb8Var) {
        hb8 hb8Var2;
        do {
            hb8Var2 = atomicReference.get();
            if (hb8Var2 == CANCELLED) {
                if (hb8Var == null) {
                    return false;
                }
                hb8Var.cancel();
                return false;
            }
        } while (!kz4.a(atomicReference, hb8Var2, hb8Var));
        if (hb8Var2 == null) {
            return true;
        }
        hb8Var2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<hb8> atomicReference, hb8 hb8Var) {
        ObjectHelper.requireNonNull(hb8Var, "s is null");
        if (kz4.a(atomicReference, null, hb8Var)) {
            return true;
        }
        hb8Var.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(hb8 hb8Var, hb8 hb8Var2) {
        if (hb8Var2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        }
        if (hb8Var == null) {
            return true;
        }
        hb8Var2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // defpackage.hb8
    public void cancel() {
    }

    @Override // defpackage.hb8
    public void request(long j) {
    }

    public static boolean cancel(AtomicReference<hb8> atomicReference) {
        hb8 andSet;
        hb8 hb8Var = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (hb8Var == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        RxJavaPlugins.onError(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    public static boolean setOnce(AtomicReference<hb8> atomicReference, hb8 hb8Var, long j) {
        if (!setOnce(atomicReference, hb8Var)) {
            return false;
        }
        hb8Var.request(j);
        return true;
    }
}
