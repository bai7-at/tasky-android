package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class gq0 {
    private static final gq0 d = new gq0().j();
    private static final gq0 e = new gq0().b();
    private Boolean a = null;
    private final List b = new ArrayList();
    private final Object c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(gq0 gq0Var, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, gq0 gq0Var2) {
        if (!gq0Var.d()) {
            atomicBoolean.set(true);
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (atomicBoolean.get()) {
                gq0Var2.b();
            } else {
                gq0Var2.j();
            }
        }
    }

    public static gq0 g(Collection collection) {
        if (collection.isEmpty()) {
            return i();
        }
        final gq0 gq0Var = new gq0();
        final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            final gq0 gq0Var2 = (gq0) it2.next();
            gq0Var2.k(new Runnable() { // from class: eq0
                @Override // java.lang.Runnable
                public final void run() {
                    gq0.f(gq0.this, atomicBoolean, atomicInteger, gq0Var);
                }
            });
        }
        return gq0Var;
    }

    public static gq0 h() {
        return e;
    }

    public static gq0 i() {
        return d;
    }

    public gq0 b() {
        synchronized (this.c) {
            try {
                if (this.a == null) {
                    this.a = Boolean.FALSE;
                    Iterator it2 = this.b.iterator();
                    while (it2.hasNext()) {
                        ((Runnable) it2.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public boolean c() {
        boolean z;
        synchronized (this.c) {
            z = this.a != null;
        }
        return z;
    }

    public boolean d() {
        boolean z;
        synchronized (this.c) {
            try {
                Boolean bool = this.a;
                z = bool != null && bool.booleanValue();
            } finally {
            }
        }
        return z;
    }

    public gq0 e(long j, TimeUnit timeUnit) {
        if (c()) {
            return this;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        k(new Runnable() { // from class: fq0
            @Override // java.lang.Runnable
            public final void run() {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(j, timeUnit);
            return this;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return this;
        }
    }

    public gq0 j() {
        synchronized (this.c) {
            try {
                if (this.a == null) {
                    this.a = Boolean.TRUE;
                    Iterator it2 = this.b.iterator();
                    while (it2.hasNext()) {
                        ((Runnable) it2.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public gq0 k(Runnable runnable) {
        boolean z;
        synchronized (this.c) {
            if (this.a != null) {
                z = true;
            } else {
                this.b.add(runnable);
                z = false;
            }
        }
        if (z) {
            runnable.run();
        }
        return this;
    }
}
