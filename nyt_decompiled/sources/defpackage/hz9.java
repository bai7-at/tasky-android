package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
public final class hz9 implements nv9 {
    public static final fw9 q = new fw9() { // from class: gz9
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new hz9()};
        }
    };
    private sv9 f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private fz9 o;
    private kz9 p;
    private final b9e a = new b9e(4);
    private final b9e b = new b9e(9);
    private final b9e c = new b9e(11);
    private final b9e d = new b9e();
    private final iz9 e = new iz9();
    private int g = 1;

    private final b9e a(ov9 ov9Var) {
        if (this.l > this.d.r()) {
            b9e b9eVar = this.d;
            int r = b9eVar.r();
            b9eVar.i(new byte[Math.max(r + r, this.l)], 0);
        } else {
            this.d.k(0);
        }
        this.d.j(this.l);
        ((bv9) ov9Var).c(this.d.m(), 0, this.l, false);
        return this.d;
    }

    private final void b() {
        if (this.n) {
            return;
        }
        this.f.m(new fx9(-9223372036854775807L, 0L));
        this.n = true;
    }

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        bv9 bv9Var = (bv9) ov9Var;
        bv9Var.d(this.a.m(), 0, 3, false);
        this.a.k(0);
        if (this.a.D() != 4607062) {
            return false;
        }
        bv9Var.d(this.a.m(), 0, 2, false);
        this.a.k(0);
        if ((this.a.F() & 250) != 0) {
            return false;
        }
        bv9Var.d(this.a.m(), 0, 4, false);
        this.a.k(0);
        int v = this.a.v();
        ov9Var.zzj();
        bv9 bv9Var2 = (bv9) ov9Var;
        bv9Var2.k(v, false);
        bv9Var2.d(this.a.m(), 0, 4, false);
        this.a.k(0);
        return this.a.v() == 0;
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.f = sv9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // defpackage.nv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n(defpackage.ov9 r17, defpackage.cx9 r18) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz9.n(ov9, cx9):int");
    }
}
