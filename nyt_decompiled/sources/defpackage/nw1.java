package defpackage;

import com.google.android.exoplayer2.t0;
import defpackage.st8;

/* loaded from: classes2.dex */
public final class nw1 implements uy1 {
    private final String b;
    private String c;
    private yp8 d;
    private int f;
    private int g;
    private long h;
    private t0 i;
    private int j;
    private final yo5 a = new yo5(new byte[18]);
    private int e = 0;
    private long k = -9223372036854775807L;

    public nw1(String str) {
        this.b = str;
    }

    private boolean b(yo5 yo5Var, byte[] bArr, int i) {
        int min = Math.min(yo5Var.a(), i - this.f);
        yo5Var.l(bArr, this.f, min);
        int i2 = this.f + min;
        this.f = i2;
        return i2 == i;
    }

    private void g() {
        byte[] e = this.a.e();
        if (this.i == null) {
            t0 g = ow1.g(e, this.c, this.b, null);
            this.i = g;
            this.d.d(g);
        }
        this.j = ow1.a(e);
        this.h = (int) ((ow1.f(e) * 1000000) / this.i.N);
    }

    private boolean h(yo5 yo5Var) {
        while (yo5Var.a() > 0) {
            int i = this.g << 8;
            this.g = i;
            int H = i | yo5Var.H();
            this.g = H;
            if (ow1.d(H)) {
                byte[] e = this.a.e();
                int i2 = this.g;
                e[0] = (byte) ((i2 >> 24) & 255);
                e[1] = (byte) ((i2 >> 16) & 255);
                e[2] = (byte) ((i2 >> 8) & 255);
                e[3] = (byte) (i2 & 255);
                this.f = 4;
                this.g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uy1
    public void a(yo5 yo5Var) {
        ur.i(this.d);
        while (yo5Var.a() > 0) {
            int i = this.e;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(yo5Var.a(), this.j - this.f);
                    this.d.a(yo5Var, min);
                    int i2 = this.f + min;
                    this.f = i2;
                    int i3 = this.j;
                    if (i2 == i3) {
                        long j = this.k;
                        if (j != -9223372036854775807L) {
                            this.d.b(j, 1, i3, 0, null);
                            this.k += this.h;
                        }
                        this.e = 0;
                    }
                } else if (b(yo5Var, this.a.e(), 18)) {
                    g();
                    this.a.U(0);
                    this.d.a(this.a, 18);
                    this.e = 2;
                }
            } else if (h(yo5Var)) {
                this.e = 1;
            }
        }
    }

    @Override // defpackage.uy1
    public void c() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.uy1
    public void d(a82 a82Var, st8.d dVar) {
        dVar.a();
        this.c = dVar.b();
        this.d = a82Var.a(dVar.c(), 1);
    }

    @Override // defpackage.uy1
    public void e() {
    }

    @Override // defpackage.uy1
    public void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }
}
