package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.t0;
import defpackage.pk0;
import defpackage.yp8;
import java.util.List;

/* loaded from: classes2.dex */
public final class re0 implements a82, pk0 {
    public static final pk0.a j = new pk0.a() { // from class: qe0
        @Override // pk0.a
        public final pk0 a(int i, t0 t0Var, boolean z, List list, yp8 yp8Var, sv5 sv5Var) {
            pk0 g;
            g = re0.g(i, t0Var, z, list, yp8Var, sv5Var);
            return g;
        }
    };
    private static final e06 k = new e06();
    private final y72 a;
    private final int b;
    private final t0 c;
    private final SparseArray d = new SparseArray();
    private boolean e;
    private pk0.b f;
    private long g;
    private ei7 h;
    private t0[] i;

    private static final class a implements yp8 {
        private final int a;
        private final int b;
        private final t0 c;
        private final rw1 d = new rw1();
        public t0 e;
        private yp8 f;
        private long g;

        public a(int i, int i2, t0 t0Var) {
            this.a = i;
            this.b = i2;
            this.c = t0Var;
        }

        @Override // defpackage.yp8
        public void b(long j, int i, int i2, int i3, yp8.a aVar) {
            long j2 = this.g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f = this.d;
            }
            ((yp8) z19.j(this.f)).b(j, i, i2, i3, aVar);
        }

        @Override // defpackage.yp8
        public void c(yo5 yo5Var, int i, int i2) {
            ((yp8) z19.j(this.f)).a(yo5Var, i);
        }

        @Override // defpackage.yp8
        public void d(t0 t0Var) {
            t0 t0Var2 = this.c;
            if (t0Var2 != null) {
                t0Var = t0Var.l(t0Var2);
            }
            this.e = t0Var;
            ((yp8) z19.j(this.f)).d(this.e);
        }

        @Override // defpackage.yp8
        public int f(s91 s91Var, int i, boolean z, int i2) {
            return ((yp8) z19.j(this.f)).e(s91Var, i, z);
        }

        public void g(pk0.b bVar, long j) {
            if (bVar == null) {
                this.f = this.d;
                return;
            }
            this.g = j;
            yp8 a = bVar.a(this.a, this.b);
            this.f = a;
            t0 t0Var = this.e;
            if (t0Var != null) {
                a.d(t0Var);
            }
        }
    }

    public re0(y72 y72Var, int i, t0 t0Var) {
        this.a = y72Var;
        this.b = i;
        this.c = t0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ pk0 g(int i, t0 t0Var, boolean z, List list, yp8 yp8Var, sv5 sv5Var) {
        y72 oq2Var;
        String str = t0Var.k;
        if (ku4.r(str)) {
            return null;
        }
        if (ku4.q(str)) {
            oq2Var = new og4(1);
        } else {
            oq2Var = new oq2(z ? 4 : 0, null, null, list, yp8Var);
        }
        return new re0(oq2Var, i, t0Var);
    }

    @Override // defpackage.a82
    public yp8 a(int i, int i2) {
        a aVar = (a) this.d.get(i);
        if (aVar == null) {
            ur.g(this.i == null);
            aVar = new a(i, i2, i2 == this.b ? this.c : null);
            aVar.g(this.f, this.g);
            this.d.put(i, aVar);
        }
        return aVar;
    }

    @Override // defpackage.pk0
    public boolean b(z72 z72Var) {
        int d = this.a.d(z72Var, k);
        ur.g(d != 1);
        return d == 0;
    }

    @Override // defpackage.pk0
    public void c(pk0.b bVar, long j2, long j3) {
        this.f = bVar;
        this.g = j3;
        if (!this.e) {
            this.a.c(this);
            if (j2 != -9223372036854775807L) {
                this.a.a(0L, j2);
            }
            this.e = true;
            return;
        }
        y72 y72Var = this.a;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        y72Var.a(0L, j2);
        for (int i = 0; i < this.d.size(); i++) {
            ((a) this.d.valueAt(i)).g(bVar, j3);
        }
    }

    @Override // defpackage.pk0
    public rk0 d() {
        ei7 ei7Var = this.h;
        if (ei7Var instanceof rk0) {
            return (rk0) ei7Var;
        }
        return null;
    }

    @Override // defpackage.pk0
    public t0[] e() {
        return this.i;
    }

    @Override // defpackage.a82
    public void p(ei7 ei7Var) {
        this.h = ei7Var;
    }

    @Override // defpackage.pk0
    public void release() {
        this.a.release();
    }

    @Override // defpackage.a82
    public void s() {
        t0[] t0VarArr = new t0[this.d.size()];
        for (int i = 0; i < this.d.size(); i++) {
            t0VarArr[i] = (t0) ur.i(((a) this.d.valueAt(i)).e);
        }
        this.i = t0VarArr;
    }
}
