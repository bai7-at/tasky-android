package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes3.dex */
public final class qt implements rp2 {
    private final String a;
    private final String b;
    private final boolean c;

    public qt(String str, String str2, boolean z) {
        zq3.h(str, "displayName");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt)) {
            return false;
        }
        qt qtVar = (qt) obj;
        return zq3.c(this.a, qtVar.a) && zq3.c(this.b, qtVar.b) && this.c == qtVar.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "AssetSection(displayName=" + this.a + ", name=" + this.b + ", nytBranded=" + this.c + ")";
    }
}
