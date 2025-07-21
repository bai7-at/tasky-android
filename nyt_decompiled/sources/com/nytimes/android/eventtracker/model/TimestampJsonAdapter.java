package com.nytimes.android.eventtracker.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class TimestampJsonAdapter extends JsonAdapter<Timestamp> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;

    public TimestampJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("timestamp", "using_device_time");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "timestamp");
        zq3.g(f, "adapter(...)");
        this.longAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "usingDeviceTime");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Timestamp fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("timestamp", "timestamp", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (bool = (Boolean) this.booleanAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("usingDeviceTime", "using_device_time", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (l == null) {
            JsonDataException o = c29.o("timestamp", "timestamp", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        long longValue = l.longValue();
        if (bool != null) {
            return new Timestamp(longValue, bool.booleanValue());
        }
        JsonDataException o2 = c29.o("usingDeviceTime", "using_device_time", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Timestamp timestamp) {
        zq3.h(hVar, "writer");
        if (timestamp == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("timestamp");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(timestamp.a()));
        hVar.C("using_device_time");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(timestamp.b()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Timestamp");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
