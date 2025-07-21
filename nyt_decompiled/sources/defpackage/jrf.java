package defpackage;

import android.os.Handler;

/* loaded from: classes3.dex */
public final class jrf {
    private final Handler a;
    private final mrf b;

    public jrf(Handler handler, mrf mrfVar) {
        this.a = mrfVar == null ? null : handler;
        this.b = mrfVar;
    }

    public final void a(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: rqf
                @Override // java.lang.Runnable
                public final void run() {
                    jrf.this.j(exc);
                }
            });
        }
    }

    public final void b(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: uqf
                @Override // java.lang.Runnable
                public final void run() {
                    jrf.this.k(exc);
                }
            });
        }
    }

    public final void c(final prf prfVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: lqf
                @Override // java.lang.Runnable
                public final void run() {
                    jrf.this.l(prfVar);
                }
            });
        }
    }

    public final void d(final prf prfVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: oqf
                @Override // java.lang.Runnable
                public final void run() {
                    jrf.this.m(prfVar);
                }
            });
        }
    }

    public final void e(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: drf
                @Override // java.lang.Runnable
                public final void run() {
                    jrf.this.n(str, j, j2);
                }
            });
        }
    }

    public final void f(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: grf
                @Override // java.lang.Runnable
                public final void run() {
                    jrf.this.o(str);
                }
            });
        }
    }

    public final void g(final e8f e8fVar) {
        e8fVar.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: cqf
                @Override // java.lang.Runnable
                public final void run() {
                    jrf.this.p(e8fVar);
                }
            });
        }
    }

    public final void h(final e8f e8fVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: zpf
                @Override // java.lang.Runnable
                public final void run() {
                    jrf.this.q(e8fVar);
                }
            });
        }
    }

    public final void i(final l6a l6aVar, final g8f g8fVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: xqf
                @Override // java.lang.Runnable
                public final void run() {
                    jrf.this.r(l6aVar, g8fVar);
                }
            });
        }
    }

    final /* synthetic */ void j(Exception exc) {
        int i = khe.a;
        this.b.b(exc);
    }

    final /* synthetic */ void k(Exception exc) {
        int i = khe.a;
        this.b.f(exc);
    }

    final /* synthetic */ void l(prf prfVar) {
        int i = khe.a;
        this.b.g(prfVar);
    }

    final /* synthetic */ void m(prf prfVar) {
        int i = khe.a;
        this.b.d(prfVar);
    }

    final /* synthetic */ void n(String str, long j, long j2) {
        int i = khe.a;
        this.b.j(str, j, j2);
    }

    final /* synthetic */ void o(String str) {
        int i = khe.a;
        this.b.s(str);
    }

    final /* synthetic */ void p(e8f e8fVar) {
        e8fVar.a();
        int i = khe.a;
        this.b.i(e8fVar);
    }

    final /* synthetic */ void q(e8f e8fVar) {
        int i = khe.a;
        this.b.h(e8fVar);
    }

    final /* synthetic */ void r(l6a l6aVar, g8f g8fVar) {
        int i = khe.a;
        this.b.e(l6aVar, g8fVar);
    }

    final /* synthetic */ void s(long j) {
        int i = khe.a;
        this.b.a(j);
    }

    final /* synthetic */ void t(boolean z) {
        int i = khe.a;
        this.b.t(z);
    }

    final /* synthetic */ void u(int i, long j, long j2) {
        int i2 = khe.a;
        this.b.c(i, j, j2);
    }

    public final void v(final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: fqf
                @Override // java.lang.Runnable
                public final void run() {
                    jrf.this.s(j);
                }
            });
        }
    }

    public final void w(final boolean z) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: arf
                @Override // java.lang.Runnable
                public final void run() {
                    jrf.this.t(z);
                }
            });
        }
    }

    public final void x(final int i, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: iqf
                @Override // java.lang.Runnable
                public final void run() {
                    jrf.this.u(i, j, j2);
                }
            });
        }
    }
}
