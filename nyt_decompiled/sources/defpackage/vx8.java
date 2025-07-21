package defpackage;

import com.nytimes.android.subauth.core.type.UserPrivacyPrefsName;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsValue;
import defpackage.nk5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class vx8 {
    private final nk5 a;
    private final UserPrivacyPrefsName b;
    private final nk5 c;
    private final UserPrivacyPrefsValue d;
    private final String e;
    private final List f;
    private final boolean g;

    public vx8(nk5 nk5Var, UserPrivacyPrefsName userPrivacyPrefsName, nk5 nk5Var2, UserPrivacyPrefsValue userPrivacyPrefsValue, String str, List list, boolean z) {
        zq3.h(nk5Var, "userIdentifier");
        zq3.h(userPrivacyPrefsName, "settingName");
        zq3.h(nk5Var2, "settingNameV2");
        zq3.h(userPrivacyPrefsValue, "newValue");
        zq3.h(str, "sourceName");
        zq3.h(list, "agentPrefs");
        this.a = nk5Var;
        this.b = userPrivacyPrefsName;
        this.c = nk5Var2;
        this.d = userPrivacyPrefsValue;
        this.e = str;
        this.f = list;
        this.g = z;
    }

    public final List a() {
        return this.f;
    }

    public final UserPrivacyPrefsValue b() {
        return this.d;
    }

    public final boolean c() {
        return this.g;
    }

    public final UserPrivacyPrefsName d() {
        return this.b;
    }

    public final nk5 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx8)) {
            return false;
        }
        vx8 vx8Var = (vx8) obj;
        return zq3.c(this.a, vx8Var.a) && this.b == vx8Var.b && zq3.c(this.c, vx8Var.c) && this.d == vx8Var.d && zq3.c(this.e, vx8Var.e) && zq3.c(this.f, vx8Var.f) && this.g == vx8Var.g;
    }

    public final String f() {
        return this.e;
    }

    public final nk5 g() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Boolean.hashCode(this.g);
    }

    public String toString() {
        return "UpdateUserPrivacyPrefsInputV2(userIdentifier=" + this.a + ", settingName=" + this.b + ", settingNameV2=" + this.c + ", newValue=" + this.d + ", sourceName=" + this.e + ", agentPrefs=" + this.f + ", platformDoNotTrackIsOn=" + this.g + ")";
    }

    public /* synthetic */ vx8(nk5 nk5Var, UserPrivacyPrefsName userPrivacyPrefsName, nk5 nk5Var2, UserPrivacyPrefsValue userPrivacyPrefsValue, String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, userPrivacyPrefsName, (i & 4) != 0 ? nk5.a.b : nk5Var2, userPrivacyPrefsValue, str, list, z);
    }
}
