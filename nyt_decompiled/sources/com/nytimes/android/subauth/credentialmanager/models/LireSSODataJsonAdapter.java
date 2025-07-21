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
public final class LireSSODataJsonAdapter extends JsonAdapter<LireSSOData> {
    private final JsonAdapter<OAuthCredentials> oAuthCredentialsAdapter;
    private final JsonReader.b options;

    public LireSSODataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("oauthCredentials");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<OAuthCredentials> f = iVar.f(OAuthCredentials.class, b0.e(), "oAuthCredentials");
        zq3.g(f, "adapter(...)");
        this.oAuthCredentialsAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LireSSOData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        OAuthCredentials oAuthCredentials = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (oAuthCredentials = (OAuthCredentials) this.oAuthCredentialsAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("oAuthCredentials", "oauthCredentials", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (oAuthCredentials != null) {
            return new LireSSOData(oAuthCredentials);
        }
        JsonDataException o = c29.o("oAuthCredentials", "oauthCredentials", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LireSSOData lireSSOData) {
        zq3.h(hVar, "writer");
        if (lireSSOData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("oauthCredentials");
        this.oAuthCredentialsAdapter.mo197toJson(hVar, lireSSOData.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LireSSOData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
