package com.nytimes.android.api.config.model;

import com.facebook.AuthenticationTokenClaims;
import defpackage.zq3;

/* loaded from: classes3.dex */
public final class AbTest {
    private final String name;
    private final String variant;

    public AbTest(String str, String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "variant");
        this.name = str;
        this.variant = str2;
    }

    public static /* synthetic */ AbTest copy$default(AbTest abTest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = abTest.name;
        }
        if ((i & 2) != 0) {
            str2 = abTest.variant;
        }
        return abTest.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.variant;
    }

    public final AbTest copy(String str, String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "variant");
        return new AbTest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbTest)) {
            return false;
        }
        AbTest abTest = (AbTest) obj;
        return zq3.c(this.name, abTest.name) && zq3.c(this.variant, abTest.variant);
    }

    public final String getName() {
        return this.name;
    }

    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.variant.hashCode();
    }

    public String toString() {
        return "AbTest(name=" + this.name + ", variant=" + this.variant + ")";
    }
}
