package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class zb8 extends xc1 implements ub8 {
    private ub8 d;
    private long e;

    @Override // defpackage.ub8
    public int a(long j) {
        return ((ub8) ur.e(this.d)).a(j - this.e);
    }

    @Override // defpackage.ub8
    public List b(long j) {
        return ((ub8) ur.e(this.d)).b(j - this.e);
    }

    @Override // defpackage.ub8
    public long c(int i) {
        return ((ub8) ur.e(this.d)).c(i) + this.e;
    }

    @Override // defpackage.ub8
    public int d() {
        return ((ub8) ur.e(this.d)).d();
    }

    @Override // defpackage.bd0
    public void f() {
        super.f();
        this.d = null;
    }

    public void t(long j, ub8 ub8Var, long j2) {
        this.b = j;
        this.d = ub8Var;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.e = j;
    }
}
