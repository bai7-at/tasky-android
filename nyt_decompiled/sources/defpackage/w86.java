package defpackage;

/* loaded from: classes4.dex */
public final class w86 {
    private final String a;
    private final Exception b;

    public w86(String str, Exception exc) {
        zq3.h(str, "errorMessage");
        this.a = str;
        this.b = exc;
    }

    public final String a() {
        return this.a;
    }

    public final Exception b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w86)) {
            return false;
        }
        w86 w86Var = (w86) obj;
        return zq3.c(this.a, w86Var.a) && zq3.c(this.b, w86Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Exception exc = this.b;
        return hashCode + (exc == null ? 0 : exc.hashCode());
    }

    public String toString() {
        return "PurrError(errorMessage=" + this.a + ", exception=" + this.b + ")";
    }
}
