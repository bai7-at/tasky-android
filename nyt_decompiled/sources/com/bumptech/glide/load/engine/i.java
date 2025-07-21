package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.m;
import defpackage.b18;
import defpackage.cz6;
import defpackage.da2;
import defpackage.fz6;
import defpackage.ov3;
import defpackage.s62;
import defpackage.sz5;
import defpackage.w03;
import defpackage.z06;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
class i implements DecodeJob.b, da2.f {
    private static final c M = new c();
    m B;
    private DecodeJob H;
    private volatile boolean L;
    final e a;
    private final b18 b;
    private final m.a c;
    private final sz5 d;
    private final c e;
    private final j f;
    private final w03 g;
    private final w03 h;
    private final w03 i;
    private final w03 j;
    private final AtomicInteger k;
    private ov3 l;
    private boolean m;
    private boolean n;
    private boolean r;
    private boolean s;
    private cz6 t;
    DataSource u;
    private boolean w;
    GlideException x;
    private boolean y;

    private class a implements Runnable {
        private final fz6 a;

        a(fz6 fz6Var) {
            this.a = fz6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.a.f()) {
                synchronized (i.this) {
                    try {
                        if (i.this.a.c(this.a)) {
                            i.this.f(this.a);
                        }
                        i.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    private class b implements Runnable {
        private final fz6 a;

        b(fz6 fz6Var) {
            this.a = fz6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.a.f()) {
                synchronized (i.this) {
                    try {
                        if (i.this.a.c(this.a)) {
                            i.this.B.b();
                            i.this.g(this.a);
                            i.this.r(this.a);
                        }
                        i.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    static class c {
        c() {
        }

        public m a(cz6 cz6Var, boolean z, ov3 ov3Var, m.a aVar) {
            return new m(cz6Var, z, true, ov3Var, aVar);
        }
    }

    static final class d {
        final fz6 a;
        final Executor b;

        d(fz6 fz6Var, Executor executor) {
            this.a = fz6Var;
            this.b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    static final class e implements Iterable {
        private final List a;

        e() {
            this(new ArrayList(2));
        }

        private static d f(fz6 fz6Var) {
            return new d(fz6Var, s62.a());
        }

        void a(fz6 fz6Var, Executor executor) {
            this.a.add(new d(fz6Var, executor));
        }

        boolean c(fz6 fz6Var) {
            return this.a.contains(f(fz6Var));
        }

        void clear() {
            this.a.clear();
        }

        e e() {
            return new e(new ArrayList(this.a));
        }

        void g(fz6 fz6Var) {
            this.a.remove(f(fz6Var));
        }

        boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.a.iterator();
        }

        int size() {
            return this.a.size();
        }

        e(List list) {
            this.a = list;
        }
    }

    i(w03 w03Var, w03 w03Var2, w03 w03Var3, w03 w03Var4, j jVar, m.a aVar, sz5 sz5Var) {
        this(w03Var, w03Var2, w03Var3, w03Var4, jVar, aVar, sz5Var, M);
    }

    private w03 j() {
        return this.n ? this.i : this.r ? this.j : this.h;
    }

    private boolean m() {
        return this.y || this.w || this.L;
    }

    private synchronized void q() {
        if (this.l == null) {
            throw new IllegalArgumentException();
        }
        this.a.clear();
        this.l = null;
        this.B = null;
        this.t = null;
        this.y = false;
        this.L = false;
        this.w = false;
        this.H.z(false);
        this.H = null;
        this.x = null;
        this.u = null;
        this.d.a(this);
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.b
    public void a(cz6 cz6Var, DataSource dataSource) {
        synchronized (this) {
            this.t = cz6Var;
            this.u = dataSource;
        }
        o();
    }

    @Override // da2.f
    public b18 b() {
        return this.b;
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.b
    public void c(GlideException glideException) {
        synchronized (this) {
            this.x = glideException;
        }
        n();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.b
    public void d(DecodeJob decodeJob) {
        j().execute(decodeJob);
    }

    synchronized void e(fz6 fz6Var, Executor executor) {
        try {
            this.b.c();
            this.a.a(fz6Var, executor);
            if (this.w) {
                k(1);
                executor.execute(new b(fz6Var));
            } else if (this.y) {
                k(1);
                executor.execute(new a(fz6Var));
            } else {
                z06.a(!this.L, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void f(fz6 fz6Var) {
        try {
            fz6Var.c(this.x);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    void g(fz6 fz6Var) {
        try {
            fz6Var.a(this.B, this.u);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    void h() {
        if (m()) {
            return;
        }
        this.L = true;
        this.H.e();
        this.f.b(this, this.l);
    }

    void i() {
        m mVar;
        synchronized (this) {
            try {
                this.b.c();
                z06.a(m(), "Not yet complete!");
                int decrementAndGet = this.k.decrementAndGet();
                z06.a(decrementAndGet >= 0, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    mVar = this.B;
                    q();
                } else {
                    mVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mVar != null) {
            mVar.g();
        }
    }

    synchronized void k(int i) {
        m mVar;
        z06.a(m(), "Not yet complete!");
        if (this.k.getAndAdd(i) == 0 && (mVar = this.B) != null) {
            mVar.b();
        }
    }

    synchronized i l(ov3 ov3Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.l = ov3Var;
        this.m = z;
        this.n = z2;
        this.r = z3;
        this.s = z4;
        return this;
    }

    void n() {
        synchronized (this) {
            try {
                this.b.c();
                if (this.L) {
                    q();
                    return;
                }
                if (this.a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.y) {
                    throw new IllegalStateException("Already failed once");
                }
                this.y = true;
                ov3 ov3Var = this.l;
                e e2 = this.a.e();
                k(e2.size() + 1);
                this.f.d(this, ov3Var, null);
                Iterator it2 = e2.iterator();
                while (it2.hasNext()) {
                    d dVar = (d) it2.next();
                    dVar.b.execute(new a(dVar.a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void o() {
        synchronized (this) {
            try {
                this.b.c();
                if (this.L) {
                    this.t.c();
                    q();
                    return;
                }
                if (this.a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.w) {
                    throw new IllegalStateException("Already have resource");
                }
                this.B = this.e.a(this.t, this.m, this.l, this.c);
                this.w = true;
                e e2 = this.a.e();
                k(e2.size() + 1);
                this.f.d(this, this.l, this.B);
                Iterator it2 = e2.iterator();
                while (it2.hasNext()) {
                    d dVar = (d) it2.next();
                    dVar.b.execute(new b(dVar.a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean p() {
        return this.s;
    }

    synchronized void r(fz6 fz6Var) {
        try {
            this.b.c();
            this.a.g(fz6Var);
            if (this.a.isEmpty()) {
                h();
                if (!this.w) {
                    if (this.y) {
                    }
                }
                if (this.k.get() == 0) {
                    q();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(DecodeJob decodeJob) {
        try {
            this.H = decodeJob;
            (decodeJob.F() ? this.g : j()).execute(decodeJob);
        } catch (Throwable th) {
            throw th;
        }
    }

    i(w03 w03Var, w03 w03Var2, w03 w03Var3, w03 w03Var4, j jVar, m.a aVar, sz5 sz5Var, c cVar) {
        this.a = new e();
        this.b = b18.a();
        this.k = new AtomicInteger();
        this.g = w03Var;
        this.h = w03Var2;
        this.i = w03Var3;
        this.j = w03Var4;
        this.f = jVar;
        this.c = aVar;
        this.d = sz5Var;
        this.e = cVar;
    }
}
