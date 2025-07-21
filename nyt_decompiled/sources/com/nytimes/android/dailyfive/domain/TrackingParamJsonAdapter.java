package com.nytimes.android.dailyfive.domain;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class TrackingParamJsonAdapter extends JsonAdapter<TrackingParam> {
    public static final int $stable = 8;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public TrackingParamJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(TransferTable.COLUMN_KEY, "value");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), TransferTable.COLUMN_KEY);
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public TrackingParam fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x(TransferTable.COLUMN_KEY, TransferTable.COLUMN_KEY, jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (str2 = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("value__", "value", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o(TransferTable.COLUMN_KEY, TransferTable.COLUMN_KEY, jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (str2 != null) {
            return new TrackingParam(str, str2);
        }
        JsonDataException o2 = c29.o("value__", "value", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, TrackingParam trackingParam) {
        zq3.h(hVar, "writer");
        if (trackingParam == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(TransferTable.COLUMN_KEY);
        this.stringAdapter.mo197toJson(hVar, trackingParam.a());
        hVar.C("value");
        this.stringAdapter.mo197toJson(hVar, trackingParam.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("TrackingParam");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
