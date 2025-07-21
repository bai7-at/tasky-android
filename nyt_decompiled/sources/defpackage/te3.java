package defpackage;

import com.google.android.exoplayer2.t0;
import defpackage.st8;

/* loaded from: classes2.dex */
public final class te3 implements uy1 {
    private yp8 b;
    private boolean c;
    private int e;
    private int f;
    private final yo5 a = new yo5(10);
    private long d = -9223372036854775807L;

    @Override // defpackage.uy1
    public void a(yo5 yo5Var) {
        ur.i(this.b);
        if (this.c) {
            int a = yo5Var.a();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(yo5Var.e(), yo5Var.f(), this.a.e(), this.f, min);
                if (this.f + min == 10) {
                    this.a.U(0);
                    if (73 != this.a.H() || 68 != this.a.H() || 51 != this.a.H()) {
                        a84.j("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        this.a.V(3);
                        this.e = this.a.G() + 10;
                    }
                }
            }
            int min2 = Math.min(a, this.e - this.f);
            this.b.a(yo5Var, min2);
            this.f += min2;
        }
    }

    @Override // defpackage.uy1
    public void c() {
        this.c = false;
        this.d = -9223372036854775807L;
    }

    @Override // defpackage.uy1
    public void d(a82 a82Var, st8.d dVar) {
        dVar.a();
        yp8 a = a82Var.a(dVar.c(), 5);
        this.b = a;
        a.d(new t0.b().U(dVar.b()).g0("application/id3").G());
    }

    @Override // defpackage.uy1
    public void e() {
        int i;
        ur.i(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                this.b.b(j, 1, i, 0, null);
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
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }
}
