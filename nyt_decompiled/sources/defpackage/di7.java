package defpackage;

import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.unfear.nytdesignsystem.model.StyledText;

/* loaded from: classes4.dex */
public final class di7 extends z74 {
    public static final int h = StyledText.d;
    private final String b;
    private final String c;
    private final StyledText d;
    private final String e;
    private final String f;
    private final boolean g;

    public di7(String str, String str2, StyledText styledText, String str3, String str4, boolean z) {
        zq3.h(str, "url");
        zq3.h(str2, "uri");
        zq3.h(styledText, "title");
        zq3.h(str3, "label");
        zq3.h(str4, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.b = str;
        this.c = str2;
        this.d = styledText;
        this.e = str3;
        this.f = str4;
        this.g = z;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.f;
    }

    public final StyledText d() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di7)) {
            return false;
        }
        di7 di7Var = (di7) obj;
        return zq3.c(this.b, di7Var.b) && zq3.c(this.c, di7Var.c) && zq3.c(this.d, di7Var.d) && zq3.c(this.e, di7Var.e) && zq3.c(this.f, di7Var.f) && this.g == di7Var.g;
    }

    public final String f() {
        return this.b;
    }

    public final boolean g() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Boolean.hashCode(this.g);
    }

    public String toString() {
        return "SeeMoreOnMostPopularTitleLockup(url=" + this.b + ", uri=" + this.c + ", title=" + this.d + ", label=" + this.e + ", name=" + this.f + ", isAvailableOffline=" + this.g + ")";
    }
}
