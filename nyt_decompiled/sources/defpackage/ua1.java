package defpackage;

import com.datadog.android.DatadogSite;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.privacy.TrackingConsent;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ua1 {
    private final DatadogSite a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final wl8 i;
    private final p36 j;
    private final NetworkInfo k;
    private final gp1 l;
    private final j09 m;
    private final TrackingConsent n;
    private final String o;
    private final Map p;

    public ua1(DatadogSite datadogSite, String str, String str2, String str3, String str4, String str5, String str6, String str7, wl8 wl8Var, p36 p36Var, NetworkInfo networkInfo, gp1 gp1Var, j09 j09Var, TrackingConsent trackingConsent, String str8, Map map) {
        zq3.h(datadogSite, "site");
        zq3.h(str, "clientToken");
        zq3.h(str2, "service");
        zq3.h(str3, "env");
        zq3.h(str4, "version");
        zq3.h(str5, "variant");
        zq3.h(str6, "source");
        zq3.h(str7, "sdkVersion");
        zq3.h(wl8Var, "time");
        zq3.h(p36Var, "processInfo");
        zq3.h(networkInfo, "networkInfo");
        zq3.h(gp1Var, "deviceInfo");
        zq3.h(j09Var, "userInfo");
        zq3.h(trackingConsent, "trackingConsent");
        zq3.h(map, "featuresContext");
        this.a = datadogSite;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = wl8Var;
        this.j = p36Var;
        this.k = networkInfo;
        this.l = gp1Var;
        this.m = j09Var;
        this.n = trackingConsent;
        this.o = str8;
        this.p = map;
    }

    public final String a() {
        return this.o;
    }

    public final String b() {
        return this.b;
    }

    public final gp1 c() {
        return this.l;
    }

    public final String d() {
        return this.d;
    }

    public final Map e() {
        return this.p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua1)) {
            return false;
        }
        ua1 ua1Var = (ua1) obj;
        return this.a == ua1Var.a && zq3.c(this.b, ua1Var.b) && zq3.c(this.c, ua1Var.c) && zq3.c(this.d, ua1Var.d) && zq3.c(this.e, ua1Var.e) && zq3.c(this.f, ua1Var.f) && zq3.c(this.g, ua1Var.g) && zq3.c(this.h, ua1Var.h) && zq3.c(this.i, ua1Var.i) && zq3.c(this.j, ua1Var.j) && zq3.c(this.k, ua1Var.k) && zq3.c(this.l, ua1Var.l) && zq3.c(this.m, ua1Var.m) && this.n == ua1Var.n && zq3.c(this.o, ua1Var.o) && zq3.c(this.p, ua1Var.p);
    }

    public final NetworkInfo f() {
        return this.k;
    }

    public final String g() {
        return this.h;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31;
        String str = this.o;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.p.hashCode();
    }

    public final DatadogSite i() {
        return this.a;
    }

    public final String j() {
        return this.g;
    }

    public final wl8 k() {
        return this.i;
    }

    public final j09 l() {
        return this.m;
    }

    public final String m() {
        return this.f;
    }

    public final String n() {
        return this.e;
    }

    public String toString() {
        return "DatadogContext(site=" + this.a + ", clientToken=" + this.b + ", service=" + this.c + ", env=" + this.d + ", version=" + this.e + ", variant=" + this.f + ", source=" + this.g + ", sdkVersion=" + this.h + ", time=" + this.i + ", processInfo=" + this.j + ", networkInfo=" + this.k + ", deviceInfo=" + this.l + ", userInfo=" + this.m + ", trackingConsent=" + this.n + ", appBuildId=" + this.o + ", featuresContext=" + this.p + ")";
    }
}
