package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.a;
import com.google.android.exoplayer2.t0;
import defpackage.fi7;
import defpackage.mm0;
import defpackage.ob;
import defpackage.q72;
import defpackage.sq8;
import defpackage.tk0;
import defpackage.up8;
import defpackage.us0;
import defpackage.wp8;
import defpackage.x64;
import defpackage.y77;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class c implements n, c0.a {
    private final b.a a;
    private final sq8 b;
    private final x64 c;
    private final i d;
    private final h.a e;
    private final com.google.android.exoplayer2.upstream.h f;
    private final p.a g;
    private final ob h;
    private final wp8 i;
    private final us0 j;
    private n.a k;
    private com.google.android.exoplayer2.source.smoothstreaming.manifest.a l;
    private tk0[] m;
    private c0 n;

    public c(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, b.a aVar2, sq8 sq8Var, us0 us0Var, mm0 mm0Var, i iVar, h.a aVar3, com.google.android.exoplayer2.upstream.h hVar, p.a aVar4, x64 x64Var, ob obVar) {
        this.l = aVar;
        this.a = aVar2;
        this.b = sq8Var;
        this.c = x64Var;
        this.d = iVar;
        this.e = aVar3;
        this.f = hVar;
        this.g = aVar4;
        this.h = obVar;
        this.j = us0Var;
        this.i = p(aVar, iVar);
        tk0[] q = q(0);
        this.m = q;
        this.n = us0Var.a(q);
    }

    private tk0 a(q72 q72Var, long j) {
        int d = this.i.d(q72Var.n());
        return new tk0(this.l.f[d].a, null, null, this.a.a(this.c, this.l, d, q72Var, this.b, null), this, this.h, j, this.d, this.e, this.f, this.g);
    }

    private static wp8 p(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, i iVar) {
        up8[] up8VarArr = new up8[aVar.f.length];
        int i = 0;
        while (true) {
            a.b[] bVarArr = aVar.f;
            if (i >= bVarArr.length) {
                return new wp8(up8VarArr);
            }
            t0[] t0VarArr = bVarArr[i].j;
            t0[] t0VarArr2 = new t0[t0VarArr.length];
            for (int i2 = 0; i2 < t0VarArr.length; i2++) {
                t0 t0Var = t0VarArr[i2];
                t0VarArr2[i2] = t0Var.d(iVar.a(t0Var));
            }
            up8VarArr[i] = new up8(Integer.toString(i), t0VarArr2);
            i++;
        }
    }

    private static tk0[] q(int i) {
        return new tk0[i];
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean b() {
        return this.n.b();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long c() {
        return this.n.c();
    }

    @Override // com.google.android.exoplayer2.source.n
    public long d(long j, fi7 fi7Var) {
        for (tk0 tk0Var : this.m) {
            if (tk0Var.a == 2) {
                return tk0Var.d(j, fi7Var);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean f(long j) {
        return this.n.f(j);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long h() {
        return this.n.h();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void i(long j) {
        this.n.i(j);
    }

    @Override // com.google.android.exoplayer2.source.n
    public long j(q72[] q72VarArr, boolean[] zArr, y77[] y77VarArr, boolean[] zArr2, long j) {
        q72 q72Var;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < q72VarArr.length; i++) {
            y77 y77Var = y77VarArr[i];
            if (y77Var != null) {
                tk0 tk0Var = (tk0) y77Var;
                if (q72VarArr[i] == null || !zArr[i]) {
                    tk0Var.P();
                    y77VarArr[i] = null;
                } else {
                    ((b) tk0Var.E()).b(q72VarArr[i]);
                    arrayList.add(tk0Var);
                }
            }
            if (y77VarArr[i] == null && (q72Var = q72VarArr[i]) != null) {
                tk0 a = a(q72Var, j);
                arrayList.add(a);
                y77VarArr[i] = a;
                zArr2[i] = true;
            }
        }
        tk0[] q = q(arrayList.size());
        this.m = q;
        arrayList.toArray(q);
        this.n = this.j.a(this.m);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long l(long j) {
        for (tk0 tk0Var : this.m) {
            tk0Var.S(j);
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long m() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n(n.a aVar, long j) {
        this.k = aVar;
        aVar.o(this);
    }

    @Override // com.google.android.exoplayer2.source.n
    public void r() {
        this.c.a();
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void g(tk0 tk0Var) {
        this.k.g(this);
    }

    @Override // com.google.android.exoplayer2.source.n
    public wp8 t() {
        return this.i;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void u(long j, boolean z) {
        for (tk0 tk0Var : this.m) {
            tk0Var.u(j, z);
        }
    }

    public void v() {
        for (tk0 tk0Var : this.m) {
            tk0Var.P();
        }
        this.k = null;
    }

    public void w(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar) {
        this.l = aVar;
        for (tk0 tk0Var : this.m) {
            ((b) tk0Var.E()).c(aVar);
        }
        this.k.g(this);
    }
}
