package com.nytimes.android.subauth.core.purr.model;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class PreferenceUpdateResult {
    private final UserPrivacyPreference preferences;
    private final PrivacyDirectives privacyDirectives;

    public PreferenceUpdateResult(PrivacyDirectives privacyDirectives, UserPrivacyPreference userPrivacyPreference) {
        this.privacyDirectives = privacyDirectives;
        this.preferences = userPrivacyPreference;
    }

    public static /* synthetic */ PreferenceUpdateResult copy$default(PreferenceUpdateResult preferenceUpdateResult, PrivacyDirectives privacyDirectives, UserPrivacyPreference userPrivacyPreference, int i, Object obj) {
        if ((i & 1) != 0) {
            privacyDirectives = preferenceUpdateResult.privacyDirectives;
        }
        if ((i & 2) != 0) {
            userPrivacyPreference = preferenceUpdateResult.preferences;
        }
        return preferenceUpdateResult.copy(privacyDirectives, userPrivacyPreference);
    }

    public final PrivacyDirectives component1() {
        return this.privacyDirectives;
    }

    public final UserPrivacyPreference component2() {
        return this.preferences;
    }

    public final PreferenceUpdateResult copy(PrivacyDirectives privacyDirectives, UserPrivacyPreference userPrivacyPreference) {
        return new PreferenceUpdateResult(privacyDirectives, userPrivacyPreference);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferenceUpdateResult)) {
            return false;
        }
        PreferenceUpdateResult preferenceUpdateResult = (PreferenceUpdateResult) obj;
        return zq3.c(this.privacyDirectives, preferenceUpdateResult.privacyDirectives) && zq3.c(this.preferences, preferenceUpdateResult.preferences);
    }

    public final UserPrivacyPreference getPreferences() {
        return this.preferences;
    }

    public final PrivacyDirectives getPrivacyDirectives() {
        return this.privacyDirectives;
    }

    public int hashCode() {
        PrivacyDirectives privacyDirectives = this.privacyDirectives;
        int hashCode = (privacyDirectives == null ? 0 : privacyDirectives.hashCode()) * 31;
        UserPrivacyPreference userPrivacyPreference = this.preferences;
        return hashCode + (userPrivacyPreference != null ? userPrivacyPreference.hashCode() : 0);
    }

    public String toString() {
        return "PreferenceUpdateResult(privacyDirectives=" + this.privacyDirectives + ", preferences=" + this.preferences + ")";
    }
}
