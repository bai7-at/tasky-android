package com.nytimes.android.subauth.credentialmanager.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class LireSSOResponseJsonAdapter extends JsonAdapter<LireSSOResponse> {
    private final JsonAdapter<LireSSOData> lireSSODataAdapter;
    private final JsonAdapter<MetaData> metaDataAdapter;
    private final JsonReader.b options;

    public LireSSOResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("data", "meta");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<LireSSOData> f = iVar.f(LireSSOData.class, b0.e(), "data");
        zq3.g(f, "adapter(...)");
        this.lireSSODataAdapter = f;
        JsonAdapter<MetaData> f2 = iVar.f(MetaData.class, b0.e(), "meta");
        zq3.g(f2, "adapter(...)");
        this.metaDataAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LireSSOResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        LireSSOData lireSSOData = null;
        MetaData metaData = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                lireSSOData = (LireSSOData) this.lireSSODataAdapter.fromJson(jsonReader);
                if (lireSSOData == null) {
                    JsonDataException x = c29.x("data_", "data", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (metaData = (MetaData) this.metaDataAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("meta", "meta", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (lireSSOData == null) {
            JsonDataException o = c29.o("data_", "data", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (metaData != null) {
            return new LireSSOResponse(lireSSOData, metaData);
        }
        JsonDataException o2 = c29.o("meta", "meta", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LireSSOResponse lireSSOResponse) {
        zq3.h(hVar, "writer");
        if (lireSSOResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("data");
        this.lireSSODataAdapter.mo197toJson(hVar, lireSSOResponse.a());
        hVar.C("meta");
        this.metaDataAdapter.mo197toJson(hVar, lireSSOResponse.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LireSSOResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
