package defpackage;

import com.google.android.exoplayer2.t0;
import defpackage.st8;

/* loaded from: classes2.dex */
public final class gp5 implements vh7 {
    private t0 a;
    private qm8 b;
    private yp8 c;

    public gp5(String str) {
        this.a = new t0.b().g0(str).G();
    }

    private void c() {
        ur.i(this.b);
        z19.j(this.c);
    }

    @Override // defpackage.vh7
    public void a(yo5 yo5Var) {
        c();
        long d = this.b.d();
        long e = this.b.e();
        if (d == -9223372036854775807L || e == -9223372036854775807L) {
            return;
        }
        t0 t0Var = this.a;
        if (e != t0Var.s) {
            t0 G = t0Var.c().k0(e).G();
            this.a = G;
            this.c.d(G);
        }
        int a = yo5Var.a();
        this.c.a(yo5Var, a);
        this.c.b(d, 1, a, 0, null);
    }

    @Override // defpackage.vh7
    public void b(qm8 qm8Var, a82 a82Var, st8.d dVar) {
        this.b = qm8Var;
        dVar.a();
        yp8 a = a82Var.a(dVar.c(), 5);
        this.c = a;
        a.d(this.a);
    }
}
