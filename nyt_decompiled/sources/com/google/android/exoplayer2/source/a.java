package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.p;
import defpackage.sq8;
import defpackage.sv5;
import defpackage.ur;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class a implements o {
    private final ArrayList a = new ArrayList(1);
    private final HashSet b = new HashSet(1);
    private final p.a c = new p.a();
    private final h.a d = new h.a();
    private Looper e;
    private g2 f;
    private sv5 g;

    protected final boolean A() {
        return !this.b.isEmpty();
    }

    protected abstract void B(sq8 sq8Var);

    protected final void C(g2 g2Var) {
        this.f = g2Var;
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((o.c) it2.next()).a(this, g2Var);
        }
    }

    protected abstract void D();

    @Override // com.google.android.exoplayer2.source.o
    public final void a(o.c cVar) {
        this.a.remove(cVar);
        if (!this.a.isEmpty()) {
            j(cVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        D();
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void c(Handler handler, p pVar) {
        ur.e(handler);
        ur.e(pVar);
        this.c.g(handler, pVar);
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void d(p pVar) {
        this.c.B(pVar);
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void i(o.c cVar) {
        ur.e(this.e);
        boolean isEmpty = this.b.isEmpty();
        this.b.add(cVar);
        if (isEmpty) {
            y();
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void j(o.c cVar) {
        boolean isEmpty = this.b.isEmpty();
        this.b.remove(cVar);
        if (isEmpty || !this.b.isEmpty()) {
            return;
        }
        x();
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void m(Handler handler, com.google.android.exoplayer2.drm.h hVar) {
        ur.e(handler);
        ur.e(hVar);
        this.d.g(handler, hVar);
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void n(com.google.android.exoplayer2.drm.h hVar) {
        this.d.t(hVar);
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void s(o.c cVar, sq8 sq8Var, sv5 sv5Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        ur.a(looper == null || looper == myLooper);
        this.g = sv5Var;
        g2 g2Var = this.f;
        this.a.add(cVar);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(cVar);
            B(sq8Var);
        } else if (g2Var != null) {
            i(cVar);
            cVar.a(this, g2Var);
        }
    }

    protected final h.a t(int i, o.b bVar) {
        return this.d.u(i, bVar);
    }

    protected final h.a u(o.b bVar) {
        return this.d.u(0, bVar);
    }

    protected final p.a v(int i, o.b bVar) {
        return this.c.E(i, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final p.a w(o.b bVar) {
        return this.c.E(0, bVar);
    }

    protected void x() {
    }

    protected void y() {
    }

    protected final sv5 z() {
        return (sv5) ur.i(this.g);
    }
}
