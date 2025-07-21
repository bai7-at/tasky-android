package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class u1a implements nv9 {
    public static final fw9 q = new fw9() { // from class: s1a
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new u1a(0)};
        }
    };
    private static final l0a r = new l0a() { // from class: t1a
    };
    private final tx9 e;
    private sv9 f;
    private tx9 g;
    private tx9 h;
    private int i;
    private zzby j;
    private long l;
    private long m;
    private int n;
    private w1a o;
    private boolean p;
    private final b9e a = new b9e(10);
    private final yw9 b = new yw9();
    private final sw9 c = new sw9();
    private long k = -9223372036854775807L;
    private final uw9 d = new uw9();

    public u1a(int i) {
        mv9 mv9Var = new mv9();
        this.e = mv9Var;
        this.h = mv9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int b(defpackage.ov9 r17) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1a.b(ov9):int");
    }

    private final long c(long j) {
        return this.k + ((j * 1000000) / this.b.d);
    }

    private final w1a d(ov9 ov9Var, boolean z) {
        ((bv9) ov9Var).d(this.a.m(), 0, 4, false);
        this.a.k(0);
        this.b.a(this.a.v());
        return new q1a(ov9Var.zzd(), ov9Var.zzf(), this.b, false);
    }

    private static boolean e(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean f(ov9 ov9Var) {
        w1a w1aVar = this.o;
        if (w1aVar != null) {
            long zzc = w1aVar.zzc();
            if (zzc != -1 && ov9Var.zze() > zzc - 4) {
                return true;
            }
        }
        try {
            return !ov9Var.d(this.a.m(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean g(ov9 ov9Var, boolean z) {
        int i;
        int i2;
        int b;
        ov9Var.zzj();
        if (ov9Var.zzf() == 0) {
            zzby a = this.d.a(ov9Var, null);
            this.j = a;
            if (a != null) {
                this.c.b(a);
            }
            i = (int) ov9Var.zze();
            if (!z) {
                ((bv9) ov9Var).l(i, false);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!f(ov9Var)) {
                this.a.k(0);
                int v = this.a.v();
                if ((i2 == 0 || e(v, i2)) && (b = zw9.b(v)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.b.a(v);
                        i2 = v;
                    }
                    ((bv9) ov9Var).k(b - 4, false);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        throw zzcc.a("Searched too many bytes.", null);
                    }
                    if (z) {
                        ov9Var.zzj();
                        ((bv9) ov9Var).k(i + i5, false);
                    } else {
                        ((bv9) ov9Var).l(1, false);
                    }
                    i2 = 0;
                    i4 = i5;
                    i3 = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((bv9) ov9Var).l(i + i4, false);
        } else {
            ov9Var.zzj();
        }
        this.i = i2;
        return true;
    }

    public final void a() {
        this.p = true;
    }

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        this.i = 0;
        this.k = -9223372036854775807L;
        this.l = 0L;
        this.n = 0;
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        return g(ov9Var, true);
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.f = sv9Var;
        tx9 zzw = sv9Var.zzw(0, 1);
        this.g = zzw;
        this.h = zzw;
        this.f.b();
    }

    @Override // defpackage.nv9
    public final int n(ov9 ov9Var, cx9 cx9Var) {
        wad.b(this.g);
        int i = khe.a;
        return b(ov9Var);
    }
}
