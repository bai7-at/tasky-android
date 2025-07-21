package defpackage;

import com.facebook.AuthenticationTokenClaims;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
final class z25 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public z25(String str, String str2, String str3, String str4) {
        zq3.h(str, "label");
        zq3.h(str2, "context");
        zq3.h(str3, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str4, "uri");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z25)) {
            return false;
        }
        z25 z25Var = (z25) obj;
        return zq3.c(this.a, z25Var.a) && zq3.c(this.b, z25Var.b) && zq3.c(this.c, z25Var.c) && zq3.c(this.d, z25Var.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "NavigationItemET2Data(label=" + this.a + ", context=" + this.b + ", name=" + this.c + ", uri=" + this.d + ")";
    }

    public /* synthetic */ z25(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4);
    }
}
