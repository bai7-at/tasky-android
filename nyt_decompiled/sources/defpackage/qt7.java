package defpackage;

import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.ads.a;
import com.google.android.exoplayer2.source.j;

/* loaded from: classes2.dex */
public final class qt7 extends j {
    private final a g;

    public qt7(g2 g2Var, a aVar) {
        super(g2Var);
        ur.g(g2Var.n() == 1);
        ur.g(g2Var.u() == 1);
        this.g = aVar;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
    public g2.b l(int i, g2.b bVar, boolean z) {
        this.f.l(i, bVar, z);
        long j = bVar.d;
        if (j == -9223372036854775807L) {
            j = this.g.d;
        }
        bVar.y(bVar.a, bVar.b, bVar.c, j, bVar.s(), this.g, bVar.f);
        return bVar;
    }
}
