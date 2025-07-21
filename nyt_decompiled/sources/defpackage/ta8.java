package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class ta8 implements ub8 {
    private final y31[] a;
    private final long[] b;

    public ta8(y31[] y31VarArr, long[] jArr) {
        this.a = y31VarArr;
        this.b = jArr;
    }

    @Override // defpackage.ub8
    public int a(long j) {
        int e = z19.e(this.b, j, false, false);
        if (e < this.b.length) {
            return e;
        }
        return -1;
    }

    @Override // defpackage.ub8
    public List b(long j) {
        y31 y31Var;
        int i = z19.i(this.b, j, true, false);
        return (i == -1 || (y31Var = this.a[i]) == y31.u) ? Collections.emptyList() : Collections.singletonList(y31Var);
    }

    @Override // defpackage.ub8
    public long c(int i) {
        ur.a(i >= 0);
        ur.a(i < this.b.length);
        return this.b[i];
    }

    @Override // defpackage.ub8
    public int d() {
        return this.b.length;
    }
}
