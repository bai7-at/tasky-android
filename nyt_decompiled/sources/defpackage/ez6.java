package defpackage;

/* loaded from: classes5.dex */
public class ez6 {
    private final iv a = hv.b();
    private String b;

    public bz6 a() {
        return bz6.e(this.a.build(), this.b);
    }

    public ez6 b(dv dvVar, Object obj) {
        if (dvVar != null && dvVar.getKey() != null && !dvVar.getKey().isEmpty() && obj != null) {
            this.a.d(dvVar, obj);
        }
        return this;
    }

    public ez6 c(bz6 bz6Var) {
        if (bz6Var != null) {
            this.a.a(bz6Var.f());
        }
        return this;
    }

    public ez6 d(String str) {
        this.b = str;
        return this;
    }
}
