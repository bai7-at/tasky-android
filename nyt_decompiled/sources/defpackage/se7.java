package defpackage;

import com.facebook.AuthenticationTokenClaims;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class se7 {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final String e;
    private final String f;

    public se7(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        zq3.h(str, "dataId");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str3, "url");
        zq3.h(str4, "uri");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = str4;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.d;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se7)) {
            return false;
        }
        se7 se7Var = (se7) obj;
        return zq3.c(this.a, se7Var.a) && zq3.c(this.b, se7Var.b) && this.c == se7Var.c && this.d == se7Var.d && zq3.c(this.e, se7Var.e) && zq3.c(this.f, se7Var.f);
    }

    public final String f() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "SectionCarouselConfig(dataId=" + this.a + ", name=" + this.b + ", multiRow=" + this.c + ", prefetchAssets=" + this.d + ", url=" + this.e + ", uri=" + this.f + ")";
    }

    public /* synthetic */ se7(String str, String str2, boolean z, boolean z2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4);
    }
}
