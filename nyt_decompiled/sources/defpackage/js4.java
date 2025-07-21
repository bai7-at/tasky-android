package defpackage;

import java.util.Set;

/* loaded from: classes4.dex */
public final class js4 {
    private final Set a;

    public js4(Set set) {
        zq3.h(set, "entitlements");
        this.a = set;
    }

    public final boolean a(String str) {
        zq3.h(str, "entitlement");
        return this.a.contains(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof js4) && zq3.c(this.a, ((js4) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "MessagingUserState(entitlements=" + this.a + ")";
    }
}
