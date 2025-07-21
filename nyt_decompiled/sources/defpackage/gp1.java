package defpackage;

import com.datadog.android.api.context.DeviceType;

/* loaded from: classes2.dex */
public final class gp1 {
    private final String a;
    private final String b;
    private final String c;
    private final DeviceType d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;

    public gp1(String str, String str2, String str3, DeviceType deviceType, String str4, String str5, String str6, String str7, String str8) {
        zq3.h(str, "deviceName");
        zq3.h(str2, "deviceBrand");
        zq3.h(str3, "deviceModel");
        zq3.h(deviceType, "deviceType");
        zq3.h(str4, "deviceBuildId");
        zq3.h(str5, "osName");
        zq3.h(str6, "osMajorVersion");
        zq3.h(str7, "osVersion");
        zq3.h(str8, "architecture");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = deviceType;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }

    public final String a() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp1)) {
            return false;
        }
        gp1 gp1Var = (gp1) obj;
        return zq3.c(this.a, gp1Var.a) && zq3.c(this.b, gp1Var.b) && zq3.c(this.c, gp1Var.c) && this.d == gp1Var.d && zq3.c(this.e, gp1Var.e) && zq3.c(this.f, gp1Var.f) && zq3.c(this.g, gp1Var.g) && zq3.c(this.h, gp1Var.h) && zq3.c(this.i, gp1Var.i);
    }

    public int hashCode() {
        return (((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public String toString() {
        return "DeviceInfo(deviceName=" + this.a + ", deviceBrand=" + this.b + ", deviceModel=" + this.c + ", deviceType=" + this.d + ", deviceBuildId=" + this.e + ", osName=" + this.f + ", osMajorVersion=" + this.g + ", osVersion=" + this.h + ", architecture=" + this.i + ")";
    }
}
