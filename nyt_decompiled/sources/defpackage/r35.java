package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class r35 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public r35(String str, String str2, String str3, String str4) {
        zq3.h(str, "nytAppTypeHeaderVal");
        zq3.h(str2, "nytBuildTypeHeaderVal");
        zq3.h(str3, "userAgentAppName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r35)) {
            return false;
        }
        r35 r35Var = (r35) obj;
        return zq3.c(this.a, r35Var.a) && zq3.c(this.b, r35Var.b) && zq3.c(this.c, r35Var.c) && zq3.c(this.d, r35Var.d);
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NetworkConfig(nytAppTypeHeaderVal=" + this.a + ", nytBuildTypeHeaderVal=" + this.b + ", userAgentAppName=" + this.c + ", clientId=" + this.d + ")";
    }

    public /* synthetic */ r35(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "release" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4);
    }
}
