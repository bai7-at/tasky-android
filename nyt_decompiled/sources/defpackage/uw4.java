package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.google.android.exoplayer2.t0;
import defpackage.st8;
import defpackage.vw4;

/* loaded from: classes2.dex */
public final class uw4 implements uy1 {
    private final yo5 a;
    private final vw4.a b;
    private final String c;
    private yp8 d;
    private String e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public uw4() {
        this(null);
    }

    private void b(yo5 yo5Var) {
        byte[] e = yo5Var.e();
        int g = yo5Var.g();
        for (int f = yo5Var.f(); f < g; f++) {
            byte b = e[f];
            boolean z = (b & 255) == 255;
            boolean z2 = this.i && (b & 224) == 224;
            this.i = z;
            if (z2) {
                yo5Var.U(f + 1);
                this.i = false;
                this.a.e()[1] = e[f];
                this.g = 2;
                this.f = 1;
                return;
            }
        }
        yo5Var.U(g);
    }

    private void g(yo5 yo5Var) {
        int min = Math.min(yo5Var.a(), this.k - this.g);
        this.d.a(yo5Var, min);
        int i = this.g + min;
        this.g = i;
        int i2 = this.k;
        if (i < i2) {
            return;
        }
        long j = this.l;
        if (j != -9223372036854775807L) {
            this.d.b(j, 1, i2, 0, null);
            this.l += this.j;
        }
        this.g = 0;
        this.f = 0;
    }

    private void h(yo5 yo5Var) {
        int min = Math.min(yo5Var.a(), 4 - this.g);
        yo5Var.l(this.a.e(), this.g, min);
        int i = this.g + min;
        this.g = i;
        if (i < 4) {
            return;
        }
        this.a.U(0);
        if (!this.b.a(this.a.q())) {
            this.g = 0;
            this.f = 1;
            return;
        }
        this.k = this.b.c;
        if (!this.h) {
            this.j = (r8.g * 1000000) / r8.d;
            this.d.d(new t0.b().U(this.e).g0(this.b.b).Y(ProgressEvent.PART_FAILED_EVENT_CODE).J(this.b.e).h0(this.b.d).X(this.c).G());
            this.h = true;
        }
        this.a.U(0);
        this.d.a(this.a, 4);
        this.f = 2;
    }

    @Override // defpackage.uy1
    public void a(yo5 yo5Var) {
        ur.i(this.d);
        while (yo5Var.a() > 0) {
            int i = this.f;
            if (i == 0) {
                b(yo5Var);
            } else if (i == 1) {
                h(yo5Var);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                g(yo5Var);
            }
        }
    }

    @Override // defpackage.uy1
    public void c() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.uy1
    public void d(a82 a82Var, st8.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.d = a82Var.a(dVar.c(), 1);
    }

    @Override // defpackage.uy1
    public void e() {
    }

    @Override // defpackage.uy1
    public void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    public uw4(String str) {
        this.f = 0;
        yo5 yo5Var = new yo5(4);
        this.a = yo5Var;
        yo5Var.e()[0] = -1;
        this.b = new vw4.a();
        this.l = -9223372036854775807L;
        this.c = str;
    }
}
