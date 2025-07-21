package io.embrace.android.embracesdk.internal.payload;

import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.payload.Span;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class SpanJsonAdapter extends JsonAdapter<Span> {
    private volatile Constructor<Span> constructorRef;
    private final JsonAdapter<List<Attribute>> nullableListOfAttributeAdapter;
    private final JsonAdapter<List<SpanEvent>> nullableListOfSpanEventAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Span.Status> nullableStatusAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public SpanJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("trace_id", "span_id", "parent_span_id", AuthenticationTokenClaims.JSON_KEY_NAME, "start_time_unix_nano", "end_time_unix_nano", "status", "events", "attributes");
        zq3.g(a, "JsonReader.Options.of(\"t…nts\",\n      \"attributes\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "traceId");
        zq3.g(f, "moshi.adapter(String::cl…   emptySet(), \"traceId\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.class, b0.e(), "startTimeUnixNano");
        zq3.g(f2, "moshi.adapter(Long::clas…t(), \"startTimeUnixNano\")");
        this.nullableLongAdapter = f2;
        JsonAdapter<Span.Status> f3 = iVar.f(Span.Status.class, b0.e(), "status");
        zq3.g(f3, "moshi.adapter(Span.Statu…va, emptySet(), \"status\")");
        this.nullableStatusAdapter = f3;
        JsonAdapter<List<SpanEvent>> f4 = iVar.f(j.j(List.class, SpanEvent.class), b0.e(), "events");
        zq3.g(f4, "moshi.adapter(Types.newP…ptySet(),\n      \"events\")");
        this.nullableListOfSpanEventAdapter = f4;
        JsonAdapter<List<Attribute>> f5 = iVar.f(j.j(List.class, Attribute.class), b0.e(), "attributes");
        zq3.g(f5, "moshi.adapter(Types.newP…et(),\n      \"attributes\")");
        this.nullableListOfAttributeAdapter = f5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(26);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Span");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Span fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Long l = null;
        Long l2 = null;
        Span.Status status = null;
        List list = null;
        List list2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= (int) 4294967294L;
                    break;
                case 1:
                    i &= (int) 4294967293L;
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    i &= (int) 4294967291L;
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    i &= (int) 4294967287L;
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    i &= (int) 4294967279L;
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    i &= (int) 4294967263L;
                    l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    i &= (int) 4294967231L;
                    status = (Span.Status) this.nullableStatusAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    i &= (int) 4294967167L;
                    list = (List) this.nullableListOfSpanEventAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    i &= (int) 4294967039L;
                    list2 = (List) this.nullableListOfAttributeAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294966784L)) {
            return new Span(str, str2, str3, str4, l, l2, status, list, list2);
        }
        Constructor<Span> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Span.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Long.class, Long.class, Span.Status.class, List.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "Span::class.java.getDecl…his.constructorRef = it }");
        }
        Span newInstance = constructor.newInstance(str, str2, str3, str4, l, l2, status, list, list2, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Span span) {
        zq3.h(hVar, "writer");
        if (span == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("trace_id");
        this.nullableStringAdapter.mo197toJson(hVar, span.getTraceId());
        hVar.C("span_id");
        this.nullableStringAdapter.mo197toJson(hVar, span.getSpanId());
        hVar.C("parent_span_id");
        this.nullableStringAdapter.mo197toJson(hVar, span.getParentSpanId());
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.nullableStringAdapter.mo197toJson(hVar, span.getName());
        hVar.C("start_time_unix_nano");
        this.nullableLongAdapter.mo197toJson(hVar, span.getStartTimeUnixNano());
        hVar.C("end_time_unix_nano");
        this.nullableLongAdapter.mo197toJson(hVar, span.getEndTimeUnixNano());
        hVar.C("status");
        this.nullableStatusAdapter.mo197toJson(hVar, span.getStatus());
        hVar.C("events");
        this.nullableListOfSpanEventAdapter.mo197toJson(hVar, span.getEvents());
        hVar.C("attributes");
        this.nullableListOfAttributeAdapter.mo197toJson(hVar, span.getAttributes());
        hVar.l();
    }
}
