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
public final class ResponsivenessOutlierJsonAdapter extends JsonAdapter<ResponsivenessOutlier> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;

    public ResponsivenessOutlierJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("start", "end");
        zq3.g(a, "JsonReader.Options.of(\"start\", \"end\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "startMs");
        zq3.g(f, "moshi.adapter(Long::clas…tySet(),\n      \"startMs\")");
        this.longAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ResponsivenessOutlier");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ResponsivenessOutlier fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Long l2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("startMs", "start", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"sta…art\",\n            reader)");
                    throw x;
                }
            } else if (P == 1 && (l2 = (Long) this.longAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("endMs", "end", jsonReader);
                zq3.g(x2, "Util.unexpectedNull(\"end…end\",\n            reader)");
                throw x2;
            }
        }
        jsonReader.h();
        if (l == null) {
            JsonDataException o = c29.o("startMs", "start", jsonReader);
            zq3.g(o, "Util.missingProperty(\"startMs\", \"start\", reader)");
            throw o;
        }
        long longValue = l.longValue();
        if (l2 != null) {
            return new ResponsivenessOutlier(longValue, l2.longValue());
        }
        JsonDataException o2 = c29.o("endMs", "end", jsonReader);
        zq3.g(o2, "Util.missingProperty(\"endMs\", \"end\", reader)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ResponsivenessOutlier responsivenessOutlier) {
        zq3.h(hVar, "writer");
        if (responsivenessOutlier == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("start");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(responsivenessOutlier.getStartMs()));
        hVar.C("end");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(responsivenessOutlier.getEndMs()));
        hVar.l();
    }
}
