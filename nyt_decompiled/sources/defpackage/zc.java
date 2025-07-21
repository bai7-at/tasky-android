package defpackage;

/* loaded from: classes2.dex */
public class zc {
    private final jc a;

    public zc(jc jcVar) {
        this.a = jcVar;
    }

    public String a() {
        return this.a.f();
    }

    public void b(String str, boolean z, h90 h90Var) {
        String str2;
        String str3;
        String str4;
        String str5 = z ? "save" : "unsave";
        String e = this.a.e();
        String a = rh7.a(this.a.f());
        if (h90Var != null) {
            String d = h90Var.d();
            String c = h90Var.c();
            str2 = d;
            str4 = h90Var.b();
            str3 = c;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        this.a.o(str, str5, e, a, str2, str3, str4);
    }
}
