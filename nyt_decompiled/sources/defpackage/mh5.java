package defpackage;

import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class mh5 {
    private final String a;
    private final Instant b;
    private final Instant c;

    public mh5(String str, Instant instant, Instant instant2) {
        zq3.h(str, "uri");
        zq3.h(instant, "lastModified");
        this.a = str;
        this.b = instant;
        this.c = instant2;
    }

    public final Instant a() {
        return this.c;
    }

    public final Instant b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh5)) {
            return false;
        }
        mh5 mh5Var = (mh5) obj;
        return zq3.c(this.a, mh5Var.a) && zq3.c(this.b, mh5Var.b) && zq3.c(this.c, mh5Var.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Instant instant = this.c;
        return hashCode + (instant == null ? 0 : instant.hashCode());
    }

    public String toString() {
        return "OneWebViewAsset(uri=" + this.a + ", lastModified=" + this.b + ", hybridLastModified=" + this.c + ")";
    }
}
