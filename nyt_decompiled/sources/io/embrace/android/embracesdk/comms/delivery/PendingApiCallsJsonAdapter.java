package io.embrace.android.embracesdk.comms.delivery;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.ku8;
import defpackage.zq3;
import io.embrace.android.embracesdk.comms.api.Endpoint;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class PendingApiCallsJsonAdapter extends JsonAdapter<PendingApiCalls> {
    private volatile Constructor<PendingApiCalls> constructorRef;
    private final JsonAdapter<Map<Endpoint, List<PendingApiCall>>> mutableMapOfEndpointMutableListOfPendingApiCallAdapter;
    private final JsonReader.b options;

    public PendingApiCallsJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("pendingApiCallsMap");
        zq3.g(a, "JsonReader.Options.of(\"pendingApiCallsMap\")");
        this.options = a;
        JsonAdapter<Map<Endpoint, List<PendingApiCall>>> f = iVar.f(j.j(Map.class, Endpoint.class, j.j(List.class, PendingApiCall.class)), b0.e(), "pendingApiCallsMap");
        zq3.g(f, "moshi.adapter(Types.newP…    \"pendingApiCallsMap\")");
        this.mutableMapOfEndpointMutableListOfPendingApiCallAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PendingApiCalls");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public PendingApiCalls fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Map map = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                map = (Map) this.mutableMapOfEndpointMutableListOfPendingApiCallAdapter.fromJson(jsonReader);
                if (map == null) {
                    JsonDataException x = c29.x("pendingApiCallsMap", "pendingApiCallsMap", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"pen…dingApiCallsMap\", reader)");
                    throw x;
                }
                i &= (int) 4294967294L;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967294L)) {
            if (map != null) {
                return new PendingApiCalls(ku8.d(map));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<io.embrace.android.embracesdk.comms.api.Endpoint, kotlin.collections.MutableList<io.embrace.android.embracesdk.comms.delivery.PendingApiCall>>");
        }
        Constructor<PendingApiCalls> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PendingApiCalls.class.getDeclaredConstructor(Map.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "PendingApiCalls::class.j…his.constructorRef = it }");
        }
        PendingApiCalls newInstance = constructor.newInstance(map, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PendingApiCalls pendingApiCalls) {
        zq3.h(hVar, "writer");
        if (pendingApiCalls == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("pendingApiCallsMap");
        this.mutableMapOfEndpointMutableListOfPendingApiCallAdapter.mo197toJson(hVar, pendingApiCalls.getPendingApiCallsMap$embrace_android_sdk_release());
        hVar.l();
    }
}
