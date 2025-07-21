package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class eb0 {
    private final float a;
    private final yc0 b;

    public /* synthetic */ eb0(float f, yc0 yc0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, yc0Var);
    }

    public final yc0 a() {
        return this.b;
    }

    public final float b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb0)) {
            return false;
        }
        eb0 eb0Var = (eb0) obj;
        return bu1.j(this.a, eb0Var.a) && zq3.c(this.b, eb0Var.b);
    }

    public int hashCode() {
        return (bu1.k(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) bu1.l(this.a)) + ", brush=" + this.b + ')';
    }

    private eb0(float f, yc0 yc0Var) {
        this.a = f;
        this.b = yc0Var;
    }
}
