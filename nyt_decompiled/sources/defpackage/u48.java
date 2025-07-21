package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u48 extends gv1 {
    public static final a e = new a(null);
    private static final int f = v48.a.a();
    private static final int g = x48.a.b();
    private final float a;
    private final float b;
    private final int c;
    private final int d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return u48.f;
        }

        private a() {
        }
    }

    public /* synthetic */ u48(float f2, float f3, int i, int i2, mp5 mp5Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, i, i2, mp5Var);
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final float d() {
        return this.b;
    }

    public final mp5 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u48)) {
            return false;
        }
        u48 u48Var = (u48) obj;
        if (this.a != u48Var.a || this.b != u48Var.b || !v48.e(this.c, u48Var.c) || !x48.e(this.d, u48Var.d)) {
            return false;
        }
        u48Var.getClass();
        return zq3.c(null, null);
    }

    public final float f() {
        return this.a;
    }

    public int hashCode() {
        return ((((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + v48.f(this.c)) * 31) + x48.f(this.d)) * 31;
    }

    public String toString() {
        return "Stroke(width=" + this.a + ", miter=" + this.b + ", cap=" + ((Object) v48.g(this.c)) + ", join=" + ((Object) x48.g(this.d)) + ", pathEffect=" + ((Object) null) + ')';
    }

    public /* synthetic */ u48(float f2, float f3, int i, int i2, mp5 mp5Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.0f : f2, (i3 & 2) != 0 ? 4.0f : f3, (i3 & 4) != 0 ? f : i, (i3 & 8) != 0 ? g : i2, (i3 & 16) != 0 ? null : mp5Var, null);
    }

    private u48(float f2, float f3, int i, int i2, mp5 mp5Var) {
        super(null);
        this.a = f2;
        this.b = f3;
        this.c = i;
        this.d = i2;
    }
}
