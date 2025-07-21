package com.nytimes.android.abra.models;

import com.nytimes.android.abra.utilities.ParamProviderKt;
import defpackage.zq3;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AbraMetaData {
    private final String abraVariant;
    private final String configVersion;
    private final boolean didAbraFail;
    private final String fallbackVariant;
    private final Map<String, String> input;
    private final String integration;

    public AbraMetaData(String str, String str2, String str3, boolean z, String str4, Map<String, String> map) {
        zq3.h(str2, "fallbackVariant");
        zq3.h(str3, "configVersion");
        zq3.h(str4, ParamProviderKt.PARAM_INTEGRATION);
        zq3.h(map, "input");
        this.abraVariant = str;
        this.fallbackVariant = str2;
        this.configVersion = str3;
        this.didAbraFail = z;
        this.integration = str4;
        this.input = map;
    }

    public static /* synthetic */ AbraMetaData copy$default(AbraMetaData abraMetaData, String str, String str2, String str3, boolean z, String str4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = abraMetaData.abraVariant;
        }
        if ((i & 2) != 0) {
            str2 = abraMetaData.fallbackVariant;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = abraMetaData.configVersion;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = abraMetaData.didAbraFail;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = abraMetaData.integration;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            map = abraMetaData.input;
        }
        return abraMetaData.copy(str, str5, str6, z2, str7, map);
    }

    public final String component1() {
        return this.abraVariant;
    }

    public final String component2() {
        return this.fallbackVariant;
    }

    public final String component3() {
        return this.configVersion;
    }

    public final boolean component4() {
        return this.didAbraFail;
    }

    public final String component5() {
        return this.integration;
    }

    public final Map<String, String> component6() {
        return this.input;
    }

    public final AbraMetaData copy(String str, String str2, String str3, boolean z, String str4, Map<String, String> map) {
        zq3.h(str2, "fallbackVariant");
        zq3.h(str3, "configVersion");
        zq3.h(str4, ParamProviderKt.PARAM_INTEGRATION);
        zq3.h(map, "input");
        return new AbraMetaData(str, str2, str3, z, str4, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbraMetaData)) {
            return false;
        }
        AbraMetaData abraMetaData = (AbraMetaData) obj;
        return zq3.c(this.abraVariant, abraMetaData.abraVariant) && zq3.c(this.fallbackVariant, abraMetaData.fallbackVariant) && zq3.c(this.configVersion, abraMetaData.configVersion) && this.didAbraFail == abraMetaData.didAbraFail && zq3.c(this.integration, abraMetaData.integration) && zq3.c(this.input, abraMetaData.input);
    }

    public final String getAbraVariant() {
        return this.abraVariant;
    }

    public final String getConfigVersion() {
        return this.configVersion;
    }

    public final boolean getDidAbraFail() {
        return this.didAbraFail;
    }

    public final String getFallbackVariant() {
        return this.fallbackVariant;
    }

    public final Map<String, String> getInput() {
        return this.input;
    }

    public final String getIntegration() {
        return this.integration;
    }

    public int hashCode() {
        String str = this.abraVariant;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.fallbackVariant.hashCode()) * 31) + this.configVersion.hashCode()) * 31) + Boolean.hashCode(this.didAbraFail)) * 31) + this.integration.hashCode()) * 31) + this.input.hashCode();
    }

    public String toString() {
        return "AbraMetaData(abraVariant=" + this.abraVariant + ", fallbackVariant=" + this.fallbackVariant + ", configVersion=" + this.configVersion + ", didAbraFail=" + this.didAbraFail + ", integration=" + this.integration + ", input=" + this.input + ")";
    }
}
