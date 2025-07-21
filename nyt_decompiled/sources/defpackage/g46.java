package defpackage;

import com.google.accompanist.pager.PagerState;
import java.util.List;

/* loaded from: classes4.dex */
public final class g46 {
    private final PagerState a;
    private final List b;

    public g46(PagerState pagerState, List list) {
        zq3.h(pagerState, "pagerState");
        zq3.h(list, "tabs");
        this.a = pagerState;
        this.b = list;
    }

    public final PagerState a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g46)) {
            return false;
        }
        g46 g46Var = (g46) obj;
        return zq3.c(this.a, g46Var.a) && zq3.c(this.b, g46Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "ProductTabs(pagerState=" + this.a + ", tabs=" + this.b + ")";
    }
}
