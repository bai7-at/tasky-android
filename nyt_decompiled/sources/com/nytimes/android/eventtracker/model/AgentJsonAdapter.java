package com.nytimes.android.eventtracker.model;

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
public final class AgentJsonAdapter extends JsonAdapter<Agent> {
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonAdapter<Timestamp> nullableTimestampAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public AgentJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("id", "started", "data");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "id");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Timestamp> f2 = iVar.f(Timestamp.class, b0.e(), "started");
        zq3.g(f2, "adapter(...)");
        this.nullableTimestampAdapter = f2;
        JsonAdapter<Map<String, Object>> f3 = iVar.f(j.j(Map.class, String.class, Object.class), b0.e(), "data");
        zq3.g(f3, "adapter(...)");
        this.nullableMapOfStringAnyAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Agent fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Timestamp timestamp = null;
        Map map = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("id", "id", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                timestamp = (Timestamp) this.nullableTimestampAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                map = (Map) this.nullableMapOfStringAnyAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (str != null) {
            return new Agent(str, timestamp, map);
        }
        JsonDataException o = c29.o("id", "id", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Agent agent) {
        zq3.h(hVar, "writer");
        if (agent == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("id");
        this.stringAdapter.mo197toJson(hVar, agent.b());
        hVar.C("started");
        this.nullableTimestampAdapter.mo197toJson(hVar, agent.c());
        hVar.C("data");
        this.nullableMapOfStringAnyAdapter.mo197toJson(hVar, agent.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(27);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Agent");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
