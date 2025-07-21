package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* loaded from: classes5.dex */
public final class dt3 {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private boolean k;
    private boolean l;
    private boolean m;
    private uk7 n;

    public dt3(at3 at3Var) {
        zq3.h(at3Var, "json");
        this.a = at3Var.e().f();
        this.b = at3Var.e().g();
        this.c = at3Var.e().h();
        this.d = at3Var.e().n();
        this.e = at3Var.e().b();
        this.f = at3Var.e().j();
        this.g = at3Var.e().k();
        this.h = at3Var.e().d();
        this.i = at3Var.e().m();
        this.j = at3Var.e().c();
        this.k = at3Var.e().a();
        this.l = at3Var.e().l();
        at3Var.e().i();
        this.m = at3Var.e().e();
        this.n = at3Var.a();
    }

    public final gt3 a() {
        if (this.i && !zq3.c(this.j, TransferTable.COLUMN_TYPE)) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
        }
        if (this.f) {
            if (!zq3.c(this.g, "    ")) {
                String str = this.g;
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.g).toString());
                    }
                }
            }
        } else if (!zq3.c(this.g, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new gt3(this.a, this.c, this.d, this.e, this.f, this.b, this.g, this.h, this.i, this.j, this.k, this.l, null, this.m);
    }

    public final uk7 b() {
        return this.n;
    }

    public final void c(boolean z) {
        this.h = z;
    }

    public final void d(boolean z) {
        this.m = z;
    }

    public final void e(boolean z) {
        this.b = z;
    }

    public final void f(boolean z) {
        this.c = z;
    }

    public final void g(boolean z) {
        this.f = z;
    }
}
