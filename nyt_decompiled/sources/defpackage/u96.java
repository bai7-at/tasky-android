package defpackage;

import com.nytimes.subauth.ui.purr.ui.theme.PurrUIColorsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class u96 {
    private final t96 a;
    private final t96 b;

    public u96(t96 t96Var, t96 t96Var2) {
        zq3.h(t96Var, "tcfDarkModeColors");
        zq3.h(t96Var2, "tcfLightModeColors");
        this.a = t96Var;
        this.b = t96Var2;
    }

    public final t96 a() {
        return this.a;
    }

    public final t96 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u96)) {
            return false;
        }
        u96 u96Var = (u96) obj;
        return zq3.c(this.a, u96Var.a) && zq3.c(this.b, u96Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "PurrUIConfig(tcfDarkModeColors=" + this.a + ", tcfLightModeColors=" + this.b + ")";
    }

    public /* synthetic */ u96(t96 t96Var, t96 t96Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PurrUIColorsKt.b() : t96Var, (i & 2) != 0 ? PurrUIColorsKt.c() : t96Var2);
    }
}
