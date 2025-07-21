package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class jp7 {
    private final e01 a;
    private final e01 b;
    private final e01 c;
    private final e01 d;
    private final e01 e;

    public jp7(e01 e01Var, e01 e01Var2, e01 e01Var3, e01 e01Var4, e01 e01Var5) {
        this.a = e01Var;
        this.b = e01Var2;
        this.c = e01Var3;
        this.d = e01Var4;
        this.e = e01Var5;
    }

    public final e01 a() {
        return this.e;
    }

    public final e01 b() {
        return this.a;
    }

    public final e01 c() {
        return this.d;
    }

    public final e01 d() {
        return this.c;
    }

    public final e01 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp7)) {
            return false;
        }
        jp7 jp7Var = (jp7) obj;
        return zq3.c(this.a, jp7Var.a) && zq3.c(this.b, jp7Var.b) && zq3.c(this.c, jp7Var.c) && zq3.c(this.d, jp7Var.d) && zq3.c(this.e, jp7Var.e);
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }

    public /* synthetic */ jp7(e01 e01Var, e01 e01Var2, e01 e01Var3, e01 e01Var4, e01 e01Var5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? uo7.a.b() : e01Var, (i & 2) != 0 ? uo7.a.e() : e01Var2, (i & 4) != 0 ? uo7.a.d() : e01Var3, (i & 8) != 0 ? uo7.a.c() : e01Var4, (i & 16) != 0 ? uo7.a.a() : e01Var5);
    }
}
