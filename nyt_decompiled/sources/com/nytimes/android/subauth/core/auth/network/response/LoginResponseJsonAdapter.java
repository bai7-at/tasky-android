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
public final class LoginResponseJsonAdapter extends JsonAdapter<LoginResponse> {
    private volatile Constructor<LoginResponse> constructorRef;
    private final JsonAdapter<LoginMeta> nullableLoginMetaAdapter;
    private final JsonAdapter<LoginResponseData> nullableLoginResponseDataAdapter;
    private final JsonReader.b options;

    public LoginResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("data", "meta");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<LoginResponseData> f = iVar.f(LoginResponseData.class, b0.e(), "data");
        zq3.g(f, "adapter(...)");
        this.nullableLoginResponseDataAdapter = f;
        JsonAdapter<LoginMeta> f2 = iVar.f(LoginMeta.class, b0.e(), "meta");
        zq3.g(f2, "adapter(...)");
        this.nullableLoginMetaAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoginResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        LoginResponseData loginResponseData = null;
        LoginMeta loginMeta = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                loginResponseData = (LoginResponseData) this.nullableLoginResponseDataAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (P == 1) {
                loginMeta = (LoginMeta) this.nullableLoginMetaAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.h();
        if (i == -4) {
            return new LoginResponse(loginResponseData, loginMeta);
        }
        Constructor<LoginResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LoginResponse.class.getDeclaredConstructor(LoginResponseData.class, LoginMeta.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        LoginResponse newInstance = constructor.newInstance(loginResponseData, loginMeta, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LoginResponse loginResponse) {
        zq3.h(hVar, "writer");
        if (loginResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("data");
        this.nullableLoginResponseDataAdapter.mo197toJson(hVar, loginResponse.c());
        hVar.C("meta");
        this.nullableLoginMetaAdapter.mo197toJson(hVar, loginResponse.f());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LoginResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
