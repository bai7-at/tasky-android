package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class n49 implements m49 {
    private final oi a;
    private mi b;
    private mi c;
    private mi d;

    public static final class a implements oi {
        final /* synthetic */ uk2 a;

        a(uk2 uk2Var) {
            this.a = uk2Var;
        }

        @Override // defpackage.oi
        public uk2 get(int i) {
            return this.a;
        }
    }

    public n49(oi oiVar) {
        this.a = oiVar;
    }

    @Override // defpackage.i49
    public long b(mi miVar, mi miVar2, mi miVar3) {
        Iterator it2 = uo6.u(0, miVar.b()).iterator();
        long j = 0;
        while (it2.hasNext()) {
            int c = ((qm3) it2).c();
            j = Math.max(j, this.a.get(c).e(miVar.a(c), miVar2.a(c), miVar3.a(c)));
        }
        return j;
    }

    @Override // defpackage.i49
    public mi e(mi miVar, mi miVar2, mi miVar3) {
        if (this.d == null) {
            this.d = ni.g(miVar3);
        }
        mi miVar4 = this.d;
        if (miVar4 == null) {
            zq3.z("endVelocityVector");
            miVar4 = null;
        }
        int b = miVar4.b();
        for (int i = 0; i < b; i++) {
            mi miVar5 = this.d;
            if (miVar5 == null) {
                zq3.z("endVelocityVector");
                miVar5 = null;
            }
            miVar5.e(i, this.a.get(i).b(miVar.a(i), miVar2.a(i), miVar3.a(i)));
        }
        mi miVar6 = this.d;
        if (miVar6 != null) {
            return miVar6;
        }
        zq3.z("endVelocityVector");
        return null;
    }

    @Override // defpackage.i49
    public mi f(long j, mi miVar, mi miVar2, mi miVar3) {
        if (this.c == null) {
            this.c = ni.g(miVar3);
        }
        mi miVar4 = this.c;
        if (miVar4 == null) {
            zq3.z("velocityVector");
            miVar4 = null;
        }
        int b = miVar4.b();
        for (int i = 0; i < b; i++) {
            mi miVar5 = this.c;
            if (miVar5 == null) {
                zq3.z("velocityVector");
                miVar5 = null;
            }
            miVar5.e(i, this.a.get(i).d(j, miVar.a(i), miVar2.a(i), miVar3.a(i)));
        }
        mi miVar6 = this.c;
        if (miVar6 != null) {
            return miVar6;
        }
        zq3.z("velocityVector");
        return null;
    }

    @Override // defpackage.i49
    public mi g(long j, mi miVar, mi miVar2, mi miVar3) {
        if (this.b == null) {
            this.b = ni.g(miVar);
        }
        mi miVar4 = this.b;
        if (miVar4 == null) {
            zq3.z("valueVector");
            miVar4 = null;
        }
        int b = miVar4.b();
        for (int i = 0; i < b; i++) {
            mi miVar5 = this.b;
            if (miVar5 == null) {
                zq3.z("valueVector");
                miVar5 = null;
            }
            miVar5.e(i, this.a.get(i).c(j, miVar.a(i), miVar2.a(i), miVar3.a(i)));
        }
        mi miVar6 = this.b;
        if (miVar6 != null) {
            return miVar6;
        }
        zq3.z("valueVector");
        return null;
    }

    public n49(uk2 uk2Var) {
        this(new a(uk2Var));
    }
}
