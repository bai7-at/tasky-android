package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.AdConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class AdConfigurationDirectiveV3 extends UserPrivacyDirective {
    private final AdConfiguration value;

    public AdConfigurationDirectiveV3(AdConfiguration adConfiguration) {
        zq3.h(adConfiguration, "value");
        this.value = adConfiguration;
    }

    public static /* synthetic */ AdConfigurationDirectiveV3 copy$default(AdConfigurationDirectiveV3 adConfigurationDirectiveV3, AdConfiguration adConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            adConfiguration = adConfigurationDirectiveV3.value;
        }
        return adConfigurationDirectiveV3.copy(adConfiguration);
    }

    public final AdConfiguration component1() {
        return this.value;
    }

    public final AdConfigurationDirectiveV3 copy(AdConfiguration adConfiguration) {
        zq3.h(adConfiguration, "value");
        return new AdConfigurationDirectiveV3(adConfiguration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdConfigurationDirectiveV3) && this.value == ((AdConfigurationDirectiveV3) obj).value;
    }

    public final AdConfiguration getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "AdConfigurationDirectiveV3(value=" + this.value + ")";
    }

    @Override // com.nytimes.android.subauth.core.purr.model.UserPrivacyDirective
    public PurrAdvertisingConfigurationDirectiveV3 toPublic$subauth_core_release() {
        return new PurrAdvertisingConfigurationDirectiveV3(this.value);
    }
}
