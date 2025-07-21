package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.DataProcessingPreferenceDirectiveValue;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class ShowDataProcessingPreferenceUiPrivacyDirectiveJsonAdapter extends JsonAdapter<ShowDataProcessingPreferenceUiPrivacyDirective> {
    private final JsonAdapter<DataProcessingPreferenceDirectiveValue> dataProcessingPreferenceDirectiveValueAdapter;
    private final JsonReader.b options;

    public ShowDataProcessingPreferenceUiPrivacyDirectiveJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("value");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<DataProcessingPreferenceDirectiveValue> f = iVar.f(DataProcessingPreferenceDirectiveValue.class, b0.e(), "value");
        zq3.g(f, "adapter(...)");
        this.dataProcessingPreferenceDirectiveValueAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(68);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ShowDataProcessingPreferenceUiPrivacyDirective");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ShowDataProcessingPreferenceUiPrivacyDirective fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        DataProcessingPreferenceDirectiveValue dataProcessingPreferenceDirectiveValue = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (dataProcessingPreferenceDirectiveValue = (DataProcessingPreferenceDirectiveValue) this.dataProcessingPreferenceDirectiveValueAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("value__", "value", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (dataProcessingPreferenceDirectiveValue != null) {
            return new ShowDataProcessingPreferenceUiPrivacyDirective(dataProcessingPreferenceDirectiveValue);
        }
        JsonDataException o = c29.o("value__", "value", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ShowDataProcessingPreferenceUiPrivacyDirective showDataProcessingPreferenceUiPrivacyDirective) {
        zq3.h(hVar, "writer");
        if (showDataProcessingPreferenceUiPrivacyDirective == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("value");
        this.dataProcessingPreferenceDirectiveValueAdapter.mo197toJson(hVar, showDataProcessingPreferenceUiPrivacyDirective.getValue());
        hVar.l();
    }
}
