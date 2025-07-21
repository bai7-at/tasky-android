package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.o;
import defpackage.fi7;
import defpackage.ob;
import defpackage.q72;
import defpackage.ur;
import defpackage.wp8;
import defpackage.y77;
import defpackage.z19;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class l implements n, n.a {
    public final o.b a;
    private final long b;
    private final ob c;
    private o d;
    private n e;
    private n.a f;
    private a g;
    private boolean h;
    private long i = -9223372036854775807L;

    public interface a {
        void a(o.b bVar);

        void b(o.b bVar, IOException iOException);
    }

    public l(o.b bVar, ob obVar, long j) {
        this.a = bVar;
        this.c = obVar;
        this.b = j;
    }

    private long s(long j) {
        long j2 = this.i;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public void a(o.b bVar) {
        long s = s(this.b);
        n g = ((o) ur.e(this.d)).g(bVar, this.c, s);
        this.e = g;
        if (this.f != null) {
            g.n(this, s);
        }
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean b() {
        n nVar = this.e;
        return nVar != null && nVar.b();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long c() {
        return ((n) z19.j(this.e)).c();
    }

    @Override // com.google.android.exoplayer2.source.n
    public long d(long j, fi7 fi7Var) {
        return ((n) z19.j(this.e)).d(j, fi7Var);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean f(long j) {
        n nVar = this.e;
        return nVar != null && nVar.f(j);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long h() {
        return ((n) z19.j(this.e)).h();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void i(long j) {
        ((n) z19.j(this.e)).i(j);
    }

    @Override // com.google.android.exoplayer2.source.n
    public long j(q72[] q72VarArr, boolean[] zArr, y77[] y77VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.i;
        if (j3 == -9223372036854775807L || j != this.b) {
            j2 = j;
        } else {
            this.i = -9223372036854775807L;
            j2 = j3;
        }
        return ((n) z19.j(this.e)).j(q72VarArr, zArr, y77VarArr, zArr2, j2);
    }

    @Override // com.google.android.exoplayer2.source.n
    public long l(long j) {
        return ((n) z19.j(this.e)).l(j);
    }

    @Override // com.google.android.exoplayer2.source.n
    public long m() {
        return ((n) z19.j(this.e)).m();
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n(n.a aVar, long j) {
        this.f = aVar;
        n nVar = this.e;
        if (nVar != null) {
            nVar.n(this, s(this.b));
        }
    }

    @Override // com.google.android.exoplayer2.source.n.a
    public void o(n nVar) {
        ((n.a) z19.j(this.f)).o(this);
        a aVar = this.g;
        if (aVar != null) {
            aVar.a(this.a);
        }
    }

    public long p() {
        return this.i;
    }

    public long q() {
        return this.b;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void r() {
        try {
            n nVar = this.e;
            if (nVar != null) {
                nVar.r();
            } else {
                o oVar = this.d;
                if (oVar != null) {
                    oVar.p();
                }
            }
        } catch (IOException e) {
            a aVar = this.g;
            if (aVar == null) {
                throw e;
            }
            if (this.h) {
                return;
            }
            this.h = true;
            aVar.b(this.a, e);
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public wp8 t() {
        return ((n) z19.j(this.e)).t();
    }

    @Override // com.google.android.exoplayer2.source.n
    public void u(long j, boolean z) {
        ((n) z19.j(this.e)).u(j, z);
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void g(n nVar) {
        ((n.a) z19.j(this.f)).g(this);
    }

    public void w(long j) {
        this.i = j;
    }

    public void x() {
        if (this.e != null) {
            ((o) ur.e(this.d)).h(this.e);
        }
    }

    public void y(o oVar) {
        ur.g(this.d == null);
        this.d = oVar;
    }

    public void z(a aVar) {
        this.g = aVar;
    }
}
