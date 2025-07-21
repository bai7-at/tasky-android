package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class zx8 {
    private final List a;
    private final List b;
    private final boolean c;

    public zx8(List list, List list2, boolean z) {
        zq3.h(list, "oldTabs");
        zq3.h(list2, "newTabs");
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public final List a() {
        return this.b;
    }

    public final List b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx8)) {
            return false;
        }
        zx8 zx8Var = (zx8) obj;
        return zq3.c(this.a, zx8Var.a) && zq3.c(this.b, zx8Var.b) && this.c == zx8Var.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "UpdatedTabs(oldTabs=" + this.a + ", newTabs=" + this.b + ", updated=" + this.c + ")";
    }
}
