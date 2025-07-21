package defpackage;

/* loaded from: classes3.dex */
public final class jy9 implements nv9 {
    private int c;
    private ky9 e;
    private long h;
    private my9 i;
    private int m;
    private boolean n;
    private final b9e a = new b9e(12);
    private final iy9 b = new iy9(null);
    private sv9 d = new lv9();
    private my9[] g = new my9[0];
    private long k = -1;
    private long l = -1;
    private int j = -1;
    private long f = -9223372036854775807L;

    private final my9 b(int i) {
        for (my9 my9Var : this.g) {
            if (my9Var.g(i)) {
                return my9Var;
            }
        }
        return null;
    }

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        this.h = -1L;
        this.i = null;
        for (my9 my9Var : this.g) {
            my9Var.f(j);
        }
        if (j == 0) {
            this.c = this.g.length != 0 ? 3 : 0;
        } else {
            this.c = 6;
        }
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        ((bv9) ov9Var).d(this.a.m(), 0, 12, false);
        this.a.k(0);
        if (this.a.x() != 1179011410) {
            return false;
        }
        this.a.l(4);
        return this.a.x() == 541677121;
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.c = 0;
        this.d = sv9Var;
        this.h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // defpackage.nv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n(defpackage.ov9 r28, defpackage.cx9 r29) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy9.n(ov9, cx9):int");
    }
}
