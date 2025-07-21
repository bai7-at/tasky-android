package defpackage;

import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class jr7 {
    private final List a;
    private final List b;
    private final List c;

    public jr7(List list, List list2, List list3) {
        zq3.h(list, "componentList");
        zq3.h(list2, "colorList");
        zq3.h(list3, "typographyList");
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final List a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr7)) {
            return false;
        }
        jr7 jr7Var = (jr7) obj;
        return zq3.c(this.a, jr7Var.a) && zq3.c(this.b, jr7Var.b) && zq3.c(this.c, jr7Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ShowkaseElementsMetadata(componentList=" + this.a + ", colorList=" + this.b + ", typographyList=" + this.c + ")";
    }

    public /* synthetic */ jr7(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? i.l() : list, (i & 2) != 0 ? i.l() : list2, (i & 4) != 0 ? i.l() : list3);
    }
}
