package defpackage;

/* loaded from: classes4.dex */
public final class eu {
    private final up1 a;

    public eu(up1 up1Var) {
        zq3.h(up1Var, "deviceToken");
        this.a = up1Var;
    }

    public final up1 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eu) && zq3.c(this.a, ((eu) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AsyncData(deviceToken=" + this.a + ")";
    }
}
