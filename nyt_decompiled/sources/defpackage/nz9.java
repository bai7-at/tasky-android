package defpackage;

import com.google.android.gms.internal.ads.zzahe;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;

/* loaded from: classes3.dex */
final class nz9 implements nv9 {
    private sv9 b;
    private int c;
    private int d;
    private int e;
    private zzahe g;
    private ov9 h;
    private tz9 i;
    private c3a j;
    private final b9e a = new b9e(6);
    private long f = -1;

    private final int a(ov9 ov9Var) {
        this.a.h(2);
        ((bv9) ov9Var).d(this.a.m(), 0, 2, false);
        return this.a.F();
    }

    private final void b() {
        c(new zzbx[0]);
        sv9 sv9Var = this.b;
        sv9Var.getClass();
        sv9Var.b();
        this.b.m(new fx9(-9223372036854775807L, 0L));
        this.c = 6;
    }

    private final void c(zzbx... zzbxVarArr) {
        sv9 sv9Var = this.b;
        sv9Var.getClass();
        tx9 zzw = sv9Var.zzw(1024, 4);
        x3a x3aVar = new x3a();
        x3aVar.b("image/jpeg");
        x3aVar.p(new zzby(-9223372036854775807L, zzbxVarArr));
        zzw.f(x3aVar.D());
    }

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            c3a c3aVar = this.j;
            c3aVar.getClass();
            c3aVar.k(j, j2);
        }
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        if (a(ov9Var) != 65496) {
            return false;
        }
        int a = a(ov9Var);
        this.d = a;
        if (a == 65504) {
            this.a.h(2);
            bv9 bv9Var = (bv9) ov9Var;
            bv9Var.d(this.a.m(), 0, 2, false);
            bv9Var.k(this.a.F() - 2, false);
            a = a(ov9Var);
            this.d = a;
        }
        if (a == 65505) {
            bv9 bv9Var2 = (bv9) ov9Var;
            bv9Var2.k(2, false);
            this.a.h(6);
            bv9Var2.d(this.a.m(), 0, 6, false);
            if (this.a.J() == 1165519206 && this.a.F() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.b = sv9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0165  */
    @Override // defpackage.nv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n(defpackage.ov9 r24, defpackage.cx9 r25) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz9.n(ov9, cx9):int");
    }
}
