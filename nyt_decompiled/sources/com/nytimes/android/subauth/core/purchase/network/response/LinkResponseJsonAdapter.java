package com.nytimes.android.subauth.core.purchase.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class LinkResponseJsonAdapter extends JsonAdapter<LinkResponse> {
    private final JsonAdapter<LinkResponseData> nullableLinkResponseDataAdapter;
    private final JsonAdapter<LinkResponseMeta> nullableLinkResponseMetaAdapter;
    private final JsonReader.b options;

    public LinkResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("data", "meta");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<LinkResponseData> f = iVar.f(LinkResponseData.class, b0.e(), "data");
        zq3.g(f, "adapter(...)");
        this.nullableLinkResponseDataAdapter = f;
        JsonAdapter<LinkResponseMeta> f2 = iVar.f(LinkResponseMeta.class, b0.e(), "meta");
        zq3.g(f2, "adapter(...)");
        this.nullableLinkResponseMetaAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LinkResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        LinkResponseData linkResponseData = null;
        LinkResponseMeta linkResponseMeta = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                linkResponseData = (LinkResponseData) this.nullableLinkResponseDataAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                linkResponseMeta = (LinkResponseMeta) this.nullableLinkResponseMetaAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new LinkResponse(linkResponseData, linkResponseMeta);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LinkResponse linkResponse) {
        zq3.h(hVar, "writer");
        if (linkResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("data");
        this.nullableLinkResponseDataAdapter.mo197toJson(hVar, linkResponse.a());
        hVar.C("meta");
        this.nullableLinkResponseMetaAdapter.mo197toJson(hVar, linkResponse.c());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LinkResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
