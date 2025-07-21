package defpackage;

/* loaded from: classes4.dex */
public final class t87 implements s87 {
    private final String a;
    private final String b;

    public t87(String str, String str2) {
        zq3.h(str, "uri");
        zq3.h(str2, "url");
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t87)) {
            return false;
        }
        t87 t87Var = (t87) obj;
        return zq3.c(this.a, t87Var.a) && zq3.c(this.b, t87Var.b);
    }

    @Override // defpackage.s87
    public String getUri() {
        return this.a;
    }

    @Override // defpackage.s87
    public String getUrl() {
        return this.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "SaveableImpl(uri=" + this.a + ", url=" + this.b + ")";
    }
}
