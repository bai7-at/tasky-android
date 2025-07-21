package defpackage;

import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import defpackage.pk0;

/* loaded from: classes2.dex */
public final class sj3 extends ok0 {
    private final pk0 j;
    private pk0.b k;
    private long l;
    private volatile boolean m;

    public sj3(a aVar, b bVar, t0 t0Var, int i, Object obj, pk0 pk0Var) {
        super(aVar, bVar, 2, t0Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = pk0Var;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() {
        if (this.l == 0) {
            this.j.c(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            b e = this.b.e(this.l);
            t18 t18Var = this.i;
            hh1 hh1Var = new hh1(t18Var, e.g, t18Var.b(e));
            while (!this.m && this.j.b(hh1Var)) {
                try {
                } finally {
                    this.l = hh1Var.getPosition() - this.b.g;
                }
            }
        } finally {
            aa1.a(this.i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void c() {
        this.m = true;
    }

    public void g(pk0.b bVar) {
        this.k = bVar;
    }
}
