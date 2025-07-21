package com.nytimes.android.subauth.core.auth.network.response;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class ProfileInfoResponseErrorJsonAdapter extends JsonAdapter<ProfileInfoResponseError> {
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public ProfileInfoResponseErrorJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("httpCode", "code", TransferTable.COLUMN_KEY, "category", "text");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "httpCode");
        zq3.g(f, "adapter(...)");
        this.nullableIntAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), TransferTable.COLUMN_KEY);
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ProfileInfoResponseError fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 3) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 4) {
                str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new ProfileInfoResponseError(num, num2, str, str2, str3);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ProfileInfoResponseError profileInfoResponseError) {
        zq3.h(hVar, "writer");
        if (profileInfoResponseError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("httpCode");
        this.nullableIntAdapter.mo197toJson(hVar, profileInfoResponseError.c());
        hVar.C("code");
        this.nullableIntAdapter.mo197toJson(hVar, profileInfoResponseError.b());
        hVar.C(TransferTable.COLUMN_KEY);
        this.nullableStringAdapter.mo197toJson(hVar, profileInfoResponseError.d());
        hVar.C("category");
        this.nullableStringAdapter.mo197toJson(hVar, profileInfoResponseError.a());
        hVar.C("text");
        this.nullableStringAdapter.mo197toJson(hVar, profileInfoResponseError.e());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ProfileInfoResponseError");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
