package com.nytimes.android.eventtracker.model;

import defpackage.et3;
import defpackage.zq3;
import java.util.Map;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Agent {
    private final String a;
    private final Timestamp b;
    private final Map c;

    public Agent(String str, Timestamp timestamp, Map map) {
        zq3.h(str, "id");
        this.a = str;
        this.b = timestamp;
        this.c = map;
    }

    public final Map a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final Timestamp c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Agent)) {
            return false;
        }
        Agent agent = (Agent) obj;
        return zq3.c(this.a, agent.a) && zq3.c(this.b, agent.b) && zq3.c(this.c, agent.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Timestamp timestamp = this.b;
        int hashCode2 = (hashCode + (timestamp == null ? 0 : timestamp.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "Agent(id=" + this.a + ", started=" + this.b + ", data=" + this.c + ")";
    }
}
