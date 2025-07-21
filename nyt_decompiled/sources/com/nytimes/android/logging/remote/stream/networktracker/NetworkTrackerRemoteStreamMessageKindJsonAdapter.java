package com.nytimes.android.logging.remote.stream.networktracker;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class NetworkTrackerRemoteStreamMessageKindJsonAdapter extends JsonAdapter<NetworkTrackerRemoteStreamMessageKind> {
    public static final int $stable = 8;
    private volatile Constructor<NetworkTrackerRemoteStreamMessageKind> constructorRef;
    private final JsonAdapter<NetworkTrackerRemoteStreamMessageData> networkTrackerRemoteStreamMessageDataAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public NetworkTrackerRemoteStreamMessageKindJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("data", "kind");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<NetworkTrackerRemoteStreamMessageData> f = iVar.f(NetworkTrackerRemoteStreamMessageData.class, b0.e(), "data");
        zq3.g(f, "adapter(...)");
        this.networkTrackerRemoteStreamMessageDataAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "kind");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public NetworkTrackerRemoteStreamMessageKind fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        NetworkTrackerRemoteStreamMessageData networkTrackerRemoteStreamMessageData = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                networkTrackerRemoteStreamMessageData = (NetworkTrackerRemoteStreamMessageData) this.networkTrackerRemoteStreamMessageDataAdapter.fromJson(jsonReader);
                if (networkTrackerRemoteStreamMessageData == null) {
                    JsonDataException x = c29.x("data_", "data", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x2 = c29.x("kind", "kind", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i = -3;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -3) {
            if (networkTrackerRemoteStreamMessageData != null) {
                zq3.f(str, "null cannot be cast to non-null type kotlin.String");
                return new NetworkTrackerRemoteStreamMessageKind(networkTrackerRemoteStreamMessageData, str);
            }
            JsonDataException o = c29.o("data_", "data", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<NetworkTrackerRemoteStreamMessageKind> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NetworkTrackerRemoteStreamMessageKind.class.getDeclaredConstructor(NetworkTrackerRemoteStreamMessageData.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (networkTrackerRemoteStreamMessageData != null) {
            NetworkTrackerRemoteStreamMessageKind newInstance = constructor.newInstance(networkTrackerRemoteStreamMessageData, str, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("data_", "data", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NetworkTrackerRemoteStreamMessageKind networkTrackerRemoteStreamMessageKind) {
        zq3.h(hVar, "writer");
        if (networkTrackerRemoteStreamMessageKind == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("data");
        this.networkTrackerRemoteStreamMessageDataAdapter.mo197toJson(hVar, networkTrackerRemoteStreamMessageKind.a());
        hVar.C("kind");
        this.stringAdapter.mo197toJson(hVar, networkTrackerRemoteStreamMessageKind.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(59);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NetworkTrackerRemoteStreamMessageKind");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
