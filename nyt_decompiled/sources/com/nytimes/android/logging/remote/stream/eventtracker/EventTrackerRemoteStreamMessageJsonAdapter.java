package com.nytimes.android.logging.remote.stream.eventtracker;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class EventTrackerRemoteStreamMessageJsonAdapter extends JsonAdapter<EventTrackerRemoteStreamMessage> {
    public static final int $stable = 8;
    private volatile Constructor<EventTrackerRemoteStreamMessage> constructorRef;
    private final JsonAdapter<EventTrackerRemoteStreamMessageKind> eventTrackerRemoteStreamMessageKindAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public EventTrackerRemoteStreamMessageJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("sessionId", "deviceId", "deviceKind", "deviceName", "kind", "messageId");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "sessionId");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "deviceId");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
        JsonAdapter<EventTrackerRemoteStreamMessageKind> f3 = iVar.f(EventTrackerRemoteStreamMessageKind.class, b0.e(), "kind");
        zq3.g(f3, "adapter(...)");
        this.eventTrackerRemoteStreamMessageKindAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EventTrackerRemoteStreamMessage fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        EventTrackerRemoteStreamMessageKind eventTrackerRemoteStreamMessageKind = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("sessionId", "sessionId", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x2 = c29.x("deviceKind", "deviceKind", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    i &= -5;
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    eventTrackerRemoteStreamMessageKind = (EventTrackerRemoteStreamMessageKind) this.eventTrackerRemoteStreamMessageKindAdapter.fromJson(jsonReader);
                    if (eventTrackerRemoteStreamMessageKind == null) {
                        JsonDataException x3 = c29.x("kind", "kind", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    break;
                case 5:
                    str5 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        JsonDataException x4 = c29.x("messageId", "messageId", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    i &= -33;
                    break;
            }
        }
        jsonReader.h();
        if (i == -37) {
            if (str == null) {
                JsonDataException o = c29.o("sessionId", "sessionId", jsonReader);
                zq3.g(o, "missingProperty(...)");
                throw o;
            }
            zq3.f(str3, "null cannot be cast to non-null type kotlin.String");
            if (eventTrackerRemoteStreamMessageKind != null) {
                zq3.f(str5, "null cannot be cast to non-null type kotlin.String");
                return new EventTrackerRemoteStreamMessage(str, str2, str3, str4, eventTrackerRemoteStreamMessageKind, str5);
            }
            JsonDataException o2 = c29.o("kind", "kind", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        Constructor<EventTrackerRemoteStreamMessage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EventTrackerRemoteStreamMessage.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, EventTrackerRemoteStreamMessageKind.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        Constructor<EventTrackerRemoteStreamMessage> constructor2 = constructor;
        if (str == null) {
            JsonDataException o3 = c29.o("sessionId", "sessionId", jsonReader);
            zq3.g(o3, "missingProperty(...)");
            throw o3;
        }
        if (eventTrackerRemoteStreamMessageKind == null) {
            JsonDataException o4 = c29.o("kind", "kind", jsonReader);
            zq3.g(o4, "missingProperty(...)");
            throw o4;
        }
        EventTrackerRemoteStreamMessage newInstance = constructor2.newInstance(str, str2, str3, str4, eventTrackerRemoteStreamMessageKind, str5, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, EventTrackerRemoteStreamMessage eventTrackerRemoteStreamMessage) {
        zq3.h(hVar, "writer");
        if (eventTrackerRemoteStreamMessage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("sessionId");
        this.stringAdapter.mo197toJson(hVar, eventTrackerRemoteStreamMessage.f());
        hVar.C("deviceId");
        this.nullableStringAdapter.mo197toJson(hVar, eventTrackerRemoteStreamMessage.a());
        hVar.C("deviceKind");
        this.stringAdapter.mo197toJson(hVar, eventTrackerRemoteStreamMessage.b());
        hVar.C("deviceName");
        this.nullableStringAdapter.mo197toJson(hVar, eventTrackerRemoteStreamMessage.c());
        hVar.C("kind");
        this.eventTrackerRemoteStreamMessageKindAdapter.mo197toJson(hVar, eventTrackerRemoteStreamMessage.d());
        hVar.C("messageId");
        this.stringAdapter.mo197toJson(hVar, eventTrackerRemoteStreamMessage.e());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EventTrackerRemoteStreamMessage");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
