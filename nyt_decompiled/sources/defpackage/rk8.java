package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class rk8 {
    private final ky3 a;
    private final List b;
    private final zq c;
    private final List d;

    public rk8(ky3 ky3Var, List list, zq zqVar, List list2) {
        zq3.h(list, "listItems");
        zq3.h(list2, "headlineItems");
        this.a = ky3Var;
        this.b = list;
        this.c = zqVar;
        this.d = list2;
    }

    public final zq a() {
        return this.c;
    }

    public final List b() {
        return this.d;
    }

    public final ky3 c() {
        return this.a;
    }

    public final List d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk8)) {
            return false;
        }
        rk8 rk8Var = (rk8) obj;
        return zq3.c(this.a, rk8Var.a) && zq3.c(this.b, rk8Var.b) && zq3.c(this.c, rk8Var.c) && zq3.c(this.d, rk8Var.d);
    }

    public int hashCode() {
        ky3 ky3Var = this.a;
        int hashCode = (((ky3Var == null ? 0 : ky3Var.hashCode()) * 31) + this.b.hashCode()) * 31;
        zq zqVar = this.c;
        return ((hashCode + (zqVar != null ? zqVar.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "TheAthleticViewState(largeItem=" + this.a + ", listItems=" + this.b + ", articleItem=" + this.c + ", headlineItems=" + this.d + ")";
    }
}
