package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.source.o;
import defpackage.ur;
import defpackage.z19;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public interface h {

    public static class a {
        public final int a;
        public final o.b b;
        private final CopyOnWriteArrayList c;

        /* renamed from: com.google.android.exoplayer2.drm.h$a$a, reason: collision with other inner class name */
        private static final class C0181a {
            public Handler a;
            public h b;

            public C0181a(Handler handler, h hVar) {
                this.a = handler;
                this.b = hVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(h hVar) {
            hVar.c0(this.a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(h hVar) {
            hVar.L(this.a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(h hVar) {
            hVar.l0(this.a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(h hVar, int i) {
            hVar.M(this.a, this.b);
            hVar.d0(this.a, this.b, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(h hVar, Exception exc) {
            hVar.T(this.a, this.b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(h hVar) {
            hVar.e0(this.a, this.b);
        }

        public void g(Handler handler, h hVar) {
            ur.e(handler);
            ur.e(hVar);
            this.c.add(new C0181a(handler, hVar));
        }

        public void h() {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0181a c0181a = (C0181a) it2.next();
                final h hVar = c0181a.b;
                z19.M0(c0181a.a, new Runnable() { // from class: dw1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a.this.n(hVar);
                    }
                });
            }
        }

        public void i() {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0181a c0181a = (C0181a) it2.next();
                final h hVar = c0181a.b;
                z19.M0(c0181a.a, new Runnable() { // from class: bw1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a.this.o(hVar);
                    }
                });
            }
        }

        public void j() {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0181a c0181a = (C0181a) it2.next();
                final h hVar = c0181a.b;
                z19.M0(c0181a.a, new Runnable() { // from class: cw1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a.this.p(hVar);
                    }
                });
            }
        }

        public void k(final int i) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0181a c0181a = (C0181a) it2.next();
                final h hVar = c0181a.b;
                z19.M0(c0181a.a, new Runnable() { // from class: aw1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a.this.q(hVar, i);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0181a c0181a = (C0181a) it2.next();
                final h hVar = c0181a.b;
                z19.M0(c0181a.a, new Runnable() { // from class: yv1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a.this.r(hVar, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0181a c0181a = (C0181a) it2.next();
                final h hVar = c0181a.b;
                z19.M0(c0181a.a, new Runnable() { // from class: zv1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a.this.s(hVar);
                    }
                });
            }
        }

        public void t(h hVar) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0181a c0181a = (C0181a) it2.next();
                if (c0181a.b == hVar) {
                    this.c.remove(c0181a);
                }
            }
        }

        public a u(int i, o.b bVar) {
            return new a(this.c, i, bVar);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i, o.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }

    void L(int i, o.b bVar);

    default void M(int i, o.b bVar) {
    }

    void T(int i, o.b bVar, Exception exc);

    void c0(int i, o.b bVar);

    void d0(int i, o.b bVar, int i2);

    void e0(int i, o.b bVar);

    void l0(int i, o.b bVar);
}
