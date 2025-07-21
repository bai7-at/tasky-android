package defpackage;

import com.google.android.exoplayer2.source.rtsp.h;
import com.google.android.exoplayer2.t0;

/* loaded from: classes2.dex */
final class t37 implements a47 {
    private final h a;
    private yp8 b;
    private int d;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private long k;
    private boolean l;
    private long c = -9223372036854775807L;
    private int e = -1;

    public t37(h hVar) {
        this.a = hVar;
    }

    private void e() {
        yp8 yp8Var = (yp8) ur.e(this.b);
        long j = this.k;
        boolean z = this.h;
        yp8Var.b(j, z ? 1 : 0, this.d, 0, null);
        this.d = 0;
        this.k = -9223372036854775807L;
        this.h = false;
        this.l = false;
    }

    private void f(yo5 yo5Var, boolean z) {
        int f = yo5Var.f();
        if (((yo5Var.J() >> 10) & 63) != 32) {
            yo5Var.U(f);
            this.h = false;
            return;
        }
        int j = yo5Var.j();
        int i = (j >> 1) & 1;
        if (!z && i == 0) {
            int i2 = (j >> 2) & 7;
            if (i2 == 1) {
                this.f = 128;
                this.g = 96;
            } else {
                int i3 = i2 - 2;
                this.f = 176 << i3;
                this.g = 144 << i3;
            }
        }
        yo5Var.U(f);
        this.h = i == 0;
    }

    @Override // defpackage.a47
    public void a(long j, long j2) {
        this.c = j;
        this.d = 0;
        this.j = j2;
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
        int f = yo5Var.f();
        int N = yo5Var.N();
        boolean z2 = (N & 1024) > 0;
        if ((N & 512) != 0 || (N & 504) != 0 || (N & 7) != 0) {
            a84.j("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
            return;
        }
        if (z2) {
            if (this.l && this.d > 0) {
                e();
            }
            this.l = true;
            if ((yo5Var.j() & 252) < 128) {
                a84.j("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                return;
            } else {
                yo5Var.e()[f] = 0;
                yo5Var.e()[f + 1] = 0;
                yo5Var.U(f);
            }
        } else {
            if (!this.l) {
                a84.j("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                return;
            }
            int b = z37.b(this.e);
            if (i < b) {
                a84.j("RtpH263Reader", z19.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b), Integer.valueOf(i)));
                return;
            }
        }
        if (this.d == 0) {
            f(yo5Var, this.i);
            if (!this.i && this.h) {
                int i2 = this.f;
                t0 t0Var = this.a.c;
                if (i2 != t0Var.t || this.g != t0Var.u) {
                    this.b.d(t0Var.c().n0(this.f).S(this.g).G());
                }
                this.i = true;
            }
        }
        int a = yo5Var.a();
        this.b.a(yo5Var, a);
        this.d += a;
        this.k = c47.a(this.j, j, this.c, 90000);
        if (z) {
            e();
        }
        this.e = i;
    }
}
