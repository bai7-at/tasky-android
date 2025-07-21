package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.AdConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV2;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class AdConfigurationDirectiveV2 extends UserPrivacyDirective {
    private final AdConfiguration value;

    public AdConfigurationDirectiveV2(AdConfiguration adConfiguration) {
        zq3.h(adConfiguration, "value");
        this.value = adConfiguration;
    }

    public static /* synthetic */ AdConfigurationDirectiveV2 copy$default(AdConfigurationDirectiveV2 adConfigurationDirectiveV2, AdConfiguration adConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            adConfiguration = adConfigurationDirectiveV2.value;
        }
        return adConfigurationDirectiveV2.copy(adConfiguration);
    }

    public final AdConfiguration component1() {
        return this.value;
    }

    public final AdConfigurationDirectiveV2 copy(AdConfiguration adConfiguration) {
        zq3.h(adConfiguration, "value");
        return new AdConfigurationDirectiveV2(adConfiguration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdConfigurationDirectiveV2) && this.value == ((AdConfigurationDirectiveV2) obj).value;
    }

    public final AdConfiguration getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "AdConfigurationDirectiveV2(value=" + this.value + ")";
    }

    @Override // com.nytimes.android.subauth.core.purr.model.UserPrivacyDirective
    public PurrAdvertisingConfigurationDirectiveV2 toPublic$subauth_core_release() {
        return new PurrAdvertisingConfigurationDirectiveV2(this.value);
    }
}
