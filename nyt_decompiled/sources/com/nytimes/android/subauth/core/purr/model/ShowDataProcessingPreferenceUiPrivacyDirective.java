package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.DataProcessingPreferenceDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.PurrShowDataProcessingPreferenceDirective;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ShowDataProcessingPreferenceUiPrivacyDirective extends UserPrivacyDirective {
    private final DataProcessingPreferenceDirectiveValue value;

    public ShowDataProcessingPreferenceUiPrivacyDirective(DataProcessingPreferenceDirectiveValue dataProcessingPreferenceDirectiveValue) {
        zq3.h(dataProcessingPreferenceDirectiveValue, "value");
        this.value = dataProcessingPreferenceDirectiveValue;
    }

    public static /* synthetic */ ShowDataProcessingPreferenceUiPrivacyDirective copy$default(ShowDataProcessingPreferenceUiPrivacyDirective showDataProcessingPreferenceUiPrivacyDirective, DataProcessingPreferenceDirectiveValue dataProcessingPreferenceDirectiveValue, int i, Object obj) {
        if ((i & 1) != 0) {
            dataProcessingPreferenceDirectiveValue = showDataProcessingPreferenceUiPrivacyDirective.value;
        }
        return showDataProcessingPreferenceUiPrivacyDirective.copy(dataProcessingPreferenceDirectiveValue);
    }

    public final DataProcessingPreferenceDirectiveValue component1() {
        return this.value;
    }

    public final ShowDataProcessingPreferenceUiPrivacyDirective copy(DataProcessingPreferenceDirectiveValue dataProcessingPreferenceDirectiveValue) {
        zq3.h(dataProcessingPreferenceDirectiveValue, "value");
        return new ShowDataProcessingPreferenceUiPrivacyDirective(dataProcessingPreferenceDirectiveValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShowDataProcessingPreferenceUiPrivacyDirective) && this.value == ((ShowDataProcessingPreferenceUiPrivacyDirective) obj).value;
    }

    public final DataProcessingPreferenceDirectiveValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "ShowDataProcessingPreferenceUiPrivacyDirective(value=" + this.value + ")";
    }

    @Override // com.nytimes.android.subauth.core.purr.model.UserPrivacyDirective
    public PurrShowDataProcessingPreferenceDirective toPublic$subauth_core_release() {
        return new PurrShowDataProcessingPreferenceDirective(this.value);
    }
}
