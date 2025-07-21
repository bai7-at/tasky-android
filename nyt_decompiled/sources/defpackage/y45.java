package defpackage;

/* loaded from: classes.dex */
public final class y45 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public y45(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y45)) {
            return false;
        }
        y45 y45Var = (y45) obj;
        return this.a == y45Var.a && this.b == y45Var.b && this.c == y45Var.c && this.d == y45Var.d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}
