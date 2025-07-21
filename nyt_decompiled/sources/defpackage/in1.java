package defpackage;

import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class in1 {
    private final List a;
    private final List b;
    private final boolean c;
    private final boolean d;

    public in1(List list, List list2, boolean z, boolean z2) {
        zq3.h(list, "tabItems");
        zq3.h(list2, "tabTitles");
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = z2;
    }

    public static /* synthetic */ in1 b(in1 in1Var, List list, List list2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = in1Var.a;
        }
        if ((i & 2) != 0) {
            list2 = in1Var.b;
        }
        if ((i & 4) != 0) {
            z = in1Var.c;
        }
        if ((i & 8) != 0) {
            z2 = in1Var.d;
        }
        return in1Var.a(list, list2, z, z2);
    }

    public final in1 a(List list, List list2, boolean z, boolean z2) {
        zq3.h(list, "tabItems");
        zq3.h(list2, "tabTitles");
        return new in1(list, list2, z, z2);
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.c;
    }

    public final List e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in1)) {
            return false;
        }
        in1 in1Var = (in1) obj;
        return zq3.c(this.a, in1Var.a) && zq3.c(this.b, in1Var.b) && this.c == in1Var.c && this.d == in1Var.d;
    }

    public final List f() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "DestinationContentState(tabItems=" + this.a + ", tabTitles=" + this.b + ", showSearch=" + this.c + ", scrollTopWebView=" + this.d + ")";
    }

    public /* synthetic */ in1(List list, List list2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? i.l() : list, (i & 2) != 0 ? i.l() : list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
