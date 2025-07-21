package com.nytimes.android.growthui.regibundle.models.remoteconfig;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class RegistrationData {
    private final String a;
    private final String b;
    private final String c;

    public RegistrationData(String str, String str2, String str3) {
        zq3.h(str, "header");
        zq3.h(str2, "text");
        zq3.h(str3, "buttonText");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegistrationData)) {
            return false;
        }
        RegistrationData registrationData = (RegistrationData) obj;
        return zq3.c(this.a, registrationData.a) && zq3.c(this.b, registrationData.b) && zq3.c(this.c, registrationData.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "RegistrationData(header=" + this.a + ", text=" + this.b + ", buttonText=" + this.c + ")";
    }

    public /* synthetic */ RegistrationData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
