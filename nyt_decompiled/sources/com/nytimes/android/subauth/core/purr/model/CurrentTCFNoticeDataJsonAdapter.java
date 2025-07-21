package com.nytimes.android.subauth.core.purr.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class CurrentTCFNoticeDataJsonAdapter extends JsonAdapter<CurrentTCFNoticeData> {
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public CurrentTCFNoticeDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("acceptAllTCFString", "rejectAllTCFString", "currentNoticeVersionHash");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "acceptAllTCFString");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CurrentTCFNoticeData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CurrentTCFNoticeData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("acceptAllTCFString", "acceptAllTCFString", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException x2 = c29.x("rejectAllTCFString", "rejectAllTCFString", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2 && (str3 = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("currentNoticeVersionHash", "currentNoticeVersionHash", jsonReader);
                zq3.g(x3, "unexpectedNull(...)");
                throw x3;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("acceptAllTCFString", "acceptAllTCFString", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (str2 == null) {
            JsonDataException o2 = c29.o("rejectAllTCFString", "rejectAllTCFString", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        if (str3 != null) {
            return new CurrentTCFNoticeData(str, str2, str3);
        }
        JsonDataException o3 = c29.o("currentNoticeVersionHash", "currentNoticeVersionHash", jsonReader);
        zq3.g(o3, "missingProperty(...)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, CurrentTCFNoticeData currentTCFNoticeData) {
        zq3.h(hVar, "writer");
        if (currentTCFNoticeData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("acceptAllTCFString");
        this.stringAdapter.mo197toJson(hVar, currentTCFNoticeData.getAcceptAllTCFString());
        hVar.C("rejectAllTCFString");
        this.stringAdapter.mo197toJson(hVar, currentTCFNoticeData.getRejectAllTCFString());
        hVar.C("currentNoticeVersionHash");
        this.stringAdapter.mo197toJson(hVar, currentTCFNoticeData.getCurrentNoticeVersionHash());
        hVar.l();
    }
}
