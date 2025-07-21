package io.embrace.android.embracesdk.payload;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.api.cms.Tag;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.EventType;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class EventJsonAdapter extends JsonAdapter<Event> {
    private volatile Constructor<Event> constructorRef;
    private final JsonAdapter<EventType> eventTypeAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public EventJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.IS_NEW_USER, "li", "id", "si", QueryKeys.TOKEN, "ts", "th", "sc", "du", "st", "pr", "sp", "et", Session.MESSAGE_TYPE_END, Tag.EM, QueryKeys.VISIT_FREQUENCY);
        zq3.g(a, "JsonReader.Options.of(\"n…\", \"et\", \"en\", \"em\", \"f\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.nullableStringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "eventId");
        zq3.g(f2, "moshi.adapter(String::cl…tySet(),\n      \"eventId\")");
        this.stringAdapter = f2;
        JsonAdapter<EventType> f3 = iVar.f(EventType.class, b0.e(), TransferTable.COLUMN_TYPE);
        zq3.g(f3, "moshi.adapter(EventType:…      emptySet(), \"type\")");
        this.eventTypeAdapter = f3;
        JsonAdapter<Long> f4 = iVar.f(Long.class, b0.e(), "timestamp");
        zq3.g(f4, "moshi.adapter(Long::clas… emptySet(), \"timestamp\")");
        this.nullableLongAdapter = f4;
        JsonAdapter<Boolean> f5 = iVar.f(Boolean.class, b0.e(), "screenshotTaken");
        zq3.g(f5, "moshi.adapter(Boolean::c…Set(), \"screenshotTaken\")");
        this.nullableBooleanAdapter = f5;
        JsonAdapter<Map<String, Object>> f6 = iVar.f(j.j(Map.class, String.class, Object.class), b0.e(), "customProperties");
        zq3.g(f6, "moshi.adapter(Types.newP…et(), \"customProperties\")");
        this.nullableMapOfStringAnyAdapter = f6;
        JsonAdapter<Map<String, String>> f7 = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "sessionProperties");
        zq3.g(f7, "moshi.adapter(Types.newP…t(), \"sessionProperties\")");
        this.nullableMapOfStringStringAdapter = f7;
        JsonAdapter<Integer> f8 = iVar.f(Integer.class, b0.e(), "framework");
        zq3.g(f8, "moshi.adapter(Int::class… emptySet(), \"framework\")");
        this.nullableIntAdapter = f8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(27);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Event");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Event fromJson(JsonReader jsonReader) {
        String str;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str2 = null;
        int i = -1;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        EventType eventType = null;
        Long l = null;
        Long l2 = null;
        Boolean bool = null;
        Long l3 = null;
        String str6 = null;
        Map map = null;
        Map map2 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Integer num = null;
        while (true) {
            Map map3 = map;
            String str10 = str6;
            Long l4 = l3;
            if (!jsonReader.hasNext()) {
                jsonReader.h();
                if (i == ((int) 4294840340L)) {
                    if (str4 == null) {
                        JsonDataException o = c29.o("eventId", "id", jsonReader);
                        zq3.g(o, "Util.missingProperty(\"eventId\", \"id\", reader)");
                        throw o;
                    }
                    if (eventType != null) {
                        return new Event(str2, str3, str4, str5, eventType, l, l2, bool, l4, str10, map3, map2, null, str7, str8, str9, num, ProgressEvent.PART_FAILED_EVENT_CODE, null);
                    }
                    JsonDataException o2 = c29.o(TransferTable.COLUMN_TYPE, QueryKeys.TOKEN, jsonReader);
                    zq3.g(o2, "Util.missingProperty(\"type\", \"t\", reader)");
                    throw o2;
                }
                Constructor<Event> constructor = this.constructorRef;
                if (constructor == null) {
                    str = "eventId";
                    constructor = Event.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, EventType.class, Long.class, Long.class, Boolean.class, Long.class, String.class, Map.class, Map.class, List.class, String.class, String.class, String.class, Integer.class, Integer.TYPE, c29.c);
                    this.constructorRef = constructor;
                    zq3.g(constructor, "Event::class.java.getDec…his.constructorRef = it }");
                } else {
                    str = "eventId";
                }
                Constructor<Event> constructor2 = constructor;
                if (str4 == null) {
                    JsonDataException o3 = c29.o(str, "id", jsonReader);
                    zq3.g(o3, "Util.missingProperty(\"eventId\", \"id\", reader)");
                    throw o3;
                }
                if (eventType == null) {
                    JsonDataException o4 = c29.o(TransferTable.COLUMN_TYPE, QueryKeys.TOKEN, jsonReader);
                    zq3.g(o4, "Util.missingProperty(\"type\", \"t\", reader)");
                    throw o4;
                }
                Event newInstance = constructor2.newInstance(str2, str3, str4, str5, eventType, l, l2, bool, l4, str10, map3, map2, null, str7, str8, str9, num, Integer.valueOf(i), null);
                zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                case 0:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= (int) 4294967294L;
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                case 1:
                    i &= (int) 4294967293L;
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                case 2:
                    String str11 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str11 == null) {
                        JsonDataException x = c29.x("eventId", "id", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"eve…\"id\",\n            reader)");
                        throw x;
                    }
                    str4 = str11;
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                case 3:
                    i &= (int) 4294967287L;
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                case 4:
                    EventType eventType2 = (EventType) this.eventTypeAdapter.fromJson(jsonReader);
                    if (eventType2 == null) {
                        JsonDataException x2 = c29.x(TransferTable.COLUMN_TYPE, QueryKeys.TOKEN, jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"typ… \"t\",\n            reader)");
                        throw x2;
                    }
                    eventType = eventType2;
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                case 5:
                    i &= (int) 4294967263L;
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                case 6:
                    i &= (int) 4294967231L;
                    l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                case 7:
                    i &= (int) 4294967167L;
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                case 8:
                    i &= (int) 4294967039L;
                    l3 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    map = map3;
                    str6 = str10;
                case 9:
                    i &= (int) 4294966783L;
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    map = map3;
                    l3 = l4;
                case 10:
                    i &= (int) 4294966271L;
                    map = (Map) this.nullableMapOfStringAnyAdapter.fromJson(jsonReader);
                    str6 = str10;
                    l3 = l4;
                case 11:
                    i &= (int) 4294965247L;
                    map2 = (Map) this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                case 12:
                    i &= (int) 4294959103L;
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                case 13:
                    i &= (int) 4294950911L;
                    str8 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                case 14:
                    i &= (int) 4294934527L;
                    str9 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                case 15:
                    i &= (int) 4294901759L;
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    map = map3;
                    str6 = str10;
                    l3 = l4;
                default:
                    map = map3;
                    str6 = str10;
                    l3 = l4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Event event) {
        zq3.h(hVar, "writer");
        if (event == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.IS_NEW_USER);
        this.nullableStringAdapter.mo197toJson(hVar, event.name);
        hVar.C("li");
        this.nullableStringAdapter.mo197toJson(hVar, event.messageId);
        hVar.C("id");
        this.stringAdapter.mo197toJson(hVar, event.eventId);
        hVar.C("si");
        this.nullableStringAdapter.mo197toJson(hVar, event.sessionId);
        hVar.C(QueryKeys.TOKEN);
        this.eventTypeAdapter.mo197toJson(hVar, event.f83type);
        hVar.C("ts");
        this.nullableLongAdapter.mo197toJson(hVar, event.timestamp);
        hVar.C("th");
        this.nullableLongAdapter.mo197toJson(hVar, event.lateThreshold);
        hVar.C("sc");
        this.nullableBooleanAdapter.mo197toJson(hVar, event.screenshotTaken);
        hVar.C("du");
        this.nullableLongAdapter.mo197toJson(hVar, event.duration);
        hVar.C("st");
        this.nullableStringAdapter.mo197toJson(hVar, event.appState);
        hVar.C("pr");
        this.nullableMapOfStringAnyAdapter.mo197toJson(hVar, event.getCustomProperties());
        hVar.C("sp");
        this.nullableMapOfStringStringAdapter.mo197toJson(hVar, event.getSessionProperties());
        hVar.C("et");
        this.nullableStringAdapter.mo197toJson(hVar, event.logExceptionType);
        hVar.C(Session.MESSAGE_TYPE_END);
        this.nullableStringAdapter.mo197toJson(hVar, event.getExceptionName());
        hVar.C(Tag.EM);
        this.nullableStringAdapter.mo197toJson(hVar, event.getExceptionMessage());
        hVar.C(QueryKeys.VISIT_FREQUENCY);
        this.nullableIntAdapter.mo197toJson(hVar, event.framework);
        hVar.l();
    }
}
