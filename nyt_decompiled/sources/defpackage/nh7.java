package defpackage;

/* loaded from: classes4.dex */
public final class nh7 {
    private final String a;
    private final String b;

    public nh7(String str, String str2) {
        zq3.h(str, "uri");
        zq3.h(str2, "title");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh7)) {
            return false;
        }
        nh7 nh7Var = (nh7) obj;
        return zq3.c(this.a, nh7Var.a) && zq3.c(this.b, nh7Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "SectionLockup(uri=" + this.a + ", title=" + this.b + ")";
    }
}
