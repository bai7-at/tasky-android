package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ox7 extends yc0 {
    private final long c;

    public /* synthetic */ ox7(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // defpackage.yc0
    public void a(long j, ao5 ao5Var, float f) {
        long r;
        ao5Var.c(1.0f);
        if (f == 1.0f) {
            r = this.c;
        } else {
            long j2 = this.c;
            r = nn0.r(j2, nn0.u(j2) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        ao5Var.k(r);
        if (ao5Var.r() != null) {
            ao5Var.q(null);
        }
    }

    public final long b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ox7) && nn0.t(this.c, ((ox7) obj).c);
    }

    public int hashCode() {
        return nn0.z(this.c);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) nn0.A(this.c)) + ')';
    }

    private ox7(long j) {
        super(null);
        this.c = j;
    }
}
