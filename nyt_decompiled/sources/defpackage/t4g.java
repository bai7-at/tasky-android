package defpackage;

/* loaded from: classes3.dex */
final class t4g implements Comparable {
    private final boolean a;
    private final boolean b;

    public t4g(l6a l6aVar, int i) {
        this.a = 1 == (l6aVar.d & 1);
        this.b = k6g.t(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(t4g t4gVar) {
        return she.j().e(this.b, t4gVar.b).e(this.a, t4gVar.a).a();
    }
}
