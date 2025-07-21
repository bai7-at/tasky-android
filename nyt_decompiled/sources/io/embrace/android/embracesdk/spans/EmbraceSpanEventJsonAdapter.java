package io.embrace.android.embracesdk.spans;

import com.facebook.AuthenticationTokenClaims;
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

/* loaded from: classes5.dex */
public final class EmbraceSpanEventJsonAdapter extends JsonAdapter<EmbraceSpanEvent> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public EmbraceSpanEventJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(AuthenticationTokenClaims.JSON_KEY_NAME, "time_unix_nano", "attributes");
        zq3.g(a, "JsonReader.Options.of(\"n…ano\",\n      \"attributes\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "timestampNanos");
        zq3.g(f2, "moshi.adapter(Long::clas…,\n      \"timestampNanos\")");
        this.longAdapter = f2;
        JsonAdapter<Map<String, String>> f3 = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "attributes");
        zq3.g(f3, "moshi.adapter(Types.newP…emptySet(), \"attributes\")");
        this.mapOfStringStringAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EmbraceSpanEvent");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public EmbraceSpanEvent fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Long l = null;
        Map map = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"nam…ame\",\n            reader)");
                    throw x;
                }
            } else if (P == 1) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x2 = c29.x("timestampNanos", "time_unix_nano", jsonReader);
                    zq3.g(x2, "Util.unexpectedNull(\"tim…\"time_unix_nano\", reader)");
                    throw x2;
                }
            } else if (P == 2 && (map = (Map) this.mapOfStringStringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("attributes", "attributes", jsonReader);
                zq3.g(x3, "Util.unexpectedNull(\"att…s\", \"attributes\", reader)");
                throw x3;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
            zq3.g(o, "Util.missingProperty(\"name\", \"name\", reader)");
            throw o;
        }
        if (l == null) {
            JsonDataException o2 = c29.o("timestampNanos", "time_unix_nano", jsonReader);
            zq3.g(o2, "Util.missingProperty(\"ti…\"time_unix_nano\", reader)");
            throw o2;
        }
        long longValue = l.longValue();
        if (map != null) {
            return new EmbraceSpanEvent(str, longValue, map);
        }
        JsonDataException o3 = c29.o("attributes", "attributes", jsonReader);
        zq3.g(o3, "Util.missingProperty(\"at…s\", \"attributes\", reader)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, EmbraceSpanEvent embraceSpanEvent) {
        zq3.h(hVar, "writer");
        if (embraceSpanEvent == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.stringAdapter.mo197toJson(hVar, embraceSpanEvent.getName());
        hVar.C("time_unix_nano");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(embraceSpanEvent.getTimestampNanos()));
        hVar.C("attributes");
        this.mapOfStringStringAdapter.mo197toJson(hVar, embraceSpanEvent.getAttributes());
        hVar.l();
    }
}
