package rx.internal.producers;

import defpackage.b46;
import defpackage.e62;
import defpackage.wa8;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class SingleDelayedProducer<T> extends AtomicInteger implements b46 {
    private static final long serialVersionUID = -2873467947112093874L;
    final wa8 child;
    T value;

    public SingleDelayedProducer(wa8 wa8Var) {
        this.child = wa8Var;
    }

    private static void a(wa8 wa8Var, Object obj) {
        if (wa8Var.isUnsubscribed()) {
            return;
        }
        try {
            wa8Var.onNext(obj);
            if (wa8Var.isUnsubscribed()) {
                return;
            }
            wa8Var.onCompleted();
        } catch (Throwable th) {
            e62.f(th, wa8Var, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(Object obj) {
        do {
            int i = get();
            if (i != 0) {
                if (i == 2 && compareAndSet(2, 3)) {
                    a(this.child, obj);
                    return;
                }
                return;
            }
            this.value = obj;
        } while (!compareAndSet(0, 1));
    }

    @Override // defpackage.b46
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j == 0) {
            return;
        }
        do {
            int i = get();
            if (i != 0) {
                if (i == 1 && compareAndSet(1, 3)) {
                    a(this.child, this.value);
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }
}
