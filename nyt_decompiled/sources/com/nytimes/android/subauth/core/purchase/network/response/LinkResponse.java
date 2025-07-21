package com.nytimes.android.subauth.core.purchase.network.response;

import defpackage.et3;
import defpackage.zq3;
import kotlin.text.h;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LinkResponse {
    private final LinkResponseData a;
    private final LinkResponseMeta b;

    public LinkResponse(LinkResponseData linkResponseData, LinkResponseMeta linkResponseMeta) {
        this.a = linkResponseData;
        this.b = linkResponseMeta;
    }

    public final LinkResponseData a() {
        return this.a;
    }

    public final String b() {
        String b;
        LinkResponseMeta linkResponseMeta = this.b;
        return (linkResponseMeta == null || !((b = linkResponseMeta.b()) == null || h.d0(b))) ? "" : this.b.b();
    }

    public final LinkResponseMeta c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkResponse)) {
            return false;
        }
        LinkResponse linkResponse = (LinkResponse) obj;
        return zq3.c(this.a, linkResponse.a) && zq3.c(this.b, linkResponse.b);
    }

    public int hashCode() {
        LinkResponseData linkResponseData = this.a;
        int hashCode = (linkResponseData == null ? 0 : linkResponseData.hashCode()) * 31;
        LinkResponseMeta linkResponseMeta = this.b;
        return hashCode + (linkResponseMeta != null ? linkResponseMeta.hashCode() : 0);
    }

    public String toString() {
        return "LinkResponse(data=" + this.a + ", meta=" + this.b + ")";
    }
}
