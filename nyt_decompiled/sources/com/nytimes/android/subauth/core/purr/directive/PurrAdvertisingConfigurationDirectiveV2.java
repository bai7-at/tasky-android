package com.nytimes.android.subauth.core.purr.directive;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrAdvertisingConfigurationDirectiveV2 extends PurrPrivacyDirective {
    private final AdConfiguration value;

    /* JADX WARN: Multi-variable type inference failed */
    public PurrAdvertisingConfigurationDirectiveV2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PurrAdvertisingConfigurationDirectiveV2 copy$default(PurrAdvertisingConfigurationDirectiveV2 purrAdvertisingConfigurationDirectiveV2, AdConfiguration adConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            adConfiguration = purrAdvertisingConfigurationDirectiveV2.value;
        }
        return purrAdvertisingConfigurationDirectiveV2.copy(adConfiguration);
    }

    public final AdConfiguration component1() {
        return this.value;
    }

    public final PurrAdvertisingConfigurationDirectiveV2 copy(AdConfiguration adConfiguration) {
        zq3.h(adConfiguration, "value");
        return new PurrAdvertisingConfigurationDirectiveV2(adConfiguration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurrAdvertisingConfigurationDirectiveV2) && this.value == ((PurrAdvertisingConfigurationDirectiveV2) obj).value;
    }

    public final AdConfiguration getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "PurrAdvertisingConfigurationDirectiveV2(value=" + this.value + ")";
    }

    public /* synthetic */ PurrAdvertisingConfigurationDirectiveV2(AdConfiguration adConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AdConfiguration.FULL : adConfiguration);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurrAdvertisingConfigurationDirectiveV2(AdConfiguration adConfiguration) {
        super(null);
        zq3.h(adConfiguration, "value");
        this.value = adConfiguration;
    }
}
