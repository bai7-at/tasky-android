package defpackage;

/* loaded from: classes3.dex */
final class l3e {
    private final k3e a = new k3e();
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    l3e() {
    }

    public final k3e a() {
        k3e k3eVar = this.a;
        k3e clone = k3eVar.clone();
        k3eVar.a = false;
        k3eVar.b = false;
        return clone;
    }

    public final String b() {
        return "\n\tPool does not exist: " + this.d + "\n\tNew pools created: " + this.b + "\n\tPools removed: " + this.c + "\n\tEntries added: " + this.f + "\n\tNo entries retrieved: " + this.e + "\n";
    }

    public final void c() {
        this.f++;
    }

    public final void d() {
        this.b++;
        this.a.a = true;
    }

    public final void e() {
        this.e++;
    }

    public final void f() {
        this.d++;
    }

    public final void g() {
        this.c++;
        this.a.b = true;
    }
}
