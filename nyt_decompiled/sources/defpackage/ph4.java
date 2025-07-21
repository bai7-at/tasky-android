package defpackage;

import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;

/* loaded from: classes2.dex */
public abstract class ph4 extends ok0 {
    public final long j;

    public ph4(a aVar, b bVar, t0 t0Var, int i, Object obj, long j, long j2, long j3) {
        super(aVar, bVar, 1, t0Var, i, obj, j, j2);
        ur.e(t0Var);
        this.j = j3;
    }

    public long g() {
        long j = this.j;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean h();
}
