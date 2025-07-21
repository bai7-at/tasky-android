package com.nytimes.android.subauth.core.auth.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class VerifyEmailWithCodeResponseDataJsonAdapter extends JsonAdapter<VerifyEmailWithCodeResponseData> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public VerifyEmailWithCodeResponseDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("token");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "token");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VerifyEmailWithCodeResponseData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new VerifyEmailWithCodeResponseData(str);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, VerifyEmailWithCodeResponseData verifyEmailWithCodeResponseData) {
        zq3.h(hVar, "writer");
        if (verifyEmailWithCodeResponseData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("token");
        this.nullableStringAdapter.mo197toJson(hVar, verifyEmailWithCodeResponseData.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("VerifyEmailWithCodeResponseData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
