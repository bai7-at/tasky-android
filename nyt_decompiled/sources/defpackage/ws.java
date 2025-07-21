package defpackage;

/* loaded from: classes3.dex */
public final class ws implements rp2 {
    private final String a;

    public ws(String str) {
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
        return (obj instanceof ws) && zq3.c(this.a, ((ws) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AssetPublished(url=" + this.a + ")";
    }
}
