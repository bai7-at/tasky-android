package com.nytimes.android.logging.remote.stream.data;

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
public final class LoggerRemoteStreamMessageLocationJsonAdapter extends JsonAdapter<LoggerRemoteStreamMessageLocation> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public LoggerRemoteStreamMessageLocationJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(TransferTable.COLUMN_FILE, "function", "line");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), TransferTable.COLUMN_FILE);
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "line");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoggerRemoteStreamMessageLocation fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("file_", TransferTable.COLUMN_FILE, jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException x2 = c29.x("function", "function", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2 && (num = (Integer) this.intAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("line", "line", jsonReader);
                zq3.g(x3, "unexpectedNull(...)");
                throw x3;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("file_", TransferTable.COLUMN_FILE, jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (str2 == null) {
            JsonDataException o2 = c29.o("function", "function", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        if (num != null) {
            return new LoggerRemoteStreamMessageLocation(str, str2, num.intValue());
        }
        JsonDataException o3 = c29.o("line", "line", jsonReader);
        zq3.g(o3, "missingProperty(...)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LoggerRemoteStreamMessageLocation loggerRemoteStreamMessageLocation) {
        zq3.h(hVar, "writer");
        if (loggerRemoteStreamMessageLocation == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(TransferTable.COLUMN_FILE);
        this.stringAdapter.mo197toJson(hVar, loggerRemoteStreamMessageLocation.a());
        hVar.C("function");
        this.stringAdapter.mo197toJson(hVar, loggerRemoteStreamMessageLocation.b());
        hVar.C("line");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(loggerRemoteStreamMessageLocation.c()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LoggerRemoteStreamMessageLocation");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
