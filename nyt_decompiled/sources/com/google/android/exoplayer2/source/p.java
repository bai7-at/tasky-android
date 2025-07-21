package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.t0;
import defpackage.pi4;
import defpackage.ur;
import defpackage.v64;
import defpackage.z19;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public interface p {

    public static class a {
        public final int a;
        public final o.b b;
        private final CopyOnWriteArrayList c;

        /* renamed from: com.google.android.exoplayer2.source.p$a$a, reason: collision with other inner class name */
        private static final class C0189a {
            public Handler a;
            public p b;

            public C0189a(Handler handler, p pVar) {
                this.a = handler;
                this.b = pVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(p pVar, pi4 pi4Var) {
            pVar.c(this.a, this.b, pi4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(p pVar, v64 v64Var, pi4 pi4Var) {
            pVar.V(this.a, this.b, v64Var, pi4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(p pVar, v64 v64Var, pi4 pi4Var) {
            pVar.O(this.a, this.b, v64Var, pi4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(p pVar, v64 v64Var, pi4 pi4Var, IOException iOException, boolean z) {
            pVar.b0(this.a, this.b, v64Var, pi4Var, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(p pVar, v64 v64Var, pi4 pi4Var) {
            pVar.a0(this.a, this.b, v64Var, pi4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(p pVar, o.b bVar, pi4 pi4Var) {
            pVar.P(this.a, bVar, pi4Var);
        }

        public void A(final v64 v64Var, final pi4 pi4Var) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0189a c0189a = (C0189a) it2.next();
                final p pVar = c0189a.b;
                z19.M0(c0189a.a, new Runnable() { // from class: mo4
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.a.this.n(pVar, v64Var, pi4Var);
                    }
                });
            }
        }

        public void B(p pVar) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0189a c0189a = (C0189a) it2.next();
                if (c0189a.b == pVar) {
                    this.c.remove(c0189a);
                }
            }
        }

        public void C(int i, long j, long j2) {
            D(new pi4(1, i, null, 3, null, z19.h1(j), z19.h1(j2)));
        }

        public void D(final pi4 pi4Var) {
            final o.b bVar = (o.b) ur.e(this.b);
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0189a c0189a = (C0189a) it2.next();
                final p pVar = c0189a.b;
                z19.M0(c0189a.a, new Runnable() { // from class: no4
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.a.this.o(pVar, bVar, pi4Var);
                    }
                });
            }
        }

        public a E(int i, o.b bVar) {
            return new a(this.c, i, bVar);
        }

        public void g(Handler handler, p pVar) {
            ur.e(handler);
            ur.e(pVar);
            this.c.add(new C0189a(handler, pVar));
        }

        public void h(int i, t0 t0Var, int i2, Object obj, long j) {
            i(new pi4(1, i, t0Var, i2, obj, z19.h1(j), -9223372036854775807L));
        }

        public void i(final pi4 pi4Var) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0189a c0189a = (C0189a) it2.next();
                final p pVar = c0189a.b;
                z19.M0(c0189a.a, new Runnable() { // from class: oo4
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.a.this.j(pVar, pi4Var);
                    }
                });
            }
        }

        public void p(v64 v64Var, int i) {
            q(v64Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void q(v64 v64Var, int i, int i2, t0 t0Var, int i3, Object obj, long j, long j2) {
            r(v64Var, new pi4(i, i2, t0Var, i3, obj, z19.h1(j), z19.h1(j2)));
        }

        public void r(final v64 v64Var, final pi4 pi4Var) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0189a c0189a = (C0189a) it2.next();
                final p pVar = c0189a.b;
                z19.M0(c0189a.a, new Runnable() { // from class: lo4
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.a.this.k(pVar, v64Var, pi4Var);
                    }
                });
            }
        }

        public void s(v64 v64Var, int i) {
            t(v64Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void t(v64 v64Var, int i, int i2, t0 t0Var, int i3, Object obj, long j, long j2) {
            u(v64Var, new pi4(i, i2, t0Var, i3, obj, z19.h1(j), z19.h1(j2)));
        }

        public void u(final v64 v64Var, final pi4 pi4Var) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0189a c0189a = (C0189a) it2.next();
                final p pVar = c0189a.b;
                z19.M0(c0189a.a, new Runnable() { // from class: jo4
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.a.this.l(pVar, v64Var, pi4Var);
                    }
                });
            }
        }

        public void v(v64 v64Var, int i, int i2, t0 t0Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            x(v64Var, new pi4(i, i2, t0Var, i3, obj, z19.h1(j), z19.h1(j2)), iOException, z);
        }

        public void w(v64 v64Var, int i, IOException iOException, boolean z) {
            v(v64Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        public void x(final v64 v64Var, final pi4 pi4Var, final IOException iOException, final boolean z) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                C0189a c0189a = (C0189a) it2.next();
                final p pVar = c0189a.b;
                z19.M0(c0189a.a, new Runnable() { // from class: ko4
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.a.this.m(pVar, v64Var, pi4Var, iOException, z);
                    }
                });
            }
        }

        public void y(v64 v64Var, int i) {
            z(v64Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void z(v64 v64Var, int i, int i2, t0 t0Var, int i3, Object obj, long j, long j2) {
            A(v64Var, new pi4(i, i2, t0Var, i3, obj, z19.h1(j), z19.h1(j2)));
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i, o.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }

    void O(int i, o.b bVar, v64 v64Var, pi4 pi4Var);

    void P(int i, o.b bVar, pi4 pi4Var);

    void V(int i, o.b bVar, v64 v64Var, pi4 pi4Var);

    void a0(int i, o.b bVar, v64 v64Var, pi4 pi4Var);

    void b0(int i, o.b bVar, v64 v64Var, pi4 pi4Var, IOException iOException, boolean z);

    void c(int i, o.b bVar, pi4 pi4Var);
}
