package defpackage;

import java.util.LinkedList;

/* loaded from: classes3.dex */
final class h3e {
    private final int b;
    private final int c;
    private final LinkedList a = new LinkedList();
    private final h4e d = new h4e();

    public h3e(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    private final void i() {
        while (!this.a.isEmpty()) {
            if (dyf.b().currentTimeMillis() - ((s3e) this.a.getFirst()).d < this.c) {
                return;
            }
            this.d.g();
            this.a.remove();
        }
    }

    public final int a() {
        return this.d.a();
    }

    public final int b() {
        i();
        return this.a.size();
    }

    public final long c() {
        return this.d.b();
    }

    public final long d() {
        return this.d.c();
    }

    public final s3e e() {
        this.d.f();
        i();
        if (this.a.isEmpty()) {
            return null;
        }
        s3e s3eVar = (s3e) this.a.remove();
        if (s3eVar != null) {
            this.d.h();
        }
        return s3eVar;
    }

    public final g4e f() {
        return this.d.d();
    }

    public final String g() {
        return this.d.e();
    }

    public final boolean h(s3e s3eVar) {
        this.d.f();
        i();
        if (this.a.size() == this.b) {
            return false;
        }
        this.a.add(s3eVar);
        return true;
    }
}
