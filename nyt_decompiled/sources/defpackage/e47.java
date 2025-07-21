package defpackage;

import com.google.android.exoplayer2.source.rtsp.h;
import com.google.android.exoplayer2.t0;

/* loaded from: classes2.dex */
final class e47 implements a47 {
    private final h a;
    private yp8 b;
    private long c = -9223372036854775807L;
    private int d = -1;
    private int e = -1;
    private long f = -9223372036854775807L;
    private long g = 0;
    private boolean h;
    private boolean i;
    private boolean j;

    public e47(h hVar) {
        this.a = hVar;
    }

    private void e() {
        yp8 yp8Var = (yp8) ur.e(this.b);
        long j = this.f;
        boolean z = this.i;
        yp8Var.b(j, z ? 1 : 0, this.e, 0, null);
        this.e = -1;
        this.f = -9223372036854775807L;
        this.h = false;
    }

    private boolean f(yo5 yo5Var, int i) {
        int H = yo5Var.H();
        if ((H & 16) == 16 && (H & 7) == 0) {
            if (this.h && this.e > 0) {
                e();
            }
            this.h = true;
        } else {
            if (!this.h) {
                a84.j("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return false;
            }
            int b = z37.b(this.d);
            if (i < b) {
                a84.j("RtpVP8Reader", z19.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b), Integer.valueOf(i)));
                return false;
            }
        }
        if ((H & 128) != 0) {
            int H2 = yo5Var.H();
            if ((H2 & 128) != 0 && (yo5Var.H() & 128) != 0) {
                yo5Var.V(1);
            }
            if ((H2 & 64) != 0) {
                yo5Var.V(1);
            }
            if ((H2 & 32) != 0 || (H2 & 16) != 0) {
                yo5Var.V(1);
            }
        }
        return true;
    }

    @Override // defpackage.a47
    public void a(long j, long j2) {
        this.c = j;
        this.e = -1;
        this.g = j2;
    }

    @Override // defpackage.a47
    public void b(a82 a82Var, int i) {
        yp8 a = a82Var.a(i, 2);
        this.b = a;
        a.d(this.a.c);
    }

    @Override // defpackage.a47
    public void c(long j, int i) {
        ur.g(this.c == -9223372036854775807L);
        this.c = j;
    }

    @Override // defpackage.a47
    public void d(yo5 yo5Var, long j, int i, boolean z) {
        ur.i(this.b);
        if (f(yo5Var, i)) {
            if (this.e == -1 && this.h) {
                this.i = (yo5Var.j() & 1) == 0;
            }
            if (!this.j) {
                int f = yo5Var.f();
                yo5Var.U(f + 6);
                int z2 = yo5Var.z() & 16383;
                int z3 = yo5Var.z() & 16383;
                yo5Var.U(f);
                t0 t0Var = this.a.c;
                if (z2 != t0Var.t || z3 != t0Var.u) {
                    this.b.d(t0Var.c().n0(z2).S(z3).G());
                }
                this.j = true;
            }
            int a = yo5Var.a();
            this.b.a(yo5Var, a);
            int i2 = this.e;
            if (i2 == -1) {
                this.e = a;
            } else {
                this.e = i2 + a;
            }
            this.f = c47.a(this.g, j, this.c, 90000);
            if (z) {
                e();
            }
            this.d = i;
        }
    }
}
