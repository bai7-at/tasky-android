package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes4.dex */
public final class ec3 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public ec3(String str, String str2, String str3, String str4, String str5) {
        zq3.h(str, "userAgentPrefix");
        zq3.h(str2, "versionCode");
        zq3.h(str3, "appVersionNumber");
        zq3.h(str4, "deviceName");
        zq3.h(str5, "osVersion");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String d(Context context) {
        zq3.h(context, "context");
        StringBuilder sb = new StringBuilder();
        sb.append(this.a + "/" + this.c + " (Android; ");
        String str = Build.VERSION.RELEASE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("; ");
        sb.append(sb2.toString());
        sb.append("Hybrid Build: " + wx0.a(context) + "; ");
        sb.append("Build Type: release)");
        String sb3 = sb.toString();
        zq3.g(sb3, "toString(...)");
        return sb3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec3)) {
            return false;
        }
        ec3 ec3Var = (ec3) obj;
        return zq3.c(this.a, ec3Var.a) && zq3.c(this.b, ec3Var.b) && zq3.c(this.c, ec3Var.c) && zq3.c(this.d, ec3Var.d) && zq3.c(this.e, ec3Var.e);
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "HybridDependencies(userAgentPrefix=" + this.a + ", versionCode=" + this.b + ", appVersionNumber=" + this.c + ", deviceName=" + this.d + ", osVersion=" + this.e + ")";
    }
}
