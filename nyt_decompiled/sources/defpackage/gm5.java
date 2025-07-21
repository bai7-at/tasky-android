package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class gm5 {
    private final long a;
    private final ym5 b;

    public /* synthetic */ gm5(long j, ym5 ym5Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, ym5Var);
    }

    public final ym5 a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zq3.c(gm5.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        zq3.f(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        gm5 gm5Var = (gm5) obj;
        return nn0.t(this.a, gm5Var.a) && zq3.c(this.b, gm5Var.b);
    }

    public int hashCode() {
        return (nn0.z(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) nn0.A(this.a)) + ", drawPadding=" + this.b + ')';
    }

    private gm5(long j, ym5 ym5Var) {
        this.a = j;
        this.b = ym5Var;
    }

    public /* synthetic */ gm5(long j, ym5 ym5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? wn0.d(4284900966L) : j, (i & 2) != 0 ? PaddingKt.c(0.0f, 0.0f, 3, null) : ym5Var, null);
    }
}
