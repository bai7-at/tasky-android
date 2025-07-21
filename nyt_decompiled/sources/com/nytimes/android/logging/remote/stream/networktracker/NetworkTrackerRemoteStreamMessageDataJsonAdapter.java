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
public final class NetworkTrackerRemoteStreamMessageDataJsonAdapter extends JsonAdapter<NetworkTrackerRemoteStreamMessageData> {
    public static final int $stable = 8;
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;
    private final JsonAdapter<NetworkTrackerRemoteStreamMessageResponse> networkTrackerRemoteStreamMessageResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public NetworkTrackerRemoteStreamMessageDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("requestUrl", "method", "tag", "body", "headers", "response");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "requestUrl");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "tag");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
        JsonAdapter<Map<String, String>> f3 = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "headers");
        zq3.g(f3, "adapter(...)");
        this.mapOfStringStringAdapter = f3;
        JsonAdapter<NetworkTrackerRemoteStreamMessageResponse> f4 = iVar.f(NetworkTrackerRemoteStreamMessageResponse.class, b0.e(), "response");
        zq3.g(f4, "adapter(...)");
        this.networkTrackerRemoteStreamMessageResponseAdapter = f4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public NetworkTrackerRemoteStreamMessageData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Map map = null;
        NetworkTrackerRemoteStreamMessageResponse networkTrackerRemoteStreamMessageResponse = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("requestUrl", "requestUrl", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x2 = c29.x("method", "method", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x3 = c29.x("body", "body", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    break;
                case 4:
                    map = (Map) this.mapOfStringStringAdapter.fromJson(jsonReader);
                    if (map == null) {
                        JsonDataException x4 = c29.x("headers", "headers", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    break;
                case 5:
                    networkTrackerRemoteStreamMessageResponse = (NetworkTrackerRemoteStreamMessageResponse) this.networkTrackerRemoteStreamMessageResponseAdapter.fromJson(jsonReader);
                    if (networkTrackerRemoteStreamMessageResponse == null) {
                        JsonDataException x5 = c29.x("response", "response", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    break;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("requestUrl", "requestUrl", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (str2 == null) {
            JsonDataException o2 = c29.o("method", "method", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        if (str4 == null) {
            JsonDataException o3 = c29.o("body", "body", jsonReader);
            zq3.g(o3, "missingProperty(...)");
            throw o3;
        }
        if (map == null) {
            JsonDataException o4 = c29.o("headers", "headers", jsonReader);
            zq3.g(o4, "missingProperty(...)");
            throw o4;
        }
        if (networkTrackerRemoteStreamMessageResponse != null) {
            return new NetworkTrackerRemoteStreamMessageData(str, str2, str3, str4, map, networkTrackerRemoteStreamMessageResponse);
        }
        JsonDataException o5 = c29.o("response", "response", jsonReader);
        zq3.g(o5, "missingProperty(...)");
        throw o5;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NetworkTrackerRemoteStreamMessageData networkTrackerRemoteStreamMessageData) {
        zq3.h(hVar, "writer");
        if (networkTrackerRemoteStreamMessageData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("requestUrl");
        this.stringAdapter.mo197toJson(hVar, networkTrackerRemoteStreamMessageData.d());
        hVar.C("method");
        this.stringAdapter.mo197toJson(hVar, networkTrackerRemoteStreamMessageData.c());
        hVar.C("tag");
        this.nullableStringAdapter.mo197toJson(hVar, networkTrackerRemoteStreamMessageData.f());
        hVar.C("body");
        this.stringAdapter.mo197toJson(hVar, networkTrackerRemoteStreamMessageData.a());
        hVar.C("headers");
        this.mapOfStringStringAdapter.mo197toJson(hVar, networkTrackerRemoteStreamMessageData.b());
        hVar.C("response");
        this.networkTrackerRemoteStreamMessageResponseAdapter.mo197toJson(hVar, networkTrackerRemoteStreamMessageData.e());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(59);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NetworkTrackerRemoteStreamMessageData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
