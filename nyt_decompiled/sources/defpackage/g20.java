package defpackage;

import defpackage.r18;

/* loaded from: classes3.dex */
final class g20 extends r18.a {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final ko1 f;

    g20(String str, String str2, String str3, String str4, int i, ko1 ko1Var) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = str4;
        this.e = i;
        if (ko1Var == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f = ko1Var;
    }

    @Override // r18.a
    public String a() {
        return this.a;
    }

    @Override // r18.a
    public int c() {
        return this.e;
    }

    @Override // r18.a
    public ko1 d() {
        return this.f;
    }

    @Override // r18.a
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r18.a)) {
            return false;
        }
        r18.a aVar = (r18.a) obj;
        return this.a.equals(aVar.a()) && this.b.equals(aVar.f()) && this.c.equals(aVar.g()) && this.d.equals(aVar.e()) && this.e == aVar.c() && this.f.equals(aVar.d());
    }

    @Override // r18.a
    public String f() {
        return this.b;
    }

    @Override // r18.a
    public String g() {
        return this.c;
    }

    public int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
