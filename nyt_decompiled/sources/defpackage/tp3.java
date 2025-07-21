package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class tp3 {
    private final List a;
    private final List b;
    private final List c;

    public tp3(List list, List list2, List list3) {
        zq3.h(list, "onboardingInterests");
        zq3.h(list2, "userInterests");
        zq3.h(list3, "editorsPicks");
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final List a() {
        return this.c;
    }

    public final List b() {
        return this.a;
    }

    public final List c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp3)) {
            return false;
        }
        tp3 tp3Var = (tp3) obj;
        return zq3.c(this.a, tp3Var.a) && zq3.c(this.b, tp3Var.b) && zq3.c(this.c, tp3Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "InterestOnboardingResults(onboardingInterests=" + this.a + ", userInterests=" + this.b + ", editorsPicks=" + this.c + ")";
    }
}
