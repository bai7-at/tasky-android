package defpackage;

import java.math.BigInteger;

/* loaded from: classes3.dex */
final class m3a implements gx9 {
    final /* synthetic */ n3a a;

    /* synthetic */ m3a(n3a n3aVar, l3a l3aVar) {
        this.a = n3aVar;
    }

    @Override // defpackage.gx9
    public final ex9 a(long j) {
        h4a h4aVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        n3a n3aVar = this.a;
        h4aVar = n3aVar.d;
        long f = h4aVar.f(j);
        j2 = n3aVar.b;
        BigInteger valueOf = BigInteger.valueOf(f);
        n3a n3aVar2 = this.a;
        j3 = n3aVar2.c;
        j4 = n3aVar2.b;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j3 - j4));
        j5 = this.a.f;
        long longValue = j2 + multiply.divide(BigInteger.valueOf(j5)).longValue();
        n3a n3aVar3 = this.a;
        j6 = n3aVar3.b;
        j7 = n3aVar3.c;
        hx9 hx9Var = new hx9(j, Math.max(j6, Math.min(longValue - 30000, j7 - 1)));
        return new ex9(hx9Var, hx9Var);
    }

    @Override // defpackage.gx9
    public final long zza() {
        h4a h4aVar;
        long j;
        n3a n3aVar = this.a;
        h4aVar = n3aVar.d;
        j = n3aVar.f;
        return h4aVar.e(j);
    }

    @Override // defpackage.gx9
    public final boolean zzh() {
        return true;
    }
}
