package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.NetworkSessionV2;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NetworkSessionV2JsonAdapter extends JsonAdapter<NetworkSessionV2> {
    private final JsonAdapter<List<NetworkCallV2>> listOfNetworkCallV2Adapter;
    private final JsonAdapter<Map<String, NetworkSessionV2.DomainCount>> mapOfStringDomainCountAdapter;
    private final JsonReader.b options;

    public NetworkSessionV2JsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.EXTERNAL_REFERRER, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        zq3.g(a, "JsonReader.Options.of(\"r\", \"c\")");
        this.options = a;
        JsonAdapter<List<NetworkCallV2>> f = iVar.f(j.j(List.class, NetworkCallV2.class), b0.e(), "requests");
        zq3.g(f, "moshi.adapter(Types.newP…  emptySet(), \"requests\")");
        this.listOfNetworkCallV2Adapter = f;
        JsonAdapter<Map<String, NetworkSessionV2.DomainCount>> f2 = iVar.f(j.j(Map.class, String.class, NetworkSessionV2.DomainCount.class), b0.e(), "requestCounts");
        zq3.g(f2, "moshi.adapter(Types.newP…tySet(), \"requestCounts\")");
        this.mapOfStringDomainCountAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NetworkSessionV2");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NetworkSessionV2 fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        Map map = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.listOfNetworkCallV2Adapter.fromJson(jsonReader);
                if (list == null) {
                    JsonDataException x = c29.x("requests", QueryKeys.EXTERNAL_REFERRER, jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"requests\", \"r\", reader)");
                    throw x;
                }
            } else if (P == 1 && (map = (Map) this.mapOfStringDomainCountAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("requestCounts", QueryKeys.TIME_ON_VIEW_IN_MINUTES, jsonReader);
                zq3.g(x2, "Util.unexpectedNull(\"requestCounts\", \"c\", reader)");
                throw x2;
            }
        }
        jsonReader.h();
        if (list == null) {
            JsonDataException o = c29.o("requests", QueryKeys.EXTERNAL_REFERRER, jsonReader);
            zq3.g(o, "Util.missingProperty(\"requests\", \"r\", reader)");
            throw o;
        }
        if (map != null) {
            return new NetworkSessionV2(list, map);
        }
        JsonDataException o2 = c29.o("requestCounts", QueryKeys.TIME_ON_VIEW_IN_MINUTES, jsonReader);
        zq3.g(o2, "Util.missingProperty(\"requestCounts\", \"c\", reader)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NetworkSessionV2 networkSessionV2) {
        zq3.h(hVar, "writer");
        if (networkSessionV2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.EXTERNAL_REFERRER);
        this.listOfNetworkCallV2Adapter.mo197toJson(hVar, networkSessionV2.getRequests());
        hVar.C(QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        this.mapOfStringDomainCountAdapter.mo197toJson(hVar, networkSessionV2.getRequestCounts());
        hVar.l();
    }
}
