package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.audio.e;
import com.google.android.exoplayer2.t0;
import defpackage.ur;
import defpackage.wc1;
import defpackage.yc1;
import defpackage.z19;

/* loaded from: classes2.dex */
public interface e {

    public static final class a {
        private final Handler a;
        private final e b;

        public a(Handler handler, e eVar) {
            this.a = eVar != null ? (Handler) ur.e(handler) : null;
            this.b = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void A(int i, long j, long j2) {
            ((e) z19.j(this.b)).x(i, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(Exception exc) {
            ((e) z19.j(this.b)).w(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(Exception exc) {
            ((e) z19.j(this.b)).b(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(String str, long j, long j2) {
            ((e) z19.j(this.b)).g(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(String str) {
            ((e) z19.j(this.b)).f(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(wc1 wc1Var) {
            wc1Var.c();
            ((e) z19.j(this.b)).r(wc1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(wc1 wc1Var) {
            ((e) z19.j(this.b)).y(wc1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(t0 t0Var, yc1 yc1Var) {
            ((e) z19.j(this.b)).H(t0Var);
            ((e) z19.j(this.b)).i(t0Var, yc1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(long j) {
            ((e) z19.j(this.b)).k(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(boolean z) {
            ((e) z19.j(this.b)).a(z);
        }

        public void B(final long j) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: hz
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.this.y(j);
                    }
                });
            }
        }

        public void C(final boolean z) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ez
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.this.z(z);
                    }
                });
            }
        }

        public void D(final int i, final long j, final long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: dz
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.this.A(i, j, j2);
                    }
                });
            }
        }

        public void k(final Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: gz
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.this.r(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: lz
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.this.s(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j, final long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: fz
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.this.t(str, j, j2);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: cz
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.this.u(str);
                    }
                });
            }
        }

        public void o(final wc1 wc1Var) {
            wc1Var.c();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: jz
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.this.v(wc1Var);
                    }
                });
            }
        }

        public void p(final wc1 wc1Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: iz
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.this.w(wc1Var);
                    }
                });
            }
        }

        public void q(final t0 t0Var, final yc1 yc1Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: kz
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.this.x(t0Var, yc1Var);
                    }
                });
            }
        }
    }

    default void H(t0 t0Var) {
    }

    void a(boolean z);

    void b(Exception exc);

    void f(String str);

    void g(String str, long j, long j2);

    void i(t0 t0Var, yc1 yc1Var);

    void k(long j);

    void r(wc1 wc1Var);

    void w(Exception exc);

    void x(int i, long j, long j2);

    void y(wc1 wc1Var);
}
