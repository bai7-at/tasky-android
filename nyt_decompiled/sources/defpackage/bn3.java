package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class bn3 {
    public static final a e = new a(null);
    private static final bn3 f = new bn3(0, 0, 0, 0);
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public bn3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.d;
    }

    public final long b() {
        return wm3.a(this.a + (i() / 2), this.b + (c() / 2));
    }

    public final int c() {
        return this.d - this.b;
    }

    public final int d() {
        return this.a;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn3)) {
            return false;
        }
        bn3 bn3Var = (bn3) obj;
        return this.a == bn3Var.a && this.b == bn3Var.b && this.c == bn3Var.c && this.d == bn3Var.d;
    }

    public final long f() {
        return in3.a(i(), c());
    }

    public final int g() {
        return this.b;
    }

    public final long h() {
        return wm3.a(this.a, this.b);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
    }

    public final int i() {
        return this.c - this.a;
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ')';
    }
}
