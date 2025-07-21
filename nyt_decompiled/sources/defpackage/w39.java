package defpackage;

/* loaded from: classes4.dex */
public final class w39 {
    private final he3 a;
    private final String b;
    private final String c;

    public w39(he3 he3Var, String str, String str2) {
        zq3.h(str, "title");
        zq3.h(str2, "description");
        this.a = he3Var;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final he3 b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w39)) {
            return false;
        }
        w39 w39Var = (w39) obj;
        return zq3.c(this.a, w39Var.a) && zq3.c(this.b, w39Var.b) && zq3.c(this.c, w39Var.c);
    }

    public int hashCode() {
        he3 he3Var = this.a;
        return ((((he3Var == null ? 0 : he3Var.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ValueProp(icon=" + this.a + ", title=" + this.b + ", description=" + this.c + ")";
    }
}
