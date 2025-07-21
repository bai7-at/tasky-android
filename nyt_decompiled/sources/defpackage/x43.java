package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class x43 {
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    public /* synthetic */ x43(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.b;
    }

    public final long d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x43)) {
            return false;
        }
        x43 x43Var = (x43) obj;
        return nn0.t(this.a, x43Var.a) && nn0.t(this.b, x43Var.b) && nn0.t(this.c, x43Var.c) && nn0.t(this.d, x43Var.d);
    }

    public int hashCode() {
        return (((((nn0.z(this.a) * 31) + nn0.z(this.b)) * 31) + nn0.z(this.c)) * 31) + nn0.z(this.d);
    }

    public String toString() {
        return "GrowthUIColors(background=" + nn0.A(this.a) + ", content=" + nn0.A(this.b) + ", border=" + nn0.A(this.c) + ", strikethrough=" + nn0.A(this.d) + ")";
    }

    private x43(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public /* synthetic */ x43(long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? nn0.b.g() : j3, (i & 8) != 0 ? nn0.b.g() : j4, null);
    }
}
