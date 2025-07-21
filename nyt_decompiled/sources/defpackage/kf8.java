package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class kf8 {
    private final float a;
    private final float b;

    public /* synthetic */ kf8(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return bu1.g(this.a + this.b);
    }

    public final float c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf8)) {
            return false;
        }
        kf8 kf8Var = (kf8) obj;
        return bu1.j(this.a, kf8Var.a) && bu1.j(this.b, kf8Var.b);
    }

    public int hashCode() {
        return (bu1.k(this.a) * 31) + bu1.k(this.b);
    }

    public String toString() {
        return "TabPosition(left=" + ((Object) bu1.l(this.a)) + ", right=" + ((Object) bu1.l(b())) + ", width=" + ((Object) bu1.l(this.b)) + ')';
    }

    private kf8(float f, float f2) {
        this.a = f;
        this.b = f2;
    }
}
