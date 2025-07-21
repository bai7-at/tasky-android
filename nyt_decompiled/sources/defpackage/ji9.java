package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class ji9 {
    private final List a;
    private final List b;
    private final fi9 c;

    public ji9(List list, List list2, fi9 fi9Var) {
        zq3.h(list, "topRecommendedAssets");
        zq3.h(list2, "secondaryRecommendedAssets");
        this.a = list;
        this.b = list2;
        this.c = fi9Var;
    }

    public final fi9 a() {
        return this.c;
    }

    public final List b() {
        return this.b;
    }

    public final List c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji9)) {
            return false;
        }
        ji9 ji9Var = (ji9) obj;
        return zq3.c(this.a, ji9Var.a) && zq3.c(this.b, ji9Var.b) && zq3.c(this.c, ji9Var.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        fi9 fi9Var = this.c;
        return hashCode + (fi9Var == null ? 0 : fi9Var.hashCode());
    }

    public String toString() {
        return "WirecutterViewState(topRecommendedAssets=" + this.a + ", secondaryRecommendedAssets=" + this.b + ", newsletterData=" + this.c + ")";
    }
}
