package defpackage;

/* loaded from: classes5.dex */
final class u10 extends lm3 {
    private final String b;
    private final String c;
    private final String d;
    private final hv e;

    u10(String str, String str2, String str3, hv hvVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        if (hvVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.e = hvVar;
    }

    @Override // defpackage.lm3
    public hv d() {
        return this.e;
    }

    @Override // defpackage.lm3
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lm3)) {
            return false;
        }
        lm3 lm3Var = (lm3) obj;
        return this.b.equals(lm3Var.e()) && ((str = this.c) != null ? str.equals(lm3Var.g()) : lm3Var.g() == null) && ((str2 = this.d) != null ? str2.equals(lm3Var.f()) : lm3Var.f() == null) && this.e.equals(lm3Var.d());
    }

    @Override // defpackage.lm3
    public String f() {
        return this.d;
    }

    @Override // defpackage.lm3
    public String g() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        return this.e.hashCode() ^ ((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003);
    }

    public String toString() {
        return "InstrumentationScopeInfo{name=" + this.b + ", version=" + this.c + ", schemaUrl=" + this.d + ", attributes=" + this.e + "}";
    }
}
