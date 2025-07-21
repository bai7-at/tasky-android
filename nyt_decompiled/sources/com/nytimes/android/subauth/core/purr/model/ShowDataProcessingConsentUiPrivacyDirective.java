package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.PurrShowDataProcessingConsentDirective;
import com.nytimes.android.subauth.core.purr.directive.ToggleableDirectiveValue;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ShowDataProcessingConsentUiPrivacyDirective extends UserPrivacyDirective {
    private final ToggleableDirectiveValue value;

    public ShowDataProcessingConsentUiPrivacyDirective(ToggleableDirectiveValue toggleableDirectiveValue) {
        zq3.h(toggleableDirectiveValue, "value");
        this.value = toggleableDirectiveValue;
    }

    public static /* synthetic */ ShowDataProcessingConsentUiPrivacyDirective copy$default(ShowDataProcessingConsentUiPrivacyDirective showDataProcessingConsentUiPrivacyDirective, ToggleableDirectiveValue toggleableDirectiveValue, int i, Object obj) {
        if ((i & 1) != 0) {
            toggleableDirectiveValue = showDataProcessingConsentUiPrivacyDirective.value;
        }
        return showDataProcessingConsentUiPrivacyDirective.copy(toggleableDirectiveValue);
    }

    public final ToggleableDirectiveValue component1() {
        return this.value;
    }

    public final ShowDataProcessingConsentUiPrivacyDirective copy(ToggleableDirectiveValue toggleableDirectiveValue) {
        zq3.h(toggleableDirectiveValue, "value");
        return new ShowDataProcessingConsentUiPrivacyDirective(toggleableDirectiveValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShowDataProcessingConsentUiPrivacyDirective) && this.value == ((ShowDataProcessingConsentUiPrivacyDirective) obj).value;
    }

    public final ToggleableDirectiveValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "ShowDataProcessingConsentUiPrivacyDirective(value=" + this.value + ")";
    }

    @Override // com.nytimes.android.subauth.core.purr.model.UserPrivacyDirective
    public PurrShowDataProcessingConsentDirective toPublic$subauth_core_release() {
        return new PurrShowDataProcessingConsentDirective(this.value);
    }
}
