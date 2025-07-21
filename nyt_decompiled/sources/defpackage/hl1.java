package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hl1 {
    private final List a;
    private final String b;

    public hl1(List list, String str) {
        zq3.h(list, "path");
        this.a = list;
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl1)) {
            return false;
        }
        hl1 hl1Var = (hl1) obj;
        return zq3.c(this.a, hl1Var.a) && zq3.c(this.b, hl1Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeferredFragmentIdentifier(path=" + this.a + ", label=" + this.b + ')';
    }
}
