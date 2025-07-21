package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class jf8 {
    private final float a;
    private final float b;

    public /* synthetic */ jf8(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
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
        if (!(obj instanceof jf8)) {
            return false;
        }
        jf8 jf8Var = (jf8) obj;
        if (bu1.j(this.a, jf8Var.a)) {
            return bu1.j(this.b, jf8Var.b);
        }
        return false;
    }

    public int hashCode() {
        return (bu1.k(this.a) * 31) + bu1.k(this.b);
    }

    public String toString() {
        return "TabPosition(left=" + bu1.l(this.a) + ", right=" + bu1.l(b()) + ", width=" + bu1.l(this.b) + ")";
    }

    private jf8(float f, float f2) {
        this.a = f;
        this.b = f2;
    }
}
