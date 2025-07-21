package com.nytimes.android.subauth.core.purr.model;

import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class UserPrivacyPreferenceJsonAdapter extends JsonAdapter<UserPrivacyPreference> {
    private final JsonReader.b options;
    private final JsonAdapter<UserPrivacyPreferenceKind> userPrivacyPreferenceKindAdapter;
    private final JsonAdapter<UserPrivacyPreferenceName> userPrivacyPreferenceNameAdapter;
    private final JsonAdapter<UserPrivacyPreferenceValue> userPrivacyPreferenceValueAdapter;

    public UserPrivacyPreferenceJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(AuthenticationTokenClaims.JSON_KEY_NAME, "value", "kind");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<UserPrivacyPreferenceName> f = iVar.f(UserPrivacyPreferenceName.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "adapter(...)");
        this.userPrivacyPreferenceNameAdapter = f;
        JsonAdapter<UserPrivacyPreferenceValue> f2 = iVar.f(UserPrivacyPreferenceValue.class, b0.e(), "value");
        zq3.g(f2, "adapter(...)");
        this.userPrivacyPreferenceValueAdapter = f2;
        JsonAdapter<UserPrivacyPreferenceKind> f3 = iVar.f(UserPrivacyPreferenceKind.class, b0.e(), "kind");
        zq3.g(f3, "adapter(...)");
        this.userPrivacyPreferenceKindAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("UserPrivacyPreference");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UserPrivacyPreference fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        UserPrivacyPreferenceName userPrivacyPreferenceName = null;
        UserPrivacyPreferenceValue userPrivacyPreferenceValue = null;
        UserPrivacyPreferenceKind userPrivacyPreferenceKind = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                userPrivacyPreferenceName = (UserPrivacyPreferenceName) this.userPrivacyPreferenceNameAdapter.fromJson(jsonReader);
                if (userPrivacyPreferenceName == null) {
                    JsonDataException x = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                userPrivacyPreferenceValue = (UserPrivacyPreferenceValue) this.userPrivacyPreferenceValueAdapter.fromJson(jsonReader);
                if (userPrivacyPreferenceValue == null) {
                    JsonDataException x2 = c29.x("value__", "value", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2 && (userPrivacyPreferenceKind = (UserPrivacyPreferenceKind) this.userPrivacyPreferenceKindAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("kind", "kind", jsonReader);
                zq3.g(x3, "unexpectedNull(...)");
                throw x3;
            }
        }
        jsonReader.h();
        if (userPrivacyPreferenceName == null) {
            JsonDataException o = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (userPrivacyPreferenceValue == null) {
            JsonDataException o2 = c29.o("value__", "value", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        if (userPrivacyPreferenceKind != null) {
            return new UserPrivacyPreference(userPrivacyPreferenceName, userPrivacyPreferenceValue, userPrivacyPreferenceKind);
        }
        JsonDataException o3 = c29.o("kind", "kind", jsonReader);
        zq3.g(o3, "missingProperty(...)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, UserPrivacyPreference userPrivacyPreference) {
        zq3.h(hVar, "writer");
        if (userPrivacyPreference == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.userPrivacyPreferenceNameAdapter.mo197toJson(hVar, userPrivacyPreference.getName());
        hVar.C("value");
        this.userPrivacyPreferenceValueAdapter.mo197toJson(hVar, userPrivacyPreference.getValue());
        hVar.C("kind");
        this.userPrivacyPreferenceKindAdapter.mo197toJson(hVar, userPrivacyPreference.getKind());
        hVar.l();
    }
}
