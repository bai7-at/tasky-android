package defpackage;

/* loaded from: classes3.dex */
public final class mz0 implements rp2 {
    private final String a;
    private final jz0 b;

    public mz0(String str, jz0 jz0Var) {
        zq3.h(str, "__typename");
        zq3.h(jz0Var, "cookingPromotional");
        this.a = str;
        this.b = jz0Var;
    }

    public final jz0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz0)) {
            return false;
        }
        mz0 mz0Var = (mz0) obj;
        return zq3.c(this.a, mz0Var.a) && zq3.c(this.b, mz0Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "CookingRecipe(__typename=" + this.a + ", cookingPromotional=" + this.b + ")";
    }
}
