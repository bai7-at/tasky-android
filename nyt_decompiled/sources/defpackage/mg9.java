package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class mg9 {
    public static final a b = new a(null);
    public static final mg9 c = new mg9(0);
    public static final mg9 d = new mg9(1);
    public static final mg9 e = new mg9(2);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mg9 a(float f) {
            if (f > 0.0f) {
                return f < 480.0f ? mg9.c : f < 900.0f ? mg9.d : mg9.e;
            }
            throw new IllegalArgumentException(("Height must be positive, received " + f).toString());
        }

        private a() {
        }
    }

    private mg9(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zq3.c(mg9.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        zq3.f(obj, "null cannot be cast to non-null type androidx.window.core.layout.WindowHeightSizeClass");
        return this.a == ((mg9) obj).a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return "WindowHeightSizeClass: " + (zq3.c(this, c) ? "COMPACT" : zq3.c(this, d) ? "MEDIUM" : zq3.c(this, e) ? "EXPANDED" : "UNKNOWN");
    }
}
