package defpackage;

/* loaded from: classes3.dex */
final class r4g extends c6g implements Comparable {
    private final int e;
    private final int f;

    public r4g(int i, v3c v3cVar, int i2, d5g d5gVar, int i3) {
        super(i, v3cVar, i2);
        this.e = k6g.t(i3, d5gVar.v0) ? 1 : 0;
        this.f = this.d.a();
    }

    @Override // defpackage.c6g
    public final int a() {
        return this.e;
    }

    @Override // defpackage.c6g
    public final /* bridge */ /* synthetic */ boolean b(c6g c6gVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(r4g r4gVar) {
        return Integer.compare(this.f, r4gVar.f);
    }
}
