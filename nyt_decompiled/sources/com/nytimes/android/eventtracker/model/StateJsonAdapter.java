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
public final class StateJsonAdapter extends JsonAdapter<State> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader.b options;

    public StateJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(io.embrace.android.embracesdk.payload.Session.APPLICATION_STATE_FOREGROUND);
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Boolean> f = iVar.f(Boolean.TYPE, b0.e(), io.embrace.android.embracesdk.payload.Session.APPLICATION_STATE_FOREGROUND);
        zq3.g(f, "adapter(...)");
        this.booleanAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public State fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (bool = (Boolean) this.booleanAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x(io.embrace.android.embracesdk.payload.Session.APPLICATION_STATE_FOREGROUND, io.embrace.android.embracesdk.payload.Session.APPLICATION_STATE_FOREGROUND, jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (bool != null) {
            return new State(bool.booleanValue());
        }
        JsonDataException o = c29.o(io.embrace.android.embracesdk.payload.Session.APPLICATION_STATE_FOREGROUND, io.embrace.android.embracesdk.payload.Session.APPLICATION_STATE_FOREGROUND, jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, State state) {
        zq3.h(hVar, "writer");
        if (state == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(io.embrace.android.embracesdk.payload.Session.APPLICATION_STATE_FOREGROUND);
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(state.a()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(27);
        sb.append("GeneratedJsonAdapter(");
        sb.append("State");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
