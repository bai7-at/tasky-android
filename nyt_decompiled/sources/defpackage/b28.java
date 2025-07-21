package defpackage;

/* loaded from: classes4.dex */
public final class b28 {
    private final long a;
    private final String b;

    public b28(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b28)) {
            return false;
        }
        b28 b28Var = (b28) obj;
        return this.a == b28Var.a && zq3.c(this.b, b28Var.b);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "StorableAssetIdAndUri(id=" + this.a + ", uri=" + this.b + ")";
    }
}
