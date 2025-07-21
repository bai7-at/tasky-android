package defpackage;

import com.google.android.exoplayer2.source.rtsp.h;
import com.google.android.exoplayer2.t0;
import java.util.List;

/* loaded from: classes2.dex */
final class y37 implements a47 {
    private final h a;
    private yp8 b;
    private long d;
    private boolean f;
    private boolean g;
    private long c = -1;
    private int e = -1;

    public y37(h hVar) {
        this.a = hVar;
    }

    private static void e(yo5 yo5Var) {
        int f = yo5Var.f();
        ur.b(yo5Var.g() > 18, "ID Header has insufficient data");
        ur.b(yo5Var.E(8).equals("OpusHead"), "ID Header missing");
        ur.b(yo5Var.H() == 1, "version number must always be 1");
        yo5Var.U(f);
    }

    @Override // defpackage.a47
    public void a(long j, long j2) {
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.a47
    public void b(a82 a82Var, int i) {
        yp8 a = a82Var.a(i, 1);
        this.b = a;
        a.d(this.a.c);
    }

    @Override // defpackage.a47
    public void c(long j, int i) {
        this.c = j;
    }

    @Override // defpackage.a47
    public void d(yo5 yo5Var, long j, int i, boolean z) {
        ur.i(this.b);
        if (!this.f) {
            e(yo5Var);
            List a = wk5.a(yo5Var.e());
            t0.b c = this.a.c.c();
            c.V(a);
            this.b.d(c.G());
            this.f = true;
        } else if (this.g) {
            int b = z37.b(this.e);
            if (i != b) {
                a84.j("RtpOpusReader", z19.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(b), Integer.valueOf(i)));
            }
            int a2 = yo5Var.a();
            this.b.a(yo5Var, a2);
            this.b.b(c47.a(this.d, j, this.c, 48000), 1, a2, 0, null);
        } else {
            ur.b(yo5Var.g() >= 8, "Comment Header has insufficient data");
            ur.b(yo5Var.E(8).equals("OpusTags"), "Comment Header should follow ID Header");
            this.g = true;
        }
        this.e = i;
    }
}
