package com.nytimes.android.subauth.core.auth.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class ProfileInfoResponseJsonAdapter extends JsonAdapter<ProfileInfoResponse> {
    private final JsonAdapter<ProfileInfoResponseMeta> nullableProfileInfoResponseMetaAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public ProfileInfoResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("sub", "email", "meta");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "sub");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<ProfileInfoResponseMeta> f2 = iVar.f(ProfileInfoResponseMeta.class, b0.e(), "meta");
        zq3.g(f2, "adapter(...)");
        this.nullableProfileInfoResponseMetaAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ProfileInfoResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        ProfileInfoResponseMeta profileInfoResponseMeta = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                profileInfoResponseMeta = (ProfileInfoResponseMeta) this.nullableProfileInfoResponseMetaAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new ProfileInfoResponse(str, str2, profileInfoResponseMeta);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ProfileInfoResponse profileInfoResponse) {
        zq3.h(hVar, "writer");
        if (profileInfoResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("sub");
        this.nullableStringAdapter.mo197toJson(hVar, profileInfoResponse.c());
        hVar.C("email");
        this.nullableStringAdapter.mo197toJson(hVar, profileInfoResponse.a());
        hVar.C("meta");
        this.nullableProfileInfoResponseMetaAdapter.mo197toJson(hVar, profileInfoResponse.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ProfileInfoResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
