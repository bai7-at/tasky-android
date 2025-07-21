package com.nytimes.android.subauth.core.purr.directive;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrShowDataProcessingConsentDirective extends PurrPrivacyDirective {
    private final ToggleableDirectiveValue value;

    /* JADX WARN: Multi-variable type inference failed */
    public PurrShowDataProcessingConsentDirective() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PurrShowDataProcessingConsentDirective copy$default(PurrShowDataProcessingConsentDirective purrShowDataProcessingConsentDirective, ToggleableDirectiveValue toggleableDirectiveValue, int i, Object obj) {
        if ((i & 1) != 0) {
            toggleableDirectiveValue = purrShowDataProcessingConsentDirective.value;
        }
        return purrShowDataProcessingConsentDirective.copy(toggleableDirectiveValue);
    }

    public final ToggleableDirectiveValue component1() {
        return this.value;
    }

    public final PurrShowDataProcessingConsentDirective copy(ToggleableDirectiveValue toggleableDirectiveValue) {
        zq3.h(toggleableDirectiveValue, "value");
        return new PurrShowDataProcessingConsentDirective(toggleableDirectiveValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurrShowDataProcessingConsentDirective) && this.value == ((PurrShowDataProcessingConsentDirective) obj).value;
    }

    public final ToggleableDirectiveValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "PurrShowDataProcessingConsentDirective(value=" + this.value + ")";
    }

    public /* synthetic */ PurrShowDataProcessingConsentDirective(ToggleableDirectiveValue toggleableDirectiveValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ToggleableDirectiveValue.HIDE : toggleableDirectiveValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurrShowDataProcessingConsentDirective(ToggleableDirectiveValue toggleableDirectiveValue) {
        super(null);
        zq3.h(toggleableDirectiveValue, "value");
        this.value = toggleableDirectiveValue;
    }
}
