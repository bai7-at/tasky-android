package defpackage;

/* loaded from: classes4.dex */
public final class he3 {
    private final String a;
    private final int b;

    public he3(String str, int i) {
        zq3.h(str, "description");
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he3)) {
            return false;
        }
        he3 he3Var = (he3) obj;
        return zq3.c(this.a, he3Var.a) && this.b == he3Var.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "Icon(description=" + this.a + ", drawableId=" + this.b + ")";
    }
}
