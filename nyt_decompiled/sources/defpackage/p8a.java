package defpackage;

/* loaded from: classes3.dex */
final class p8a {
    private final m7a a;
    private final pfe b;
    private final g8e c = new g8e(new byte[64], 64);
    private boolean d;
    private boolean e;
    private boolean f;

    public p8a(m7a m7aVar, pfe pfeVar) {
        this.a = m7aVar;
        this.b = pfeVar;
    }

    public final void a(b9e b9eVar) {
        long j;
        long j2;
        b9eVar.g(this.c.a, 0, 3);
        this.c.k(0);
        this.c.m(8);
        this.d = this.c.o();
        this.e = this.c.o();
        this.c.m(6);
        g8e g8eVar = this.c;
        b9eVar.g(g8eVar.a, 0, g8eVar.d(8));
        this.c.k(0);
        if (this.d) {
            this.c.m(4);
            long d = this.c.d(3);
            this.c.m(1);
            int d2 = this.c.d(15) << 15;
            this.c.m(1);
            long d3 = this.c.d(15);
            this.c.m(1);
            if (this.f || !this.e) {
                j2 = d;
            } else {
                this.c.m(4);
                this.c.m(1);
                int d4 = this.c.d(15) << 15;
                this.c.m(1);
                j2 = d;
                long d5 = this.c.d(15);
                this.c.m(1);
                this.b.b(d4 | (this.c.d(3) << 30) | d5);
                this.f = true;
            }
            j = this.b.b((j2 << 30) | d2 | d3);
        } else {
            j = 0;
        }
        this.a.d(j, 4);
        this.a.b(b9eVar);
        this.a.a(false);
    }

    public final void b() {
        this.f = false;
        this.a.zze();
    }
}
