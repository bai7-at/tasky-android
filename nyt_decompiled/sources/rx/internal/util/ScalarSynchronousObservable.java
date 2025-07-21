package rx.internal.util;

import defpackage.b46;
import defpackage.e62;
import defpackage.eb7;
import defpackage.f42;
import defpackage.gb8;
import defpackage.jc5;
import defpackage.ps2;
import defpackage.v3;
import defpackage.wa8;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.internal.producers.SingleProducer;

/* loaded from: classes5.dex */
public final class ScalarSynchronousObservable extends jc5 {
    static final boolean d = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();
    final Object c;

    static final class ScalarAsyncProducer<T> extends AtomicBoolean implements b46, v3 {
        private static final long serialVersionUID = -2466317989629281651L;
        final wa8 actual;
        final ps2 onSchedule;
        final T value;

        /* JADX WARN: Multi-variable type inference failed */
        public ScalarAsyncProducer(wa8 wa8Var, Object obj, ps2 ps2Var) {
            this.actual = wa8Var;
            this.value = obj;
            this.onSchedule = ps2Var;
        }

        @Override // defpackage.v3
        public void call() {
            wa8 wa8Var = this.actual;
            if (wa8Var.isUnsubscribed()) {
                return;
            }
            T t = this.value;
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

        @Override // defpackage.b46
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            if (j == 0 || !compareAndSet(false, true)) {
                return;
            }
            this.actual.add((gb8) this.onSchedule.call(this));
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.value + ", " + get() + "]";
        }
    }

    class a implements jc5.a {
        final /* synthetic */ Object a;

        a(Object obj) {
            this.a = obj;
        }

        @Override // defpackage.w3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(wa8 wa8Var) {
            wa8Var.setProducer(ScalarSynchronousObservable.v(wa8Var, this.a));
        }
    }

    class b implements ps2 {
        final /* synthetic */ f42 a;

        b(f42 f42Var) {
            this.a = f42Var;
        }

        @Override // defpackage.ps2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gb8 call(v3 v3Var) {
            return this.a.b(v3Var);
        }
    }

    class c implements ps2 {
        final /* synthetic */ eb7 a;

        class a implements v3 {
            final /* synthetic */ v3 a;
            final /* synthetic */ eb7.a b;

            a(v3 v3Var, eb7.a aVar) {
                this.a = v3Var;
                this.b = aVar;
            }

            @Override // defpackage.v3
            public void call() {
                try {
                    this.a.call();
                } finally {
                    this.b.unsubscribe();
                }
            }
        }

        c(eb7 eb7Var) {
            this.a = eb7Var;
        }

        @Override // defpackage.ps2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gb8 call(v3 v3Var) {
            eb7.a a2 = this.a.a();
            a2.b(new a(v3Var, a2));
            return a2;
        }
    }

    static final class d implements jc5.a {
        final Object a;
        final ps2 b;

        d(Object obj, ps2 ps2Var) {
            this.a = obj;
            this.b = ps2Var;
        }

        @Override // defpackage.w3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(wa8 wa8Var) {
            wa8Var.setProducer(new ScalarAsyncProducer(wa8Var, this.a, this.b));
        }
    }

    static final class e implements b46 {
        final wa8 a;
        final Object b;
        boolean c;

        public e(wa8 wa8Var, Object obj) {
            this.a = wa8Var;
            this.b = obj;
        }

        @Override // defpackage.b46
        public void request(long j) {
            if (this.c) {
                return;
            }
            if (j < 0) {
                throw new IllegalStateException("n >= required but it was " + j);
            }
            if (j == 0) {
                return;
            }
            this.c = true;
            wa8 wa8Var = this.a;
            if (wa8Var.isUnsubscribed()) {
                return;
            }
            Object obj = this.b;
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
    }

    protected ScalarSynchronousObservable(Object obj) {
        super(new a(obj));
        this.c = obj;
    }

    public static ScalarSynchronousObservable u(Object obj) {
        return new ScalarSynchronousObservable(obj);
    }

    static b46 v(wa8 wa8Var, Object obj) {
        return d ? new SingleProducer(wa8Var, obj) : new e(wa8Var, obj);
    }

    public jc5 w(eb7 eb7Var) {
        return jc5.b(new d(this.c, eb7Var instanceof f42 ? new b((f42) eb7Var) : new c(eb7Var)));
    }
}
