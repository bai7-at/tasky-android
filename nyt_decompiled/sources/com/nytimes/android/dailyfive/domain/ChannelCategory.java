package com.nytimes.android.dailyfive.domain;

import com.facebook.AuthenticationTokenClaims;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ChannelCategory {
    private final String a;
    private final List b;

    public ChannelCategory(String str, List list) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(list, "channels");
        this.a = str;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelCategory)) {
            return false;
        }
        ChannelCategory channelCategory = (ChannelCategory) obj;
        return zq3.c(this.a, channelCategory.a) && zq3.c(this.b, channelCategory.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "ChannelCategory(name=" + this.a + ", channels=" + this.b + ")";
    }
}
