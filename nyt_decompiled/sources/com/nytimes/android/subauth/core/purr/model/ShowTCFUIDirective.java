package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrTCFUIDirective;
import com.nytimes.android.subauth.core.purr.directive.ToggleableDirectiveValue;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ShowTCFUIDirective extends UserPrivacyDirective {
    private final ToggleableDirectiveValue value;

    public ShowTCFUIDirective(ToggleableDirectiveValue toggleableDirectiveValue) {
        zq3.h(toggleableDirectiveValue, "value");
        this.value = toggleableDirectiveValue;
    }

    public static /* synthetic */ ShowTCFUIDirective copy$default(ShowTCFUIDirective showTCFUIDirective, ToggleableDirectiveValue toggleableDirectiveValue, int i, Object obj) {
        if ((i & 1) != 0) {
            toggleableDirectiveValue = showTCFUIDirective.value;
        }
        return showTCFUIDirective.copy(toggleableDirectiveValue);
    }

    public final ToggleableDirectiveValue component1() {
        return this.value;
    }

    public final ShowTCFUIDirective copy(ToggleableDirectiveValue toggleableDirectiveValue) {
        zq3.h(toggleableDirectiveValue, "value");
        return new ShowTCFUIDirective(toggleableDirectiveValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShowTCFUIDirective) && this.value == ((ShowTCFUIDirective) obj).value;
    }

    public final ToggleableDirectiveValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // com.nytimes.android.subauth.core.purr.model.UserPrivacyDirective
    public PurrPrivacyDirective toPublic$subauth_core_release() {
        return new PurrTCFUIDirective(this.value);
    }

    public String toString() {
        return "ShowTCFUIDirective(value=" + this.value + ")";
    }
}
