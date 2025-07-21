package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.h;
import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
final class v37 implements a47 {
    private final h c;
    private yp8 d;
    private int e;
    private int h;
    private long i;
    private final yo5 a = new yo5();
    private final yo5 b = new yo5(j15.a);
    private long f = -9223372036854775807L;
    private int g = -1;

    public v37(h hVar) {
        this.c = hVar;
    }

    private static int e(int i) {
        return (i == 19 || i == 20) ? 1 : 0;
    }

    private void f(yo5 yo5Var, int i) {
        if (yo5Var.e().length < 3) {
            throw ParserException.c("Malformed FU header.", null);
        }
        int i2 = yo5Var.e()[1] & 7;
        byte b = yo5Var.e()[2];
        int i3 = b & 63;
        boolean z = (b & 128) > 0;
        boolean z2 = (b & 64) > 0;
        if (z) {
            this.h += h();
            yo5Var.e()[1] = (byte) ((i3 << 1) & 127);
            yo5Var.e()[2] = (byte) i2;
            this.a.R(yo5Var.e());
            this.a.U(1);
        } else {
            int i4 = (this.g + 1) % Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            if (i != i4) {
                a84.j("RtpH265Reader", z19.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i4), Integer.valueOf(i)));
                return;
            } else {
                this.a.R(yo5Var.e());
                this.a.U(3);
            }
        }
        int a = this.a.a();
        this.d.a(this.a, a);
        this.h += a;
        if (z2) {
            this.e = e(i3);
        }
    }

    private void g(yo5 yo5Var) {
        int a = yo5Var.a();
        this.h += h();
        this.d.a(yo5Var, a);
        this.h += a;
        this.e = e((yo5Var.e()[0] >> 1) & 63);
    }

    private int h() {
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
        a.d(this.c.c);
    }

    @Override // defpackage.a47
    public void c(long j, int i) {
    }

    @Override // defpackage.a47
    public void d(yo5 yo5Var, long j, int i, boolean z) {
        if (yo5Var.e().length == 0) {
            throw ParserException.c("Empty RTP data packet.", null);
        }
        int i2 = (yo5Var.e()[0] >> 1) & 63;
        ur.i(this.d);
        if (i2 >= 0 && i2 < 48) {
            g(yo5Var);
        } else {
            if (i2 == 48) {
                throw new UnsupportedOperationException("need to implement processAggregationPacket");
            }
            if (i2 != 49) {
                throw ParserException.c(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i2)), null);
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
    }
}
