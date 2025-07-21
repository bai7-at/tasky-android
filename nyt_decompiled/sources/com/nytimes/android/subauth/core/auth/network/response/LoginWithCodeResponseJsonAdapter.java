package com.nytimes.android.subauth.core.auth.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class LoginWithCodeResponseJsonAdapter extends JsonAdapter<LoginWithCodeResponse> {
    private volatile Constructor<LoginWithCodeResponse> constructorRef;
    private final JsonAdapter<LoginWithCodeResponseData> nullableLoginWithCodeResponseDataAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public LoginWithCodeResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("legacy_response", "error", "error_description");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<LoginWithCodeResponseData> f = iVar.f(LoginWithCodeResponseData.class, b0.e(), "data");
        zq3.g(f, "adapter(...)");
        this.nullableLoginWithCodeResponseDataAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "error");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoginWithCodeResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        LoginWithCodeResponseData loginWithCodeResponseData = null;
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                loginWithCodeResponseData = (LoginWithCodeResponseData) this.nullableLoginWithCodeResponseDataAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (P == 1) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (P == 2) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.h();
        if (i == -8) {
            return new LoginWithCodeResponse(loginWithCodeResponseData, str, str2);
        }
        Constructor<LoginWithCodeResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LoginWithCodeResponse.class.getDeclaredConstructor(LoginWithCodeResponseData.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        LoginWithCodeResponse newInstance = constructor.newInstance(loginWithCodeResponseData, str, str2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LoginWithCodeResponse loginWithCodeResponse) {
        zq3.h(hVar, "writer");
        if (loginWithCodeResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("legacy_response");
        this.nullableLoginWithCodeResponseDataAdapter.mo197toJson(hVar, loginWithCodeResponse.a());
        hVar.C("error");
        this.nullableStringAdapter.mo197toJson(hVar, loginWithCodeResponse.b());
        hVar.C("error_description");
        this.nullableStringAdapter.mo197toJson(hVar, loginWithCodeResponse.c());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LoginWithCodeResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
