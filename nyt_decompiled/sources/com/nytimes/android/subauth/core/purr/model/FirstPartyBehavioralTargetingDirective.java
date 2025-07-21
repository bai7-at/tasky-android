package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.FirstPartyDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.PurrFirstPartyBehavioralTargetingDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyDirective;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class FirstPartyBehavioralTargetingDirective extends UserPrivacyDirective {
    private final FirstPartyDirectiveValue value;

    public FirstPartyBehavioralTargetingDirective(FirstPartyDirectiveValue firstPartyDirectiveValue) {
        zq3.h(firstPartyDirectiveValue, "value");
        this.value = firstPartyDirectiveValue;
    }

    public static /* synthetic */ FirstPartyBehavioralTargetingDirective copy$default(FirstPartyBehavioralTargetingDirective firstPartyBehavioralTargetingDirective, FirstPartyDirectiveValue firstPartyDirectiveValue, int i, Object obj) {
        if ((i & 1) != 0) {
            firstPartyDirectiveValue = firstPartyBehavioralTargetingDirective.value;
        }
        return firstPartyBehavioralTargetingDirective.copy(firstPartyDirectiveValue);
    }

    public final FirstPartyDirectiveValue component1() {
        return this.value;
    }

    public final FirstPartyBehavioralTargetingDirective copy(FirstPartyDirectiveValue firstPartyDirectiveValue) {
        zq3.h(firstPartyDirectiveValue, "value");
        return new FirstPartyBehavioralTargetingDirective(firstPartyDirectiveValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirstPartyBehavioralTargetingDirective) && this.value == ((FirstPartyBehavioralTargetingDirective) obj).value;
    }

    public final FirstPartyDirectiveValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // com.nytimes.android.subauth.core.purr.model.UserPrivacyDirective
    public PurrPrivacyDirective toPublic$subauth_core_release() {
        return new PurrFirstPartyBehavioralTargetingDirective(this.value);
    }

    public String toString() {
        return "FirstPartyBehavioralTargetingDirective(value=" + this.value + ")";
    }
}
