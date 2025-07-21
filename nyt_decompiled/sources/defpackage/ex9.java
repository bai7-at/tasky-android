package defpackage;

/* loaded from: classes3.dex */
public final class ex9 {
    public final hx9 a;
    public final hx9 b;

    public ex9(hx9 hx9Var, hx9 hx9Var2) {
        this.a = hx9Var;
        this.b = hx9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ex9.class == obj.getClass()) {
            ex9 ex9Var = (ex9) obj;
            if (this.a.equals(ex9Var.a) && this.b.equals(ex9Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        hx9 hx9Var = this.a;
        hx9 hx9Var2 = this.b;
        return "[" + hx9Var.toString() + (hx9Var.equals(hx9Var2) ? "" : ", ".concat(this.b.toString())) + "]";
    }
}
