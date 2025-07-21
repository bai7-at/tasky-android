package defpackage;

/* loaded from: classes3.dex */
public final class lz9 implements nv9 {
    private final b9e a = new b9e(4);
    private final ix9 b = new ix9(-1, -1, "image/heif");

    private final boolean a(ov9 ov9Var, int i) {
        this.a.h(4);
        ((bv9) ov9Var).d(this.a.m(), 0, 4, false);
        return this.a.J() == ((long) i);
    }

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        this.b.k(j, j2);
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        ((bv9) ov9Var).k(4, false);
        return a(ov9Var, 1718909296) && a(ov9Var, 1751476579);
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.b.m(sv9Var);
    }

    @Override // defpackage.nv9
    public final int n(ov9 ov9Var, cx9 cx9Var) {
        return this.b.n(ov9Var, cx9Var);
    }
}
