package rx.internal.producers;

import defpackage.b46;
import defpackage.e62;
import defpackage.wa8;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class SingleProducer<T> extends AtomicBoolean implements b46 {
    private static final long serialVersionUID = -3353584923995471404L;
    final wa8 child;
    final T value;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleProducer(wa8 wa8Var, Object obj) {
        this.child = wa8Var;
        this.value = obj;
    }

    @Override // defpackage.b46
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j != 0 && compareAndSet(false, true)) {
            wa8 wa8Var = this.child;
            T t = this.value;
            if (wa8Var.isUnsubscribed()) {
                return;
            }
            try {
                wa8Var.onNext(t);
                if (wa8Var.isUnsubscribed()) {
                    return;
                }
                wa8Var.onCompleted();
            } catch (Throwable th) {
                e62.f(th, wa8Var, t);
            }
        }
    }
}
