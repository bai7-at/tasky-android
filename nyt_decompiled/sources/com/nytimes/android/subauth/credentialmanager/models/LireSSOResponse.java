package com.nytimes.android.subauth.credentialmanager.models;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LireSSOResponse {
    private final LireSSOData a;
    private final MetaData b;

    public LireSSOResponse(LireSSOData lireSSOData, MetaData metaData) {
        zq3.h(lireSSOData, "data");
        zq3.h(metaData, "meta");
        this.a = lireSSOData;
        this.b = metaData;
    }

    public final LireSSOData a() {
        return this.a;
    }

    public final MetaData b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LireSSOResponse)) {
            return false;
        }
        LireSSOResponse lireSSOResponse = (LireSSOResponse) obj;
        return zq3.c(this.a, lireSSOResponse.a) && zq3.c(this.b, lireSSOResponse.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "LireSSOResponse(data=" + this.a + ", meta=" + this.b + ")";
    }
}
