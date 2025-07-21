package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class ss8 {
    private final List a;
    private final List b;
    private final List c;

    public ss8(List list, List list2, List list3) {
        zq3.h(list, "mostPopular");
        zq3.h(list2, "mostShared");
        zq3.h(list3, "mostPopularVideos");
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final List a() {
        return this.a;
    }

    public final List b() {
        return this.c;
    }

    public final List c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss8)) {
            return false;
        }
        ss8 ss8Var = (ss8) obj;
        return zq3.c(this.a, ss8Var.a) && zq3.c(this.b, ss8Var.b) && zq3.c(this.c, ss8Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "TrendingViewState(mostPopular=" + this.a + ", mostShared=" + this.b + ", mostPopularVideos=" + this.c + ")";
    }
}
