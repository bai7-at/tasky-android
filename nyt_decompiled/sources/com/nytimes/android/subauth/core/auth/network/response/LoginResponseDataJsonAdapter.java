package com.nytimes.android.subauth.core.auth.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class LoginResponseDataJsonAdapter extends JsonAdapter<LoginResponseData> {
    private final JsonAdapter<List<NYTCookie>> nullableListOfNYTCookieAdapter;
    private final JsonAdapter<NYTUserInfo> nullableNYTUserInfoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public LoginResponseDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("action", "cookies", "userInfo");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "action");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<List<NYTCookie>> f2 = iVar.f(j.j(List.class, NYTCookie.class), b0.e(), "cookies");
        zq3.g(f2, "adapter(...)");
        this.nullableListOfNYTCookieAdapter = f2;
        JsonAdapter<NYTUserInfo> f3 = iVar.f(NYTUserInfo.class, b0.e(), "userInfo");
        zq3.g(f3, "adapter(...)");
        this.nullableNYTUserInfoAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoginResponseData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        List list = null;
        NYTUserInfo nYTUserInfo = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                list = (List) this.nullableListOfNYTCookieAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                nYTUserInfo = (NYTUserInfo) this.nullableNYTUserInfoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new LoginResponseData(str, list, nYTUserInfo);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LoginResponseData loginResponseData) {
        zq3.h(hVar, "writer");
        if (loginResponseData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("action");
        this.nullableStringAdapter.mo197toJson(hVar, loginResponseData.c());
        hVar.C("cookies");
        this.nullableListOfNYTCookieAdapter.mo197toJson(hVar, loginResponseData.d());
        hVar.C("userInfo");
        this.nullableNYTUserInfoAdapter.mo197toJson(hVar, loginResponseData.e());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LoginResponseData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
