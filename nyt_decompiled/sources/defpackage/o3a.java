package defpackage;

/* loaded from: classes3.dex */
final class o3a implements u3a {
    private final pw9 a;
    private final ow9 b;
    private long c = -1;
    private long d = -1;

    public o3a(pw9 pw9Var, ow9 ow9Var) {
        this.a = pw9Var;
        this.b = ow9Var;
    }

    @Override // defpackage.u3a
    public final void a(long j) {
        long[] jArr = this.b.a;
        this.d = jArr[khe.r(jArr, j, true, true)];
    }

    @Override // defpackage.u3a
    public final long b(ov9 ov9Var) {
        long j = this.d;
        if (j < 0) {
            return -1L;
        }
        this.d = -1L;
        return -(j + 2);
    }

    public final void c(long j) {
        this.c = j;
    }

    @Override // defpackage.u3a
    public final gx9 zze() {
        wad.f(this.c != -1);
        return new nw9(this.a, this.c);
    }
}
