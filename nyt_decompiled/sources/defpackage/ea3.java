package defpackage;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ea3 extends jb5 {
    public static final int f = 8;
    private final List b;
    private final sm5 c;
    private final float d;
    private final int e;

    public /* synthetic */ ea3(List list, sm5 sm5Var, float f2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? sm5.Companion.a() : sm5Var, (i2 & 4) != 0 ? 0.0f : f2, (i2 & 8) != 0 ? 1 : i);
    }

    public final float b() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    public List d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea3)) {
            return false;
        }
        ea3 ea3Var = (ea3) obj;
        return zq3.c(this.b, ea3Var.b) && zq3.c(this.c, ea3Var.c) && Float.compare(this.d, ea3Var.d) == 0 && this.e == ea3Var.e;
    }

    public int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + Float.hashCode(this.d)) * 31) + Integer.hashCode(this.e);
    }

    public String toString() {
        return "HorizontalCarouselPackage(lockups=" + this.b + ", packageConfig=" + this.c + ", itemVerticalSpacingInDp=" + this.d + ", itemsPerColumn=" + this.e + ")";
    }

    public ea3(List list, sm5 sm5Var, float f2, int i) {
        zq3.h(list, "lockups");
        zq3.h(sm5Var, "packageConfig");
        this.b = list;
        this.c = sm5Var;
        this.d = f2;
        this.e = i;
    }
}
