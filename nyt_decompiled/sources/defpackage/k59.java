package defpackage;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class k59 extends xm5 {
    public static final int d = 8;
    private final List a;
    private final pv0 b;
    private final String c;

    public /* synthetic */ k59(List list, pv0 pv0Var, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? pv0.Companion.a() : pv0Var, (i & 4) != 0 ? null : str);
    }

    @Override // defpackage.l34
    public String a() {
        return this.c;
    }

    public pv0 b() {
        return this.b;
    }

    public List c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k59)) {
            return false;
        }
        k59 k59Var = (k59) obj;
        return zq3.c(this.a, k59Var.a) && zq3.c(this.b, k59Var.b) && zq3.c(this.c, k59Var.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VerticalStackContainer(packages=" + this.a + ", containerConfig=" + this.b + ", testTag=" + this.c + ")";
    }

    public k59(List list, pv0 pv0Var, String str) {
        zq3.h(list, "packages");
        zq3.h(pv0Var, "containerConfig");
        this.a = list;
        this.b = pv0Var;
        this.c = str;
    }
}
