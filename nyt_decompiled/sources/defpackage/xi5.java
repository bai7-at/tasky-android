package defpackage;

import defpackage.eb7;
import defpackage.jc5;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.NotificationLite;

/* loaded from: classes5.dex */
public final class xi5 implements jc5.b {
    private final eb7 a;
    private final boolean b;
    private final int c;

    private static final class a extends wa8 implements v3 {
        final wa8 a;
        final eb7.a b;
        final boolean d;
        final Queue e;
        final int f;
        volatile boolean g;
        Throwable j;
        long k;
        final AtomicLong h = new AtomicLong();
        final AtomicLong i = new AtomicLong();
        final NotificationLite c = NotificationLite.b();

        /* renamed from: xi5$a$a, reason: collision with other inner class name */
        class C0555a implements b46 {
            C0555a() {
            }

            @Override // defpackage.b46
            public void request(long j) {
                if (j > 0) {
                    r30.b(a.this.h, j);
                    a.this.d();
                }
            }
        }

        public a(eb7 eb7Var, wa8 wa8Var, boolean z, int i) {
            this.a = wa8Var;
            this.b = eb7Var.a();
            this.d = z;
            i = i <= 0 ? y47.c : i;
            this.f = i - (i >> 2);
            if (mx8.b()) {
                this.e = new rz7(i);
            } else {
                this.e = new yz7(i);
            }
            request(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v10, types: [eb7$a, gb8] */
        boolean b(boolean z, boolean z2, wa8 wa8Var, Queue queue) {
            if (wa8Var.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.d) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.j;
                try {
                    if (th != null) {
                        wa8Var.onError(th);
                    } else {
                        wa8Var.onCompleted();
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Throwable th3 = this.j;
            if (th3 != null) {
                queue.clear();
                try {
                    wa8Var.onError(th3);
                    return true;
                } finally {
                }
            }
            if (!z2) {
                return false;
            }
            try {
                wa8Var.onCompleted();
                return true;
            } finally {
            }
        }

        void c() {
            wa8 wa8Var = this.a;
            wa8Var.setProducer(new C0555a());
            wa8Var.add(this.b);
            wa8Var.add(this);
        }

        @Override // defpackage.v3
        public void call() {
            long j = this.k;
            Queue queue = this.e;
            wa8 wa8Var = this.a;
            NotificationLite notificationLite = this.c;
            long j2 = 1;
            do {
                long j3 = this.h.get();
                while (j3 != j) {
                    boolean z = this.g;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (b(z, z2, wa8Var, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    wa8Var.onNext(notificationLite.a(poll));
                    j++;
                    if (j == this.f) {
                        j3 = r30.c(this.h, j);
                        request(j);
                        j = 0;
                    }
                }
                if (j3 == j && b(this.g, queue.isEmpty(), wa8Var, queue)) {
                    return;
                }
                this.k = j;
                j2 = this.i.addAndGet(-j2);
            } while (j2 != 0);
        }

        protected void d() {
            if (this.i.getAndIncrement() == 0) {
                this.b.b(this);
            }
        }

        @Override // defpackage.uc5
        public void onCompleted() {
            if (isUnsubscribed() || this.g) {
                return;
            }
            this.g = true;
            d();
        }

        @Override // defpackage.uc5
        public void onError(Throwable th) {
            if (isUnsubscribed() || this.g) {
                r47.b().a().a(th);
                return;
            }
            this.j = th;
            this.g = true;
            d();
        }

        @Override // defpackage.uc5
        public void onNext(Object obj) {
            if (isUnsubscribed() || this.g) {
                return;
            }
            if (this.e.offer(this.c.c(obj))) {
                d();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    public xi5(eb7 eb7Var, boolean z, int i) {
        this.a = eb7Var;
        this.b = z;
        this.c = i <= 0 ? y47.c : i;
    }

    @Override // defpackage.ps2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public wa8 call(wa8 wa8Var) {
        a aVar = new a(this.a, wa8Var, this.b, this.c);
        aVar.c();
        return aVar;
    }
}
