package defpackage;

import com.facebook.AuthenticationTokenClaims;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class rx0 {
    private final String a;
    private final qs2 b;
    private final nn0 c;

    public /* synthetic */ rx0(String str, qs2 qs2Var, nn0 nn0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, qs2Var, nn0Var);
    }

    public final qs2 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final nn0 c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0)) {
            return false;
        }
        rx0 rx0Var = (rx0) obj;
        return zq3.c(this.a, rx0Var.a) && zq3.c(this.b, rx0Var.b) && zq3.c(this.c, rx0Var.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        nn0 nn0Var = this.c;
        return hashCode + (nn0Var == null ? 0 : nn0.z(nn0Var.B()));
    }

    public String toString() {
        return "ContextMenuItem(name=" + this.a + ", clickAction=" + this.b + ", textColorOverride=" + this.c + ")";
    }

    private rx0(String str, qs2 qs2Var, nn0 nn0Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(qs2Var, "clickAction");
        this.a = str;
        this.b = qs2Var;
        this.c = nn0Var;
    }

    public /* synthetic */ rx0(String str, qs2 qs2Var, nn0 nn0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, qs2Var, (i & 4) != 0 ? null : nn0Var, null);
    }
}
