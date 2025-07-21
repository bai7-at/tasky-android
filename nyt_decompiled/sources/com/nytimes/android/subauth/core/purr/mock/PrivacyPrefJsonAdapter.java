package com.nytimes.android.subauth.core.purr.mock;

import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceValue;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PrivacyPrefJsonAdapter extends JsonAdapter<PrivacyPref> {
    private final JsonAdapter<UserPrivacyPreferenceValue> nullableUserPrivacyPreferenceValueAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public PrivacyPrefJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("action", "valueLocalToAgent", "valueStoredByNyt");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "action");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<UserPrivacyPreferenceValue> f2 = iVar.f(UserPrivacyPreferenceValue.class, b0.e(), "valueLocalToAgent");
        zq3.g(f2, "adapter(...)");
        this.nullableUserPrivacyPreferenceValueAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PrivacyPref fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        UserPrivacyPreferenceValue userPrivacyPreferenceValue = null;
        UserPrivacyPreferenceValue userPrivacyPreferenceValue2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("action", "action", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                userPrivacyPreferenceValue = (UserPrivacyPreferenceValue) this.nullableUserPrivacyPreferenceValueAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                userPrivacyPreferenceValue2 = (UserPrivacyPreferenceValue) this.nullableUserPrivacyPreferenceValueAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (str != null) {
            return new PrivacyPref(str, userPrivacyPreferenceValue, userPrivacyPreferenceValue2);
        }
        JsonDataException o = c29.o("action", "action", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PrivacyPref privacyPref) {
        zq3.h(hVar, "writer");
        if (privacyPref == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("action");
        this.stringAdapter.mo197toJson(hVar, privacyPref.a());
        hVar.C("valueLocalToAgent");
        this.nullableUserPrivacyPreferenceValueAdapter.mo197toJson(hVar, privacyPref.b());
        hVar.C("valueStoredByNyt");
        this.nullableUserPrivacyPreferenceValueAdapter.mo197toJson(hVar, privacyPref.c());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PrivacyPref");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
