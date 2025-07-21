package defpackage;

import com.nytimes.android.designsystem.uiview.ProgressVisibility;

/* loaded from: classes4.dex */
public final class z93 {
    private final l93 a;
    private final ProgressVisibility b;
    private final String c;

    public z93(l93 l93Var, ProgressVisibility progressVisibility) {
        zq3.h(progressVisibility, "progressVisibility");
        this.a = l93Var;
        this.b = progressVisibility;
        this.c = l93Var != null ? l93Var.b() : null;
    }

    public static /* synthetic */ z93 b(z93 z93Var, l93 l93Var, ProgressVisibility progressVisibility, int i, Object obj) {
        if ((i & 1) != 0) {
            l93Var = z93Var.a;
        }
        if ((i & 2) != 0) {
            progressVisibility = z93Var.b;
        }
        return z93Var.a(l93Var, progressVisibility);
    }

    public final z93 a(l93 l93Var, ProgressVisibility progressVisibility) {
        zq3.h(progressVisibility, "progressVisibility");
        return new z93(l93Var, progressVisibility);
    }

    public final l93 c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final ProgressVisibility e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z93)) {
            return false;
        }
        z93 z93Var = (z93) obj;
        return zq3.c(this.a, z93Var.a) && this.b == z93Var.b;
    }

    public int hashCode() {
        l93 l93Var = this.a;
        return ((l93Var == null ? 0 : l93Var.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "HomeViewState(homeContent=" + this.a + ", progressVisibility=" + this.b + ")";
    }
}
