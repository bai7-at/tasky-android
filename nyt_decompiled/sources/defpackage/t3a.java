package defpackage;

import com.google.android.gms.internal.ads.zzcc;

/* loaded from: classes3.dex */
final class t3a {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    private final b9e g = new b9e(255);

    t3a() {
    }

    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean b(ov9 ov9Var, boolean z) {
        a();
        this.g.h(27);
        if (tv9.c(ov9Var, this.g.m(), 0, 27, z) && this.g.J() == 1332176723) {
            if (this.g.B() != 0) {
                if (z) {
                    return false;
                }
                throw zzcc.c("unsupported bit stream revision");
            }
            this.a = this.g.B();
            this.b = this.g.G();
            this.g.H();
            this.g.H();
            this.g.H();
            int B = this.g.B();
            this.c = B;
            this.d = B + 27;
            this.g.h(B);
            if (tv9.c(ov9Var, this.g.m(), 0, this.c, z)) {
                for (int i = 0; i < this.c; i++) {
                    this.f[i] = this.g.B();
                    this.e += this.f[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c(ov9 ov9Var, long j) {
        wad.d(ov9Var.zzf() == ov9Var.zze());
        this.g.h(4);
        while (true) {
            if ((j == -1 || ov9Var.zzf() + 4 < j) && tv9.c(ov9Var, this.g.m(), 0, 4, true)) {
                this.g.k(0);
                if (this.g.J() == 1332176723) {
                    ov9Var.zzj();
                    return true;
                }
                ((bv9) ov9Var).l(1, false);
            }
        }
        do {
            if (j != -1 && ov9Var.zzf() >= j) {
                break;
            }
        } while (ov9Var.a(1) != -1);
        return false;
    }
}
