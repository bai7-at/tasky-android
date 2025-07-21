package defpackage;

/* loaded from: classes3.dex */
public final class e86 implements rp2 {
    private final String a;
    private final String b;

    public e86(String str, String str2) {
        zq3.h(str, "url");
        zq3.h(str2, "uri");
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
        if (!(obj instanceof e86)) {
            return false;
        }
        e86 e86Var = (e86) obj;
        return zq3.c(this.a, e86Var.a) && zq3.c(this.b, e86Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "PublishedUrl(url=" + this.a + ", uri=" + this.b + ")";
    }
}
