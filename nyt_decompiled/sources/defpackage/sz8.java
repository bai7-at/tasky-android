package defpackage;

import com.google.android.exoplayer2.t0;
import defpackage.st8;
import java.util.List;

/* loaded from: classes2.dex */
final class sz8 {
    private final List a;
    private final yp8[] b;

    public sz8(List list) {
        this.a = list;
        this.b = new yp8[list.size()];
    }

    public void a(long j, yo5 yo5Var) {
        if (yo5Var.a() < 9) {
            return;
        }
        int q = yo5Var.q();
        int q2 = yo5Var.q();
        int H = yo5Var.H();
        if (q == 434 && q2 == 1195456820 && H == 3) {
            ri0.b(j, yo5Var, this.b);
        }
    }

    public void b(a82 a82Var, st8.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            yp8 a = a82Var.a(dVar.c(), 3);
            t0 t0Var = (t0) this.a.get(i);
            String str = t0Var.l;
            ur.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            a.d(new t0.b().U(dVar.b()).g0(str).i0(t0Var.d).X(t0Var.c).H(t0Var.Y).V(t0Var.n).G());
            this.b[i] = a;
        }
    }
}
