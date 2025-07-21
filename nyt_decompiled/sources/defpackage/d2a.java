package defpackage;

/* loaded from: classes3.dex */
final class d2a {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final b9e f;
    private final b9e g;
    private int h;
    private int i;

    public d2a(b9e b9eVar, b9e b9eVar2, boolean z) {
        this.g = b9eVar;
        this.f = b9eVar2;
        this.e = z;
        b9eVar2.k(12);
        this.a = b9eVar2.E();
        b9eVar.k(12);
        this.i = b9eVar.E();
        tv9.b(b9eVar.v() == 1, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        this.d = this.e ? this.f.K() : this.f.J();
        if (this.b == this.h) {
            this.c = this.g.E();
            this.g.l(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? (-1) + this.g.E() : -1;
        }
        return true;
    }
}
