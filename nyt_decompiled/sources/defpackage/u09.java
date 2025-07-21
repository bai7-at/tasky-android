package defpackage;

import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsKind;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsName;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsValue;
import defpackage.nk5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class u09 {
    private final UserPrivacyPrefsName a;
    private final nk5 b;
    private final UserPrivacyPrefsValue c;
    private final UserPrivacyPrefsKind d;

    public u09(UserPrivacyPrefsName userPrivacyPrefsName, nk5 nk5Var, UserPrivacyPrefsValue userPrivacyPrefsValue, UserPrivacyPrefsKind userPrivacyPrefsKind) {
        zq3.h(userPrivacyPrefsName, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(nk5Var, "nameV2");
        zq3.h(userPrivacyPrefsValue, "value");
        zq3.h(userPrivacyPrefsKind, "kind");
        this.a = userPrivacyPrefsName;
        this.b = nk5Var;
        this.c = userPrivacyPrefsValue;
        this.d = userPrivacyPrefsKind;
    }

    public final UserPrivacyPrefsKind a() {
        return this.d;
    }

    public final UserPrivacyPrefsName b() {
        return this.a;
    }

    public final nk5 c() {
        return this.b;
    }

    public final UserPrivacyPrefsValue d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u09)) {
            return false;
        }
        u09 u09Var = (u09) obj;
        return this.a == u09Var.a && zq3.c(this.b, u09Var.b) && this.c == u09Var.c && this.d == u09Var.d;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "UserPrivacyPreferenceInputV2(name=" + this.a + ", nameV2=" + this.b + ", value=" + this.c + ", kind=" + this.d + ")";
    }

    public /* synthetic */ u09(UserPrivacyPrefsName userPrivacyPrefsName, nk5 nk5Var, UserPrivacyPrefsValue userPrivacyPrefsValue, UserPrivacyPrefsKind userPrivacyPrefsKind, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userPrivacyPrefsName, (i & 2) != 0 ? nk5.a.b : nk5Var, userPrivacyPrefsValue, userPrivacyPrefsKind);
    }
}
