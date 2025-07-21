package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.c;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.p;
import defpackage.pi4;
import defpackage.sq8;
import defpackage.ur;
import defpackage.v64;
import defpackage.z19;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class c extends com.google.android.exoplayer2.source.a {
    private final HashMap h = new HashMap();
    private Handler i;
    private sq8 j;

    private final class a implements p, com.google.android.exoplayer2.drm.h {
        private final Object a;
        private p.a b;
        private h.a c;

        public a(Object obj) {
            this.b = c.this.w(null);
            this.c = c.this.u(null);
            this.a = obj;
        }

        private boolean a(int i, o.b bVar) {
            o.b bVar2;
            if (bVar != null) {
                bVar2 = c.this.F(this.a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int H = c.this.H(this.a, i);
            p.a aVar = this.b;
            if (aVar.a != H || !z19.c(aVar.b, bVar2)) {
                this.b = c.this.v(H, bVar2);
            }
            h.a aVar2 = this.c;
            if (aVar2.a == H && z19.c(aVar2.b, bVar2)) {
                return true;
            }
            this.c = c.this.t(H, bVar2);
            return true;
        }

        private pi4 h(pi4 pi4Var) {
            long G = c.this.G(this.a, pi4Var.f);
            long G2 = c.this.G(this.a, pi4Var.g);
            return (G == pi4Var.f && G2 == pi4Var.g) ? pi4Var : new pi4(pi4Var.a, pi4Var.b, pi4Var.c, pi4Var.d, pi4Var.e, G, G2);
        }

        @Override // com.google.android.exoplayer2.drm.h
        public void L(int i, o.b bVar) {
            if (a(i, bVar)) {
                this.c.i();
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void O(int i, o.b bVar, v64 v64Var, pi4 pi4Var) {
            if (a(i, bVar)) {
                this.b.u(v64Var, h(pi4Var));
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void P(int i, o.b bVar, pi4 pi4Var) {
            if (a(i, bVar)) {
                this.b.D(h(pi4Var));
            }
        }

        @Override // com.google.android.exoplayer2.drm.h
        public void T(int i, o.b bVar, Exception exc) {
            if (a(i, bVar)) {
                this.c.l(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void V(int i, o.b bVar, v64 v64Var, pi4 pi4Var) {
            if (a(i, bVar)) {
                this.b.r(v64Var, h(pi4Var));
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void a0(int i, o.b bVar, v64 v64Var, pi4 pi4Var) {
            if (a(i, bVar)) {
                this.b.A(v64Var, h(pi4Var));
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void b0(int i, o.b bVar, v64 v64Var, pi4 pi4Var, IOException iOException, boolean z) {
            if (a(i, bVar)) {
                this.b.x(v64Var, h(pi4Var), iOException, z);
            }
        }

        @Override // com.google.android.exoplayer2.source.p
        public void c(int i, o.b bVar, pi4 pi4Var) {
            if (a(i, bVar)) {
                this.b.i(h(pi4Var));
            }
        }

        @Override // com.google.android.exoplayer2.drm.h
        public void c0(int i, o.b bVar) {
            if (a(i, bVar)) {
                this.c.h();
            }
        }

        @Override // com.google.android.exoplayer2.drm.h
        public void d0(int i, o.b bVar, int i2) {
            if (a(i, bVar)) {
                this.c.k(i2);
            }
        }

        @Override // com.google.android.exoplayer2.drm.h
        public void e0(int i, o.b bVar) {
            if (a(i, bVar)) {
                this.c.m();
            }
        }

        @Override // com.google.android.exoplayer2.drm.h
        public void l0(int i, o.b bVar) {
            if (a(i, bVar)) {
                this.c.j();
            }
        }
    }

    private static final class b {
        public final o a;
        public final o.c b;
        public final a c;

        public b(o oVar, o.c cVar, a aVar) {
            this.a = oVar;
            this.b = cVar;
            this.c = aVar;
        }
    }

    protected c() {
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void B(sq8 sq8Var) {
        this.j = sq8Var;
        this.i = z19.w();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D() {
        for (b bVar : this.h.values()) {
            bVar.a.a(bVar.b);
            bVar.a.d(bVar.c);
            bVar.a.n(bVar.c);
        }
        this.h.clear();
    }

    protected abstract o.b F(Object obj, o.b bVar);

    protected long G(Object obj, long j) {
        return j;
    }

    protected int H(Object obj, int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public abstract void I(Object obj, o oVar, g2 g2Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void K(final Object obj, o oVar) {
        ur.a(!this.h.containsKey(obj));
        o.c cVar = new o.c() { // from class: ss0
            @Override // com.google.android.exoplayer2.source.o.c
            public final void a(o oVar2, g2 g2Var) {
                c.this.I(obj, oVar2, g2Var);
            }
        };
        a aVar = new a(obj);
        this.h.put(obj, new b(oVar, cVar, aVar));
        oVar.c((Handler) ur.e(this.i), aVar);
        oVar.m((Handler) ur.e(this.i), aVar);
        oVar.s(cVar, this.j, z());
        if (A()) {
            return;
        }
        oVar.j(cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L(Object obj) {
        b bVar = (b) ur.e((b) this.h.remove(obj));
        bVar.a.a(bVar.b);
        bVar.a.d(bVar.c);
        bVar.a.n(bVar.c);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void p() {
        Iterator it2 = this.h.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).a.p();
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void x() {
        for (b bVar : this.h.values()) {
            bVar.a.j(bVar.b);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void y() {
        for (b bVar : this.h.values()) {
            bVar.a.i(bVar.b);
        }
    }
}
