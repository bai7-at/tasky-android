package defpackage;

/* loaded from: classes5.dex */
final class k20 extends d99 {
    private final String a;
    private final String b;
    private final bb c;
    private final jv d;
    private final int e;

    k20(String str, String str2, bb bbVar, jv jvVar, int i) {
        this.a = str;
        this.b = str2;
        if (bbVar == null) {
            throw new NullPointerException("Null aggregation");
        }
        this.c = bbVar;
        if (jvVar == null) {
            throw new NullPointerException("Null attributesProcessor");
        }
        this.d = jvVar;
        this.e = i;
    }

    @Override // defpackage.d99
    public bb c() {
        return this.c;
    }

    @Override // defpackage.d99
    jv d() {
        return this.d;
    }

    @Override // defpackage.d99
    int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d99)) {
            return false;
        }
        d99 d99Var = (d99) obj;
        String str = this.a;
        if (str != null ? str.equals(d99Var.g()) : d99Var.g() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(d99Var.f()) : d99Var.f() == null) {
                if (this.c.equals(d99Var.c()) && this.d.equals(d99Var.d()) && this.e == d99Var.e()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.d99
    public String f() {
        return this.b;
    }

    @Override // defpackage.d99
    public String g() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        return this.e ^ ((((((hashCode ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }
}
