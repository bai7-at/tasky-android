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
public final class NYTEntitlementJsonAdapter extends JsonAdapter<NYTEntitlement> {
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public NYTEntitlementJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public NYTEntitlement fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (str = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (str != null) {
            return new NYTEntitlement(str);
        }
        JsonDataException o = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NYTEntitlement nYTEntitlement) {
        zq3.h(hVar, "writer");
        if (nYTEntitlement == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.stringAdapter.mo197toJson(hVar, nYTEntitlement.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NYTEntitlement");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
