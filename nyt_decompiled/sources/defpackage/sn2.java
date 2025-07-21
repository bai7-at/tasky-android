package defpackage;

import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class sn2 {
    private final List a;
    private final List b;
    private final Instant c;

    public sn2(List list, List list2, Instant instant) {
        zq3.h(list, "items");
        zq3.h(list2, "followStatus");
        zq3.h(instant, "fetchingDate");
        this.a = list;
        this.b = list2;
        this.c = instant;
    }

    public final Instant a() {
        return this.c;
    }

    public final List b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn2)) {
            return false;
        }
        sn2 sn2Var = (sn2) obj;
        return zq3.c(this.a, sn2Var.a) && zq3.c(this.b, sn2Var.b) && zq3.c(this.c, sn2Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ForYouDailyPersistedFeed(items=" + this.a + ", followStatus=" + this.b + ", fetchingDate=" + this.c + ")";
    }
}
