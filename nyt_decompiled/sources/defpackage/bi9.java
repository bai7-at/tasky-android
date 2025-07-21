package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class bi9 {
    public static final a b = new a(null);
    public static final bi9 c = new bi9(0);
    public static final bi9 d = new bi9(1);
    public static final bi9 e = new bi9(2);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bi9 a(float f) {
            if (f > 0.0f) {
                return f < 600.0f ? bi9.c : f < 840.0f ? bi9.d : bi9.e;
            }
            throw new IllegalArgumentException(("Width must be positive, received " + f).toString());
        }

        private a() {
        }
    }

    private bi9(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zq3.c(bi9.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        zq3.f(obj, "null cannot be cast to non-null type androidx.window.core.layout.WindowWidthSizeClass");
        return this.a == ((bi9) obj).a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return "WindowWidthSizeClass: " + (zq3.c(this, c) ? "COMPACT" : zq3.c(this, d) ? "MEDIUM" : zq3.c(this, e) ? "EXPANDED" : "UNKNOWN");
    }
}
