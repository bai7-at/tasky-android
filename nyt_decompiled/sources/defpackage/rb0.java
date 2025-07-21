package defpackage;

/* loaded from: classes4.dex */
public final class rb0 implements yr4 {
    private final gt2 a;
    private final boolean b;

    public rb0(gt2 gt2Var, boolean z) {
        zq3.h(gt2Var, "content");
        this.a = gt2Var;
        this.b = z;
    }

    public final gt2 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb0)) {
            return false;
        }
        rb0 rb0Var = (rb0) obj;
        return zq3.c(this.a, rb0Var.a) && this.b == rb0Var.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "BottomSheetMessageState(content=" + this.a + ", dismissOnClickOutside=" + this.b + ")";
    }
}
