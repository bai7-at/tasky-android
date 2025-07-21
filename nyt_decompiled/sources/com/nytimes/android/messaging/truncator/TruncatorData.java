package com.nytimes.android.messaging.truncator;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class TruncatorData {
    private final boolean a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final boolean g;
    private final int h;

    public TruncatorData(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, int i) {
        zq3.h(str, "title");
        zq3.h(str2, "details");
        zq3.h(str3, "primaryButtonText");
        zq3.h(str4, "primaryButtonLink");
        zq3.h(str5, "secondaryButtonText");
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z2;
        this.h = i;
    }

    public final String a() {
        return this.c;
    }

    public final int b() {
        return this.h;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TruncatorData)) {
            return false;
        }
        TruncatorData truncatorData = (TruncatorData) obj;
        return this.a == truncatorData.a && zq3.c(this.b, truncatorData.b) && zq3.c(this.c, truncatorData.c) && zq3.c(this.d, truncatorData.d) && zq3.c(this.e, truncatorData.e) && zq3.c(this.f, truncatorData.f) && this.g == truncatorData.g && this.h == truncatorData.h;
    }

    public final String f() {
        return this.b;
    }

    public final boolean g() {
        return this.a;
    }

    public final boolean h() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Boolean.hashCode(this.g)) * 31) + Integer.hashCode(this.h);
    }

    public String toString() {
        return "TruncatorData(isActive=" + this.a + ", title=" + this.b + ", details=" + this.c + ", primaryButtonText=" + this.d + ", primaryButtonLink=" + this.e + ", secondaryButtonText=" + this.f + ", isDismissible=" + this.g + ", displayIntervalInHours=" + this.h + ")";
    }

    public /* synthetic */ TruncatorData(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? "We're unable to process the payment for your subscription." : str, (i2 & 4) != 0 ? "Please update your information so that your New York Times subscription won't be canceled." : str2, (i2 & 8) != 0 ? "Update payment information" : str3, (i2 & 16) != 0 ? "https://myaccount.nytimes.com/get-started/manage-billing" : str4, (i2 & 32) != 0 ? "Not now" : str5, (i2 & 64) != 0 ? true : z2, (i2 & 128) != 0 ? 24 : i);
    }
}
