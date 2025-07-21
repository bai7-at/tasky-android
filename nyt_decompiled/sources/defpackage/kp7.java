package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class kp7 {
    private final e01 a;
    private final e01 b;
    private final e01 c;

    public kp7(e01 e01Var, e01 e01Var2, e01 e01Var3) {
        this.a = e01Var;
        this.b = e01Var2;
        this.c = e01Var3;
    }

    public final e01 a() {
        return this.c;
    }

    public final e01 b() {
        return this.b;
    }

    public final e01 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp7)) {
            return false;
        }
        kp7 kp7Var = (kp7) obj;
        return zq3.c(this.a, kp7Var.a) && zq3.c(this.b, kp7Var.b) && zq3.c(this.c, kp7Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }

    public /* synthetic */ kp7(e01 e01Var, e01 e01Var2, e01 e01Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? d37.c(bu1.g(4)) : e01Var, (i & 2) != 0 ? d37.c(bu1.g(4)) : e01Var2, (i & 4) != 0 ? d37.c(bu1.g(0)) : e01Var3);
    }
}
