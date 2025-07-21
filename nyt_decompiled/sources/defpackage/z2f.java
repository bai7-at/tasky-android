package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class z2f extends c3f implements oca {
    pca i;
    protected final String j = "moov";

    public z2f(String str) {
    }

    @Override // defpackage.oca
    public final void b(pca pcaVar) {
        this.i = pcaVar;
    }

    @Override // defpackage.oca
    public final void d(d3f d3fVar, ByteBuffer byteBuffer, long j, lca lcaVar) {
        d3fVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.b = d3fVar;
        this.d = d3fVar.zzb();
        d3fVar.f(d3fVar.zzb() + j);
        this.e = d3fVar.zzb();
        this.a = lcaVar;
    }

    @Override // defpackage.oca
    public final String zza() {
        return this.j;
    }
}
