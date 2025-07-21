package defpackage;

/* loaded from: classes3.dex */
final class rud {
    public final Object a;
    private zy9 b = new zy9();
    private boolean c;
    private boolean d;

    public rud(Object obj) {
        this.a = obj;
    }

    public final void a(int i, srd srdVar) {
        if (this.d) {
            return;
        }
        if (i != -1) {
            this.b.a(i);
        }
        this.c = true;
        srdVar.zza(this.a);
    }

    public final void b(qtd qtdVar) {
        if (this.d || !this.c) {
            return;
        }
        p0a b = this.b.b();
        this.b = new zy9();
        this.c = false;
        qtdVar.a(this.a, b);
    }

    public final void c(qtd qtdVar) {
        this.d = true;
        if (this.c) {
            this.c = false;
            qtdVar.a(this.a, this.b.b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rud.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((rud) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
