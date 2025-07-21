package defpackage;

/* loaded from: classes4.dex */
public final class el {
    private final String a;
    private final String b;
    private final String c;

    public el(String str, String str2, String str3) {
        zq3.h(str, "deviceName");
        zq3.h(str2, "osVersion");
        zq3.h(str3, "appVersion");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el)) {
            return false;
        }
        el elVar = (el) obj;
        return zq3.c(this.a, elVar.a) && zq3.c(this.b, elVar.b) && zq3.c(this.c, elVar.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "AppConfig(deviceName=" + this.a + ", osVersion=" + this.b + ", appVersion=" + this.c + ")";
    }
}
