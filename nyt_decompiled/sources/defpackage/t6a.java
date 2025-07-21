package defpackage;

/* loaded from: classes3.dex */
final class t6a implements Comparable {
    public final int a;
    public final i6a b;

    public t6a(int i, i6a i6aVar) {
        this.a = i;
        this.b = i6aVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.a, ((t6a) obj).a);
    }
}
