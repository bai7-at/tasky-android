package defpackage;

import java.util.Set;

/* loaded from: classes4.dex */
public final class p19 {
    private final Set a;

    public p19(Set set) {
        zq3.h(set, "subscriptions");
        this.a = set;
    }

    public final Set a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p19) && zq3.c(this.a, ((p19) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "UserSubscriptions(subscriptions=" + this.a + ")";
    }
}
