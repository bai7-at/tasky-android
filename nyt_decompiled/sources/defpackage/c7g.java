package defpackage;

/* loaded from: classes3.dex */
public final class c7g {
    public final int a;
    public final bgf[] b;
    public final o6g[] c;
    public final mhc d;
    public final Object e;

    public c7g(bgf[] bgfVarArr, o6g[] o6gVarArr, mhc mhcVar, Object obj) {
        this.b = bgfVarArr;
        this.c = (o6g[]) o6gVarArr.clone();
        this.d = mhcVar;
        this.e = obj;
        this.a = bgfVarArr.length;
    }

    public final boolean a(c7g c7gVar, int i) {
        return c7gVar != null && khe.f(this.b[i], c7gVar.b[i]) && khe.f(this.c[i], c7gVar.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
