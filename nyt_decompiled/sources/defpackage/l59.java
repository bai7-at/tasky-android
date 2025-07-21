package defpackage;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class l59 extends jb5 {
    public static final int d = 8;
    private final List b;
    private final sm5 c;

    public /* synthetic */ l59(List list, sm5 sm5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? sm5.Companion.a() : sm5Var);
    }

    public List b() {
        return this.b;
    }

    public sm5 c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l59)) {
            return false;
        }
        l59 l59Var = (l59) obj;
        return zq3.c(this.b, l59Var.b) && zq3.c(this.c, l59Var.c);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        return "VerticalStackPackage(lockups=" + this.b + ", packageConfig=" + this.c + ")";
    }

    public l59(List list, sm5 sm5Var) {
        zq3.h(list, "lockups");
        zq3.h(sm5Var, "packageConfig");
        this.b = list;
        this.c = sm5Var;
    }
}
