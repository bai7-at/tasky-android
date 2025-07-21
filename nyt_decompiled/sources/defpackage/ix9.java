package defpackage;

/* loaded from: classes3.dex */
public final class ix9 implements nv9 {
    private final int a;
    private final int b;
    private final String c;
    private int d;
    private int e;
    private sv9 f;
    private tx9 g;

    public ix9(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        wad.f((this.a == -1 || this.b == -1) ? false : true);
        b9e b9eVar = new b9e(this.b);
        ((bv9) ov9Var).d(b9eVar.m(), 0, this.b, false);
        return b9eVar.F() == this.a;
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.f = sv9Var;
        tx9 zzw = sv9Var.zzw(1024, 4);
        this.g = zzw;
        x3a x3aVar = new x3a();
        x3aVar.b(this.c);
        zzw.f(x3aVar.D());
        this.f.b();
        this.f.m(new jx9(-9223372036854775807L));
        this.e = 1;
    }

    @Override // defpackage.nv9
    public final int n(ov9 ov9Var, cx9 cx9Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        tx9 tx9Var = this.g;
        tx9Var.getClass();
        int a = kx9.a(tx9Var, ov9Var, 1024, true);
        if (a == -1) {
            this.e = 2;
            this.g.c(0L, 1, this.d, 0, null);
            this.d = 0;
        } else {
            this.d += a;
        }
        return 0;
    }
}
