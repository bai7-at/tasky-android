package io.embrace.android.embracesdk.internal.payload;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class SessionPayloadJsonAdapter extends JsonAdapter<SessionPayload> {
    private volatile Constructor<SessionPayload> constructorRef;
    private final JsonAdapter<InternalError> nullableInternalErrorAdapter;
    private final JsonAdapter<List<Span>> nullableListOfSpanAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonReader.b options;

    public SessionPayloadJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("spans", "span_snapshots", "internal_error", "shared_lib_symbol_mapping");
        zq3.g(a, "JsonReader.Options.of(\"s…ared_lib_symbol_mapping\")");
        this.options = a;
        JsonAdapter<List<Span>> f = iVar.f(j.j(List.class, Span.class), b0.e(), "spans");
        zq3.g(f, "moshi.adapter(Types.newP…mptySet(),\n      \"spans\")");
        this.nullableListOfSpanAdapter = f;
        JsonAdapter<InternalError> f2 = iVar.f(InternalError.class, b0.e(), "internalError");
        zq3.g(f2, "moshi.adapter(InternalEr…tySet(), \"internalError\")");
        this.nullableInternalErrorAdapter = f2;
        JsonAdapter<Map<String, String>> f3 = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "sharedLibSymbolMapping");
        zq3.g(f3, "moshi.adapter(Types.newP…\"sharedLibSymbolMapping\")");
        this.nullableMapOfStringStringAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SessionPayload");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public SessionPayload fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        List list2 = null;
        InternalError internalError = null;
        Map map = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    list = (List) this.nullableListOfSpanAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    list2 = (List) this.nullableListOfSpanAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                } else if (P == 2) {
                    internalError = (InternalError) this.nullableInternalErrorAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                } else if (P == 3) {
                    map = (Map) this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
                    j = 4294967287L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967280L)) {
            return new SessionPayload(list, list2, internalError, map);
        }
        Constructor<SessionPayload> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SessionPayload.class.getDeclaredConstructor(List.class, List.class, InternalError.class, Map.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "SessionPayload::class.ja…his.constructorRef = it }");
        }
        SessionPayload newInstance = constructor.newInstance(list, list2, internalError, map, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, SessionPayload sessionPayload) {
        zq3.h(hVar, "writer");
        if (sessionPayload == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("spans");
        this.nullableListOfSpanAdapter.mo197toJson(hVar, sessionPayload.getSpans());
        hVar.C("span_snapshots");
        this.nullableListOfSpanAdapter.mo197toJson(hVar, sessionPayload.getSpanSnapshots());
        hVar.C("internal_error");
        this.nullableInternalErrorAdapter.mo197toJson(hVar, sessionPayload.getInternalError());
        hVar.C("shared_lib_symbol_mapping");
        this.nullableMapOfStringStringAdapter.mo197toJson(hVar, sessionPayload.getSharedLibSymbolMapping());
        hVar.l();
    }
}
