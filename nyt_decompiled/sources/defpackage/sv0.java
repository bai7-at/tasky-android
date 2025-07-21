package defpackage;

import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import defpackage.pk0;

/* loaded from: classes2.dex */
public class sv0 extends s50 {
    private final int o;
    private final long p;
    private final pk0 q;
    private long r;
    private volatile boolean s;
    private boolean t;

    public sv0(a aVar, b bVar, t0 t0Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, pk0 pk0Var) {
        super(aVar, bVar, t0Var, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = pk0Var;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() {
        if (this.r == 0) {
            u50 j = j();
            j.c(this.p);
            pk0 pk0Var = this.q;
            pk0.b l = l(j);
            long j2 = this.k;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.p;
            long j4 = this.l;
            pk0Var.c(l, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.p);
        }
        try {
            b e = this.b.e(this.r);
            t18 t18Var = this.i;
            hh1 hh1Var = new hh1(t18Var, e.g, t18Var.b(e));
            do {
                try {
                    if (this.s) {
                        break;
                    }
                } finally {
                    this.r = hh1Var.getPosition() - this.b.g;
                }
            } while (this.q.b(hh1Var));
            aa1.a(this.i);
            this.t = !this.s;
        } catch (Throwable th) {
            aa1.a(this.i);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void c() {
        this.s = true;
    }

    @Override // defpackage.ph4
    public long g() {
        return this.j + this.o;
    }

    @Override // defpackage.ph4
    public boolean h() {
        return this.t;
    }

    protected pk0.b l(u50 u50Var) {
        return u50Var;
    }
}
