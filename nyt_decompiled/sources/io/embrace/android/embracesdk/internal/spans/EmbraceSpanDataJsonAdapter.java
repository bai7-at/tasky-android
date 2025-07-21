package io.embrace.android.embracesdk.internal.spans;

import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.spans.EmbraceSpanEvent;
import io.opentelemetry.api.trace.StatusCode;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class EmbraceSpanDataJsonAdapter extends JsonAdapter<EmbraceSpanData> {
    private volatile Constructor<EmbraceSpanData> constructorRef;
    private final JsonAdapter<List<EmbraceSpanEvent>> listOfEmbraceSpanEventAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<StatusCode> statusCodeAdapter;
    private final JsonAdapter<String> stringAdapter;

    public EmbraceSpanDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("trace_id", "span_id", "parent_span_id", AuthenticationTokenClaims.JSON_KEY_NAME, "start_time_unix_nano", "end_time_unix_nano", "status", "events", "attributes");
        zq3.g(a, "JsonReader.Options.of(\"t…nts\",\n      \"attributes\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "traceId");
        zq3.g(f, "moshi.adapter(String::cl…tySet(),\n      \"traceId\")");
        this.stringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "parentSpanId");
        zq3.g(f2, "moshi.adapter(String::cl…ptySet(), \"parentSpanId\")");
        this.nullableStringAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.TYPE, b0.e(), "startTimeNanos");
        zq3.g(f3, "moshi.adapter(Long::clas…,\n      \"startTimeNanos\")");
        this.longAdapter = f3;
        JsonAdapter<StatusCode> f4 = iVar.f(StatusCode.class, b0.e(), "status");
        zq3.g(f4, "moshi.adapter(StatusCode…    emptySet(), \"status\")");
        this.statusCodeAdapter = f4;
        JsonAdapter<List<EmbraceSpanEvent>> f5 = iVar.f(j.j(List.class, EmbraceSpanEvent.class), b0.e(), "events");
        zq3.g(f5, "moshi.adapter(Types.newP…    emptySet(), \"events\")");
        this.listOfEmbraceSpanEventAdapter = f5;
        JsonAdapter<Map<String, String>> f6 = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "attributes");
        zq3.g(f6, "moshi.adapter(Types.newP…emptySet(), \"attributes\")");
        this.mapOfStringStringAdapter = f6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EmbraceSpanData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public EmbraceSpanData fromJson(JsonReader jsonReader) {
        String str;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str2 = null;
        int i = -1;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Long l = null;
        Long l2 = null;
        StatusCode statusCode = null;
        List list = null;
        Map map = null;
        while (true) {
            String str6 = str4;
            Map map2 = map;
            List list2 = list;
            StatusCode statusCode2 = statusCode;
            Long l3 = l2;
            Long l4 = l;
            if (!jsonReader.hasNext()) {
                jsonReader.h();
                if (i == ((int) 4294966847L)) {
                    if (str2 == null) {
                        JsonDataException o = c29.o("traceId", "trace_id", jsonReader);
                        zq3.g(o, "Util.missingProperty(\"tr…eId\", \"trace_id\", reader)");
                        throw o;
                    }
                    if (str3 == null) {
                        JsonDataException o2 = c29.o("spanId", "span_id", jsonReader);
                        zq3.g(o2, "Util.missingProperty(\"spanId\", \"span_id\", reader)");
                        throw o2;
                    }
                    if (str5 == null) {
                        JsonDataException o3 = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                        zq3.g(o3, "Util.missingProperty(\"name\", \"name\", reader)");
                        throw o3;
                    }
                    if (l4 == null) {
                        JsonDataException o4 = c29.o("startTimeNanos", "start_time_unix_nano", jsonReader);
                        zq3.g(o4, "Util.missingProperty(\"st…_time_unix_nano\", reader)");
                        throw o4;
                    }
                    long longValue = l4.longValue();
                    if (l3 == null) {
                        JsonDataException o5 = c29.o("endTimeNanos", "end_time_unix_nano", jsonReader);
                        zq3.g(o5, "Util.missingProperty(\"en…_time_unix_nano\", reader)");
                        throw o5;
                    }
                    long longValue2 = l3.longValue();
                    if (statusCode2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type io.opentelemetry.api.trace.StatusCode");
                    }
                    if (list2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<io.embrace.android.embracesdk.spans.EmbraceSpanEvent>");
                    }
                    if (map2 != null) {
                        return new EmbraceSpanData(str2, str3, str6, str5, longValue, longValue2, statusCode2, list2, map2);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                }
                Constructor<EmbraceSpanData> constructor = this.constructorRef;
                if (constructor == null) {
                    Class cls = Long.TYPE;
                    str = "spanId";
                    constructor = EmbraceSpanData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, cls, cls, StatusCode.class, List.class, Map.class, Integer.TYPE, c29.c);
                    this.constructorRef = constructor;
                    zq3.g(constructor, "EmbraceSpanData::class.j…his.constructorRef = it }");
                } else {
                    str = "spanId";
                }
                Constructor<EmbraceSpanData> constructor2 = constructor;
                if (str2 == null) {
                    JsonDataException o6 = c29.o("traceId", "trace_id", jsonReader);
                    zq3.g(o6, "Util.missingProperty(\"tr…eId\", \"trace_id\", reader)");
                    throw o6;
                }
                if (str3 == null) {
                    JsonDataException o7 = c29.o(str, "span_id", jsonReader);
                    zq3.g(o7, "Util.missingProperty(\"spanId\", \"span_id\", reader)");
                    throw o7;
                }
                if (str5 == null) {
                    JsonDataException o8 = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                    zq3.g(o8, "Util.missingProperty(\"name\", \"name\", reader)");
                    throw o8;
                }
                if (l4 == null) {
                    JsonDataException o9 = c29.o("startTimeNanos", "start_time_unix_nano", jsonReader);
                    zq3.g(o9, "Util.missingProperty(\"st…o\",\n              reader)");
                    throw o9;
                }
                if (l3 == null) {
                    JsonDataException o10 = c29.o("endTimeNanos", "end_time_unix_nano", jsonReader);
                    zq3.g(o10, "Util.missingProperty(\"en…_time_unix_nano\", reader)");
                    throw o10;
                }
                EmbraceSpanData newInstance = constructor2.newInstance(str2, str3, str6, str5, l4, l3, statusCode2, list2, map2, Integer.valueOf(i), null);
                zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    str4 = str6;
                    map = map2;
                    list = list2;
                    statusCode = statusCode2;
                    l2 = l3;
                    l = l4;
                case 0:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x = c29.x("traceId", "trace_id", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"tra…      \"trace_id\", reader)");
                        throw x;
                    }
                    str4 = str6;
                    map = map2;
                    list = list2;
                    statusCode = statusCode2;
                    l2 = l3;
                    l = l4;
                case 1:
                    String str7 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str7 == null) {
                        JsonDataException x2 = c29.x("spanId", "span_id", jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"spa…       \"span_id\", reader)");
                        throw x2;
                    }
                    str3 = str7;
                    str4 = str6;
                    map = map2;
                    list = list2;
                    statusCode = statusCode2;
                    l2 = l3;
                    l = l4;
                case 2:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    map = map2;
                    list = list2;
                    statusCode = statusCode2;
                    l2 = l3;
                    l = l4;
                case 3:
                    String str8 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        JsonDataException x3 = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                        zq3.g(x3, "Util.unexpectedNull(\"nam…ame\",\n            reader)");
                        throw x3;
                    }
                    str5 = str8;
                    str4 = str6;
                    map = map2;
                    list = list2;
                    statusCode = statusCode2;
                    l2 = l3;
                    l = l4;
                case 4:
                    Long l5 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l5 == null) {
                        JsonDataException x4 = c29.x("startTimeNanos", "start_time_unix_nano", jsonReader);
                        zq3.g(x4, "Util.unexpectedNull(\"sta…_time_unix_nano\", reader)");
                        throw x4;
                    }
                    l = l5;
                    str4 = str6;
                    map = map2;
                    list = list2;
                    statusCode = statusCode2;
                    l2 = l3;
                case 5:
                    Long l6 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l6 == null) {
                        JsonDataException x5 = c29.x("endTimeNanos", "end_time_unix_nano", jsonReader);
                        zq3.g(x5, "Util.unexpectedNull(\"end…_time_unix_nano\", reader)");
                        throw x5;
                    }
                    l2 = l6;
                    str4 = str6;
                    map = map2;
                    list = list2;
                    statusCode = statusCode2;
                    l = l4;
                case 6:
                    StatusCode statusCode3 = (StatusCode) this.statusCodeAdapter.fromJson(jsonReader);
                    if (statusCode3 == null) {
                        JsonDataException x6 = c29.x("status", "status", jsonReader);
                        zq3.g(x6, "Util.unexpectedNull(\"sta…        \"status\", reader)");
                        throw x6;
                    }
                    i &= (int) 4294967231L;
                    statusCode = statusCode3;
                    str4 = str6;
                    map = map2;
                    list = list2;
                    l2 = l3;
                    l = l4;
                case 7:
                    List list3 = (List) this.listOfEmbraceSpanEventAdapter.fromJson(jsonReader);
                    if (list3 == null) {
                        JsonDataException x7 = c29.x("events", "events", jsonReader);
                        zq3.g(x7, "Util.unexpectedNull(\"events\", \"events\", reader)");
                        throw x7;
                    }
                    i &= (int) 4294967167L;
                    list = list3;
                    str4 = str6;
                    map = map2;
                    statusCode = statusCode2;
                    l2 = l3;
                    l = l4;
                case 8:
                    Map map3 = (Map) this.mapOfStringStringAdapter.fromJson(jsonReader);
                    if (map3 == null) {
                        JsonDataException x8 = c29.x("attributes", "attributes", jsonReader);
                        zq3.g(x8, "Util.unexpectedNull(\"att…s\", \"attributes\", reader)");
                        throw x8;
                    }
                    i &= (int) 4294967039L;
                    map = map3;
                    str4 = str6;
                    list = list2;
                    statusCode = statusCode2;
                    l2 = l3;
                    l = l4;
                default:
                    str4 = str6;
                    map = map2;
                    list = list2;
                    statusCode = statusCode2;
                    l2 = l3;
                    l = l4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, EmbraceSpanData embraceSpanData) {
        zq3.h(hVar, "writer");
        if (embraceSpanData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("trace_id");
        this.stringAdapter.mo197toJson(hVar, embraceSpanData.getTraceId());
        hVar.C("span_id");
        this.stringAdapter.mo197toJson(hVar, embraceSpanData.getSpanId());
        hVar.C("parent_span_id");
        this.nullableStringAdapter.mo197toJson(hVar, embraceSpanData.getParentSpanId());
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.stringAdapter.mo197toJson(hVar, embraceSpanData.getName());
        hVar.C("start_time_unix_nano");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(embraceSpanData.getStartTimeNanos()));
        hVar.C("end_time_unix_nano");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(embraceSpanData.getEndTimeNanos()));
        hVar.C("status");
        this.statusCodeAdapter.mo197toJson(hVar, embraceSpanData.getStatus());
        hVar.C("events");
        this.listOfEmbraceSpanEventAdapter.mo197toJson(hVar, embraceSpanData.getEvents());
        hVar.C("attributes");
        this.mapOfStringStringAdapter.mo197toJson(hVar, embraceSpanData.getAttributes());
        hVar.l();
    }
}
