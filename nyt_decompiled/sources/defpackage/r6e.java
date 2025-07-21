package defpackage;

/* loaded from: classes3.dex */
final class r6e {
    public final String a;
    public final String b;

    public r6e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6e)) {
            return false;
        }
        r6e r6eVar = (r6e) obj;
        return this.a.equals(r6eVar.a) && this.b.equals(r6eVar.b);
    }

    public final int hashCode() {
        return String.valueOf(this.a).concat(String.valueOf(this.b)).hashCode();
    }
}
