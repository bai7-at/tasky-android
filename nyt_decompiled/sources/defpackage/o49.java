package defpackage;

/* loaded from: classes.dex */
final class o49 implements k49 {
    private final xk2 a;
    private mi b;
    private mi c;
    private mi d;
    private final float e;

    public o49(xk2 xk2Var) {
        this.a = xk2Var;
        this.e = xk2Var.a();
    }

    @Override // defpackage.k49
    public float a() {
        return this.e;
    }

    @Override // defpackage.k49
    public mi b(long j, mi miVar, mi miVar2) {
        if (this.c == null) {
            this.c = ni.g(miVar);
        }
        mi miVar3 = this.c;
        if (miVar3 == null) {
            zq3.z("velocityVector");
            miVar3 = null;
        }
        int b = miVar3.b();
        for (int i = 0; i < b; i++) {
            mi miVar4 = this.c;
            if (miVar4 == null) {
                zq3.z("velocityVector");
                miVar4 = null;
            }
            miVar4.e(i, this.a.b(j, miVar.a(i), miVar2.a(i)));
        }
        mi miVar5 = this.c;
        if (miVar5 != null) {
            return miVar5;
        }
        zq3.z("velocityVector");
        return null;
    }

    @Override // defpackage.k49
    public mi c(long j, mi miVar, mi miVar2) {
        if (this.b == null) {
            this.b = ni.g(miVar);
        }
        mi miVar3 = this.b;
        if (miVar3 == null) {
            zq3.z("valueVector");
            miVar3 = null;
        }
        int b = miVar3.b();
        for (int i = 0; i < b; i++) {
            mi miVar4 = this.b;
            if (miVar4 == null) {
                zq3.z("valueVector");
                miVar4 = null;
            }
            miVar4.e(i, this.a.e(j, miVar.a(i), miVar2.a(i)));
        }
        mi miVar5 = this.b;
        if (miVar5 != null) {
            return miVar5;
        }
        zq3.z("valueVector");
        return null;
    }

    @Override // defpackage.k49
    public mi d(mi miVar, mi miVar2) {
        if (this.d == null) {
            this.d = ni.g(miVar);
        }
        mi miVar3 = this.d;
        if (miVar3 == null) {
            zq3.z("targetVector");
            miVar3 = null;
        }
        int b = miVar3.b();
        for (int i = 0; i < b; i++) {
            mi miVar4 = this.d;
            if (miVar4 == null) {
                zq3.z("targetVector");
                miVar4 = null;
            }
            miVar4.e(i, this.a.d(miVar.a(i), miVar2.a(i)));
        }
        mi miVar5 = this.d;
        if (miVar5 != null) {
            return miVar5;
        }
        zq3.z("targetVector");
        return null;
    }

    @Override // defpackage.k49
    public long e(mi miVar, mi miVar2) {
        if (this.c == null) {
            this.c = ni.g(miVar);
        }
        mi miVar3 = this.c;
        if (miVar3 == null) {
            zq3.z("velocityVector");
            miVar3 = null;
        }
        int b = miVar3.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, this.a.c(miVar.a(i), miVar2.a(i)));
        }
        return j;
    }
}
