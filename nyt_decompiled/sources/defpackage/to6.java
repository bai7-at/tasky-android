package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class to6 {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public to6(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public to6 a(to6 to6Var, String str) {
        String c = c(str);
        if (to6Var != null && c.equals(to6Var.c(str))) {
            long j = this.b;
            if (j != -1) {
                long j2 = this.a;
                if (j2 + j == to6Var.a) {
                    long j3 = to6Var.b;
                    return new to6(c, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = to6Var.b;
            if (j4 != -1) {
                long j5 = to6Var.a;
                if (j5 + j4 == this.a) {
                    return new to6(c, j5, j != -1 ? j4 + j : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return yy8.e(str, this.c);
    }

    public String c(String str) {
        return yy8.d(str, this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || to6.class != obj.getClass()) {
            return false;
        }
        to6 to6Var = (to6) obj;
        return this.a == to6Var.a && this.b == to6Var.b && this.c.equals(to6Var.c);
    }

    public int hashCode() {
        if (this.d == 0) {
            this.d = ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
        }
        return this.d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.c + ", start=" + this.a + ", length=" + this.b + ")";
    }
}
