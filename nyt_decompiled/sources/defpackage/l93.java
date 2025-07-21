package defpackage;

import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class l93 {
    private final String a;
    private final Instant b;

    public l93(String str, Instant instant) {
        zq3.h(instant, "fetchingDate");
        this.a = str;
        this.b = instant;
    }

    public final Instant a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l93)) {
            return false;
        }
        l93 l93Var = (l93) obj;
        return zq3.c(this.a, l93Var.a) && zq3.c(this.b, l93Var.b);
    }

    public int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "HomeContent(html=" + this.a + ", fetchingDate=" + this.b + ")";
    }
}
