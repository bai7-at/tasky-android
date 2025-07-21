package defpackage;

/* loaded from: classes3.dex */
final class m1g implements p2g {
    private final int a;
    final /* synthetic */ p1g b;

    public m1g(p1g p1gVar, int i) {
        this.b = p1gVar;
        this.a = i;
    }

    @Override // defpackage.p2g
    public final int a(kdf kdfVar, n7f n7fVar, int i) {
        return this.b.I(this.a, kdfVar, n7fVar, i);
    }

    @Override // defpackage.p2g
    public final int b(long j) {
        return this.b.J(this.a, j);
    }

    @Override // defpackage.p2g
    public final void zzd() {
        this.b.v(this.a);
    }

    @Override // defpackage.p2g
    public final boolean zze() {
        return this.b.x(this.a);
    }
}
