package com.nytimes.android.subauth.core.purr.directive;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrAdvertisingConfigurationDirectiveV3 extends PurrPrivacyDirective {
    private final AdConfiguration value;

    /* JADX WARN: Multi-variable type inference failed */
    public PurrAdvertisingConfigurationDirectiveV3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PurrAdvertisingConfigurationDirectiveV3 copy$default(PurrAdvertisingConfigurationDirectiveV3 purrAdvertisingConfigurationDirectiveV3, AdConfiguration adConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            adConfiguration = purrAdvertisingConfigurationDirectiveV3.value;
        }
        return purrAdvertisingConfigurationDirectiveV3.copy(adConfiguration);
    }

    public final AdConfiguration component1() {
        return this.value;
    }

    public final PurrAdvertisingConfigurationDirectiveV3 copy(AdConfiguration adConfiguration) {
        zq3.h(adConfiguration, "value");
        return new PurrAdvertisingConfigurationDirectiveV3(adConfiguration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurrAdvertisingConfigurationDirectiveV3) && this.value == ((PurrAdvertisingConfigurationDirectiveV3) obj).value;
    }

    public final AdConfiguration getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "PurrAdvertisingConfigurationDirectiveV3(value=" + this.value + ")";
    }

    public /* synthetic */ PurrAdvertisingConfigurationDirectiveV3(AdConfiguration adConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AdConfiguration.FULL : adConfiguration);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurrAdvertisingConfigurationDirectiveV3(AdConfiguration adConfiguration) {
        super(null);
        zq3.h(adConfiguration, "value");
        this.value = adConfiguration;
    }
}
