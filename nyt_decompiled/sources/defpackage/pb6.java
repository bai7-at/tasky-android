package defpackage;

/* loaded from: classes4.dex */
public final class pb6 {
    private final String a;
    private final int b;

    public pb6(String str, int i) {
        zq3.h(str, "historyId");
        this.a = str;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb6)) {
            return false;
        }
        pb6 pb6Var = (pb6) obj;
        return zq3.c(this.a, pb6Var.a) && this.b == pb6Var.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "already shown " + this.b + " historyId '" + this.a + "'";
    }
}
