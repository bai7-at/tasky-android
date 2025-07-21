package com.nytimes.android.logging.remote.stream.eventtracker;

import com.nytimes.android.eventtracker.model.Event;
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
public final class EventTrackerRemoteStreamMessageKindJsonAdapter extends JsonAdapter<EventTrackerRemoteStreamMessageKind> {
    public static final int $stable = 8;
    private volatile Constructor<EventTrackerRemoteStreamMessageKind> constructorRef;
    private final JsonAdapter<Event> eventAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public EventTrackerRemoteStreamMessageKindJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("data", "kind");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Event> f = iVar.f(Event.class, b0.e(), "data");
        zq3.g(f, "adapter(...)");
        this.eventAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "kind");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EventTrackerRemoteStreamMessageKind fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Event event = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                event = (Event) this.eventAdapter.fromJson(jsonReader);
                if (event == null) {
                    JsonDataException x = c29.x("data_", "data", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x2 = c29.x("kind", "kind", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i = -3;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -3) {
            if (event != null) {
                zq3.f(str, "null cannot be cast to non-null type kotlin.String");
                return new EventTrackerRemoteStreamMessageKind(event, str);
            }
            JsonDataException o = c29.o("data_", "data", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<EventTrackerRemoteStreamMessageKind> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EventTrackerRemoteStreamMessageKind.class.getDeclaredConstructor(Event.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (event != null) {
            EventTrackerRemoteStreamMessageKind newInstance = constructor.newInstance(event, str, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("data_", "data", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, EventTrackerRemoteStreamMessageKind eventTrackerRemoteStreamMessageKind) {
        zq3.h(hVar, "writer");
        if (eventTrackerRemoteStreamMessageKind == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("data");
        this.eventAdapter.mo197toJson(hVar, eventTrackerRemoteStreamMessageKind.a());
        hVar.C("kind");
        this.stringAdapter.mo197toJson(hVar, eventTrackerRemoteStreamMessageKind.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(57);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EventTrackerRemoteStreamMessageKind");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
