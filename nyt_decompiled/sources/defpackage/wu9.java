package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes3.dex */
public abstract class wu9 {
    protected final ou9 a;
    protected final uu9 b;
    protected ru9 c;
    private final int d;

    protected wu9(su9 su9Var, uu9 uu9Var, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = uu9Var;
        this.d = i;
        this.a = new ou9(su9Var, j, 0L, j3, j4, j5, j6);
    }

    protected static final int f(ov9 ov9Var, long j, cx9 cx9Var) {
        if (j == ov9Var.zzf()) {
            return 0;
        }
        cx9Var.a = j;
        return 1;
    }

    protected static final boolean g(ov9 ov9Var, long j) {
        long zzf = j - ov9Var.zzf();
        if (zzf < 0 || zzf > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((bv9) ov9Var).l((int) zzf, false);
        return true;
    }

    public final int a(ov9 ov9Var, cx9 cx9Var) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        while (true) {
            ru9 ru9Var = this.c;
            wad.b(ru9Var);
            j = ru9Var.f;
            j2 = ru9Var.g;
            long j12 = j2 - j;
            int i2 = this.d;
            j3 = ru9Var.h;
            if (j12 <= i2) {
                c(false, j);
                return f(ov9Var, j, cx9Var);
            }
            if (!g(ov9Var, j3)) {
                return f(ov9Var, j3, cx9Var);
            }
            ov9Var.zzj();
            uu9 uu9Var = this.b;
            j4 = ru9Var.b;
            tu9 a = uu9Var.a(ov9Var, j4);
            i = a.a;
            if (i == -3) {
                c(false, j3);
                return f(ov9Var, j3, cx9Var);
            }
            if (i == -2) {
                j10 = a.b;
                j11 = a.c;
                ru9.h(ru9Var, j10, j11);
            } else {
                if (i != -1) {
                    j5 = a.c;
                    g(ov9Var, j5);
                    j6 = a.c;
                    c(true, j6);
                    j7 = a.c;
                    return f(ov9Var, j7, cx9Var);
                }
                j8 = a.b;
                j9 = a.c;
                ru9.g(ru9Var, j8, j9);
            }
        }
    }

    public final gx9 b() {
        return this.a;
    }

    protected final void c(boolean z, long j) {
        this.c = null;
        this.b.zzb();
    }

    public final void d(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        ru9 ru9Var = this.c;
        if (ru9Var != null) {
            j6 = ru9Var.a;
            if (j6 == j) {
                return;
            }
        }
        ou9 ou9Var = this.a;
        long g = ou9Var.g(j);
        j2 = ou9Var.c;
        j3 = ou9Var.d;
        j4 = ou9Var.e;
        j5 = ou9Var.f;
        this.c = new ru9(j, g, 0L, j2, j3, j4, j5);
    }

    public final boolean e() {
        return this.c != null;
    }
}
