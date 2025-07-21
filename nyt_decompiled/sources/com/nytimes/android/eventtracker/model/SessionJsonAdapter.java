package com.nytimes.android.eventtracker.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class SessionJsonAdapter extends JsonAdapter<Session> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<Timestamp> timestampAdapter;

    public SessionJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("index", "started");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.TYPE, b0.e(), "index");
        zq3.g(f, "adapter(...)");
        this.intAdapter = f;
        JsonAdapter<Timestamp> f2 = iVar.f(Timestamp.class, b0.e(), "started");
        zq3.g(f2, "adapter(...)");
        this.timestampAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Session fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Timestamp timestamp = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x = c29.x("index", "index", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (timestamp = (Timestamp) this.timestampAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("started", "started", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (num == null) {
            JsonDataException o = c29.o("index", "index", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        int intValue = num.intValue();
        if (timestamp != null) {
            return new Session(intValue, timestamp);
        }
        JsonDataException o2 = c29.o("started", "started", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Session session) {
        zq3.h(hVar, "writer");
        if (session == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("index");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(session.a()));
        hVar.C("started");
        this.timestampAdapter.mo197toJson(hVar, session.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(29);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Session");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
