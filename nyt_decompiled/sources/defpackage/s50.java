package defpackage;

import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;

/* loaded from: classes2.dex */
public abstract class s50 extends ph4 {
    public final long k;
    public final long l;
    private u50 m;
    private int[] n;

    public s50(a aVar, b bVar, t0 t0Var, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(aVar, bVar, t0Var, i, obj, j, j2, j5);
        this.k = j3;
        this.l = j4;
    }

    public final int i(int i) {
        return ((int[]) ur.i(this.n))[i];
    }

    protected final u50 j() {
        return (u50) ur.i(this.m);
    }

    public void k(u50 u50Var) {
        this.m = u50Var;
        this.n = u50Var.b();
    }
}
