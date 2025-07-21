package defpackage;

/* loaded from: classes3.dex */
final class v2g implements p2g {
    private final p2g a;
    private final long b;

    public v2g(p2g p2gVar, long j) {
        this.a = p2gVar;
        this.b = j;
    }

    @Override // defpackage.p2g
    public final int a(kdf kdfVar, n7f n7fVar, int i) {
        int a = this.a.a(kdfVar, n7fVar, i);
        if (a != -4) {
            return a;
        }
        n7fVar.f += this.b;
        return -4;
    }

    @Override // defpackage.p2g
    public final int b(long j) {
        return this.a.b(j - this.b);
    }

    public final p2g c() {
        return this.a;
    }

    @Override // defpackage.p2g
    public final void zzd() {
        this.a.zzd();
    }

    @Override // defpackage.p2g
    public final boolean zze() {
        return this.a.zze();
    }
}
