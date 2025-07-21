package defpackage;

/* loaded from: classes3.dex */
final class h4e {
    private final long a;
    private long c;
    private final g4e b = new g4e();
    private int d = 0;
    private int e = 0;
    private int f = 0;

    public h4e() {
        long currentTimeMillis = dyf.b().currentTimeMillis();
        this.a = currentTimeMillis;
        this.c = currentTimeMillis;
    }

    public final int a() {
        return this.d;
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }

    public final g4e d() {
        g4e g4eVar = this.b;
        g4e clone = g4eVar.clone();
        g4eVar.a = false;
        g4eVar.b = 0;
        return clone;
    }

    public final String e() {
        return "Created: " + this.a + " Last accessed: " + this.c + " Accesses: " + this.d + "\nEntries retrieved: Valid: " + this.e + " Stale: " + this.f;
    }

    public final void f() {
        this.c = dyf.b().currentTimeMillis();
        this.d++;
    }

    public final void g() {
        this.f++;
        this.b.b++;
    }

    public final void h() {
        this.e++;
        this.b.a = true;
    }
}
