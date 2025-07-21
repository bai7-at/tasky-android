package defpackage;

import android.util.Log;
import com.google.android.exoplayer2.source.rtsp.h;

/* loaded from: classes2.dex */
public final class b47 implements a47 {
    private final h a;
    private yp8 b;
    private long c = -9223372036854775807L;
    private long d = 0;
    private int e = -1;

    public b47(h hVar) {
        this.a = hVar;
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
        int b;
        ur.e(this.b);
        int i2 = this.e;
        if (i2 != -1 && i != (b = z37.b(i2))) {
            Log.w("RtpPcmReader", z19.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(b), Integer.valueOf(i)));
        }
        long a = c47.a(this.d, j, this.c, this.a.b);
        int a2 = yo5Var.a();
        this.b.a(yo5Var, a2);
        this.b.b(a, 1, a2, 0, null);
        this.e = i;
    }
}
