package com.nytimes.android.logging.remote.stream.networktracker;

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
public final class NetworkTrackerRemoteStreamMessageResponseJsonAdapter extends JsonAdapter<NetworkTrackerRemoteStreamMessageResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public NetworkTrackerRemoteStreamMessageResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("headers", "body", "code", "error");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Map<String, String>> f = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "headers");
        zq3.g(f, "adapter(...)");
        this.mapOfStringStringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "body");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
        JsonAdapter<Integer> f3 = iVar.f(Integer.class, b0.e(), "code");
        zq3.g(f3, "adapter(...)");
        this.nullableIntAdapter = f3;
        JsonAdapter<String> f4 = iVar.f(String.class, b0.e(), "error");
        zq3.g(f4, "adapter(...)");
        this.nullableStringAdapter = f4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public NetworkTrackerRemoteStreamMessageResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Map map = null;
        String str = null;
        Integer num = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                map = (Map) this.mapOfStringStringAdapter.fromJson(jsonReader);
                if (map == null) {
                    JsonDataException x = c29.x("headers", "headers", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x2 = c29.x("body", "body", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2) {
                num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            } else if (P == 3) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (map == null) {
            JsonDataException o = c29.o("headers", "headers", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (str != null) {
            return new NetworkTrackerRemoteStreamMessageResponse(map, str, num, str2);
        }
        JsonDataException o2 = c29.o("body", "body", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NetworkTrackerRemoteStreamMessageResponse networkTrackerRemoteStreamMessageResponse) {
        zq3.h(hVar, "writer");
        if (networkTrackerRemoteStreamMessageResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("headers");
        this.mapOfStringStringAdapter.mo197toJson(hVar, networkTrackerRemoteStreamMessageResponse.d());
        hVar.C("body");
        this.stringAdapter.mo197toJson(hVar, networkTrackerRemoteStreamMessageResponse.a());
        hVar.C("code");
        this.nullableIntAdapter.mo197toJson(hVar, networkTrackerRemoteStreamMessageResponse.b());
        hVar.C("error");
        this.nullableStringAdapter.mo197toJson(hVar, networkTrackerRemoteStreamMessageResponse.c());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(63);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NetworkTrackerRemoteStreamMessageResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
