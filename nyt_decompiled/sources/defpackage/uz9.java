package defpackage;

/* loaded from: classes3.dex */
final class uz9 extends rw9 {
    final /* synthetic */ gx9 b;
    final /* synthetic */ vz9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    uz9(vz9 vz9Var, gx9 gx9Var, gx9 gx9Var2) {
        super(gx9Var);
        this.b = gx9Var2;
        this.c = vz9Var;
    }

    @Override // defpackage.rw9, defpackage.gx9
    public final ex9 a(long j) {
        long j2;
        long j3;
        ex9 a = this.b.a(j);
        hx9 hx9Var = a.a;
        long j4 = hx9Var.b;
        j2 = this.c.a;
        hx9 hx9Var2 = new hx9(hx9Var.a, j4 + j2);
        hx9 hx9Var3 = a.b;
        long j5 = hx9Var3.b;
        j3 = this.c.a;
        return new ex9(hx9Var2, new hx9(hx9Var3.a, j5 + j3));
    }
}
