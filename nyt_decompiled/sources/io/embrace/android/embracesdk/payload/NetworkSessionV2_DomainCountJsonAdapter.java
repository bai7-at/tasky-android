package io.embrace.android.embracesdk.payload;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.NetworkSessionV2;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NetworkSessionV2_DomainCountJsonAdapter extends JsonAdapter<NetworkSessionV2.DomainCount> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.b options;

    public NetworkSessionV2_DomainCountJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("requestCount", "captureLimit");
        zq3.g(a, "JsonReader.Options.of(\"r…stCount\", \"captureLimit\")");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.TYPE, b0.e(), "requestCount");
        zq3.g(f, "moshi.adapter(Int::class…(),\n      \"requestCount\")");
        this.intAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NetworkSessionV2.DomainCount");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NetworkSessionV2.DomainCount fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x = c29.x("requestCount", "requestCount", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"req…  \"requestCount\", reader)");
                    throw x;
                }
            } else if (P == 1 && (num2 = (Integer) this.intAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("captureLimit", "captureLimit", jsonReader);
                zq3.g(x2, "Util.unexpectedNull(\"cap…  \"captureLimit\", reader)");
                throw x2;
            }
        }
        jsonReader.h();
        if (num == null) {
            JsonDataException o = c29.o("requestCount", "requestCount", jsonReader);
            zq3.g(o, "Util.missingProperty(\"re…unt\",\n            reader)");
            throw o;
        }
        int intValue = num.intValue();
        if (num2 != null) {
            return new NetworkSessionV2.DomainCount(intValue, num2.intValue());
        }
        JsonDataException o2 = c29.o("captureLimit", "captureLimit", jsonReader);
        zq3.g(o2, "Util.missingProperty(\"ca…mit\",\n            reader)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NetworkSessionV2.DomainCount domainCount) {
        zq3.h(hVar, "writer");
        if (domainCount == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("requestCount");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(domainCount.getRequestCount()));
        hVar.C("captureLimit");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(domainCount.getCaptureLimit()));
        hVar.l();
    }
}
