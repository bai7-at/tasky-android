package defpackage;

/* loaded from: classes3.dex */
public final class nw9 implements gx9 {
    private final pw9 a;
    private final long b;

    public nw9(pw9 pw9Var, long j) {
        this.a = pw9Var;
        this.b = j;
    }

    private final hx9 c(long j, long j2) {
        return new hx9((j * 1000000) / this.a.e, this.b + j2);
    }

    @Override // defpackage.gx9
    public final ex9 a(long j) {
        wad.b(this.a.k);
        pw9 pw9Var = this.a;
        ow9 ow9Var = pw9Var.k;
        long[] jArr = ow9Var.a;
        long[] jArr2 = ow9Var.b;
        int r = khe.r(jArr, pw9Var.b(j), true, false);
        hx9 c = c(r == -1 ? 0L : jArr[r], r != -1 ? jArr2[r] : 0L);
        if (c.a == j || r == jArr.length - 1) {
            return new ex9(c, c);
        }
        int i = r + 1;
        return new ex9(c, c(jArr[i], jArr2[i]));
    }

    @Override // defpackage.gx9
    public final long zza() {
        return this.a.a();
    }

    @Override // defpackage.gx9
    public final boolean zzh() {
        return true;
    }
}
