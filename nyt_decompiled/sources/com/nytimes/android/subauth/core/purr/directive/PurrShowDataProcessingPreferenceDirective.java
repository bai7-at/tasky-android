package com.nytimes.android.subauth.core.purr.directive;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrShowDataProcessingPreferenceDirective extends PurrPrivacyDirective {
    private final DataProcessingPreferenceDirectiveValue value;

    /* JADX WARN: Multi-variable type inference failed */
    public PurrShowDataProcessingPreferenceDirective() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PurrShowDataProcessingPreferenceDirective copy$default(PurrShowDataProcessingPreferenceDirective purrShowDataProcessingPreferenceDirective, DataProcessingPreferenceDirectiveValue dataProcessingPreferenceDirectiveValue, int i, Object obj) {
        if ((i & 1) != 0) {
            dataProcessingPreferenceDirectiveValue = purrShowDataProcessingPreferenceDirective.value;
        }
        return purrShowDataProcessingPreferenceDirective.copy(dataProcessingPreferenceDirectiveValue);
    }

    public final DataProcessingPreferenceDirectiveValue component1() {
        return this.value;
    }

    public final PurrShowDataProcessingPreferenceDirective copy(DataProcessingPreferenceDirectiveValue dataProcessingPreferenceDirectiveValue) {
        zq3.h(dataProcessingPreferenceDirectiveValue, "value");
        return new PurrShowDataProcessingPreferenceDirective(dataProcessingPreferenceDirectiveValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurrShowDataProcessingPreferenceDirective) && this.value == ((PurrShowDataProcessingPreferenceDirective) obj).value;
    }

    public final DataProcessingPreferenceDirectiveValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "PurrShowDataProcessingPreferenceDirective(value=" + this.value + ")";
    }

    public /* synthetic */ PurrShowDataProcessingPreferenceDirective(DataProcessingPreferenceDirectiveValue dataProcessingPreferenceDirectiveValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DataProcessingPreferenceDirectiveValue.HIDE : dataProcessingPreferenceDirectiveValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurrShowDataProcessingPreferenceDirective(DataProcessingPreferenceDirectiveValue dataProcessingPreferenceDirectiveValue) {
        super(null);
        zq3.h(dataProcessingPreferenceDirectiveValue, "value");
        this.value = dataProcessingPreferenceDirectiveValue;
    }
}
