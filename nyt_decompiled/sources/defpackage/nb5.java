package defpackage;

/* loaded from: classes4.dex */
public final class nb5 {
    public static final int c = bs0.b;
    private final boolean a;
    private final bs0 b;

    public nb5(boolean z, bs0 bs0Var) {
        zq3.h(bs0Var, "composablePositions");
        this.a = z;
        this.b = bs0Var;
    }

    public final bs0 a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb5)) {
            return false;
        }
        nb5 nb5Var = (nb5) obj;
        return this.a == nb5Var.a && zq3.c(this.b, nb5Var.b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "NytThemeState(useMaterialYouAsAccent=" + this.a + ", composablePositions=" + this.b + ")";
    }
}
