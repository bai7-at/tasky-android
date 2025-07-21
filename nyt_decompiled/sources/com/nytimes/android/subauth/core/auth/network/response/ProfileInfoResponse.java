package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ProfileInfoResponse {
    private final String a;
    private final String b;
    private final ProfileInfoResponseMeta c;

    public ProfileInfoResponse(String str, String str2, ProfileInfoResponseMeta profileInfoResponseMeta) {
        this.a = str;
        this.b = str2;
        this.c = profileInfoResponseMeta;
    }

    public final String a() {
        return this.b;
    }

    public final ProfileInfoResponseMeta b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileInfoResponse)) {
            return false;
        }
        ProfileInfoResponse profileInfoResponse = (ProfileInfoResponse) obj;
        return zq3.c(this.a, profileInfoResponse.a) && zq3.c(this.b, profileInfoResponse.b) && zq3.c(this.c, profileInfoResponse.c);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProfileInfoResponseMeta profileInfoResponseMeta = this.c;
        return hashCode2 + (profileInfoResponseMeta != null ? profileInfoResponseMeta.hashCode() : 0);
    }

    public String toString() {
        return "ProfileInfoResponse(sub=" + this.a + ", email=" + this.b + ", meta=" + this.c + ")";
    }
}
