package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class aj1 {
    private final t96 a;
    private final t96 b;
    private final u96 c;

    public aj1(t96 t96Var, t96 t96Var2) {
        this.a = t96Var;
        this.b = t96Var2;
        this.c = new u96(null, null, 3, null);
    }

    public final u96 a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj1)) {
            return false;
        }
        aj1 aj1Var = (aj1) obj;
        return zq3.c(this.a, aj1Var.a) && zq3.c(this.b, aj1Var.b);
    }

    public int hashCode() {
        t96 t96Var = this.a;
        int hashCode = (t96Var == null ? 0 : t96Var.hashCode()) * 31;
        t96 t96Var2 = this.b;
        return hashCode + (t96Var2 != null ? t96Var2.hashCode() : 0);
    }

    public String toString() {
        return "DefaultPurrUIConfig(tcfDarkModeColors=" + this.a + ", tcfLightModeColors=" + this.b + ")";
    }

    public /* synthetic */ aj1(t96 t96Var, t96 t96Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : t96Var, (i & 2) != 0 ? null : t96Var2);
    }
}
