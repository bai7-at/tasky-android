package com.nytimes.android.subauth.core.purr.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class UserTCFDataJsonAdapter extends JsonAdapter<UserTCFData> {
    private final JsonAdapter<Map<String, Object>> mapOfStringNullableAnyAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public UserTCFDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("tcfString", "tcfNoticeVersion", "tcfDecodedData");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "tcfString");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Map<String, Object>> f2 = iVar.f(j.j(Map.class, String.class, Object.class), b0.e(), "tcfDecodedData");
        zq3.g(f2, "adapter(...)");
        this.mapOfStringNullableAnyAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("UserTCFData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UserTCFData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        Map map = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("tcfString", "tcfString", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException x2 = c29.x("tcfNoticeVersion", "tcfNoticeVersion", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2 && (map = (Map) this.mapOfStringNullableAnyAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("tcfDecodedData", "tcfDecodedData", jsonReader);
                zq3.g(x3, "unexpectedNull(...)");
                throw x3;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("tcfString", "tcfString", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (str2 == null) {
            JsonDataException o2 = c29.o("tcfNoticeVersion", "tcfNoticeVersion", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        if (map != null) {
            return new UserTCFData(str, str2, map);
        }
        JsonDataException o3 = c29.o("tcfDecodedData", "tcfDecodedData", jsonReader);
        zq3.g(o3, "missingProperty(...)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, UserTCFData userTCFData) {
        zq3.h(hVar, "writer");
        if (userTCFData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("tcfString");
        this.stringAdapter.mo197toJson(hVar, userTCFData.getTcfString());
        hVar.C("tcfNoticeVersion");
        this.stringAdapter.mo197toJson(hVar, userTCFData.getTcfNoticeVersion());
        hVar.C("tcfDecodedData");
        this.mapOfStringNullableAnyAdapter.mo197toJson(hVar, userTCFData.getTcfDecodedData());
        hVar.l();
    }
}
