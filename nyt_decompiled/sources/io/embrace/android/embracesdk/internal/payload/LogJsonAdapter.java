package io.embrace.android.embracesdk.internal.payload;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class LogJsonAdapter extends JsonAdapter<Log> {
    private volatile Constructor<Log> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<Attribute>> nullableListOfAttributeAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public LogJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("time_unix_nano", "severity_number", "severity_text", "body", "attributes", "trace_id", "span_id");
        zq3.g(a, "JsonReader.Options.of(\"t…\", \"trace_id\", \"span_id\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.class, b0.e(), "timeUnixNano");
        zq3.g(f, "moshi.adapter(Long::clas…ptySet(), \"timeUnixNano\")");
        this.nullableLongAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.class, b0.e(), "severityNumber");
        zq3.g(f2, "moshi.adapter(Int::class…ySet(), \"severityNumber\")");
        this.nullableIntAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "severityText");
        zq3.g(f3, "moshi.adapter(String::cl…ptySet(), \"severityText\")");
        this.nullableStringAdapter = f3;
        JsonAdapter<List<Attribute>> f4 = iVar.f(j.j(List.class, Attribute.class), b0.e(), "attributes");
        zq3.g(f4, "moshi.adapter(Types.newP…et(),\n      \"attributes\")");
        this.nullableListOfAttributeAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(25);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Log");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Log fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        int i = -1;
        Integer num = null;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    i &= (int) 4294967294L;
                    break;
                case 1:
                    i &= (int) 4294967293L;
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    i &= (int) 4294967291L;
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    i &= (int) 4294967287L;
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    i &= (int) 4294967279L;
                    list = (List) this.nullableListOfAttributeAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    i &= (int) 4294967263L;
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    i &= (int) 4294967231L;
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967168L)) {
            return new Log(l, num, str, str2, list, str3, str4);
        }
        Constructor<Log> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Log.class.getDeclaredConstructor(Long.class, Integer.class, String.class, String.class, List.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "Log::class.java.getDecla…his.constructorRef = it }");
        }
        Log newInstance = constructor.newInstance(l, num, str, str2, list, str3, str4, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Log log) {
        zq3.h(hVar, "writer");
        if (log == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("time_unix_nano");
        this.nullableLongAdapter.mo197toJson(hVar, log.getTimeUnixNano());
        hVar.C("severity_number");
        this.nullableIntAdapter.mo197toJson(hVar, log.getSeverityNumber());
        hVar.C("severity_text");
        this.nullableStringAdapter.mo197toJson(hVar, log.getSeverityText());
        hVar.C("body");
        this.nullableStringAdapter.mo197toJson(hVar, log.getBody());
        hVar.C("attributes");
        this.nullableListOfAttributeAdapter.mo197toJson(hVar, log.getAttributes());
        hVar.C("trace_id");
        this.nullableStringAdapter.mo197toJson(hVar, log.getTraceId());
        hVar.C("span_id");
        this.nullableStringAdapter.mo197toJson(hVar, log.getSpanId());
        hVar.l();
    }
}
