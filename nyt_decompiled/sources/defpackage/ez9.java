package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzafw;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ez9 implements nv9 {
    public static final fw9 n = new fw9() { // from class: vy9
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new ez9(0)};
        }
    };
    private sv9 d;
    private tx9 e;
    private zzby g;
    private pw9 h;
    private int i;
    private int j;
    private uy9 k;
    private int l;
    private long m;
    private final byte[] a = new byte[42];
    private final b9e b = new b9e(new byte[32768], 0);
    private final hw9 c = new hw9();
    private int f = 0;

    public ez9(int i) {
    }

    private final long a(b9e b9eVar, boolean z) {
        boolean z2;
        this.h.getClass();
        int s = b9eVar.s();
        while (s <= b9eVar.t() - 16) {
            b9eVar.k(s);
            if (jw9.c(b9eVar, this.h, this.j, this.c)) {
                b9eVar.k(s);
                return this.c.a;
            }
            s++;
        }
        if (!z) {
            b9eVar.k(s);
            return -1L;
        }
        while (s <= b9eVar.t() - this.i) {
            b9eVar.k(s);
            try {
                z2 = jw9.c(b9eVar, this.h, this.j, this.c);
            } catch (IndexOutOfBoundsException unused) {
                z2 = false;
            }
            if (b9eVar.s() <= b9eVar.t() && z2) {
                b9eVar.k(s);
                return this.c.a;
            }
            s++;
        }
        b9eVar.k(b9eVar.t());
        return -1L;
    }

    private final void b() {
        long j = this.m * 1000000;
        pw9 pw9Var = this.h;
        int i = khe.a;
        this.e.c(j / pw9Var.e, 1, this.l, 0, null);
    }

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        if (j == 0) {
            this.f = 0;
        } else {
            uy9 uy9Var = this.k;
            if (uy9Var != null) {
                uy9Var.d(j2);
            }
        }
        this.m = j2 != 0 ? -1L : 0L;
        this.l = 0;
        this.b.h(0);
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        lw9.a(ov9Var, false);
        b9e b9eVar = new b9e(4);
        ((bv9) ov9Var).d(b9eVar.m(), 0, 4, false);
        return b9eVar.J() == 1716281667;
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.d = sv9Var;
        this.e = sv9Var.zzw(0, 1);
        sv9Var.b();
    }

    @Override // defpackage.nv9
    public final int n(ov9 ov9Var, cx9 cx9Var) {
        boolean o;
        gx9 fx9Var;
        boolean z;
        int i = this.f;
        if (i == 0) {
            ov9Var.zzj();
            long zze = ov9Var.zze();
            zzby a = lw9.a(ov9Var, true);
            ((bv9) ov9Var).l((int) (ov9Var.zze() - zze), false);
            this.g = a;
            this.f = 1;
            return 0;
        }
        if (i == 1) {
            ((bv9) ov9Var).d(this.a, 0, 42, false);
            ov9Var.zzj();
            this.f = 2;
            return 0;
        }
        if (i == 2) {
            b9e b9eVar = new b9e(4);
            ((bv9) ov9Var).c(b9eVar.m(), 0, 4, false);
            if (b9eVar.J() != 1716281667) {
                throw zzcc.a("Failed to read FLAC stream marker.", null);
            }
            this.f = 3;
            return 0;
        }
        if (i == 3) {
            pw9 pw9Var = this.h;
            do {
                ov9Var.zzj();
                g8e g8eVar = new g8e(new byte[4], 4);
                bv9 bv9Var = (bv9) ov9Var;
                bv9Var.d(g8eVar.a, 0, 4, false);
                o = g8eVar.o();
                int d = g8eVar.d(7);
                int d2 = g8eVar.d(24) + 4;
                if (d == 0) {
                    byte[] bArr = new byte[38];
                    bv9Var.c(bArr, 0, 38, false);
                    pw9Var = new pw9(bArr, 4);
                } else {
                    if (pw9Var == null) {
                        throw new IllegalArgumentException();
                    }
                    if (d == 3) {
                        b9e b9eVar2 = new b9e(d2);
                        bv9Var.c(b9eVar2.m(), 0, d2, false);
                        pw9Var = pw9Var.f(lw9.b(b9eVar2));
                    } else if (d == 4) {
                        b9e b9eVar3 = new b9e(d2);
                        bv9Var.c(b9eVar3.m(), 0, d2, false);
                        b9eVar3.l(4);
                        pw9Var = pw9Var.g(Arrays.asList(cy9.c(b9eVar3, false, false).b));
                    } else if (d == 6) {
                        b9e b9eVar4 = new b9e(d2);
                        bv9Var.c(b9eVar4.m(), 0, d2, false);
                        b9eVar4.l(4);
                        pw9Var = pw9Var.e(zzgaa.u(zzafw.a(b9eVar4)));
                    } else {
                        bv9Var.l(d2, false);
                    }
                }
                int i2 = khe.a;
                this.h = pw9Var;
            } while (!o);
            pw9Var.getClass();
            this.i = Math.max(pw9Var.c, 6);
            this.e.f(this.h.c(this.a, this.g));
            this.f = 4;
            return 0;
        }
        if (i == 4) {
            ov9Var.zzj();
            b9e b9eVar5 = new b9e(2);
            ((bv9) ov9Var).d(b9eVar5.m(), 0, 2, false);
            int F = b9eVar5.F();
            if ((F >> 2) != 16382) {
                ov9Var.zzj();
                throw zzcc.a("First frame does not start with sync code.", null);
            }
            ov9Var.zzj();
            this.j = F;
            sv9 sv9Var = this.d;
            int i3 = khe.a;
            long zzf = ov9Var.zzf();
            long zzd = ov9Var.zzd();
            pw9 pw9Var2 = this.h;
            pw9Var2.getClass();
            if (pw9Var2.k != null) {
                fx9Var = new nw9(pw9Var2, zzf);
            } else if (zzd == -1 || pw9Var2.j <= 0) {
                fx9Var = new fx9(pw9Var2.a(), 0L);
            } else {
                uy9 uy9Var = new uy9(pw9Var2, this.j, zzf, zzd);
                this.k = uy9Var;
                fx9Var = uy9Var.b();
            }
            sv9Var.m(fx9Var);
            this.f = 5;
            return 0;
        }
        this.e.getClass();
        pw9 pw9Var3 = this.h;
        pw9Var3.getClass();
        uy9 uy9Var2 = this.k;
        if (uy9Var2 != null && uy9Var2.e()) {
            return uy9Var2.a(ov9Var, cx9Var);
        }
        if (this.m == -1) {
            this.m = jw9.b(ov9Var, pw9Var3);
            return 0;
        }
        b9e b9eVar6 = this.b;
        int t = b9eVar6.t();
        if (t < 32768) {
            int b = ov9Var.b(b9eVar6.m(), t, 32768 - t);
            z = b == -1;
            if (!z) {
                this.b.j(t + b);
            } else if (this.b.q() == 0) {
                b();
                return -1;
            }
        } else {
            z = false;
        }
        b9e b9eVar7 = this.b;
        int s = b9eVar7.s();
        int i4 = this.l;
        int i5 = this.i;
        if (i4 < i5) {
            b9eVar7.l(Math.min(i5 - i4, b9eVar7.q()));
        }
        long a2 = a(this.b, z);
        b9e b9eVar8 = this.b;
        int s2 = b9eVar8.s() - s;
        b9eVar8.k(s);
        kx9.b(this.e, this.b, s2);
        this.l += s2;
        if (a2 != -1) {
            b();
            this.l = 0;
            this.m = a2;
        }
        b9e b9eVar9 = this.b;
        if (b9eVar9.q() >= 16) {
            return 0;
        }
        int q = b9eVar9.q();
        System.arraycopy(b9eVar9.m(), b9eVar9.s(), b9eVar9.m(), 0, q);
        this.b.k(0);
        this.b.j(q);
        return 0;
    }
}
