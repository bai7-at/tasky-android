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
public final class OAuthCredentialsJsonAdapter extends JsonAdapter<OAuthCredentials> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public OAuthCredentialsJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("authUri", "clientId", "responseType", "scopes");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "authUri");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "clientId");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public OAuthCredentials fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException x = c29.x("clientId", "clientId", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 3) {
                str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (str2 != null) {
            return new OAuthCredentials(str, str2, str3, str4);
        }
        JsonDataException o = c29.o("clientId", "clientId", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, OAuthCredentials oAuthCredentials) {
        zq3.h(hVar, "writer");
        if (oAuthCredentials == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("authUri");
        this.nullableStringAdapter.mo197toJson(hVar, oAuthCredentials.a());
        hVar.C("clientId");
        this.stringAdapter.mo197toJson(hVar, oAuthCredentials.b());
        hVar.C("responseType");
        this.nullableStringAdapter.mo197toJson(hVar, oAuthCredentials.c());
        hVar.C("scopes");
        this.nullableStringAdapter.mo197toJson(hVar, oAuthCredentials.d());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("OAuthCredentials");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
