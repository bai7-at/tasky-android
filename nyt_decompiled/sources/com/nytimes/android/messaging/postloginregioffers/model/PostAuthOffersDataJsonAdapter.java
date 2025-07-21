package com.nytimes.android.messaging.postloginregioffers.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PostAuthOffersDataJsonAdapter extends JsonAdapter<PostAuthOffersData> {
    public static final int $stable = 8;
    private final JsonReader.b options;
    private final JsonAdapter<PostAuthOfferData> postAuthOfferDataAdapter;

    public PostAuthOffersDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("plo", "pro");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<PostAuthOfferData> f = iVar.f(PostAuthOfferData.class, b0.e(), "plo");
        zq3.g(f, "adapter(...)");
        this.postAuthOfferDataAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PostAuthOffersData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        PostAuthOfferData postAuthOfferData = null;
        PostAuthOfferData postAuthOfferData2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                postAuthOfferData = (PostAuthOfferData) this.postAuthOfferDataAdapter.fromJson(jsonReader);
                if (postAuthOfferData == null) {
                    JsonDataException x = c29.x("plo", "plo", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (postAuthOfferData2 = (PostAuthOfferData) this.postAuthOfferDataAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("pro", "pro", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (postAuthOfferData == null) {
            JsonDataException o = c29.o("plo", "plo", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (postAuthOfferData2 != null) {
            return new PostAuthOffersData(postAuthOfferData, postAuthOfferData2);
        }
        JsonDataException o2 = c29.o("pro", "pro", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PostAuthOffersData postAuthOffersData) {
        zq3.h(hVar, "writer");
        if (postAuthOffersData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("plo");
        this.postAuthOfferDataAdapter.mo197toJson(hVar, postAuthOffersData.getPlo());
        hVar.C("pro");
        this.postAuthOfferDataAdapter.mo197toJson(hVar, postAuthOffersData.getPro());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PostAuthOffersData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
