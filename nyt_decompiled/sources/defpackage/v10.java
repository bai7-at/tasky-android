package defpackage;

/* loaded from: classes3.dex */
final class v10 extends s34 {
    private final String a;
    private final String b;

    v10(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    @Override // defpackage.s34
    public String b() {
        return this.a;
    }

    @Override // defpackage.s34
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s34)) {
            return false;
        }
        s34 s34Var = (s34) obj;
        return this.a.equals(s34Var.b()) && this.b.equals(s34Var.c());
    }

    public int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}
