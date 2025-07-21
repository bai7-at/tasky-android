package defpackage;

/* loaded from: classes3.dex */
final class ioa implements noa {
    private final xhe a;
    private final String b;

    public ioa(xhe xheVar, String str) {
        this.a = xheVar;
        this.b = str;
    }

    @Override // defpackage.noa
    public final xhe a(caa caaVar) {
        xhe a = this.a.a();
        a.e(this.b, caaVar);
        return a;
    }
}
