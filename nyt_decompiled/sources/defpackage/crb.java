package defpackage;

/* loaded from: classes3.dex */
public final class crb {
    private dob a;
    private zsb b;
    private e6e c;
    private ltb d;
    private x2e e;

    /* synthetic */ crb(brb brbVar) {
    }

    public final aob a() {
        d4f.c(this.a, dob.class);
        d4f.c(this.b, zsb.class);
        if (this.c == null) {
            this.c = new e6e();
        }
        if (this.d == null) {
            this.d = new ltb();
        }
        if (this.e == null) {
            this.e = new x2e();
        }
        return new gqb(this.a, this.b, this.c, this.d, this.e, null);
    }

    public final crb b(dob dobVar) {
        this.a = dobVar;
        return this;
    }

    public final crb c(zsb zsbVar) {
        this.b = zsbVar;
        return this;
    }
}
