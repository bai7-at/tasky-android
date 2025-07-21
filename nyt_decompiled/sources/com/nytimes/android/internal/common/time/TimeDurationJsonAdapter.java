package com.nytimes.android.internal.common.time;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.util.concurrent.TimeUnit;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class TimeDurationJsonAdapter extends JsonAdapter<TimeDuration> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<TimeUnit> timeUnitAdapter;

    public TimeDurationJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("value", "unit");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "value");
        zq3.g(f, "adapter(...)");
        this.longAdapter = f;
        JsonAdapter<TimeUnit> f2 = iVar.f(TimeUnit.class, b0.e(), "unit");
        zq3.g(f2, "adapter(...)");
        this.timeUnitAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public TimeDuration fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        TimeUnit timeUnit = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("value__", "value", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (timeUnit = (TimeUnit) this.timeUnitAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("unit", "unit", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (l == null) {
            JsonDataException o = c29.o("value__", "value", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        long longValue = l.longValue();
        if (timeUnit != null) {
            return new TimeDuration(longValue, timeUnit);
        }
        JsonDataException o2 = c29.o("unit", "unit", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, TimeDuration timeDuration) {
        zq3.h(hVar, "writer");
        if (timeDuration == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("value");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(timeDuration.c()));
        hVar.C("unit");
        this.timeUnitAdapter.mo197toJson(hVar, timeDuration.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("TimeDuration");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
