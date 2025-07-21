package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.h;

/* loaded from: classes2.dex */
final class u37 implements a47 {
    private final h c;
    private yp8 d;
    private int e;
    private int h;
    private long i;
    private final yo5 b = new yo5(j15.a);
    private final yo5 a = new yo5();
    private long f = -9223372036854775807L;
    private int g = -1;

    public u37(h hVar) {
        this.c = hVar;
    }

    private static int e(int i) {
        return i == 5 ? 1 : 0;
    }

    private void f(yo5 yo5Var, int i) {
        byte b = yo5Var.e()[0];
        byte b2 = yo5Var.e()[1];
        int i2 = (b & 224) | (b2 & 31);
        boolean z = (b2 & 128) > 0;
        boolean z2 = (b2 & 64) > 0;
        if (z) {
            this.h += i();
            yo5Var.e()[1] = (byte) i2;
            this.a.R(yo5Var.e());
            this.a.U(1);
        } else {
            int b3 = z37.b(this.g);
            if (i != b3) {
                a84.j("RtpH264Reader", z19.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b3), Integer.valueOf(i)));
                return;
            } else {
                this.a.R(yo5Var.e());
                this.a.U(2);
            }
        }
        int a = this.a.a();
        this.d.a(this.a, a);
        this.h += a;
        if (z2) {
            this.e = e(i2 & 31);
        }
    }

    private void g(yo5 yo5Var) {
        int a = yo5Var.a();
        this.h += i();
        this.d.a(yo5Var, a);
        this.h += a;
        this.e = e(yo5Var.e()[0] & 31);
    }

    private void h(yo5 yo5Var) {
        yo5Var.H();
        while (yo5Var.a() > 4) {
            int N = yo5Var.N();
            this.h += i();
            this.d.a(yo5Var, N);
            this.h += N;
        }
        this.e = 0;
    }

    private int i() {
        this.b.U(0);
        int a = this.b.a();
        ((yp8) ur.e(this.d)).a(this.b, a);
        return a;
    }

    @Override // defpackage.a47
    public void a(long j, long j2) {
        this.f = j;
        this.h = 0;
        this.i = j2;
    }

    @Override // defpackage.a47
    public void b(a82 a82Var, int i) {
        yp8 a = a82Var.a(i, 2);
        this.d = a;
        ((yp8) z19.j(a)).d(this.c.c);
    }

    @Override // defpackage.a47
    public void c(long j, int i) {
    }

    @Override // defpackage.a47
    public void d(yo5 yo5Var, long j, int i, boolean z) {
        try {
            int i2 = yo5Var.e()[0] & 31;
            ur.i(this.d);
            if (i2 > 0 && i2 < 24) {
                g(yo5Var);
            } else if (i2 == 24) {
                h(yo5Var);
            } else {
                if (i2 != 28) {
                    throw ParserException.c(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i2)), null);
                }
                f(yo5Var, i);
            }
            if (z) {
                if (this.f == -9223372036854775807L) {
                    this.f = j;
                }
                this.d.b(c47.a(this.i, j, this.f, 90000), this.e, this.h, 0, null);
                this.h = 0;
            }
            this.g = i;
        } catch (IndexOutOfBoundsException e) {
            throw ParserException.c(null, e);
        }
    }
}
