package io.embrace.android.embracesdk.payload;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NetworkRequestsJsonAdapter extends JsonAdapter<NetworkRequests> {
    private final JsonAdapter<NetworkSessionV2> nullableNetworkSessionV2Adapter;
    private final JsonReader.b options;

    public NetworkRequestsJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("v2");
        zq3.g(a, "JsonReader.Options.of(\"v2\")");
        this.options = a;
        JsonAdapter<NetworkSessionV2> f = iVar.f(NetworkSessionV2.class, b0.e(), "networkSessionV2");
        zq3.g(f, "moshi.adapter(NetworkSes…et(), \"networkSessionV2\")");
        this.nullableNetworkSessionV2Adapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NetworkRequests");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NetworkRequests fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        NetworkSessionV2 networkSessionV2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                networkSessionV2 = (NetworkSessionV2) this.nullableNetworkSessionV2Adapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new NetworkRequests(networkSessionV2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NetworkRequests networkRequests) {
        zq3.h(hVar, "writer");
        if (networkRequests == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("v2");
        this.nullableNetworkSessionV2Adapter.mo197toJson(hVar, networkRequests.getNetworkSessionV2());
        hVar.l();
    }
}
