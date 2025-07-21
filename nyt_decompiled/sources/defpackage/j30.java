package defpackage;

import com.datadog.android.core.configuration.BackPressureMitigation;

/* loaded from: classes2.dex */
public final class j30 {
    private final int a;
    private final qs2 b;
    private final ss2 c;
    private final BackPressureMitigation d;

    public j30(int i, qs2 qs2Var, ss2 ss2Var, BackPressureMitigation backPressureMitigation) {
        zq3.h(qs2Var, "onThresholdReached");
        zq3.h(ss2Var, "onItemDropped");
        zq3.h(backPressureMitigation, "backpressureMitigation");
        this.a = i;
        this.b = qs2Var;
        this.c = ss2Var;
        this.d = backPressureMitigation;
    }

    public final BackPressureMitigation a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final ss2 c() {
        return this.c;
    }

    public final qs2 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j30)) {
            return false;
        }
        j30 j30Var = (j30) obj;
        return this.a == j30Var.a && zq3.c(this.b, j30Var.b) && zq3.c(this.c, j30Var.c) && this.d == j30Var.d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BackPressureStrategy(capacity=" + this.a + ", onThresholdReached=" + this.b + ", onItemDropped=" + this.c + ", backpressureMitigation=" + this.d + ")";
    }
}
