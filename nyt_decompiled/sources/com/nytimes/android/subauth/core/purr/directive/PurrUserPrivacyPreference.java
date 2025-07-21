package com.nytimes.android.subauth.core.purr.directive;

import com.facebook.AuthenticationTokenClaims;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class PurrUserPrivacyPreference {
    private final PurrPrivacyPreferenceKind kind;
    private final PurrPrivacyPreferenceName name;
    private final PurrPrivacyPreferenceValue value;

    public PurrUserPrivacyPreference(PurrPrivacyPreferenceName purrPrivacyPreferenceName, PurrPrivacyPreferenceValue purrPrivacyPreferenceValue, PurrPrivacyPreferenceKind purrPrivacyPreferenceKind) {
        zq3.h(purrPrivacyPreferenceName, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(purrPrivacyPreferenceValue, "value");
        zq3.h(purrPrivacyPreferenceKind, "kind");
        this.name = purrPrivacyPreferenceName;
        this.value = purrPrivacyPreferenceValue;
        this.kind = purrPrivacyPreferenceKind;
    }

    public static /* synthetic */ PurrUserPrivacyPreference copy$default(PurrUserPrivacyPreference purrUserPrivacyPreference, PurrPrivacyPreferenceName purrPrivacyPreferenceName, PurrPrivacyPreferenceValue purrPrivacyPreferenceValue, PurrPrivacyPreferenceKind purrPrivacyPreferenceKind, int i, Object obj) {
        if ((i & 1) != 0) {
            purrPrivacyPreferenceName = purrUserPrivacyPreference.name;
        }
        if ((i & 2) != 0) {
            purrPrivacyPreferenceValue = purrUserPrivacyPreference.value;
        }
        if ((i & 4) != 0) {
            purrPrivacyPreferenceKind = purrUserPrivacyPreference.kind;
        }
        return purrUserPrivacyPreference.copy(purrPrivacyPreferenceName, purrPrivacyPreferenceValue, purrPrivacyPreferenceKind);
    }

    public final PurrPrivacyPreferenceName component1() {
        return this.name;
    }

    public final PurrPrivacyPreferenceValue component2() {
        return this.value;
    }

    public final PurrPrivacyPreferenceKind component3() {
        return this.kind;
    }

    public final PurrUserPrivacyPreference copy(PurrPrivacyPreferenceName purrPrivacyPreferenceName, PurrPrivacyPreferenceValue purrPrivacyPreferenceValue, PurrPrivacyPreferenceKind purrPrivacyPreferenceKind) {
        zq3.h(purrPrivacyPreferenceName, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(purrPrivacyPreferenceValue, "value");
        zq3.h(purrPrivacyPreferenceKind, "kind");
        return new PurrUserPrivacyPreference(purrPrivacyPreferenceName, purrPrivacyPreferenceValue, purrPrivacyPreferenceKind);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurrUserPrivacyPreference)) {
            return false;
        }
        PurrUserPrivacyPreference purrUserPrivacyPreference = (PurrUserPrivacyPreference) obj;
        return this.name == purrUserPrivacyPreference.name && this.value == purrUserPrivacyPreference.value && this.kind == purrUserPrivacyPreference.kind;
    }

    public final PurrPrivacyPreferenceKind getKind() {
        return this.kind;
    }

    public final PurrPrivacyPreferenceName getName() {
        return this.name;
    }

    public final PurrPrivacyPreferenceValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.value.hashCode()) * 31) + this.kind.hashCode();
    }

    public String toString() {
        return "PurrUserPrivacyPreference(name=" + this.name + ", value=" + this.value + ", kind=" + this.kind + ")";
    }
}
