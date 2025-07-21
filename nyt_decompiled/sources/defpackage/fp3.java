package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class fp3 {
    private final List a;
    private final List b;
    private final long c;

    public fp3(List list, List list2, long j) {
        zq3.h(list, "content");
        zq3.h(list2, "order");
        this.a = list;
        this.b = list2;
        this.c = j;
    }

    public final List a() {
        return this.a;
    }

    public final long b() {
        return this.c;
    }

    public final List c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp3)) {
            return false;
        }
        fp3 fp3Var = (fp3) obj;
        return zq3.c(this.a, fp3Var.a) && zq3.c(this.b, fp3Var.b) && this.c == fp3Var.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c);
    }

    public String toString() {
        return "InterestContent(content=" + this.a + ", order=" + this.b + ", lastAutoAddedAt=" + this.c + ")";
    }
}
