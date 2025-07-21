package defpackage;

import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsKind;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsName;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsValue;

/* loaded from: classes4.dex */
public final class qg5 implements rp2 {
    private final UserPrivacyPrefsName a;
    private final UserPrivacyPrefsKind b;
    private final UserPrivacyPrefsValue c;

    public qg5(UserPrivacyPrefsName userPrivacyPrefsName, UserPrivacyPrefsKind userPrivacyPrefsKind, UserPrivacyPrefsValue userPrivacyPrefsValue) {
        zq3.h(userPrivacyPrefsName, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(userPrivacyPrefsKind, "kind");
        zq3.h(userPrivacyPrefsValue, "value");
        this.a = userPrivacyPrefsName;
        this.b = userPrivacyPrefsKind;
        this.c = userPrivacyPrefsValue;
    }

    public final UserPrivacyPrefsKind a() {
        return this.b;
    }

    public final UserPrivacyPrefsName b() {
        return this.a;
    }

    public final UserPrivacyPrefsValue c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg5)) {
            return false;
        }
        qg5 qg5Var = (qg5) obj;
        return this.a == qg5Var.a && this.b == qg5Var.b && this.c == qg5Var.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "OnUserPrivacyPreferenceV2(name=" + this.a + ", kind=" + this.b + ", value=" + this.c + ")";
    }
}
