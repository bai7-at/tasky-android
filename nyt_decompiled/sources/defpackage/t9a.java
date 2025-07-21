package defpackage;

import com.google.android.gms.internal.ads.zzcc;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
final class t9a implements s9a {
    private final sv9 a;
    private final tx9 b;
    private final v9a c;
    private final l6a d;
    private final int e;
    private long f;
    private int g;
    private long h;

    public t9a(sv9 sv9Var, tx9 tx9Var, v9a v9aVar, String str, int i) {
        this.a = sv9Var;
        this.b = tx9Var;
        this.c = v9aVar;
        int i2 = v9aVar.b * v9aVar.e;
        int i3 = v9aVar.d;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw zzcc.a("Expected block size: " + i4 + "; got: " + i3, null);
        }
        int i5 = v9aVar.c * i4;
        int i6 = i5 * 8;
        int max = Math.max(i4, i5 / 10);
        this.e = max;
        x3a x3aVar = new x3a();
        x3aVar.w(str);
        x3aVar.j0(i6);
        x3aVar.r(i6);
        x3aVar.o(max);
        x3aVar.k0(v9aVar.b);
        x3aVar.x(v9aVar.c);
        x3aVar.q(i);
        this.d = x3aVar.D();
    }

    @Override // defpackage.s9a
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.s9a
    public final boolean c(ov9 ov9Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int a = kx9.a(this.b, ov9Var, (int) Math.min(i2 - i, j2), true);
            if (a == -1) {
                j2 = 0;
            } else {
                this.g += a;
                j2 -= a;
            }
        }
        v9a v9aVar = this.c;
        int i3 = this.g;
        int i4 = v9aVar.d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long H = this.f + khe.H(this.h, 1000000L, v9aVar.c, RoundingMode.FLOOR);
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.c(H, 1, i6, i7, null);
            this.h += i5;
            this.g = i7;
        }
        return j2 <= 0;
    }

    @Override // defpackage.s9a
    public final void zza(int i, long j) {
        this.a.m(new y9a(this.c, 1, i, j));
        this.b.f(this.d);
    }
}
