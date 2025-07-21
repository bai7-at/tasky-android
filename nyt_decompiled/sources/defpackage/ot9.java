package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class ot9 {
    private final Handler a;
    private final pt9 b;

    public ot9(Handler handler, pt9 pt9Var) {
        this.a = pt9Var == null ? null : handler;
        this.b = pt9Var;
    }

    public final void a(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: rs9
                @Override // java.lang.Runnable
                public final void run() {
                    ot9.this.g(str, j, j2);
                }
            });
        }
    }

    public final void b(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: nt9
                @Override // java.lang.Runnable
                public final void run() {
                    ot9.this.h(str);
                }
            });
        }
    }

    public final void c(final e8f e8fVar) {
        e8fVar.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: mt9
                @Override // java.lang.Runnable
                public final void run() {
                    ot9.this.i(e8fVar);
                }
            });
        }
    }

    public final void d(final int i, final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt9
                @Override // java.lang.Runnable
                public final void run() {
                    ot9.this.j(i, j);
                }
            });
        }
    }

    public final void e(final e8f e8fVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: it9
                @Override // java.lang.Runnable
                public final void run() {
                    ot9.this.k(e8fVar);
                }
            });
        }
    }

    public final void f(final l6a l6aVar, final g8f g8fVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: kt9
                @Override // java.lang.Runnable
                public final void run() {
                    ot9.this.l(l6aVar, g8fVar);
                }
            });
        }
    }

    final /* synthetic */ void g(String str, long j, long j2) {
        int i = khe.a;
        this.b.a0(str, j, j2);
    }

    final /* synthetic */ void h(String str) {
        int i = khe.a;
        this.b.U(str);
    }

    final /* synthetic */ void i(e8f e8fVar) {
        e8fVar.a();
        int i = khe.a;
        this.b.Y(e8fVar);
    }

    final /* synthetic */ void j(int i, long j) {
        int i2 = khe.a;
        this.b.d0(i, j);
    }

    final /* synthetic */ void k(e8f e8fVar) {
        int i = khe.a;
        this.b.Z(e8fVar);
    }

    final /* synthetic */ void l(l6a l6aVar, g8f g8fVar) {
        int i = khe.a;
        this.b.V(l6aVar, g8fVar);
    }

    final /* synthetic */ void m(Object obj, long j) {
        int i = khe.a;
        this.b.b0(obj, j);
    }

    final /* synthetic */ void n(long j, int i) {
        int i2 = khe.a;
        this.b.W(j, i);
    }

    final /* synthetic */ void o(Exception exc) {
        int i = khe.a;
        this.b.c0(exc);
    }

    final /* synthetic */ void p(wmc wmcVar) {
        int i = khe.a;
        this.b.X(wmcVar);
    }

    public final void q(final Object obj) {
        Handler handler = this.a;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: dt9
                @Override // java.lang.Runnable
                public final void run() {
                    ot9.this.m(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void r(final long j, final int i) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: ft9
                @Override // java.lang.Runnable
                public final void run() {
                    ot9.this.n(j, i);
                }
            });
        }
    }

    public final void s(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: ht9
                @Override // java.lang.Runnable
                public final void run() {
                    ot9.this.o(exc);
                }
            });
        }
    }

    public final void t(final wmc wmcVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: zs9
                @Override // java.lang.Runnable
                public final void run() {
                    ot9.this.p(wmcVar);
                }
            });
        }
    }
}
