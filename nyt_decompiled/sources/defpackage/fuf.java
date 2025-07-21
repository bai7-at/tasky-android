package defpackage;

/* loaded from: classes3.dex */
public final class fuf {
    private final grc[] a;
    private final zvf b;
    private final quc c;

    public fuf(grc... grcVarArr) {
        zvf zvfVar = new zvf();
        quc qucVar = new quc();
        grc[] grcVarArr2 = {zvfVar, qucVar};
        this.a = grcVarArr2;
        System.arraycopy(grcVarArr, 0, grcVarArr2, 0, 0);
        this.b = zvfVar;
        this.c = qucVar;
    }

    public final long a(long j) {
        return this.c.c(j);
    }

    public final long b() {
        return this.b.i();
    }

    public final hib c(hib hibVar) {
        this.c.e(hibVar.a);
        this.c.d(hibVar.b);
        return hibVar;
    }

    public final boolean d(boolean z) {
        this.b.j(z);
        return z;
    }

    public final grc[] e() {
        return this.a;
    }
}
