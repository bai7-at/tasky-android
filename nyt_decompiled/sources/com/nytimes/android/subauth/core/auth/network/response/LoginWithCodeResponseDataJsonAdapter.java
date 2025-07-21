package com.nytimes.android.subauth.core.auth.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class LoginWithCodeResponseDataJsonAdapter extends JsonAdapter<LoginWithCodeResponseData> {
    private final JsonAdapter<List<NYTCodeCookie>> listOfNYTCodeCookieAdapter;
    private final JsonAdapter<NYTUserInfo> nYTUserInfoAdapter;
    private final JsonReader.b options;

    public LoginWithCodeResponseDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("cookies", "user_info");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<List<NYTCodeCookie>> f = iVar.f(j.j(List.class, NYTCodeCookie.class), b0.e(), "cookies");
        zq3.g(f, "adapter(...)");
        this.listOfNYTCodeCookieAdapter = f;
        JsonAdapter<NYTUserInfo> f2 = iVar.f(NYTUserInfo.class, b0.e(), "userInfo");
        zq3.g(f2, "adapter(...)");
        this.nYTUserInfoAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoginWithCodeResponseData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        NYTUserInfo nYTUserInfo = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.listOfNYTCodeCookieAdapter.fromJson(jsonReader);
                if (list == null) {
                    JsonDataException x = c29.x("cookies", "cookies", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (nYTUserInfo = (NYTUserInfo) this.nYTUserInfoAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("userInfo", "user_info", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (list == null) {
            JsonDataException o = c29.o("cookies", "cookies", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (nYTUserInfo != null) {
            return new LoginWithCodeResponseData(list, nYTUserInfo);
        }
        JsonDataException o2 = c29.o("userInfo", "user_info", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LoginWithCodeResponseData loginWithCodeResponseData) {
        zq3.h(hVar, "writer");
        if (loginWithCodeResponseData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("cookies");
        this.listOfNYTCodeCookieAdapter.mo197toJson(hVar, loginWithCodeResponseData.a());
        hVar.C("user_info");
        this.nYTUserInfoAdapter.mo197toJson(hVar, loginWithCodeResponseData.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LoginWithCodeResponseData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
