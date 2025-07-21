package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class az2 {
    private final List a;

    public az2(List list) {
        zq3.h(list, "topics");
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az2)) {
            return false;
        }
        az2 az2Var = (az2) obj;
        if (this.a.size() != az2Var.a.size()) {
            return false;
        }
        return zq3.c(new HashSet(this.a), new HashSet(az2Var.a));
    }

    public int hashCode() {
        return Objects.hash(this.a);
    }

    public String toString() {
        return "Topics=" + this.a;
    }
}
