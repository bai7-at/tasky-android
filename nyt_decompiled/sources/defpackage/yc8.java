package defpackage;

import java.util.Set;

/* loaded from: classes4.dex */
public final class yc8 {
    private final Set a;

    public yc8(Set set) {
        zq3.h(set, "names");
        this.a = set;
    }

    public final Set a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yc8) && zq3.c(this.a, ((yc8) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SupportedMessagingUnits(names=" + this.a + ")";
    }
}
