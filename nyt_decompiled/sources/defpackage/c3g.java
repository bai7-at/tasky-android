package defpackage;

/* loaded from: classes3.dex */
public abstract class c3g extends dzf {
    protected final b0g k;

    protected c3g(b0g b0gVar) {
        this.k = b0gVar;
    }

    @Override // defpackage.dzf
    protected final /* synthetic */ void A(Object obj, b0g b0gVar, n1c n1cVar) {
        G(n1cVar);
    }

    @Override // defpackage.dzf
    protected final /* bridge */ /* synthetic */ int C(Object obj, int i) {
        return 0;
    }

    @Override // defpackage.dzf
    protected final /* synthetic */ long D(Object obj, long j, zzf zzfVar) {
        return j;
    }

    @Override // defpackage.dzf
    protected final /* synthetic */ zzf E(Object obj, zzf zzfVar) {
        return F(zzfVar);
    }

    protected abstract zzf F(zzf zzfVar);

    protected abstract void G(n1c n1cVar);

    @Override // defpackage.nyf, defpackage.b0g
    public final n1c H() {
        this.k.H();
        return null;
    }

    protected abstract void I();

    @Override // defpackage.nyf, defpackage.b0g
    public final boolean a() {
        this.k.a();
        return true;
    }

    @Override // defpackage.b0g
    public final cza d() {
        return this.k.d();
    }

    @Override // defpackage.b0g
    public abstract void j(xzf xzfVar);

    @Override // defpackage.dzf, defpackage.nyf
    protected final void v(f6f f6fVar) {
        super.v(f6fVar);
        I();
    }
}
