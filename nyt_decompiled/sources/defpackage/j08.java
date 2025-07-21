package defpackage;

import com.nytimes.android.unfear.nytdesignsystem.model.Viewport;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class j08 extends an5 {
    public static final int f = 8;
    private final Viewport b;
    private final List c;
    private final cn5 d;
    private final String e;

    public /* synthetic */ j08(Viewport viewport, List list, cn5 cn5Var, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewport, list, (i & 4) != 0 ? cn5.Companion.a() : cn5Var, (i & 8) != 0 ? null : str);
    }

    @Override // defpackage.l34
    public String a() {
        return this.e;
    }

    public final List b() {
        return this.c;
    }

    public final cn5 c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j08)) {
            return false;
        }
        j08 j08Var = (j08) obj;
        return this.b == j08Var.b && zq3.c(this.c, j08Var.c) && zq3.c(this.d, j08Var.d) && zq3.c(this.e, j08Var.e);
    }

    public int hashCode() {
        int hashCode = ((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "StandardPage(viewport=" + this.b + ", containers=" + this.c + ", pageConfig=" + this.d + ", testTag=" + this.e + ")";
    }

    public j08(Viewport viewport, List list, cn5 cn5Var, String str) {
        zq3.h(viewport, "viewport");
        zq3.h(list, "containers");
        zq3.h(cn5Var, "pageConfig");
        this.b = viewport;
        this.c = list;
        this.d = cn5Var;
        this.e = str;
    }
}
