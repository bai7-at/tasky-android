package defpackage;

/* loaded from: classes4.dex */
public final class rp7 {
    private final String a;

    public rp7(String str) {
        zq3.h(str, "url");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rp7) && zq3.c(this.a, ((rp7) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ShareCodeRequest(url=" + this.a + ")";
    }
}
