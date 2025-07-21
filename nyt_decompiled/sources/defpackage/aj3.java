package defpackage;

import defpackage.ei7;

/* loaded from: classes2.dex */
final class aj3 implements hi7 {
    private final long a;
    private final va4 b;
    private final va4 c;
    private long d;

    public aj3(long j, long j2, long j3) {
        this.d = j;
        this.a = j3;
        va4 va4Var = new va4();
        this.b = va4Var;
        va4 va4Var2 = new va4();
        this.c = va4Var2;
        va4Var.a(0L);
        va4Var2.a(j2);
    }

    public boolean a(long j) {
        va4 va4Var = this.b;
        return j - va4Var.b(va4Var.c() - 1) < 100000;
    }

    @Override // defpackage.hi7
    public long b(long j) {
        return this.b.b(z19.f(this.c, j, true, true));
    }

    public void c(long j, long j2) {
        if (a(j)) {
            return;
        }
        this.b.a(j);
        this.c.a(j2);
    }

    void d(long j) {
        this.d = j;
    }

    @Override // defpackage.ei7
    public ei7.a f(long j) {
        int f = z19.f(this.b, j, true, true);
        gi7 gi7Var = new gi7(this.b.b(f), this.c.b(f));
        if (gi7Var.a == j || f == this.b.c() - 1) {
            return new ei7.a(gi7Var);
        }
        int i = f + 1;
        return new ei7.a(gi7Var, new gi7(this.b.b(i), this.c.b(i)));
    }

    @Override // defpackage.hi7
    public long g() {
        return this.a;
    }

    @Override // defpackage.ei7
    public boolean h() {
        return true;
    }

    @Override // defpackage.ei7
    public long i() {
        return this.d;
    }
}
