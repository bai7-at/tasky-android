package defpackage;

import com.nytimes.android.api.cms.Asset;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class j44 {
    private final Asset a;
    private final Pair b;
    private final List c;
    private final List d;
    private final List e;
    private final Pair f;
    private final List g;
    private final Asset h;
    private final List i;
    private final List j;
    private final List k;

    public j44(Asset asset, Pair pair, List list, List list2, List list3, Pair pair2, List list4, Asset asset2, List list5, List list6, List list7) {
        zq3.h(asset, "algoHero");
        zq3.h(pair, "algoModule");
        zq3.h(list2, "reviewsModule");
        zq3.h(list3, "profilesModule");
        zq3.h(pair2, "watchReadModule");
        zq3.h(list4, "travelModule");
        zq3.h(asset2, "featuredHero");
        zq3.h(list5, "wellnessModule");
        zq3.h(list6, "modernLoveModule");
        zq3.h(list7, "latest");
        this.a = asset;
        this.b = pair;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = pair2;
        this.g = list4;
        this.h = asset2;
        this.i = list5;
        this.j = list6;
        this.k = list7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j44)) {
            return false;
        }
        j44 j44Var = (j44) obj;
        return zq3.c(this.a, j44Var.a) && zq3.c(this.b, j44Var.b) && zq3.c(this.c, j44Var.c) && zq3.c(this.d, j44Var.d) && zq3.c(this.e, j44Var.e) && zq3.c(this.f, j44Var.f) && zq3.c(this.g, j44Var.g) && zq3.c(this.h, j44Var.h) && zq3.c(this.i, j44Var.i) && zq3.c(this.j, j44Var.j) && zq3.c(this.k, j44Var.k);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        List list = this.c;
        return ((((((((((((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public String toString() {
        return "LifestyleViewState(algoHero=" + this.a + ", algoModule=" + this.b + ", conditionalCarouselModule=" + this.c + ", reviewsModule=" + this.d + ", profilesModule=" + this.e + ", watchReadModule=" + this.f + ", travelModule=" + this.g + ", featuredHero=" + this.h + ", wellnessModule=" + this.i + ", modernLoveModule=" + this.j + ", latest=" + this.k + ")";
    }
}
