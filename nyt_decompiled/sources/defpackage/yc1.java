package defpackage;

import com.google.android.exoplayer2.t0;

/* loaded from: classes2.dex */
public final class yc1 {
    public final String a;
    public final t0 b;
    public final t0 c;
    public final int d;
    public final int e;

    public yc1(String str, t0 t0Var, t0 t0Var2, int i, int i2) {
        ur.a(i == 0 || i2 == 0);
        this.a = ur.d(str);
        this.b = (t0) ur.e(t0Var);
        this.c = (t0) ur.e(t0Var2);
        this.d = i;
        this.e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yc1.class != obj.getClass()) {
            return false;
        }
        yc1 yc1Var = (yc1) obj;
        return this.d == yc1Var.d && this.e == yc1Var.e && this.a.equals(yc1Var.a) && this.b.equals(yc1Var.b) && this.c.equals(yc1Var.c);
    }

    public int hashCode() {
        return ((((((((527 + this.d) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
