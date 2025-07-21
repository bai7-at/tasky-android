package com.nytimes.android.subauth.core.purr.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PreferenceUpdateResultJsonAdapter extends JsonAdapter<PreferenceUpdateResult> {
    private final JsonAdapter<PrivacyDirectives> nullablePrivacyDirectivesAdapter;
    private final JsonAdapter<UserPrivacyPreference> nullableUserPrivacyPreferenceAdapter;
    private final JsonReader.b options;

    public PreferenceUpdateResultJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("privacyDirectives", "preferences");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<PrivacyDirectives> f = iVar.f(PrivacyDirectives.class, b0.e(), "privacyDirectives");
        zq3.g(f, "adapter(...)");
        this.nullablePrivacyDirectivesAdapter = f;
        JsonAdapter<UserPrivacyPreference> f2 = iVar.f(UserPrivacyPreference.class, b0.e(), "preferences");
        zq3.g(f2, "adapter(...)");
        this.nullableUserPrivacyPreferenceAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PreferenceUpdateResult");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public PreferenceUpdateResult fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        PrivacyDirectives privacyDirectives = null;
        UserPrivacyPreference userPrivacyPreference = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                privacyDirectives = (PrivacyDirectives) this.nullablePrivacyDirectivesAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                userPrivacyPreference = (UserPrivacyPreference) this.nullableUserPrivacyPreferenceAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new PreferenceUpdateResult(privacyDirectives, userPrivacyPreference);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PreferenceUpdateResult preferenceUpdateResult) {
        zq3.h(hVar, "writer");
        if (preferenceUpdateResult == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("privacyDirectives");
        this.nullablePrivacyDirectivesAdapter.mo197toJson(hVar, preferenceUpdateResult.getPrivacyDirectives());
        hVar.C("preferences");
        this.nullableUserPrivacyPreferenceAdapter.mo197toJson(hVar, preferenceUpdateResult.getPreferences());
        hVar.l();
    }
}
