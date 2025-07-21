package com.nytimes.android.abra.models;

import com.nytimes.android.abra.utilities.ParamProviderKt;
import defpackage.du8;
import defpackage.ss2;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public final class AbraTest {
    private final AbraMetaData abraMetaData;
    private final String testName;
    private final String variant;

    public AbraTest(String str, String str2, AbraMetaData abraMetaData) {
        zq3.h(str, "testName");
        zq3.h(str2, "variant");
        zq3.h(abraMetaData, "abraMetaData");
        this.testName = str;
        this.variant = str2;
        this.abraMetaData = abraMetaData;
    }

    public static /* synthetic */ AbraTest copy$default(AbraTest abraTest, String str, String str2, AbraMetaData abraMetaData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = abraTest.testName;
        }
        if ((i & 2) != 0) {
            str2 = abraTest.variant;
        }
        if ((i & 4) != 0) {
            abraMetaData = abraTest.abraMetaData;
        }
        return abraTest.copy(str, str2, abraMetaData);
    }

    public static /* synthetic */ Map generateAbraEventMap$default(AbraTest abraTest, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ss2Var = new ss2() { // from class: com.nytimes.android.abra.models.AbraTest$generateAbraEventMap$1
                @Override // defpackage.ss2
                public final Boolean invoke(String str) {
                    zq3.h(str, "it");
                    return Boolean.FALSE;
                }
            };
        }
        return abraTest.generateAbraEventMap(ss2Var);
    }

    public final String component1() {
        return this.testName;
    }

    public final String component2() {
        return this.variant;
    }

    public final AbraMetaData component3() {
        return this.abraMetaData;
    }

    public final AbraTest copy(String str, String str2, AbraMetaData abraMetaData) {
        zq3.h(str, "testName");
        zq3.h(str2, "variant");
        zq3.h(abraMetaData, "abraMetaData");
        return new AbraTest(str, str2, abraMetaData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbraTest)) {
            return false;
        }
        AbraTest abraTest = (AbraTest) obj;
        return zq3.c(this.testName, abraTest.testName) && zq3.c(this.variant, abraTest.variant) && zq3.c(this.abraMetaData, abraTest.abraMetaData);
    }

    public final Map<String, Object> generateAbraEventMap(ss2 ss2Var) {
        zq3.h(ss2Var, "removeInputKeys");
        Pair a = du8.a("test", this.testName);
        Pair a2 = du8.a("variant", this.abraMetaData.getAbraVariant());
        Pair a3 = du8.a("config_ver", this.abraMetaData.getConfigVersion());
        Pair a4 = du8.a("variant_or_fallback", this.abraMetaData.getFallbackVariant());
        Pair a5 = du8.a("did_abra_error", Boolean.valueOf(this.abraMetaData.getDidAbraFail()));
        Pair a6 = du8.a(ParamProviderKt.PARAM_INTEGRATION, this.abraMetaData.getIntegration());
        Map<String, String> input = this.abraMetaData.getInput();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : input.entrySet()) {
            if (!((Boolean) ss2Var.invoke(entry.getKey())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return t.m(a, a2, a3, a4, a5, a6, du8.a("input", linkedHashMap));
    }

    public final AbraMetaData getAbraMetaData() {
        return this.abraMetaData;
    }

    public final String getTestName() {
        return this.testName;
    }

    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return (((this.testName.hashCode() * 31) + this.variant.hashCode()) * 31) + this.abraMetaData.hashCode();
    }

    public String toString() {
        return "AbraTest(testName=" + this.testName + ", variant=" + this.variant + ", abraMetaData=" + this.abraMetaData + ")";
    }
}
