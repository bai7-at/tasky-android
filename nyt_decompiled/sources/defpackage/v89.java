package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.t0;
import defpackage.v89;

/* loaded from: classes2.dex */
public interface v89 {

    public static final class a {
        private final Handler a;
        private final v89 b;

        public a(Handler handler, v89 v89Var) {
            this.a = v89Var != null ? (Handler) ur.e(handler) : null;
            this.b = v89Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j, long j2) {
            ((v89) z19.j(this.b)).e(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((v89) z19.j(this.b)).d(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(wc1 wc1Var) {
            wc1Var.c();
            ((v89) z19.j(this.b)).o(wc1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(int i, long j) {
            ((v89) z19.j(this.b)).t(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(wc1 wc1Var) {
            ((v89) z19.j(this.b)).p(wc1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(t0 t0Var, yc1 yc1Var) {
            ((v89) z19.j(this.b)).C(t0Var);
            ((v89) z19.j(this.b)).v(t0Var, yc1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j) {
            ((v89) z19.j(this.b)).u(obj, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(long j, int i) {
            ((v89) z19.j(this.b)).z(j, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((v89) z19.j(this.b)).l(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(z89 z89Var) {
            ((v89) z19.j(this.b)).n(z89Var);
        }

        public void A(final Object obj) {
            if (this.a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.a.post(new Runnable() { // from class: n89
                    @Override // java.lang.Runnable
                    public final void run() {
                        v89.a.this.w(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j, final int i) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u89
                    @Override // java.lang.Runnable
                    public final void run() {
                        v89.a.this.x(j, i);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q89
                    @Override // java.lang.Runnable
                    public final void run() {
                        v89.a.this.y(exc);
                    }
                });
            }
        }

        public void D(final z89 z89Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l89
                    @Override // java.lang.Runnable
                    public final void run() {
                        v89.a.this.z(z89Var);
                    }
                });
            }
        }

        public void k(final String str, final long j, final long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: r89
                    @Override // java.lang.Runnable
                    public final void run() {
                        v89.a.this.q(str, j, j2);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o89
                    @Override // java.lang.Runnable
                    public final void run() {
                        v89.a.this.r(str);
                    }
                });
            }
        }

        public void m(final wc1 wc1Var) {
            wc1Var.c();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p89
                    @Override // java.lang.Runnable
                    public final void run() {
                        v89.a.this.s(wc1Var);
                    }
                });
            }
        }

        public void n(final int i, final long j) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m89
                    @Override // java.lang.Runnable
                    public final void run() {
                        v89.a.this.t(i, j);
                    }
                });
            }
        }

        public void o(final wc1 wc1Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: s89
                    @Override // java.lang.Runnable
                    public final void run() {
                        v89.a.this.u(wc1Var);
                    }
                });
            }
        }

        public void p(final t0 t0Var, final yc1 yc1Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t89
                    @Override // java.lang.Runnable
                    public final void run() {
                        v89.a.this.v(t0Var, yc1Var);
                    }
                });
            }
        }
    }

    default void C(t0 t0Var) {
    }

    void d(String str);

    void e(String str, long j, long j2);

    void l(Exception exc);

    void n(z89 z89Var);

    void o(wc1 wc1Var);

    void p(wc1 wc1Var);

    void t(int i, long j);

    void u(Object obj, long j);

    void v(t0 t0Var, yc1 yc1Var);

    void z(long j, int i);
}
