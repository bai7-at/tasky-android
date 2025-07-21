package defpackage;

import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class ee7 implements rp2 {
    private final String a;
    private final String b;
    private final Instant c;

    public ee7(String str, String str2, Instant instant) {
        zq3.h(str, "uri");
        zq3.h(str2, "url");
        this.a = str;
        this.b = str2;
        this.c = instant;
    }

    public final Instant a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee7)) {
            return false;
        }
        ee7 ee7Var = (ee7) obj;
        return zq3.c(this.a, ee7Var.a) && zq3.c(this.b, ee7Var.b) && zq3.c(this.c, ee7Var.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Instant instant = this.c;
        return hashCode + (instant == null ? 0 : instant.hashCode());
    }

    public String toString() {
        return "SearchPublished(uri=" + this.a + ", url=" + this.b + ", lastModified=" + this.c + ")";
    }
}
