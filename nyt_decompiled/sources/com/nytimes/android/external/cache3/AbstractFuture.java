package com.nytimes.android.external.cache3;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import defpackage.e16;
import defpackage.i64;
import defpackage.v1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class AbstractFuture implements i64 {
    private static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger e = Logger.getLogger(AbstractFuture.class.getName());
    private static final b f;
    private static final Object g;
    private volatile Object a;
    private volatile d b;
    private volatile h c;

    private static final class Failure {
        static final Failure b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.nytimes.android.external.cache3.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable a;

        Failure(Throwable th) {
            this.a = (Throwable) e16.d(th);
        }
    }

    private static abstract class b {
        private b() {
        }

        abstract boolean a(AbstractFuture abstractFuture, d dVar, d dVar2);

        abstract boolean b(AbstractFuture abstractFuture, Object obj, Object obj2);

        abstract boolean c(AbstractFuture abstractFuture, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    private static final class c {
        final boolean a;
        final Throwable b;

        c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    private static final class d {
        static final d d = new d(null, null);
        final Runnable a;
        final Executor b;
        d c;

        d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    private static final class e extends b {
        final AtomicReferenceFieldUpdater a;
        final AtomicReferenceFieldUpdater b;
        final AtomicReferenceFieldUpdater c;
        final AtomicReferenceFieldUpdater d;
        final AtomicReferenceFieldUpdater e;

        e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture.b
        boolean a(AbstractFuture abstractFuture, d dVar, d dVar2) {
            return v1.a(this.d, abstractFuture, dVar, dVar2);
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture.b
        boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return v1.a(this.e, abstractFuture, obj, obj2);
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture.b
        boolean c(AbstractFuture abstractFuture, h hVar, h hVar2) {
            return v1.a(this.c, abstractFuture, hVar, hVar2);
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture.b
        void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture.b
        void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    private static final class f extends b {
        private f() {
            super();
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture.b
        boolean a(AbstractFuture abstractFuture, d dVar, d dVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.b != dVar) {
                        return false;
                    }
                    abstractFuture.b = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture.b
        boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.a != obj) {
                        return false;
                    }
                    abstractFuture.a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture.b
        boolean c(AbstractFuture abstractFuture, h hVar, h hVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.c != hVar) {
                        return false;
                    }
                    abstractFuture.c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture.b
        void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture.b
        void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    public static abstract class g extends AbstractFuture {
        @Override // com.nytimes.android.external.cache3.AbstractFuture, defpackage.i64
        public final void a(Runnable runnable, Executor executor) {
            super.a(runnable, executor);
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture, java.util.concurrent.Future
        public final Object get() {
            return super.get();
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.nytimes.android.external.cache3.AbstractFuture, java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return super.get(j, timeUnit);
        }
    }

    private static final class h {
        static final h c = new h(false);
        volatile Thread a;
        volatile h b;

        h(boolean z) {
        }

        void a(h hVar) {
            AbstractFuture.f.d(this, hVar);
        }

        void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            AbstractFuture.f.e(this, Thread.currentThread());
        }
    }

    static {
        b fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, Tag.A), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, h.class, QueryKeys.TIME_ON_VIEW_IN_MINUTES), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, Tag.A));
        } catch (Throwable th) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!");
            logger.log(level, "SafeAtomicHelper is broken!", th);
            fVar = new f();
        }
        f = fVar;
        g = new Object();
    }

    protected AbstractFuture() {
    }

    static final CancellationException i(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private d j() {
        d dVar;
        do {
            dVar = this.b;
        } while (!f.a(this, dVar, d.d));
        return dVar;
    }

    private h k() {
        h hVar;
        do {
            hVar = this.c;
        } while (!f.c(this, hVar, h.c));
        return hVar;
    }

    private void l() {
        for (h k = k(); k != null; k = k.b) {
            k.b();
        }
        d j = j();
        d dVar = null;
        while (j != null) {
            d dVar2 = j.c;
            j.c = dVar;
            dVar = j;
            j = dVar2;
        }
        while (dVar != null) {
            n(dVar.a, dVar.b);
            dVar = dVar.c;
        }
        m();
    }

    private static void n(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    private Object o(Object obj) {
        if (obj instanceof c) {
            throw i("Task was cancelled.", ((c) obj).b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    private Throwable r() {
        return new CancellationException("Future.cancel() was called.");
    }

    private void s(h hVar) {
        hVar.a = null;
        while (true) {
            h hVar2 = this.c;
            if (hVar2 == h.c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.b;
                if (hVar2.a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.b = hVar4;
                    if (hVar3.a == null) {
                        break;
                    }
                } else if (!f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // defpackage.i64
    public void a(Runnable runnable, Executor executor) {
        e16.e(runnable, "Runnable was null.");
        e16.e(executor, "Executor was null.");
        d dVar = this.b;
        if (dVar != d.d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.c = dVar;
                if (f.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.b;
                }
            } while (dVar != d.d);
        }
        n(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj == null) {
            if (f.b(this, obj, new c(z, d ? r() : null))) {
                if (z) {
                    p();
                }
                l();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return o(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.c;
            if (hVar != h.c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                s(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return o(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        s(hVar2);
                    } else {
                        hVar = this.c;
                    }
                } while (hVar != h.c);
            }
            return o(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return o(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.a != null;
    }

    void m() {
    }

    protected void p() {
    }

    final void q(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(v());
        }
    }

    protected boolean t(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.b(this, null, obj)) {
            return false;
        }
        l();
        return true;
    }

    protected boolean u(Throwable th) {
        if (!f.b(this, null, new Failure((Throwable) e16.d(th)))) {
            return false;
        }
        l();
        return true;
    }

    protected final boolean v() {
        Object obj = this.a;
        return (obj instanceof c) && ((c) obj).a;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return o(obj2);
            }
            h hVar = this.c;
            if (hVar != h.c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                s(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return o(obj);
                    }
                    hVar = this.c;
                } while (hVar != h.c);
            }
            return o(this.a);
        }
        throw new InterruptedException();
    }
}
