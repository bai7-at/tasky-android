package com.nytimes.android.subauth.core.auth.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class DeleteAccountResponseErrorJsonAdapter extends JsonAdapter<DeleteAccountResponseError> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public DeleteAccountResponseErrorJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("category", "code", "httpCode", "text");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "category");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "code");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DeleteAccountResponseError fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("category", "category", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x2 = c29.x("code", "code", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2) {
                num2 = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    JsonDataException x3 = c29.x("httpCode", "httpCode", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
            } else if (P == 3 && (str2 = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x4 = c29.x("text", "text", jsonReader);
                zq3.g(x4, "unexpectedNull(...)");
                throw x4;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("category", "category", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (num == null) {
            JsonDataException o2 = c29.o("code", "code", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        int intValue = num.intValue();
        if (num2 == null) {
            JsonDataException o3 = c29.o("httpCode", "httpCode", jsonReader);
            zq3.g(o3, "missingProperty(...)");
            throw o3;
        }
        int intValue2 = num2.intValue();
        if (str2 != null) {
            return new DeleteAccountResponseError(str, intValue, intValue2, str2);
        }
        JsonDataException o4 = c29.o("text", "text", jsonReader);
        zq3.g(o4, "missingProperty(...)");
        throw o4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, DeleteAccountResponseError deleteAccountResponseError) {
        zq3.h(hVar, "writer");
        if (deleteAccountResponseError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("category");
        this.stringAdapter.mo197toJson(hVar, deleteAccountResponseError.a());
        hVar.C("code");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(deleteAccountResponseError.b()));
        hVar.C("httpCode");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(deleteAccountResponseError.c()));
        hVar.C("text");
        this.stringAdapter.mo197toJson(hVar, deleteAccountResponseError.d());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(48);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DeleteAccountResponseError");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
