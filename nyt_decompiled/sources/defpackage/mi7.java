package defpackage;

import com.google.android.exoplayer2.t0;
import defpackage.st8;
import java.util.List;

/* loaded from: classes2.dex */
public final class mi7 {
    private final List a;
    private final yp8[] b;

    public mi7(List list) {
        this.a = list;
        this.b = new yp8[list.size()];
    }

    public void a(long j, yo5 yo5Var) {
        ri0.a(j, yo5Var, this.b);
    }

    public void b(a82 a82Var, st8.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            yp8 a = a82Var.a(dVar.c(), 3);
            t0 t0Var = (t0) this.a.get(i);
            String str = t0Var.l;
            ur.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String str2 = t0Var.a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            a.d(new t0.b().U(str2).g0(str).i0(t0Var.d).X(t0Var.c).H(t0Var.Y).V(t0Var.n).G());
            this.b[i] = a;
        }
    }
}
