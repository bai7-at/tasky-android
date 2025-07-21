package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class IntervalJsonAdapter extends JsonAdapter<Interval> {
    private volatile Constructor<Interval> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public IntervalJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("st", Session.MESSAGE_TYPE_END, QueryKeys.INTERNAL_REFERRER);
        zq3.g(a, "JsonReader.Options.of(\"st\", \"en\", \"v\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "startTime");
        zq3.g(f, "moshi.adapter(Long::clas…Set(),\n      \"startTime\")");
        this.longAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "value");
        zq3.g(f2, "moshi.adapter(String::cl…     emptySet(), \"value\")");
        this.nullableStringAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Interval");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Interval fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        int i = -1;
        Long l = null;
        Long l2 = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("startTime", "st", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"sta…            \"st\", reader)");
                    throw x;
                }
            } else if (P == 1) {
                l2 = (Long) this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    JsonDataException x2 = c29.x("endTime", Session.MESSAGE_TYPE_END, jsonReader);
                    zq3.g(x2, "Util.unexpectedNull(\"end…\"en\",\n            reader)");
                    throw x2;
                }
            } else if (P == 2) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= (int) 4294967291L;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967291L)) {
            if (l == null) {
                JsonDataException o = c29.o("startTime", "st", jsonReader);
                zq3.g(o, "Util.missingProperty(\"startTime\", \"st\", reader)");
                throw o;
            }
            long longValue = l.longValue();
            if (l2 != null) {
                return new Interval(longValue, l2.longValue(), str);
            }
            JsonDataException o2 = c29.o("endTime", Session.MESSAGE_TYPE_END, jsonReader);
            zq3.g(o2, "Util.missingProperty(\"endTime\", \"en\", reader)");
            throw o2;
        }
        Constructor<Interval> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Long.TYPE;
            constructor = Interval.class.getDeclaredConstructor(cls, cls, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "Interval::class.java.get…his.constructorRef = it }");
        }
        if (l == null) {
            JsonDataException o3 = c29.o("startTime", "st", jsonReader);
            zq3.g(o3, "Util.missingProperty(\"startTime\", \"st\", reader)");
            throw o3;
        }
        if (l2 != null) {
            Interval newInstance = constructor.newInstance(l, l2, str, Integer.valueOf(i), null);
            zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        JsonDataException o4 = c29.o("endTime", Session.MESSAGE_TYPE_END, jsonReader);
        zq3.g(o4, "Util.missingProperty(\"endTime\", \"en\", reader)");
        throw o4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Interval interval) {
        zq3.h(hVar, "writer");
        if (interval == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("st");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(interval.getStartTime()));
        hVar.C(Session.MESSAGE_TYPE_END);
        this.longAdapter.mo197toJson(hVar, Long.valueOf(interval.getEndTime()));
        hVar.C(QueryKeys.INTERNAL_REFERRER);
        this.nullableStringAdapter.mo197toJson(hVar, interval.getValue());
        hVar.l();
    }
}
