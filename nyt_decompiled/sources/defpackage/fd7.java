package defpackage;

/* loaded from: classes5.dex */
class fd7 implements dt4 {
    private final pr0 a;
    private final String b;
    private String c;
    private String d;

    fd7(pr0 pr0Var, String str) {
        this.a = pr0Var;
        this.b = str;
    }

    @Override // defpackage.dt4
    public ct4 build() {
        return (ct4) this.a.j(this.b, this.c, this.d, hv.d());
    }
}
