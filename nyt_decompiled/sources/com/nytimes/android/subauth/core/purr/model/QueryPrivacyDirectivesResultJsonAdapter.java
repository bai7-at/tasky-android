package com.nytimes.android.subauth.core.purr.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class QueryPrivacyDirectivesResultJsonAdapter extends JsonAdapter<QueryPrivacyDirectivesResult> {
    private final JsonReader.b options;
    private final JsonAdapter<PrivacyDirectives> privacyDirectivesAdapter;
    private final JsonAdapter<TcfPreferenceData> tcfPreferenceDataAdapter;

    public QueryPrivacyDirectivesResultJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("privacyDirectives", "tcfPreferenceData");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<PrivacyDirectives> f = iVar.f(PrivacyDirectives.class, b0.e(), "privacyDirectives");
        zq3.g(f, "adapter(...)");
        this.privacyDirectivesAdapter = f;
        JsonAdapter<TcfPreferenceData> f2 = iVar.f(TcfPreferenceData.class, b0.e(), "tcfPreferenceData");
        zq3.g(f2, "adapter(...)");
        this.tcfPreferenceDataAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("GeneratedJsonAdapter(");
        sb.append("QueryPrivacyDirectivesResult");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public QueryPrivacyDirectivesResult fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        PrivacyDirectives privacyDirectives = null;
        TcfPreferenceData tcfPreferenceData = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                privacyDirectives = (PrivacyDirectives) this.privacyDirectivesAdapter.fromJson(jsonReader);
                if (privacyDirectives == null) {
                    JsonDataException x = c29.x("privacyDirectives", "privacyDirectives", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (tcfPreferenceData = (TcfPreferenceData) this.tcfPreferenceDataAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("tcfPreferenceData", "tcfPreferenceData", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (privacyDirectives == null) {
            JsonDataException o = c29.o("privacyDirectives", "privacyDirectives", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (tcfPreferenceData != null) {
            return new QueryPrivacyDirectivesResult(privacyDirectives, tcfPreferenceData);
        }
        JsonDataException o2 = c29.o("tcfPreferenceData", "tcfPreferenceData", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, QueryPrivacyDirectivesResult queryPrivacyDirectivesResult) {
        zq3.h(hVar, "writer");
        if (queryPrivacyDirectivesResult == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("privacyDirectives");
        this.privacyDirectivesAdapter.mo197toJson(hVar, queryPrivacyDirectivesResult.getPrivacyDirectives());
        hVar.C("tcfPreferenceData");
        this.tcfPreferenceDataAdapter.mo197toJson(hVar, queryPrivacyDirectivesResult.getTcfPreferenceData());
        hVar.l();
    }
}
