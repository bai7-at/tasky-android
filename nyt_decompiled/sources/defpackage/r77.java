package defpackage;

/* loaded from: classes4.dex */
public final class r77 {
    private final ty6 a;
    private final qs2 b;
    private final boolean c;
    private final boolean d;
    private final String e;
    private final String f;

    public r77(ty6 ty6Var, qs2 qs2Var, boolean z, boolean z2, String str, String str2) {
        zq3.h(ty6Var, "signer");
        zq3.h(qs2Var, "baseUrl");
        zq3.h(str, "headerLanguage");
        this.a = ty6Var;
        this.b = qs2Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = str2;
    }

    public final qs2 a() {
        return this.b;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.e;
    }

    public final boolean d() {
        return this.c;
    }

    public final ty6 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r77)) {
            return false;
        }
        r77 r77Var = (r77) obj;
        return zq3.c(this.a, r77Var.a) && zq3.c(this.b, r77Var.b) && this.c == r77Var.c && this.d == r77Var.d && zq3.c(this.e, r77Var.e) && zq3.c(this.f, r77Var.f);
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d)) * 31) + this.e.hashCode()) * 31;
        String str = this.f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SamizdatClientConfig(signer=" + this.a + ", baseUrl=" + this.b + ", hybridSupportedIsEnabled=" + this.c + ", deviceIdSupported=" + this.d + ", headerLanguage=" + this.e + ", deviceId=" + this.f + ")";
    }
}
