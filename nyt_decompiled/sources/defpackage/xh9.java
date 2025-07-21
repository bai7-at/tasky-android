package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class xh9 {
    public static final a c = new a(null);
    private final bi9 a;
    private final mg9 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xh9 a(float f, float f2) {
            return new xh9(bi9.b.a(f), mg9.b.a(f2), null);
        }

        private a() {
        }
    }

    public /* synthetic */ xh9(bi9 bi9Var, mg9 mg9Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(bi9Var, mg9Var);
    }

    public final bi9 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zq3.c(xh9.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        zq3.f(obj, "null cannot be cast to non-null type androidx.window.core.layout.WindowSizeClass");
        xh9 xh9Var = (xh9) obj;
        return zq3.c(this.a, xh9Var.a) && zq3.c(this.b, xh9Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "SizeClass { widthSizeClass: " + this.a + ", heightSizeClass: " + this.b + " }";
    }

    private xh9(bi9 bi9Var, mg9 mg9Var) {
        this.a = bi9Var;
        this.b = mg9Var;
    }
}
