package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.q1;
import com.google.android.exoplayer2.source.o;
import defpackage.a84;
import defpackage.nc;
import defpackage.ob;
import defpackage.pi4;
import defpackage.qr7;
import defpackage.r63;
import defpackage.sq8;
import defpackage.sv5;
import defpackage.ur;
import defpackage.v64;
import defpackage.z19;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class q1 {
    private final sv5 a;
    private final d e;
    private final nc h;
    private final r63 i;
    private boolean k;
    private sq8 l;
    private qr7 j = new qr7.a(0);
    private final IdentityHashMap c = new IdentityHashMap();
    private final Map d = new HashMap();
    private final List b = new ArrayList();
    private final HashMap f = new HashMap();
    private final Set g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements com.google.android.exoplayer2.source.p, com.google.android.exoplayer2.drm.h {
        private final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        private Pair F(int i, o.b bVar) {
            o.b bVar2 = null;
            if (bVar != null) {
                o.b n = q1.n(this.a, bVar);
                if (n == null) {
                    return null;
                }
                bVar2 = n;
            }
            return Pair.create(Integer.valueOf(q1.s(this.a, i)), bVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void G(Pair pair, pi4 pi4Var) {
            q1.this.h.c(((Integer) pair.first).intValue(), (o.b) pair.second, pi4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void I(Pair pair) {
            q1.this.h.c0(((Integer) pair.first).intValue(), (o.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void J(Pair pair) {
            q1.this.h.L(((Integer) pair.first).intValue(), (o.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void N(Pair pair) {
            q1.this.h.l0(((Integer) pair.first).intValue(), (o.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Q(Pair pair, int i) {
            q1.this.h.d0(((Integer) pair.first).intValue(), (o.b) pair.second, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void R(Pair pair, Exception exc) {
            q1.this.h.T(((Integer) pair.first).intValue(), (o.b) pair.second, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void S(Pair pair) {
            q1.this.h.e0(((Integer) pair.first).intValue(), (o.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void U(Pair pair, v64 v64Var, pi4 pi4Var) {
            q1.this.h.V(((Integer) pair.first).intValue(), (o.b) pair.second, v64Var, pi4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void W(Pair pair, v64 v64Var, pi4 pi4Var) {
            q1.this.h.O(((Integer) pair.first).intValue(), (o.b) pair.second, v64Var, pi4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void X(Pair pair, v64 v64Var, pi4 pi4Var, IOException iOException, boolean z) {
            q1.this.h.b0(((Integer) pair.first).intValue(), (o.b) pair.second, v64Var, pi4Var, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Y(Pair pair, v64 v64Var, pi4 pi4Var) {
            q1.this.h.a0(((Integer) pair.first).intValue(), (o.b) pair.second, v64Var, pi4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Z(Pair pair, pi4 pi4Var) {
            q1.this.h.P(((Integer) pair.first).intValue(), (o.b) ur.e((o.b) pair.second), pi4Var);
        }

        @Override // com.google.android.exoplayer2.drm.h
        public void L(int i, o.b bVar) {
            final Pair F = F(i, bVar);
            if (F != null) {
                q1.this.i.h(new Runnable() { // from class: com.google.android.exoplayer2.f1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a.this.J(F);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void O(int i, o.b bVar, final v64 v64Var, final pi4 pi4Var) {
            final Pair F = F(i, bVar);
            if (F != null) {
                q1.this.i.h(new Runnable() { // from class: com.google.android.exoplayer2.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a.this.W(F, v64Var, pi4Var);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void P(int i, o.b bVar, final pi4 pi4Var) {
            final Pair F = F(i, bVar);
            if (F != null) {
                q1.this.i.h(new Runnable() { // from class: com.google.android.exoplayer2.o1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a.this.Z(F, pi4Var);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.h
        public void T(int i, o.b bVar, final Exception exc) {
            final Pair F = F(i, bVar);
            if (F != null) {
                q1.this.i.h(new Runnable() { // from class: com.google.android.exoplayer2.j1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a.this.R(F, exc);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void V(int i, o.b bVar, final v64 v64Var, final pi4 pi4Var) {
            final Pair F = F(i, bVar);
            if (F != null) {
                q1.this.i.h(new Runnable() { // from class: com.google.android.exoplayer2.m1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a.this.U(F, v64Var, pi4Var);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void a0(int i, o.b bVar, final v64 v64Var, final pi4 pi4Var) {
            final Pair F = F(i, bVar);
            if (F != null) {
                q1.this.i.h(new Runnable() { // from class: com.google.android.exoplayer2.k1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a.this.Y(F, v64Var, pi4Var);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void b0(int i, o.b bVar, final v64 v64Var, final pi4 pi4Var, final IOException iOException, final boolean z) {
            final Pair F = F(i, bVar);
            if (F != null) {
                q1.this.i.h(new Runnable() { // from class: com.google.android.exoplayer2.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a.this.X(F, v64Var, pi4Var, iOException, z);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void c(int i, o.b bVar, final pi4 pi4Var) {
            final Pair F = F(i, bVar);
            if (F != null) {
                q1.this.i.h(new Runnable() { // from class: com.google.android.exoplayer2.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a.this.G(F, pi4Var);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.h
        public void c0(int i, o.b bVar) {
            final Pair F = F(i, bVar);
            if (F != null) {
                q1.this.i.h(new Runnable() { // from class: com.google.android.exoplayer2.g1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a.this.I(F);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.h
        public void d0(int i, o.b bVar, final int i2) {
            final Pair F = F(i, bVar);
            if (F != null) {
                q1.this.i.h(new Runnable() { // from class: com.google.android.exoplayer2.l1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a.this.Q(F, i2);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.h
        public void e0(int i, o.b bVar) {
            final Pair F = F(i, bVar);
            if (F != null) {
                q1.this.i.h(new Runnable() { // from class: com.google.android.exoplayer2.i1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a.this.S(F);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.h
        public void l0(int i, o.b bVar) {
            final Pair F = F(i, bVar);
            if (F != null) {
                q1.this.i.h(new Runnable() { // from class: com.google.android.exoplayer2.p1
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.a.this.N(F);
                    }
                });
            }
        }
    }

    private static final class b {
        public final com.google.android.exoplayer2.source.o a;
        public final o.c b;
        public final a c;

        public b(com.google.android.exoplayer2.source.o oVar, o.c cVar, a aVar) {
            this.a = oVar;
            this.b = cVar;
            this.c = aVar;
        }
    }

    static final class c implements c1 {
        public final com.google.android.exoplayer2.source.m a;
        public int d;
        public boolean e;
        public final List c = new ArrayList();
        public final Object b = new Object();

        public c(com.google.android.exoplayer2.source.o oVar, boolean z) {
            this.a = new com.google.android.exoplayer2.source.m(oVar, z);
        }

        @Override // com.google.android.exoplayer2.c1
        public Object a() {
            return this.b;
        }

        @Override // com.google.android.exoplayer2.c1
        public g2 b() {
            return this.a.Z();
        }

        public void c(int i) {
            this.d = i;
            this.e = false;
            this.c.clear();
        }
    }

    public interface d {
        void c();
    }

    public q1(d dVar, nc ncVar, r63 r63Var, sv5 sv5Var) {
        this.a = sv5Var;
        this.e = dVar;
        this.h = ncVar;
        this.i = r63Var;
    }

    private void B(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            c cVar = (c) this.b.remove(i3);
            this.d.remove(cVar.b);
            g(i3, -cVar.a.Z().u());
            cVar.e = true;
            if (this.k) {
                v(cVar);
            }
        }
    }

    private void g(int i, int i2) {
        while (i < this.b.size()) {
            ((c) this.b.get(i)).d += i2;
            i++;
        }
    }

    private void j(c cVar) {
        b bVar = (b) this.f.get(cVar);
        if (bVar != null) {
            bVar.a.j(bVar.b);
        }
    }

    private void k() {
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            if (cVar.c.isEmpty()) {
                j(cVar);
                it2.remove();
            }
        }
    }

    private void l(c cVar) {
        this.g.add(cVar);
        b bVar = (b) this.f.get(cVar);
        if (bVar != null) {
            bVar.a.i(bVar.b);
        }
    }

    private static Object m(Object obj) {
        return com.google.android.exoplayer2.a.A(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o.b n(c cVar, o.b bVar) {
        for (int i = 0; i < cVar.c.size(); i++) {
            if (((o.b) cVar.c.get(i)).d == bVar.d) {
                return bVar.c(p(cVar, bVar.a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return com.google.android.exoplayer2.a.B(obj);
    }

    private static Object p(c cVar, Object obj) {
        return com.google.android.exoplayer2.a.D(cVar.b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i) {
        return i + cVar.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(com.google.android.exoplayer2.source.o oVar, g2 g2Var) {
        this.e.c();
    }

    private void v(c cVar) {
        if (cVar.e && cVar.c.isEmpty()) {
            b bVar = (b) ur.e((b) this.f.remove(cVar));
            bVar.a.a(bVar.b);
            bVar.a.d(bVar.c);
            bVar.a.n(bVar.c);
            this.g.remove(cVar);
        }
    }

    private void x(c cVar) {
        com.google.android.exoplayer2.source.m mVar = cVar.a;
        o.c cVar2 = new o.c() { // from class: com.google.android.exoplayer2.d1
            @Override // com.google.android.exoplayer2.source.o.c
            public final void a(com.google.android.exoplayer2.source.o oVar, g2 g2Var) {
                q1.this.u(oVar, g2Var);
            }
        };
        a aVar = new a(cVar);
        this.f.put(cVar, new b(mVar, cVar2, aVar));
        mVar.c(z19.y(), aVar);
        mVar.m(z19.y(), aVar);
        mVar.s(cVar2, this.l, this.a);
    }

    public g2 A(int i, int i2, qr7 qr7Var) {
        ur.a(i >= 0 && i <= i2 && i2 <= r());
        this.j = qr7Var;
        B(i, i2);
        return i();
    }

    public g2 C(List list, qr7 qr7Var) {
        B(0, this.b.size());
        return f(this.b.size(), list, qr7Var);
    }

    public g2 D(qr7 qr7Var) {
        int r = r();
        if (qr7Var.getLength() != r) {
            qr7Var = qr7Var.e().g(0, r);
        }
        this.j = qr7Var;
        return i();
    }

    public g2 f(int i, List list, qr7 qr7Var) {
        if (!list.isEmpty()) {
            this.j = qr7Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                c cVar = (c) list.get(i2 - i);
                if (i2 > 0) {
                    c cVar2 = (c) this.b.get(i2 - 1);
                    cVar.c(cVar2.d + cVar2.a.Z().u());
                } else {
                    cVar.c(0);
                }
                g(i2, cVar.a.Z().u());
                this.b.add(i2, cVar);
                this.d.put(cVar.b, cVar);
                if (this.k) {
                    x(cVar);
                    if (this.c.isEmpty()) {
                        this.g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public com.google.android.exoplayer2.source.n h(o.b bVar, ob obVar, long j) {
        Object o = o(bVar.a);
        o.b c2 = bVar.c(m(bVar.a));
        c cVar = (c) ur.e((c) this.d.get(o));
        l(cVar);
        cVar.c.add(c2);
        com.google.android.exoplayer2.source.l g = cVar.a.g(c2, obVar, j);
        this.c.put(g, cVar);
        k();
        return g;
    }

    public g2 i() {
        if (this.b.isEmpty()) {
            return g2.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            c cVar = (c) this.b.get(i2);
            cVar.d = i;
            i += cVar.a.Z().u();
        }
        return new x1(this.b, this.j);
    }

    public qr7 q() {
        return this.j;
    }

    public int r() {
        return this.b.size();
    }

    public boolean t() {
        return this.k;
    }

    public void w(sq8 sq8Var) {
        ur.g(!this.k);
        this.l = sq8Var;
        for (int i = 0; i < this.b.size(); i++) {
            c cVar = (c) this.b.get(i);
            x(cVar);
            this.g.add(cVar);
        }
        this.k = true;
    }

    public void y() {
        for (b bVar : this.f.values()) {
            try {
                bVar.a.a(bVar.b);
            } catch (RuntimeException e) {
                a84.e("MediaSourceList", "Failed to release child source.", e);
            }
            bVar.a.d(bVar.c);
            bVar.a.n(bVar.c);
        }
        this.f.clear();
        this.g.clear();
        this.k = false;
    }

    public void z(com.google.android.exoplayer2.source.n nVar) {
        c cVar = (c) ur.e((c) this.c.remove(nVar));
        cVar.a.h(nVar);
        cVar.c.remove(((com.google.android.exoplayer2.source.l) nVar).a);
        if (!this.c.isEmpty()) {
            k();
        }
        v(cVar);
    }
}
