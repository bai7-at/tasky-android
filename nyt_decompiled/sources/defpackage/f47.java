package defpackage;

import com.google.android.exoplayer2.source.rtsp.h;
import com.google.android.exoplayer2.t0;

/* loaded from: classes2.dex */
final class f47 implements a47 {
    private final h a;
    private yp8 b;
    private boolean j;
    private boolean k;
    private boolean l;
    private long c = -9223372036854775807L;
    private int f = -1;
    private long g = -9223372036854775807L;
    private long d = 0;
    private int e = -1;
    private int h = -1;
    private int i = -1;

    public f47(h hVar) {
        this.a = hVar;
    }

    private void e() {
        yp8 yp8Var = (yp8) ur.e(this.b);
        long j = this.g;
        boolean z = this.l;
        yp8Var.b(j, z ? 1 : 0, this.f, 0, null);
        this.f = -1;
        this.g = -9223372036854775807L;
        this.j = false;
    }

    private boolean f(yo5 yo5Var, int i) {
        int H = yo5Var.H();
        if ((H & 8) == 8) {
            if (this.j && this.f > 0) {
                e();
            }
            this.j = true;
        } else {
            if (!this.j) {
                a84.j("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                return false;
            }
            int b = z37.b(this.e);
            if (i < b) {
                a84.j("RtpVp9Reader", z19.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b), Integer.valueOf(i)));
                return false;
            }
        }
        if ((H & 128) != 0 && (yo5Var.H() & 128) != 0 && yo5Var.a() < 1) {
            return false;
        }
        int i2 = H & 16;
        ur.b(i2 == 0, "VP9 flexible mode is not supported.");
        if ((H & 32) != 0) {
            yo5Var.V(1);
            if (yo5Var.a() < 1) {
                return false;
            }
            if (i2 == 0) {
                yo5Var.V(1);
            }
        }
        if ((H & 2) != 0) {
            int H2 = yo5Var.H();
            int i3 = (H2 >> 5) & 7;
            if ((H2 & 16) != 0) {
                int i4 = i3 + 1;
                if (yo5Var.a() < i4 * 4) {
                    return false;
                }
                for (int i5 = 0; i5 < i4; i5++) {
                    this.h = yo5Var.N();
                    this.i = yo5Var.N();
                }
            }
            if ((H2 & 8) != 0) {
                int H3 = yo5Var.H();
                if (yo5Var.a() < H3) {
                    return false;
                }
                for (int i6 = 0; i6 < H3; i6++) {
                    int N = (yo5Var.N() & 12) >> 2;
                    if (yo5Var.a() < N) {
                        return false;
                    }
                    yo5Var.V(N);
                }
            }
        }
        return true;
    }

    @Override // defpackage.a47
    public void a(long j, long j2) {
        this.c = j;
        this.f = -1;
        this.d = j2;
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
        int i2;
        int i3;
        ur.i(this.b);
        if (f(yo5Var, i)) {
            if (this.f == -1 && this.j) {
                this.l = (yo5Var.j() & 4) == 0;
            }
            if (!this.k && (i2 = this.h) != -1 && (i3 = this.i) != -1) {
                t0 t0Var = this.a.c;
                if (i2 != t0Var.t || i3 != t0Var.u) {
                    this.b.d(t0Var.c().n0(this.h).S(this.i).G());
                }
                this.k = true;
            }
            int a = yo5Var.a();
            this.b.a(yo5Var, a);
            int i4 = this.f;
            if (i4 == -1) {
                this.f = a;
            } else {
                this.f = i4 + a;
            }
            this.g = c47.a(this.d, j, this.c, 90000);
            if (z) {
                e();
            }
            this.e = i;
        }
    }
}
