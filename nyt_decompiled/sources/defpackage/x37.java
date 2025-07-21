package defpackage;

import com.google.android.exoplayer2.source.rtsp.h;

/* loaded from: classes2.dex */
final class x37 implements a47 {
    private final h a;
    private yp8 b;
    private int c;
    private long d = -9223372036854775807L;
    private int e = -1;
    private long f;
    private int g;

    public x37(h hVar) {
        this.a = hVar;
    }

    private static int e(yo5 yo5Var) {
        int a = vf0.a(yo5Var.e(), new byte[]{0, 0, 1, -74});
        if (a == -1) {
            return 0;
        }
        yo5Var.U(a + 4);
        return (yo5Var.j() >> 6) == 0 ? 1 : 0;
    }

    @Override // defpackage.a47
    public void a(long j, long j2) {
        this.d = j;
        this.f = j2;
        this.g = 0;
    }

    @Override // defpackage.a47
    public void b(a82 a82Var, int i) {
        yp8 a = a82Var.a(i, 2);
        this.b = a;
        ((yp8) z19.j(a)).d(this.a.c);
    }

    @Override // defpackage.a47
    public void c(long j, int i) {
    }

    @Override // defpackage.a47
    public void d(yo5 yo5Var, long j, int i, boolean z) {
        int b;
        ur.i(this.b);
        int i2 = this.e;
        if (i2 != -1 && i != (b = z37.b(i2))) {
            a84.j("RtpMpeg4Reader", z19.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b), Integer.valueOf(i)));
        }
        int a = yo5Var.a();
        this.b.a(yo5Var, a);
        if (this.g == 0) {
            this.c = e(yo5Var);
        }
        this.g += a;
        if (z) {
            if (this.d == -9223372036854775807L) {
                this.d = j;
            }
            this.b.b(c47.a(this.f, j, this.d, 90000), this.c, this.g, 0, null);
            this.g = 0;
        }
        this.e = i;
    }
}
