package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class li8 {
    public static final a c = new a(null);
    private static final li8 d = new li8(1.0f, 0.0f);
    private final float a;
    private final float b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final li8 a() {
            return li8.d;
        }

        private a() {
        }
    }

    public li8(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float b() {
        return this.a;
    }

    public final float c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li8)) {
            return false;
        }
        li8 li8Var = (li8) obj;
        return this.a == li8Var.a && this.b == li8Var.b;
    }

    public int hashCode() {
        return (Float.hashCode(this.a) * 31) + Float.hashCode(this.b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.a + ", skewX=" + this.b + ')';
    }
}
