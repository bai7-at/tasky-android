package defpackage;

/* loaded from: classes3.dex */
final class h2a implements f2a {
    private final int a;
    private final int b;
    private final b9e c;

    public h2a(b2a b2aVar, l6a l6aVar) {
        b9e b9eVar = b2aVar.b;
        this.c = b9eVar;
        b9eVar.k(12);
        int E = b9eVar.E();
        if ("audio/raw".equals(l6aVar.l)) {
            int A = khe.A(l6aVar.A, l6aVar.y);
            if (E == 0 || E % A != 0) {
                ezd.f("AtomParsers", "Audio sample size mismatch. stsd sample size: " + A + ", stsz sample size: " + E);
                E = A;
            }
        }
        this.a = E == 0 ? -1 : E;
        this.b = b9eVar.E();
    }

    @Override // defpackage.f2a
    public final int zza() {
        return this.a;
    }

    @Override // defpackage.f2a
    public final int zzb() {
        return this.b;
    }

    @Override // defpackage.f2a
    public final int zzc() {
        int i = this.a;
        return i == -1 ? this.c.E() : i;
    }
}
