package defpackage;

/* loaded from: classes2.dex */
public final class fi7 {
    public static final fi7 c;
    public static final fi7 d;
    public static final fi7 e;
    public static final fi7 f;
    public static final fi7 g;
    public final long a;
    public final long b;

    static {
        fi7 fi7Var = new fi7(0L, 0L);
        c = fi7Var;
        d = new fi7(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new fi7(Long.MAX_VALUE, 0L);
        f = new fi7(0L, Long.MAX_VALUE);
        g = fi7Var;
    }

    public fi7(long j, long j2) {
        ur.a(j >= 0);
        ur.a(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public long a(long j, long j2, long j3) {
        long j4 = this.a;
        if (j4 == 0 && this.b == 0) {
            return j;
        }
        long Y0 = z19.Y0(j, j4, Long.MIN_VALUE);
        long b = z19.b(j, this.b, Long.MAX_VALUE);
        boolean z = false;
        boolean z2 = Y0 <= j2 && j2 <= b;
        if (Y0 <= j3 && j3 <= b) {
            z = true;
        }
        return (z2 && z) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z2 ? j2 : z ? j3 : Y0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fi7.class != obj.getClass()) {
            return false;
        }
        fi7 fi7Var = (fi7) obj;
        return this.a == fi7Var.a && this.b == fi7Var.b;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
