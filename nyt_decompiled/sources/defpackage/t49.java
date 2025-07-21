package defpackage;

/* loaded from: classes.dex */
public final class t49 implements l49 {
    private final int a;
    private final int b;
    private final vx1 c;
    private final n49 d;

    public t49(int i, int i2, vx1 vx1Var) {
        this.a = i;
        this.b = i2;
        this.c = vx1Var;
        this.d = new n49(new el2(d(), c(), vx1Var));
    }

    @Override // defpackage.l49
    public int c() {
        return this.b;
    }

    @Override // defpackage.l49
    public int d() {
        return this.a;
    }

    @Override // defpackage.i49
    public mi f(long j, mi miVar, mi miVar2, mi miVar3) {
        return this.d.f(j, miVar, miVar2, miVar3);
    }

    @Override // defpackage.i49
    public mi g(long j, mi miVar, mi miVar2, mi miVar3) {
        return this.d.g(j, miVar, miVar2, miVar3);
    }
}
