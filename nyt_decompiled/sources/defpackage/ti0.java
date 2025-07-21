package defpackage;

/* loaded from: classes4.dex */
public final class ti0 implements yr4 {
    private final gt2 a;
    private final qs2 b;
    private final boolean c;

    public ti0(gt2 gt2Var, qs2 qs2Var, boolean z) {
        zq3.h(gt2Var, "content");
        zq3.h(qs2Var, "onDismiss");
        this.a = gt2Var;
        this.b = qs2Var;
        this.c = z;
    }

    public final gt2 a() {
        return this.a;
    }

    public final qs2 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti0)) {
            return false;
        }
        ti0 ti0Var = (ti0) obj;
        return zq3.c(this.a, ti0Var.a) && zq3.c(this.b, ti0Var.b) && this.c == ti0Var.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "CenterModalMessageState(content=" + this.a + ", onDismiss=" + this.b + ", dismissOnClickOutside=" + this.c + ")";
    }
}
