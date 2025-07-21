package com.nytimes.android.eventtracker.model;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.Map;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Event {
    private final String a;
    private final String b;
    private final PreviousEventIds c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final Timestamp h;
    private final Agent i;
    private final Session j;
    private final String k;
    private final Metadata l;
    private final State m;
    private final Map n;
    private final String o;
    private final String p;

    public Event(@bt3(name = "context_id") String str, @bt3(name = "pageview_id") String str2, @bt3(name = "previous") PreviousEventIds previousEventIds, @bt3(name = "event_id") String str3, @bt3(name = "client_lib") String str4, @bt3(name = "source_app") String str5, String str6, @bt3(name = "client_ts") Timestamp timestamp, Agent agent, Session session, String str7, Metadata metadata, State state, Map<String, ? extends Object> map, @bt3(name = "device_token") String str8, @bt3(name = "secure_device_id") String str9) {
        zq3.h(str, "contextId");
        zq3.h(str2, "pageviewId");
        zq3.h(str3, "eventId");
        zq3.h(str4, "clientLib");
        zq3.h(str5, "sourceApp");
        zq3.h(str6, "how");
        zq3.h(timestamp, "clientTs");
        zq3.h(agent, "agent");
        zq3.h(session, "session");
        zq3.h(str7, "subject");
        zq3.h(map, "data");
        this.a = str;
        this.b = str2;
        this.c = previousEventIds;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = timestamp;
        this.i = agent;
        this.j = session;
        this.k = str7;
        this.l = metadata;
        this.m = state;
        this.n = map;
        this.o = str8;
        this.p = str9;
    }

    public final Agent a() {
        return this.i;
    }

    public final String b() {
        return this.e;
    }

    public final Timestamp c() {
        return this.h;
    }

    public final Event copy(@bt3(name = "context_id") String str, @bt3(name = "pageview_id") String str2, @bt3(name = "previous") PreviousEventIds previousEventIds, @bt3(name = "event_id") String str3, @bt3(name = "client_lib") String str4, @bt3(name = "source_app") String str5, String str6, @bt3(name = "client_ts") Timestamp timestamp, Agent agent, Session session, String str7, Metadata metadata, State state, Map<String, ? extends Object> map, @bt3(name = "device_token") String str8, @bt3(name = "secure_device_id") String str9) {
        zq3.h(str, "contextId");
        zq3.h(str2, "pageviewId");
        zq3.h(str3, "eventId");
        zq3.h(str4, "clientLib");
        zq3.h(str5, "sourceApp");
        zq3.h(str6, "how");
        zq3.h(timestamp, "clientTs");
        zq3.h(agent, "agent");
        zq3.h(session, "session");
        zq3.h(str7, "subject");
        zq3.h(map, "data");
        return new Event(str, str2, previousEventIds, str3, str4, str5, str6, timestamp, agent, session, str7, metadata, state, map, str8, str9);
    }

    public final String d() {
        return this.a;
    }

    public final Map e() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return zq3.c(this.a, event.a) && zq3.c(this.b, event.b) && zq3.c(this.c, event.c) && zq3.c(this.d, event.d) && zq3.c(this.e, event.e) && zq3.c(this.f, event.f) && zq3.c(this.g, event.g) && zq3.c(this.h, event.h) && zq3.c(this.i, event.i) && zq3.c(this.j, event.j) && zq3.c(this.k, event.k) && zq3.c(this.l, event.l) && zq3.c(this.m, event.m) && zq3.c(this.n, event.n) && zq3.c(this.o, event.o) && zq3.c(this.p, event.p);
    }

    public final String f() {
        return this.o;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        PreviousEventIds previousEventIds = this.c;
        int hashCode2 = (((((((((((((((((hashCode + (previousEventIds == null ? 0 : previousEventIds.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31;
        Metadata metadata = this.l;
        int hashCode3 = (hashCode2 + (metadata == null ? 0 : metadata.hashCode())) * 31;
        State state = this.m;
        int hashCode4 = (((hashCode3 + (state == null ? 0 : state.hashCode())) * 31) + this.n.hashCode()) * 31;
        String str = this.o;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.p;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Metadata i() {
        return this.l;
    }

    public final String j() {
        return this.b;
    }

    public final PreviousEventIds k() {
        return this.c;
    }

    public final String l() {
        return this.p;
    }

    public final Session m() {
        return this.j;
    }

    public final String n() {
        return this.f;
    }

    public final State o() {
        return this.m;
    }

    public final String p() {
        return this.k;
    }

    public String toString() {
        return "Event(contextId=" + this.a + ", pageviewId=" + this.b + ", previousIds=" + this.c + ", eventId=" + this.d + ", clientLib=" + this.e + ", sourceApp=" + this.f + ", how=" + this.g + ", clientTs=" + this.h + ", agent=" + this.i + ", session=" + this.j + ", subject=" + this.k + ", metadata=" + this.l + ", state=" + this.m + ", data=" + this.n + ", deviceToken=" + this.o + ", secureDeviceId=" + this.p + ")";
    }
}
