package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.PurrShowLimitSensitivePIUiDirective;
import com.nytimes.android.subauth.core.purr.directive.ToggleableDirectiveValue;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ShowLimitSensitivePIUiDirective extends UserPrivacyDirective {
    private final ToggleableDirectiveValue value;

    public ShowLimitSensitivePIUiDirective(ToggleableDirectiveValue toggleableDirectiveValue) {
        zq3.h(toggleableDirectiveValue, "value");
        this.value = toggleableDirectiveValue;
    }

    public static /* synthetic */ ShowLimitSensitivePIUiDirective copy$default(ShowLimitSensitivePIUiDirective showLimitSensitivePIUiDirective, ToggleableDirectiveValue toggleableDirectiveValue, int i, Object obj) {
        if ((i & 1) != 0) {
            toggleableDirectiveValue = showLimitSensitivePIUiDirective.value;
        }
        return showLimitSensitivePIUiDirective.copy(toggleableDirectiveValue);
    }

    public final ToggleableDirectiveValue component1() {
        return this.value;
    }

    public final ShowLimitSensitivePIUiDirective copy(ToggleableDirectiveValue toggleableDirectiveValue) {
        zq3.h(toggleableDirectiveValue, "value");
        return new ShowLimitSensitivePIUiDirective(toggleableDirectiveValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShowLimitSensitivePIUiDirective) && this.value == ((ShowLimitSensitivePIUiDirective) obj).value;
    }

    public final ToggleableDirectiveValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "ShowLimitSensitivePIUiDirective(value=" + this.value + ")";
    }

    @Override // com.nytimes.android.subauth.core.purr.model.UserPrivacyDirective
    public PurrShowLimitSensitivePIUiDirective toPublic$subauth_core_release() {
        return new PurrShowLimitSensitivePIUiDirective(this.value);
    }
}
