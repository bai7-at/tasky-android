package io.reactivex.internal.subscriptions;

import defpackage.hb8;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<hb8> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i) {
        super(i);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        hb8 andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                hb8 hb8Var = get(i);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (hb8Var != subscriptionHelper && (andSet = getAndSet(i, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }

    public hb8 replaceResource(int i, hb8 hb8Var) {
        hb8 hb8Var2;
        do {
            hb8Var2 = get(i);
            if (hb8Var2 == SubscriptionHelper.CANCELLED) {
                if (hb8Var == null) {
                    return null;
                }
                hb8Var.cancel();
                return null;
            }
        } while (!compareAndSet(i, hb8Var2, hb8Var));
        return hb8Var2;
    }

    public boolean setResource(int i, hb8 hb8Var) {
        hb8 hb8Var2;
        do {
            hb8Var2 = get(i);
            if (hb8Var2 == SubscriptionHelper.CANCELLED) {
                if (hb8Var == null) {
                    return false;
                }
                hb8Var.cancel();
                return false;
            }
        } while (!compareAndSet(i, hb8Var2, hb8Var));
        if (hb8Var2 == null) {
            return true;
        }
        hb8Var2.cancel();
        return true;
    }
}
