package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class so1 {
    public static final b Companion = new b(null);
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final Integer l;
    private final long m;
    private final String n;

    public static final class a {
        private String g;
        private String j;
        private String k;
        private Integer l;
        private String a = "";
        private String b = "";
        private String c = "";
        private String d = "";
        private String e = "";
        private String f = "";
        private String h = "";
        private String i = "";
        private long m = -1;

        public final a a(String str) {
            zq3.h(str, "agentId");
            this.i = str;
            return this;
        }

        public final a b(String str) {
            zq3.h(str, "appType");
            this.a = str;
            return this;
        }

        public final a c(String str) {
            zq3.h(str, "appVersion");
            this.b = str;
            return this;
        }

        public final so1 d() {
            return new so1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }

        public final a e(String str) {
            zq3.h(str, "buildType");
            this.f = str;
            return this;
        }

        public final a f(String str) {
            this.j = str;
            return this;
        }

        public final a g(String str) {
            this.g = str;
            return this;
        }

        public final a h(String str) {
            zq3.h(str, "deviceModel");
            this.e = str;
            return this;
        }

        public final a i(String str) {
            zq3.h(str, "deviceType");
            this.d = str;
            return this;
        }

        public final a j(long j) {
            this.m = j;
            return this;
        }

        public final a k(String str) {
            zq3.h(str, "nytHeaderValue");
            this.h = str;
            return this;
        }

        public final a l(String str) {
            zq3.h(str, "osVersion");
            this.c = str;
            return this;
        }

        public final a m(Integer num) {
            this.l = num;
            return this;
        }

        public final a n(String str) {
            this.k = str;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public so1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, long j) {
        zq3.h(str, "appType");
        zq3.h(str2, "appVersion");
        zq3.h(str3, "osVersion");
        zq3.h(str4, "deviceType");
        zq3.h(str5, "deviceModel");
        zq3.h(str6, "buildType");
        zq3.h(str8, "nytHeaderValue");
        zq3.h(str9, "agentId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = num;
        this.m = j;
        this.n = "okhttp/4.10.0 " + str9 + "/" + str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        String str = this.g;
        return str == null ? "" : str;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so1)) {
            return false;
        }
        so1 so1Var = (so1) obj;
        return zq3.c(this.a, so1Var.a) && zq3.c(this.b, so1Var.b) && zq3.c(this.c, so1Var.c) && zq3.c(this.d, so1Var.d) && zq3.c(this.e, so1Var.e) && zq3.c(this.f, so1Var.f) && zq3.c(this.g, so1Var.g) && zq3.c(this.h, so1Var.h) && zq3.c(this.i, so1Var.i) && zq3.c(this.j, so1Var.j) && zq3.c(this.k, so1Var.k) && zq3.c(this.l, so1Var.l) && this.m == so1Var.m;
    }

    public final long f() {
        return this.m;
    }

    public final String g() {
        return this.h;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        String str = this.g;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31;
        String str2 = this.j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.l;
        return ((hashCode4 + (num != null ? num.hashCode() : 0)) * 31) + Long.hashCode(this.m);
    }

    public final String i() {
        return this.n;
    }

    public final String j() {
        return this.k;
    }

    public String toString() {
        return "DeviceConfig(appType=" + this.a + ", appVersion=" + this.b + ", osVersion=" + this.c + ", deviceType=" + this.d + ", deviceModel=" + this.e + ", buildType=" + this.f + ", deviceId=" + this.g + ", nytHeaderValue=" + this.h + ", agentId=" + this.i + ", clientId=" + this.j + ", webViewPackage=" + this.k + ", screenWidth=" + this.l + ", googlePlayServicesVersion=" + this.m + ")";
    }
}
