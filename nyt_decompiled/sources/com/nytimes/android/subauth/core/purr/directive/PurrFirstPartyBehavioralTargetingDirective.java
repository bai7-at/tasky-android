package com.nytimes.android.subauth.core.purr.directive;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrFirstPartyBehavioralTargetingDirective extends PurrPrivacyDirective {
    private final FirstPartyDirectiveValue value;

    /* JADX WARN: Multi-variable type inference failed */
    public PurrFirstPartyBehavioralTargetingDirective() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PurrFirstPartyBehavioralTargetingDirective copy$default(PurrFirstPartyBehavioralTargetingDirective purrFirstPartyBehavioralTargetingDirective, FirstPartyDirectiveValue firstPartyDirectiveValue, int i, Object obj) {
        if ((i & 1) != 0) {
            firstPartyDirectiveValue = purrFirstPartyBehavioralTargetingDirective.value;
        }
        return purrFirstPartyBehavioralTargetingDirective.copy(firstPartyDirectiveValue);
    }

    public final FirstPartyDirectiveValue component1() {
        return this.value;
    }

    public final PurrFirstPartyBehavioralTargetingDirective copy(FirstPartyDirectiveValue firstPartyDirectiveValue) {
        zq3.h(firstPartyDirectiveValue, "value");
        return new PurrFirstPartyBehavioralTargetingDirective(firstPartyDirectiveValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurrFirstPartyBehavioralTargetingDirective) && this.value == ((PurrFirstPartyBehavioralTargetingDirective) obj).value;
    }

    public final FirstPartyDirectiveValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "PurrFirstPartyBehavioralTargetingDirective(value=" + this.value + ")";
    }

    public /* synthetic */ PurrFirstPartyBehavioralTargetingDirective(FirstPartyDirectiveValue firstPartyDirectiveValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FirstPartyDirectiveValue.ALLOWED : firstPartyDirectiveValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurrFirstPartyBehavioralTargetingDirective(FirstPartyDirectiveValue firstPartyDirectiveValue) {
        super(null);
        zq3.h(firstPartyDirectiveValue, "value");
        this.value = firstPartyDirectiveValue;
    }
}
