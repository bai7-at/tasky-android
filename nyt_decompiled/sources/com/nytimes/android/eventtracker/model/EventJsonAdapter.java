package com.nytimes.android.eventtracker.model;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class EventJsonAdapter extends JsonAdapter<Event> {
    private final JsonAdapter<Agent> agentAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringNullableAnyAdapter;
    private final JsonAdapter<Metadata> nullableMetadataAdapter;
    private final JsonAdapter<PreviousEventIds> nullablePreviousEventIdsAdapter;
    private final JsonAdapter<State> nullableStateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<Session> sessionAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Timestamp> timestampAdapter;

    public EventJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("context_id", "pageview_id", "previous", "event_id", "client_lib", "source_app", "how", "client_ts", "agent", "session", "subject", "metadata", TransferTable.COLUMN_STATE, "data", "device_token", "secure_device_id");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "contextId");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<PreviousEventIds> f2 = iVar.f(PreviousEventIds.class, b0.e(), "previousIds");
        zq3.g(f2, "adapter(...)");
        this.nullablePreviousEventIdsAdapter = f2;
        JsonAdapter<Timestamp> f3 = iVar.f(Timestamp.class, b0.e(), "clientTs");
        zq3.g(f3, "adapter(...)");
        this.timestampAdapter = f3;
        JsonAdapter<Agent> f4 = iVar.f(Agent.class, b0.e(), "agent");
        zq3.g(f4, "adapter(...)");
        this.agentAdapter = f4;
        JsonAdapter<Session> f5 = iVar.f(Session.class, b0.e(), "session");
        zq3.g(f5, "adapter(...)");
        this.sessionAdapter = f5;
        JsonAdapter<Metadata> f6 = iVar.f(Metadata.class, b0.e(), "metadata");
        zq3.g(f6, "adapter(...)");
        this.nullableMetadataAdapter = f6;
        JsonAdapter<State> f7 = iVar.f(State.class, b0.e(), TransferTable.COLUMN_STATE);
        zq3.g(f7, "adapter(...)");
        this.nullableStateAdapter = f7;
        JsonAdapter<Map<String, Object>> f8 = iVar.f(j.j(Map.class, String.class, Object.class), b0.e(), "data");
        zq3.g(f8, "adapter(...)");
        this.mapOfStringNullableAnyAdapter = f8;
        JsonAdapter<String> f9 = iVar.f(String.class, b0.e(), "deviceToken");
        zq3.g(f9, "adapter(...)");
        this.nullableStringAdapter = f9;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Event fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        PreviousEventIds previousEventIds = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Timestamp timestamp = null;
        Agent agent = null;
        Session session = null;
        String str7 = null;
        Metadata metadata = null;
        State state = null;
        Map map = null;
        String str8 = null;
        String str9 = null;
        while (true) {
            Metadata metadata2 = metadata;
            PreviousEventIds previousEventIds2 = previousEventIds;
            String str10 = str7;
            Session session2 = session;
            Agent agent2 = agent;
            Timestamp timestamp2 = timestamp;
            String str11 = str6;
            String str12 = str5;
            String str13 = str4;
            String str14 = str3;
            String str15 = str2;
            String str16 = str;
            if (!jsonReader.hasNext()) {
                jsonReader.h();
                if (str16 == null) {
                    JsonDataException o = c29.o("contextId", "context_id", jsonReader);
                    zq3.g(o, "missingProperty(...)");
                    throw o;
                }
                if (str15 == null) {
                    JsonDataException o2 = c29.o("pageviewId", "pageview_id", jsonReader);
                    zq3.g(o2, "missingProperty(...)");
                    throw o2;
                }
                if (str14 == null) {
                    JsonDataException o3 = c29.o("eventId", "event_id", jsonReader);
                    zq3.g(o3, "missingProperty(...)");
                    throw o3;
                }
                if (str13 == null) {
                    JsonDataException o4 = c29.o("clientLib", "client_lib", jsonReader);
                    zq3.g(o4, "missingProperty(...)");
                    throw o4;
                }
                if (str12 == null) {
                    JsonDataException o5 = c29.o("sourceApp", "source_app", jsonReader);
                    zq3.g(o5, "missingProperty(...)");
                    throw o5;
                }
                if (str11 == null) {
                    JsonDataException o6 = c29.o("how", "how", jsonReader);
                    zq3.g(o6, "missingProperty(...)");
                    throw o6;
                }
                if (timestamp2 == null) {
                    JsonDataException o7 = c29.o("clientTs", "client_ts", jsonReader);
                    zq3.g(o7, "missingProperty(...)");
                    throw o7;
                }
                if (agent2 == null) {
                    JsonDataException o8 = c29.o("agent", "agent", jsonReader);
                    zq3.g(o8, "missingProperty(...)");
                    throw o8;
                }
                if (session2 == null) {
                    JsonDataException o9 = c29.o("session", "session", jsonReader);
                    zq3.g(o9, "missingProperty(...)");
                    throw o9;
                }
                if (str10 == null) {
                    JsonDataException o10 = c29.o("subject", "subject", jsonReader);
                    zq3.g(o10, "missingProperty(...)");
                    throw o10;
                }
                if (map != null) {
                    return new Event(str16, str15, previousEventIds2, str14, str13, str12, str11, timestamp2, agent2, session2, str10, metadata2, state, map, str8, str9);
                }
                JsonDataException o11 = c29.o("data_", "data", jsonReader);
                zq3.g(o11, "missingProperty(...)");
                throw o11;
            }
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("contextId", "context_id", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x2 = c29.x("pageviewId", "pageview_id", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str = str16;
                case 2:
                    previousEventIds = (PreviousEventIds) this.nullablePreviousEventIdsAdapter.fromJson(jsonReader);
                    metadata = metadata2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                case 3:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x3 = c29.x("eventId", "event_id", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str2 = str15;
                    str = str16;
                case 4:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x4 = c29.x("clientLib", "client_lib", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                case 5:
                    String str17 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str17 == null) {
                        JsonDataException x5 = c29.x("sourceApp", "source_app", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    str5 = str17;
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                case 6:
                    str6 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        JsonDataException x6 = c29.x("how", "how", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                case 7:
                    timestamp = (Timestamp) this.timestampAdapter.fromJson(jsonReader);
                    if (timestamp == null) {
                        JsonDataException x7 = c29.x("clientTs", "client_ts", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                case 8:
                    agent = (Agent) this.agentAdapter.fromJson(jsonReader);
                    if (agent == null) {
                        JsonDataException x8 = c29.x("agent", "agent", jsonReader);
                        zq3.g(x8, "unexpectedNull(...)");
                        throw x8;
                    }
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                case 9:
                    Session session3 = (Session) this.sessionAdapter.fromJson(jsonReader);
                    if (session3 == null) {
                        JsonDataException x9 = c29.x("session", "session", jsonReader);
                        zq3.g(x9, "unexpectedNull(...)");
                        throw x9;
                    }
                    session = session3;
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                case 10:
                    str7 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str7 == null) {
                        JsonDataException x10 = c29.x("subject", "subject", jsonReader);
                        zq3.g(x10, "unexpectedNull(...)");
                        throw x10;
                    }
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                case 11:
                    metadata = (Metadata) this.nullableMetadataAdapter.fromJson(jsonReader);
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                case 12:
                    state = (State) this.nullableStateAdapter.fromJson(jsonReader);
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                case 13:
                    map = (Map) this.mapOfStringNullableAnyAdapter.fromJson(jsonReader);
                    if (map == null) {
                        JsonDataException x11 = c29.x("data_", "data", jsonReader);
                        zq3.g(x11, "unexpectedNull(...)");
                        throw x11;
                    }
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                case 14:
                    str8 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                case 15:
                    str9 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
                default:
                    metadata = metadata2;
                    previousEventIds = previousEventIds2;
                    str7 = str10;
                    session = session2;
                    agent = agent2;
                    timestamp = timestamp2;
                    str6 = str11;
                    str5 = str12;
                    str4 = str13;
                    str3 = str14;
                    str2 = str15;
                    str = str16;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Event event) {
        zq3.h(hVar, "writer");
        if (event == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("context_id");
        this.stringAdapter.mo197toJson(hVar, event.d());
        hVar.C("pageview_id");
        this.stringAdapter.mo197toJson(hVar, event.j());
        hVar.C("previous");
        this.nullablePreviousEventIdsAdapter.mo197toJson(hVar, event.k());
        hVar.C("event_id");
        this.stringAdapter.mo197toJson(hVar, event.g());
        hVar.C("client_lib");
        this.stringAdapter.mo197toJson(hVar, event.b());
        hVar.C("source_app");
        this.stringAdapter.mo197toJson(hVar, event.n());
        hVar.C("how");
        this.stringAdapter.mo197toJson(hVar, event.h());
        hVar.C("client_ts");
        this.timestampAdapter.mo197toJson(hVar, event.c());
        hVar.C("agent");
        this.agentAdapter.mo197toJson(hVar, event.a());
        hVar.C("session");
        this.sessionAdapter.mo197toJson(hVar, event.m());
        hVar.C("subject");
        this.stringAdapter.mo197toJson(hVar, event.p());
        hVar.C("metadata");
        this.nullableMetadataAdapter.mo197toJson(hVar, event.i());
        hVar.C(TransferTable.COLUMN_STATE);
        this.nullableStateAdapter.mo197toJson(hVar, event.o());
        hVar.C("data");
        this.mapOfStringNullableAnyAdapter.mo197toJson(hVar, event.e());
        hVar.C("device_token");
        this.nullableStringAdapter.mo197toJson(hVar, event.f());
        hVar.C("secure_device_id");
        this.nullableStringAdapter.mo197toJson(hVar, event.l());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(27);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Event");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
