package defpackage;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f49 extends d49 {
    private final String a;
    private final List b;
    private final int c;
    private final yc0 d;
    private final float e;
    private final yc0 f;
    private final float g;
    private final float h;
    private final int i;
    private final int j;
    private final float k;
    private final float l;
    private final float m;
    private final float n;

    public /* synthetic */ f49(String str, List list, int i, yc0 yc0Var, float f, yc0 yc0Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i, yc0Var, f, yc0Var2, f2, f3, i2, i3, f4, f5, f6, f7);
    }

    public final yc0 a() {
        return this.d;
    }

    public final float c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f49.class == obj.getClass()) {
            f49 f49Var = (f49) obj;
            return zq3.c(this.a, f49Var.a) && zq3.c(this.d, f49Var.d) && this.e == f49Var.e && zq3.c(this.f, f49Var.f) && this.g == f49Var.g && this.h == f49Var.h && v48.e(this.i, f49Var.i) && x48.e(this.j, f49Var.j) && this.k == f49Var.k && this.l == f49Var.l && this.m == f49Var.m && this.n == f49Var.n && np5.d(this.c, f49Var.c) && zq3.c(this.b, f49Var.b);
        }
        return false;
    }

    public final String f() {
        return this.a;
    }

    public final List g() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        yc0 yc0Var = this.d;
        int hashCode2 = (((hashCode + (yc0Var != null ? yc0Var.hashCode() : 0)) * 31) + Float.hashCode(this.e)) * 31;
        yc0 yc0Var2 = this.f;
        return ((((((((((((((((((hashCode2 + (yc0Var2 != null ? yc0Var2.hashCode() : 0)) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.h)) * 31) + v48.f(this.i)) * 31) + x48.f(this.j)) * 31) + Float.hashCode(this.k)) * 31) + Float.hashCode(this.l)) * 31) + Float.hashCode(this.m)) * 31) + Float.hashCode(this.n)) * 31) + np5.e(this.c);
    }

    public final int j() {
        return this.c;
    }

    public final yc0 n() {
        return this.f;
    }

    public final float o() {
        return this.g;
    }

    public final int p() {
        return this.i;
    }

    public final int q() {
        return this.j;
    }

    public final float t() {
        return this.k;
    }

    public final float u() {
        return this.h;
    }

    public final float v() {
        return this.m;
    }

    public final float w() {
        return this.n;
    }

    public final float x() {
        return this.l;
    }

    private f49(String str, List list, int i, yc0 yc0Var, float f, yc0 yc0Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = yc0Var;
        this.e = f;
        this.f = yc0Var2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }
}
