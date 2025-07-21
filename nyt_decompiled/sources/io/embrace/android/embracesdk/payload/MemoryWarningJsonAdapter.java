package io.embrace.android.embracesdk.payload;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class MemoryWarningJsonAdapter extends JsonAdapter<MemoryWarning> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;

    public MemoryWarningJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("ts");
        zq3.g(a, "JsonReader.Options.of(\"ts\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "timestamp");
        zq3.g(f, "moshi.adapter(Long::clas…Set(),\n      \"timestamp\")");
        this.longAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("MemoryWarning");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public MemoryWarning fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (l = (Long) this.longAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("timestamp", "ts", jsonReader);
                zq3.g(x, "Util.unexpectedNull(\"tim…            \"ts\", reader)");
                throw x;
            }
        }
        jsonReader.h();
        if (l != null) {
            return new MemoryWarning(l.longValue());
        }
        JsonDataException o = c29.o("timestamp", "ts", jsonReader);
        zq3.g(o, "Util.missingProperty(\"timestamp\", \"ts\", reader)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, MemoryWarning memoryWarning) {
        zq3.h(hVar, "writer");
        if (memoryWarning == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("ts");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(memoryWarning.getTimestamp()));
        hVar.l();
    }
}
