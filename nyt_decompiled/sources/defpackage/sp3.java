package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class sp3 {
    private final List a;
    private final List b;
    private final List c;

    public sp3(List list, List list2, List list3) {
        zq3.h(list, "topics");
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
        if (!(obj instanceof sp3)) {
            return false;
        }
        sp3 sp3Var = (sp3) obj;
        return zq3.c(this.a, sp3Var.a) && zq3.c(this.b, sp3Var.b) && zq3.c(this.c, sp3Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "InterestOnboardingResponse(topics=" + this.a + ", userInterests=" + this.b + ", editorsPicks=" + this.c + ")";
    }
}
