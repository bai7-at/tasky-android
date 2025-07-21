package com.nytimes.android.subauth.core.purr.mock;

import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceValue;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class PrivacyPref {
    private final String a;
    private final UserPrivacyPreferenceValue b;
    private final UserPrivacyPreferenceValue c;

    public PrivacyPref(String str, UserPrivacyPreferenceValue userPrivacyPreferenceValue, UserPrivacyPreferenceValue userPrivacyPreferenceValue2) {
        zq3.h(str, "action");
        this.a = str;
        this.b = userPrivacyPreferenceValue;
        this.c = userPrivacyPreferenceValue2;
    }

    public final String a() {
        return this.a;
    }

    public final UserPrivacyPreferenceValue b() {
        return this.b;
    }

    public final UserPrivacyPreferenceValue c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyPref)) {
            return false;
        }
        PrivacyPref privacyPref = (PrivacyPref) obj;
        return zq3.c(this.a, privacyPref.a) && this.b == privacyPref.b && this.c == privacyPref.c;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        UserPrivacyPreferenceValue userPrivacyPreferenceValue = this.b;
        int hashCode2 = (hashCode + (userPrivacyPreferenceValue == null ? 0 : userPrivacyPreferenceValue.hashCode())) * 31;
        UserPrivacyPreferenceValue userPrivacyPreferenceValue2 = this.c;
        return hashCode2 + (userPrivacyPreferenceValue2 != null ? userPrivacyPreferenceValue2.hashCode() : 0);
    }

    public String toString() {
        return "PrivacyPref(action=" + this.a + ", valueLocalToAgent=" + this.b + ", valueStoredByNyt=" + this.c + ")";
    }
}
