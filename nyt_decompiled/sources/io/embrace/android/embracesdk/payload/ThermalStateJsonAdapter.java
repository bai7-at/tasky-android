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
public final class ThermalStateJsonAdapter extends JsonAdapter<ThermalState> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;

    public ThermalStateJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.TOKEN, "s");
        zq3.g(a, "JsonReader.Options.of(\"t\", \"s\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "timestamp");
        zq3.g(f, "moshi.adapter(Long::clas…Set(),\n      \"timestamp\")");
        this.longAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "status");
        zq3.g(f2, "moshi.adapter(Int::class…va, emptySet(), \"status\")");
        this.intAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ThermalState");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ThermalState fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("timestamp", QueryKeys.TOKEN, jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"tim… \"t\",\n            reader)");
                    throw x;
                }
            } else if (P == 1 && (num = (Integer) this.intAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("status", "s", jsonReader);
                zq3.g(x2, "Util.unexpectedNull(\"sta… \"s\",\n            reader)");
                throw x2;
            }
        }
        jsonReader.h();
        if (l == null) {
            JsonDataException o = c29.o("timestamp", QueryKeys.TOKEN, jsonReader);
            zq3.g(o, "Util.missingProperty(\"timestamp\", \"t\", reader)");
            throw o;
        }
        long longValue = l.longValue();
        if (num != null) {
            return new ThermalState(longValue, num.intValue());
        }
        JsonDataException o2 = c29.o("status", "s", jsonReader);
        zq3.g(o2, "Util.missingProperty(\"status\", \"s\", reader)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ThermalState thermalState) {
        zq3.h(hVar, "writer");
        if (thermalState == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.TOKEN);
        this.longAdapter.mo197toJson(hVar, Long.valueOf(thermalState.getTimestamp$embrace_android_sdk_release()));
        hVar.C("s");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(thermalState.getStatus$embrace_android_sdk_release()));
        hVar.l();
    }
}
