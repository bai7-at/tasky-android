package com.nytimes.android.ads.hybrid.bridge.model;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes2.dex */
public final class AdCommandResponse {
    private final boolean a;
    private final String b;

    public AdCommandResponse(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdCommandResponse)) {
            return false;
        }
        AdCommandResponse adCommandResponse = (AdCommandResponse) obj;
        return this.a == adCommandResponse.a && zq3.c(this.b, adCommandResponse.b);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AdCommandResponse(onSuccess=" + this.a + ", result=" + this.b + ")";
    }
}
