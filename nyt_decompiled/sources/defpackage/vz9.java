package defpackage;

/* loaded from: classes3.dex */
public final class vz9 implements sv9 {
    private final long a;
    private final sv9 b;

    public vz9(long j, sv9 sv9Var) {
        this.a = j;
        this.b = sv9Var;
    }

    @Override // defpackage.sv9
    public final void b() {
        this.b.b();
    }

    @Override // defpackage.sv9
    public final void m(gx9 gx9Var) {
        this.b.m(new uz9(this, gx9Var, gx9Var));
    }

    @Override // defpackage.sv9
    public final tx9 zzw(int i, int i2) {
        return this.b.zzw(i, i2);
    }
}
