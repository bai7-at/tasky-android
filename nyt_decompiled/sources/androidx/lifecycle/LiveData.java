package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.d44;
import defpackage.l77;
import defpackage.vc5;
import defpackage.vn;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData {
    static final Object k = new Object();
    final Object a;
    private l77 b;
    int c;
    private boolean d;
    private volatile Object e;
    volatile Object f;
    private int g;
    private boolean h;
    private boolean i;
    private final Runnable j;

    class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements g {
        final d44 e;

        LifecycleBoundObserver(d44 d44Var, vc5 vc5Var) {
            super(vc5Var);
            this.e = d44Var;
        }

        void b() {
            this.e.getLifecycle().d(this);
        }

        boolean c(d44 d44Var) {
            return this.e == d44Var;
        }

        boolean d() {
            return this.e.getLifecycle().b().isAtLeast(Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.g
        public void h(d44 d44Var, Lifecycle.Event event) {
            Lifecycle.State b = this.e.getLifecycle().b();
            if (b == Lifecycle.State.DESTROYED) {
                LiveData.this.o(this.a);
                return;
            }
            Lifecycle.State state = null;
            while (state != b) {
                a(d());
                state = b;
                b = this.e.getLifecycle().b();
            }
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.f;
                LiveData.this.f = LiveData.k;
            }
            LiveData.this.p(obj);
        }
    }

    private class b extends c {
        b(vc5 vc5Var) {
            super(vc5Var);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean d() {
            return true;
        }
    }

    private abstract class c {
        final vc5 a;
        boolean b;
        int c = -1;

        c(vc5 vc5Var) {
            this.a = vc5Var;
        }

        void a(boolean z) {
            if (z == this.b) {
                return;
            }
            this.b = z;
            LiveData.this.c(z ? 1 : -1);
            if (this.b) {
                LiveData.this.e(this);
            }
        }

        void b() {
        }

        boolean c(d44 d44Var) {
            return false;
        }

        abstract boolean d();
    }

    public LiveData(Object obj) {
        this.a = new Object();
        this.b = new l77();
        this.c = 0;
        this.f = k;
        this.j = new a();
        this.e = obj;
        this.g = 0;
    }

    static void b(String str) {
        if (vn.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(c cVar) {
        if (cVar.b) {
            if (!cVar.d()) {
                cVar.a(false);
                return;
            }
            int i = cVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            cVar.c = i2;
            cVar.a.a(this.e);
        }
    }

    void c(int i) {
        int i2 = this.c;
        this.c = i + i2;
        if (this.d) {
            return;
        }
        this.d = true;
        while (true) {
            try {
                int i3 = this.c;
                if (i2 == i3) {
                    this.d = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    l();
                } else if (z2) {
                    m();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
    }

    void e(c cVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                l77.d e = this.b.e();
                while (e.hasNext()) {
                    d((c) ((Map.Entry) e.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public Object f() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    int g() {
        return this.g;
    }

    public boolean h() {
        return this.c > 0;
    }

    public boolean i() {
        return this.e != k;
    }

    public void j(d44 d44Var, vc5 vc5Var) {
        b("observe");
        if (d44Var.getLifecycle().b() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(d44Var, vc5Var);
        c cVar = (c) this.b.j(vc5Var, lifecycleBoundObserver);
        if (cVar != null && !cVar.c(d44Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        d44Var.getLifecycle().a(lifecycleBoundObserver);
    }

    public void k(vc5 vc5Var) {
        b("observeForever");
        b bVar = new b(vc5Var);
        c cVar = (c) this.b.j(vc5Var, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void l() {
    }

    protected void m() {
    }

    protected void n(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            vn.g().c(this.j);
        }
    }

    public void o(vc5 vc5Var) {
        b("removeObserver");
        c cVar = (c) this.b.k(vc5Var);
        if (cVar == null) {
            return;
        }
        cVar.b();
        cVar.a(false);
    }

    protected void p(Object obj) {
        b("setValue");
        this.g++;
        this.e = obj;
        e(null);
    }

    public LiveData() {
        this.a = new Object();
        this.b = new l77();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }
}
