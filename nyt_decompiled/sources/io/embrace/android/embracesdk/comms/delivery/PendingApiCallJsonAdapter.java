package io.embrace.android.embracesdk.comms.delivery;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.comms.api.ApiRequest;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class PendingApiCallJsonAdapter extends JsonAdapter<PendingApiCall> {
    private final JsonAdapter<ApiRequest> apiRequestAdapter;
    private volatile Constructor<PendingApiCall> constructorRef;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public PendingApiCallJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("apiRequest", "cachedPayload", "queueTime");
        zq3.g(a, "JsonReader.Options.of(\"a…load\",\n      \"queueTime\")");
        this.options = a;
        JsonAdapter<ApiRequest> f = iVar.f(ApiRequest.class, b0.e(), "apiRequest");
        zq3.g(f, "moshi.adapter(ApiRequest…emptySet(), \"apiRequest\")");
        this.apiRequestAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "cachedPayloadFilename");
        zq3.g(f2, "moshi.adapter(String::cl… \"cachedPayloadFilename\")");
        this.stringAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.class, b0.e(), "queueTime");
        zq3.g(f3, "moshi.adapter(Long::clas… emptySet(), \"queueTime\")");
        this.nullableLongAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PendingApiCall");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public PendingApiCall fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        int i = -1;
        ApiRequest apiRequest = null;
        String str = null;
        Long l = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                apiRequest = (ApiRequest) this.apiRequestAdapter.fromJson(jsonReader);
                if (apiRequest == null) {
                    JsonDataException x = c29.x("apiRequest", "apiRequest", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"api…t\", \"apiRequest\", reader)");
                    throw x;
                }
            } else if (P == 1) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x2 = c29.x("cachedPayloadFilename", "cachedPayload", jsonReader);
                    zq3.g(x2, "Util.unexpectedNull(\"cac… \"cachedPayload\", reader)");
                    throw x2;
                }
            } else if (P == 2) {
                l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                i &= (int) 4294967291L;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967291L)) {
            if (apiRequest == null) {
                JsonDataException o = c29.o("apiRequest", "apiRequest", jsonReader);
                zq3.g(o, "Util.missingProperty(\"ap…t\", \"apiRequest\", reader)");
                throw o;
            }
            if (str != null) {
                return new PendingApiCall(apiRequest, str, l);
            }
            JsonDataException o2 = c29.o("cachedPayloadFilename", "cachedPayload", jsonReader);
            zq3.g(o2, "Util.missingProperty(\"ca… \"cachedPayload\", reader)");
            throw o2;
        }
        Constructor<PendingApiCall> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PendingApiCall.class.getDeclaredConstructor(ApiRequest.class, String.class, Long.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "PendingApiCall::class.ja…his.constructorRef = it }");
        }
        if (apiRequest == null) {
            JsonDataException o3 = c29.o("apiRequest", "apiRequest", jsonReader);
            zq3.g(o3, "Util.missingProperty(\"ap…t\", \"apiRequest\", reader)");
            throw o3;
        }
        if (str != null) {
            PendingApiCall newInstance = constructor.newInstance(apiRequest, str, l, Integer.valueOf(i), null);
            zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        JsonDataException o4 = c29.o("cachedPayloadFilename", "cachedPayload", jsonReader);
        zq3.g(o4, "Util.missingProperty(\"ca… \"cachedPayload\", reader)");
        throw o4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PendingApiCall pendingApiCall) {
        zq3.h(hVar, "writer");
        if (pendingApiCall == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("apiRequest");
        this.apiRequestAdapter.mo197toJson(hVar, pendingApiCall.getApiRequest());
        hVar.C("cachedPayload");
        this.stringAdapter.mo197toJson(hVar, pendingApiCall.getCachedPayloadFilename());
        hVar.C("queueTime");
        this.nullableLongAdapter.mo197toJson(hVar, pendingApiCall.getQueueTime());
        hVar.l();
    }
}
