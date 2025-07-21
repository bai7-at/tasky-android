package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class OrientationJsonAdapter extends JsonAdapter<Orientation> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public OrientationJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.DOCUMENT_WIDTH, "ts");
        zq3.g(a, "JsonReader.Options.of(\"o\", \"ts\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "orientation");
        zq3.g(f, "moshi.adapter(String::cl…t(),\n      \"orientation\")");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "timestamp");
        zq3.g(f2, "moshi.adapter(Long::clas…Set(),\n      \"timestamp\")");
        this.longAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Orientation");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Orientation fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Long l = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("orientation", QueryKeys.DOCUMENT_WIDTH, jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"orientation\", \"o\", reader)");
                    throw x;
                }
            } else if (P == 1 && (l = (Long) this.longAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("timestamp", "ts", jsonReader);
                zq3.g(x2, "Util.unexpectedNull(\"tim…            \"ts\", reader)");
                throw x2;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("orientation", QueryKeys.DOCUMENT_WIDTH, jsonReader);
            zq3.g(o, "Util.missingProperty(\"orientation\", \"o\", reader)");
            throw o;
        }
        if (l != null) {
            return new Orientation(str, l.longValue());
        }
        JsonDataException o2 = c29.o("timestamp", "ts", jsonReader);
        zq3.g(o2, "Util.missingProperty(\"timestamp\", \"ts\", reader)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Orientation orientation) {
        zq3.h(hVar, "writer");
        if (orientation == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.DOCUMENT_WIDTH);
        this.stringAdapter.mo197toJson(hVar, orientation.getOrientation());
        hVar.C("ts");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(orientation.getTimestamp()));
        hVar.l();
    }
}
