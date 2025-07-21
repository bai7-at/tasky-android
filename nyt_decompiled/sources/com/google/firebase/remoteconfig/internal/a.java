package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.e;
import defpackage.bc8;
import defpackage.gh4;
import defpackage.le5;
import defpackage.og8;
import defpackage.ue5;
import defpackage.vf5;
import defpackage.vg8;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class a {
    private static final Map d = new HashMap();
    private static final Executor e = new gh4();
    private final ExecutorService a;
    private final e b;
    private og8 c = null;

    private static class b implements vf5, ue5, le5 {
        private final CountDownLatch a;

        private b() {
            this.a = new CountDownLatch(1);
        }

        @Override // defpackage.le5
        public void a() {
            this.a.countDown();
        }

        public boolean b(long j, TimeUnit timeUnit) {
            return this.a.await(j, timeUnit);
        }

        @Override // defpackage.ue5
        public void onFailure(Exception exc) {
            this.a.countDown();
        }

        @Override // defpackage.vf5
        public void onSuccess(Object obj) {
            this.a.countDown();
        }
    }

    private a(ExecutorService executorService, e eVar) {
        this.a = executorService;
        this.b = eVar;
    }

    private static Object c(og8 og8Var, long j, TimeUnit timeUnit) {
        b bVar = new b();
        Executor executor = e;
        og8Var.g(executor, bVar);
        og8Var.e(executor, bVar);
        og8Var.a(executor, bVar);
        if (!bVar.b(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (og8Var.q()) {
            return og8Var.m();
        }
        throw new ExecutionException(og8Var.l());
    }

    public static synchronized a h(ExecutorService executorService, e eVar) {
        a aVar;
        synchronized (a.class) {
            try {
                String b2 = eVar.b();
                Map map = d;
                if (!map.containsKey(b2)) {
                    map.put(b2, new a(executorService, eVar));
                }
                aVar = (a) map.get(b2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void i(com.google.firebase.remoteconfig.internal.b bVar) {
        return this.b.e(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ og8 j(boolean z, com.google.firebase.remoteconfig.internal.b bVar, Void r3) {
        if (z) {
            m(bVar);
        }
        return vg8.e(bVar);
    }

    private synchronized void m(com.google.firebase.remoteconfig.internal.b bVar) {
        this.c = vg8.e(bVar);
    }

    public void d() {
        synchronized (this) {
            this.c = vg8.e(null);
        }
        this.b.a();
    }

    public synchronized og8 e() {
        try {
            og8 og8Var = this.c;
            if (og8Var != null) {
                if (og8Var.p() && !this.c.q()) {
                }
            }
            ExecutorService executorService = this.a;
            final e eVar = this.b;
            Objects.requireNonNull(eVar);
            this.c = vg8.c(executorService, new Callable() { // from class: st0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return e.this.d();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public com.google.firebase.remoteconfig.internal.b f() {
        return g(5L);
    }

    com.google.firebase.remoteconfig.internal.b g(long j) {
        synchronized (this) {
            try {
                og8 og8Var = this.c;
                if (og8Var != null && og8Var.q()) {
                    return (com.google.firebase.remoteconfig.internal.b) this.c.m();
                }
                try {
                    return (com.google.firebase.remoteconfig.internal.b) c(e(), j, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public og8 k(com.google.firebase.remoteconfig.internal.b bVar) {
        return l(bVar, true);
    }

    public og8 l(final com.google.firebase.remoteconfig.internal.b bVar, final boolean z) {
        return vg8.c(this.a, new Callable() { // from class: tt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void i;
                i = a.this.i(bVar);
                return i;
            }
        }).s(this.a, new bc8() { // from class: ut0
            @Override // defpackage.bc8
            public final og8 then(Object obj) {
                og8 j;
                j = a.this.j(z, bVar, (Void) obj);
                return j;
            }
        });
    }
}
