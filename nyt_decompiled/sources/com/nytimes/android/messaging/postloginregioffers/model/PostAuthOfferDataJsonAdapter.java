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
public final class PostAuthOfferDataJsonAdapter extends JsonAdapter<PostAuthOfferData> {
    public static final int $stable = 8;
    private final JsonReader.b options;
    private final JsonAdapter<PostRegiLoginOfferConfig> postRegiLoginOfferConfigAdapter;

    public PostAuthOfferDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("all_access");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<PostRegiLoginOfferConfig> f = iVar.f(PostRegiLoginOfferConfig.class, b0.e(), "allAccess");
        zq3.g(f, "adapter(...)");
        this.postRegiLoginOfferConfigAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PostAuthOfferData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        PostRegiLoginOfferConfig postRegiLoginOfferConfig = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (postRegiLoginOfferConfig = (PostRegiLoginOfferConfig) this.postRegiLoginOfferConfigAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("allAccess", "all_access", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (postRegiLoginOfferConfig != null) {
            return new PostAuthOfferData(postRegiLoginOfferConfig);
        }
        JsonDataException o = c29.o("allAccess", "all_access", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PostAuthOfferData postAuthOfferData) {
        zq3.h(hVar, "writer");
        if (postAuthOfferData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("all_access");
        this.postRegiLoginOfferConfigAdapter.mo197toJson(hVar, postAuthOfferData.getAllAccess());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PostAuthOfferData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
