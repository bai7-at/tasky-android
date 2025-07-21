package defpackage;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class yx5 {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final boolean e;
    private final float f;
    private final int g;
    private final boolean h;
    private final List i;
    private final long j;
    private final long k;

    public /* synthetic */ yx5(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, f, i, z2, list, j5, j6);
    }

    public final boolean a() {
        return this.e;
    }

    public final List b() {
        return this.i;
    }

    public final long c() {
        return this.a;
    }

    public final boolean d() {
        return this.h;
    }

    public final long e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx5)) {
            return false;
        }
        yx5 yx5Var = (yx5) obj;
        return tx5.d(this.a, yx5Var.a) && this.b == yx5Var.b && fd5.l(this.c, yx5Var.c) && fd5.l(this.d, yx5Var.d) && this.e == yx5Var.e && Float.compare(this.f, yx5Var.f) == 0 && iy5.g(this.g, yx5Var.g) && this.h == yx5Var.h && zq3.c(this.i, yx5Var.i) && fd5.l(this.j, yx5Var.j) && fd5.l(this.k, yx5Var.k);
    }

    public final long f() {
        return this.d;
    }

    public final long g() {
        return this.c;
    }

    public final float h() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((((((((((((tx5.e(this.a) * 31) + Long.hashCode(this.b)) * 31) + fd5.q(this.c)) * 31) + fd5.q(this.d)) * 31) + Boolean.hashCode(this.e)) * 31) + Float.hashCode(this.f)) * 31) + iy5.h(this.g)) * 31) + Boolean.hashCode(this.h)) * 31) + this.i.hashCode()) * 31) + fd5.q(this.j)) * 31) + fd5.q(this.k);
    }

    public final long i() {
        return this.j;
    }

    public final int j() {
        return this.g;
    }

    public final long k() {
        return this.b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) tx5.f(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) fd5.v(this.c)) + ", position=" + ((Object) fd5.v(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) iy5.i(this.g)) + ", issuesEnterExit=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) fd5.v(this.j)) + ", originalEventPosition=" + ((Object) fd5.v(this.k)) + ')';
    }

    private yx5(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = list;
        this.j = j5;
        this.k = j6;
    }
}
