package defpackage;

import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.unfear.nytdesignsystem.model.StyledText;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class mh7 extends z74 {
    public static final int h = StyledText.d;
    private final String b;
    private final StyledText c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final String g;

    public /* synthetic */ mh7(String str, StyledText styledText, String str2, boolean z, boolean z2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, styledText, str2, z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? styledText.c() : str3);
    }

    @Override // defpackage.z74, defpackage.l34
    public String a() {
        return this.g;
    }

    public final String b() {
        return this.d;
    }

    public final StyledText c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh7)) {
            return false;
        }
        mh7 mh7Var = (mh7) obj;
        return zq3.c(this.b, mh7Var.b) && zq3.c(this.c, mh7Var.c) && zq3.c(this.d, mh7Var.d) && this.e == mh7Var.e && this.f == mh7Var.f && zq3.c(this.g, mh7Var.g);
    }

    public final boolean f() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = ((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31;
        String str = this.g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SectionLockup(uri=" + this.b + ", title=" + this.c + ", name=" + this.d + ", isAvailableOffline=" + this.e + ", isShowExternalIcon=" + this.f + ", testTag=" + this.g + ")";
    }

    public mh7(String str, StyledText styledText, String str2, boolean z, boolean z2, String str3) {
        zq3.h(str, "uri");
        zq3.h(styledText, "title");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.b = str;
        this.c = styledText;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = str3;
    }
}
