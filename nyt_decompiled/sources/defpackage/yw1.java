package defpackage;

import com.google.android.exoplayer2.t0;
import defpackage.st8;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class yw1 implements uy1 {
    private final List a;
    private final yp8[] b;
    private boolean c;
    private int d;
    private int e;
    private long f = -9223372036854775807L;

    public yw1(List list) {
        this.a = list;
        this.b = new yp8[list.size()];
    }

    private boolean b(yo5 yo5Var, int i) {
        if (yo5Var.a() == 0) {
            return false;
        }
        if (yo5Var.H() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // defpackage.uy1
    public void a(yo5 yo5Var) {
        if (this.c) {
            if (this.d != 2 || b(yo5Var, 32)) {
                if (this.d != 1 || b(yo5Var, 0)) {
                    int f = yo5Var.f();
                    int a = yo5Var.a();
                    for (yp8 yp8Var : this.b) {
                        yo5Var.U(f);
                        yp8Var.a(yo5Var, a);
                    }
                    this.e += a;
                }
            }
        }
    }

    @Override // defpackage.uy1
    public void c() {
        this.c = false;
        this.f = -9223372036854775807L;
    }

    @Override // defpackage.uy1
    public void d(a82 a82Var, st8.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            st8.a aVar = (st8.a) this.a.get(i);
            dVar.a();
            yp8 a = a82Var.a(dVar.c(), 3);
            a.d(new t0.b().U(dVar.b()).g0("application/dvbsubs").V(Collections.singletonList(aVar.c)).X(aVar.a).G());
            this.b[i] = a;
        }
    }

    @Override // defpackage.uy1
    public void e() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                for (yp8 yp8Var : this.b) {
                    yp8Var.b(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    @Override // defpackage.uy1
    public void f(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }
}
