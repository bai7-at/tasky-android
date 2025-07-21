package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.PurrShowCaliforniaNoticesUiDirective;
import com.nytimes.android.subauth.core.purr.directive.ToggleableDirectiveValue;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ShowCaliforniaNoticesUiDirective extends UserPrivacyDirective {
    private final ToggleableDirectiveValue value;

    public ShowCaliforniaNoticesUiDirective(ToggleableDirectiveValue toggleableDirectiveValue) {
        zq3.h(toggleableDirectiveValue, "value");
        this.value = toggleableDirectiveValue;
    }

    public static /* synthetic */ ShowCaliforniaNoticesUiDirective copy$default(ShowCaliforniaNoticesUiDirective showCaliforniaNoticesUiDirective, ToggleableDirectiveValue toggleableDirectiveValue, int i, Object obj) {
        if ((i & 1) != 0) {
            toggleableDirectiveValue = showCaliforniaNoticesUiDirective.value;
        }
        return showCaliforniaNoticesUiDirective.copy(toggleableDirectiveValue);
    }

    public final ToggleableDirectiveValue component1() {
        return this.value;
    }

    public final ShowCaliforniaNoticesUiDirective copy(ToggleableDirectiveValue toggleableDirectiveValue) {
        zq3.h(toggleableDirectiveValue, "value");
        return new ShowCaliforniaNoticesUiDirective(toggleableDirectiveValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShowCaliforniaNoticesUiDirective) && this.value == ((ShowCaliforniaNoticesUiDirective) obj).value;
    }

    public final ToggleableDirectiveValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "ShowCaliforniaNoticesUiDirective(value=" + this.value + ")";
    }

    @Override // com.nytimes.android.subauth.core.purr.model.UserPrivacyDirective
    public PurrShowCaliforniaNoticesUiDirective toPublic$subauth_core_release() {
        return new PurrShowCaliforniaNoticesUiDirective(this.value);
    }
}
