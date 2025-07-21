package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class tv4 {
    private final List a;

    public tv4(List list) {
        zq3.h(list, "sections");
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv4) && zq3.c(this.a, ((tv4) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "MoreViewState(sections=" + this.a + ")";
    }
}
