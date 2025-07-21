package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class jl3 {
    public static final jl3 e = new jl3(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static class a {
        static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    private jl3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static jl3 a(jl3 jl3Var, jl3 jl3Var2) {
        return b(Math.max(jl3Var.a, jl3Var2.a), Math.max(jl3Var.b, jl3Var2.b), Math.max(jl3Var.c, jl3Var2.c), Math.max(jl3Var.d, jl3Var2.d));
    }

    public static jl3 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new jl3(i, i2, i3, i4);
    }

    public static jl3 c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static jl3 d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jl3.class != obj.getClass()) {
            return false;
        }
        jl3 jl3Var = (jl3) obj;
        return this.d == jl3Var.d && this.a == jl3Var.a && this.c == jl3Var.c && this.b == jl3Var.b;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
