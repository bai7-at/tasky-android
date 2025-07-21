package defpackage;

import com.google.android.exoplayer2.source.rtsp.h;

/* loaded from: classes2.dex */
final class s37 implements a47 {
    private static final int[] h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private final h a;
    private final boolean b;
    private final int c;
    private yp8 d;
    private long e = -9223372036854775807L;
    private int g = -1;
    private long f = 0;

    public s37(h hVar) {
        this.a = hVar;
        this.b = "audio/amr-wb".equals(ur.e(hVar.c.l));
        this.c = hVar.b;
    }

    public static int e(int i2, boolean z) {
        boolean z2 = (i2 >= 0 && i2 <= 8) || i2 == 15;
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(z ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i2);
        ur.b(z2, sb.toString());
        return z ? i[i2] : h[i2];
    }

    @Override // defpackage.a47
    public void a(long j, long j2) {
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.a47
    public void b(a82 a82Var, int i2) {
        yp8 a = a82Var.a(i2, 1);
        this.d = a;
        a.d(this.a.c);
    }

    @Override // defpackage.a47
    public void c(long j, int i2) {
        this.e = j;
    }

    @Override // defpackage.a47
    public void d(yo5 yo5Var, long j, int i2, boolean z) {
        int b;
        ur.i(this.d);
        int i3 = this.g;
        if (i3 != -1 && i2 != (b = z37.b(i3))) {
            a84.j("RtpAmrReader", z19.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(b), Integer.valueOf(i2)));
        }
        yo5Var.V(1);
        int e = e((yo5Var.j() >> 3) & 15, this.b);
        int a = yo5Var.a();
        ur.b(a == e, "compound payload not supported currently");
        this.d.a(yo5Var, a);
        this.d.b(c47.a(this.f, j, this.e, this.c), 1, a, 0, null);
        this.g = i2;
    }
}
