package com.nytimes.android.dailyfive.domain;

import com.facebook.AuthenticationTokenClaims;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class DailyFiveChannel {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Image e;

    public DailyFiveChannel(String str, String str2, String str3, String str4, Image image) {
        zq3.h(str, "uri");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = image;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final Image c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyFiveChannel)) {
            return false;
        }
        DailyFiveChannel dailyFiveChannel = (DailyFiveChannel) obj;
        return zq3.c(this.a, dailyFiveChannel.a) && zq3.c(this.b, dailyFiveChannel.b) && zq3.c(this.c, dailyFiveChannel.c) && zq3.c(this.d, dailyFiveChannel.d) && zq3.c(this.e, dailyFiveChannel.e);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.e;
        return hashCode3 + (image != null ? image.hashCode() : 0);
    }

    public String toString() {
        return "DailyFiveChannel(uri=" + this.a + ", name=" + this.b + ", description=" + this.c + ", shortDescription=" + this.d + ", promoMedia=" + this.e + ")";
    }
}
