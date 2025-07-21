package com.nytimes.android.subauth.core.purchase.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class LinkResponseDataJsonAdapter extends JsonAdapter<LinkResponseData> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public LinkResponseDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("subscription_id");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "subscriptionId");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LinkResponseData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                z = true;
            }
        }
        jsonReader.h();
        LinkResponseData linkResponseData = new LinkResponseData();
        if (z) {
            linkResponseData.b(str);
        }
        return linkResponseData;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LinkResponseData linkResponseData) {
        zq3.h(hVar, "writer");
        if (linkResponseData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("subscription_id");
        this.nullableStringAdapter.mo197toJson(hVar, linkResponseData.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LinkResponseData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
