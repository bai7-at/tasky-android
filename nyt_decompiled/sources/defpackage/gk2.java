package defpackage;

import defpackage.ei7;
import defpackage.hk2;

/* loaded from: classes2.dex */
public final class gk2 implements ei7 {
    private final hk2 a;
    private final long b;

    public gk2(hk2 hk2Var, long j) {
        this.a = hk2Var;
        this.b = j;
    }

    private gi7 a(long j, long j2) {
        return new gi7((j * 1000000) / this.a.e, this.b + j2);
    }

    @Override // defpackage.ei7
    public ei7.a f(long j) {
        ur.i(this.a.k);
        hk2 hk2Var = this.a;
        hk2.a aVar = hk2Var.k;
        long[] jArr = aVar.a;
        long[] jArr2 = aVar.b;
        int i = z19.i(jArr, hk2Var.i(j), true, false);
        gi7 a = a(i == -1 ? 0L : jArr[i], i != -1 ? jArr2[i] : 0L);
        if (a.a == j || i == jArr.length - 1) {
            return new ei7.a(a);
        }
        int i2 = i + 1;
        return new ei7.a(a, a(jArr[i2], jArr2[i2]));
    }

    @Override // defpackage.ei7
    public boolean h() {
        return true;
    }

    @Override // defpackage.ei7
    public long i() {
        return this.a.f();
    }
}
