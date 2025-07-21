package defpackage;

/* loaded from: classes3.dex */
public abstract class a7g {
    private y6g a;
    private q7g b;

    public abstract yff a();

    public void b() {
        this.a = null;
        this.b = null;
    }

    public abstract void c(waf wafVar);

    public abstract boolean d();

    public abstract c7g e(zff[] zffVarArr, z2g z2gVar, zzf zzfVar, n1c n1cVar);

    public abstract void f(Object obj);

    protected final q7g g() {
        q7g q7gVar = this.b;
        wad.b(q7gVar);
        return q7gVar;
    }

    public final void h(y6g y6gVar, q7g q7gVar) {
        this.a = y6gVar;
        this.b = q7gVar;
    }

    protected final void i() {
        y6g y6gVar = this.a;
        if (y6gVar != null) {
            y6gVar.zzj();
        }
    }
}
