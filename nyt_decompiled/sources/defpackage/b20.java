package defpackage;

/* loaded from: classes5.dex */
final class b20 extends bz6 {
    private final String j;
    private final hv k;

    b20(String str, hv hvVar) {
        this.j = str;
        if (hvVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.k = hvVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bz6)) {
            return false;
        }
        bz6 bz6Var = (bz6) obj;
        String str = this.j;
        if (str != null ? str.equals(bz6Var.h()) : bz6Var.h() == null) {
            if (this.k.equals(bz6Var.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bz6
    public hv f() {
        return this.k;
    }

    @Override // defpackage.bz6
    public String h() {
        return this.j;
    }

    public int hashCode() {
        String str = this.j;
        return this.k.hashCode() ^ (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003);
    }

    public String toString() {
        return "Resource{schemaUrl=" + this.j + ", attributes=" + this.k + "}";
    }
}
