package com.nytimes.android.subauth.core.auth.network.response;

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
public final class NYTCodeCookieJsonAdapter extends JsonAdapter<NYTCodeCookie> {
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public NYTCodeCookieJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("value", AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "value");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public NYTCodeCookie fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("value__", "value", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (str2 = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("id", AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("value__", "value", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (str2 != null) {
            return new NYTCodeCookie(str, str2);
        }
        JsonDataException o2 = c29.o("id", AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NYTCodeCookie nYTCodeCookie) {
        zq3.h(hVar, "writer");
        if (nYTCodeCookie == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("value");
        this.stringAdapter.mo197toJson(hVar, nYTCodeCookie.b());
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.stringAdapter.mo197toJson(hVar, nYTCodeCookie.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NYTCodeCookie");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
