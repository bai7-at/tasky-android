package com.nytimes.android.subauth.core.purr.model;

import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.subauth.core.purr.directive.PurrUserPrivacyPreference;
import defpackage.et3;
import defpackage.u09;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class UserPrivacyPreference {
    private final UserPrivacyPreferenceKind kind;
    private final UserPrivacyPreferenceName name;
    private final UserPrivacyPreferenceValue value;

    public UserPrivacyPreference(UserPrivacyPreferenceName userPrivacyPreferenceName, UserPrivacyPreferenceValue userPrivacyPreferenceValue, UserPrivacyPreferenceKind userPrivacyPreferenceKind) {
        zq3.h(userPrivacyPreferenceName, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(userPrivacyPreferenceValue, "value");
        zq3.h(userPrivacyPreferenceKind, "kind");
        this.name = userPrivacyPreferenceName;
        this.value = userPrivacyPreferenceValue;
        this.kind = userPrivacyPreferenceKind;
    }

    public static /* synthetic */ UserPrivacyPreference copy$default(UserPrivacyPreference userPrivacyPreference, UserPrivacyPreferenceName userPrivacyPreferenceName, UserPrivacyPreferenceValue userPrivacyPreferenceValue, UserPrivacyPreferenceKind userPrivacyPreferenceKind, int i, Object obj) {
        if ((i & 1) != 0) {
            userPrivacyPreferenceName = userPrivacyPreference.name;
        }
        if ((i & 2) != 0) {
            userPrivacyPreferenceValue = userPrivacyPreference.value;
        }
        if ((i & 4) != 0) {
            userPrivacyPreferenceKind = userPrivacyPreference.kind;
        }
        return userPrivacyPreference.copy(userPrivacyPreferenceName, userPrivacyPreferenceValue, userPrivacyPreferenceKind);
    }

    public final UserPrivacyPreferenceName component1() {
        return this.name;
    }

    public final UserPrivacyPreferenceValue component2() {
        return this.value;
    }

    public final UserPrivacyPreferenceKind component3() {
        return this.kind;
    }

    public final UserPrivacyPreference copy(UserPrivacyPreferenceName userPrivacyPreferenceName, UserPrivacyPreferenceValue userPrivacyPreferenceValue, UserPrivacyPreferenceKind userPrivacyPreferenceKind) {
        zq3.h(userPrivacyPreferenceName, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(userPrivacyPreferenceValue, "value");
        zq3.h(userPrivacyPreferenceKind, "kind");
        return new UserPrivacyPreference(userPrivacyPreferenceName, userPrivacyPreferenceValue, userPrivacyPreferenceKind);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPrivacyPreference)) {
            return false;
        }
        UserPrivacyPreference userPrivacyPreference = (UserPrivacyPreference) obj;
        return this.name == userPrivacyPreference.name && this.value == userPrivacyPreference.value && this.kind == userPrivacyPreference.kind;
    }

    public final UserPrivacyPreferenceKind getKind() {
        return this.kind;
    }

    public final UserPrivacyPreferenceName getName() {
        return this.name;
    }

    public final UserPrivacyPreferenceValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.value.hashCode()) * 31) + this.kind.hashCode();
    }

    public final u09 toApollo$subauth_core_release() {
        return new u09(this.name.toApollo$subauth_core_release(), null, this.value.toApollo$subauth_core_release(), this.kind.toApollo$subauth_core_release(), 2, null);
    }

    public final PurrUserPrivacyPreference toPublic$subauth_core_release() {
        return new PurrUserPrivacyPreference(this.name.toPublic$subauth_core_release(), this.value.toPublic$subauth_core_release(), this.kind.toPublic$subauth_core_release());
    }

    public String toString() {
        return "UserPrivacyPreference(name=" + this.name + ", value=" + this.value + ", kind=" + this.kind + ")";
    }
}
