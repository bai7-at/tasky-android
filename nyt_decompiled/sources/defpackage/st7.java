package defpackage;

import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;

/* loaded from: classes2.dex */
public final class st7 extends s50 {
    private final int o;
    private final t0 p;
    private long q;
    private boolean r;

    public st7(a aVar, b bVar, t0 t0Var, int i, Object obj, long j, long j2, long j3, int i2, t0 t0Var2) {
        super(aVar, bVar, t0Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = t0Var2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() {
        u50 j = j();
        j.c(0L);
        yp8 a = j.a(0, this.o);
        a.d(this.p);
        try {
            long b = this.i.b(this.b.e(this.q));
            if (b != -1) {
                b += this.q;
            }
            hh1 hh1Var = new hh1(this.i, this.q, b);
            for (int i = 0; i != -1; i = a.e(hh1Var, Integer.MAX_VALUE, true)) {
                this.q += i;
            }
            a.b(this.g, 1, (int) this.q, 0, null);
            aa1.a(this.i);
            this.r = true;
        } catch (Throwable th) {
            aa1.a(this.i);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void c() {
    }

    @Override // defpackage.ph4
    public boolean h() {
        return this.r;
    }
}
