package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NetworkCapturedCallJsonAdapter extends JsonAdapter<NetworkCapturedCall> {
    private volatile Constructor<NetworkCapturedCall> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public NetworkCapturedCallJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("dur", "et", QueryKeys.MAX_SCROLL_DEPTH, "mu", "id", "qb", "qi", "qq", "qh", "qz", "sb", "si", "sh", "sz", "sc", "sid", "st", "url", Tag.EM, "ne");
        zq3.g(a, "JsonReader.Options.of(\"d… \"st\", \"url\", \"em\", \"ne\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.class, b0.e(), "duration");
        zq3.g(f, "moshi.adapter(Long::clas…  emptySet(), \"duration\")");
        this.nullableLongAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "httpMethod");
        zq3.g(f2, "moshi.adapter(String::cl…emptySet(), \"httpMethod\")");
        this.nullableStringAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "networkId");
        zq3.g(f3, "moshi.adapter(String::cl…Set(),\n      \"networkId\")");
        this.stringAdapter = f3;
        JsonAdapter<Integer> f4 = iVar.f(Integer.class, b0.e(), "requestBodySize");
        zq3.g(f4, "moshi.adapter(Int::class…Set(), \"requestBodySize\")");
        this.nullableIntAdapter = f4;
        JsonAdapter<Map<String, String>> f5 = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "requestQueryHeaders");
        zq3.g(f5, "moshi.adapter(Types.newP…), \"requestQueryHeaders\")");
        this.nullableMapOfStringStringAdapter = f5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NetworkCapturedCall");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NetworkCapturedCall fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        int i = -1;
        Long l2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        Map map = null;
        Integer num2 = null;
        String str6 = null;
        Integer num3 = null;
        Map map2 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str7 = null;
        Long l3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                    break;
                case 1:
                    i &= (int) 4294967293L;
                    l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                case 2:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                    break;
                case 3:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967287L;
                    break;
                case 4:
                    String str11 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str11 == null) {
                        JsonDataException x = c29.x("networkId", "id", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"net…d\",\n              reader)");
                        throw x;
                    }
                    str3 = str11;
                    j = 4294967279L;
                    break;
                case 5:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967263L;
                    break;
                case 6:
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967231L;
                    break;
                case 7:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967167L;
                    break;
                case 8:
                    map = (Map) this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
                    j = 4294967039L;
                    break;
                case 9:
                    num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294966783L;
                    break;
                case 10:
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294966271L;
                    break;
                case 11:
                    num3 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294965247L;
                    break;
                case 12:
                    map2 = (Map) this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
                    j = 4294963199L;
                    break;
                case 13:
                    num4 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294959103L;
                    break;
                case 14:
                    num5 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294950911L;
                    break;
                case 15:
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294934527L;
                    break;
                case 16:
                    l3 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    j = 4294901759L;
                    break;
                case 17:
                    str8 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294836223L;
                    break;
                case 18:
                    str9 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294705151L;
                    break;
                case 19:
                    i &= (int) 4294443007L;
                    str10 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
            }
            i &= (int) j;
        }
        jsonReader.h();
        if (i == ((int) 4293918720L)) {
            if (str3 != null) {
                return new NetworkCapturedCall(l, l2, str, str2, str3, str4, num, str5, map, num2, str6, num3, map2, num4, num5, str7, l3, str8, str9, str10);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Constructor<NetworkCapturedCall> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NetworkCapturedCall.class.getDeclaredConstructor(Long.class, Long.class, String.class, String.class, String.class, String.class, Integer.class, String.class, Map.class, Integer.class, String.class, Integer.class, Map.class, Integer.class, Integer.class, String.class, Long.class, String.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "NetworkCapturedCall::cla…his.constructorRef = it }");
        }
        NetworkCapturedCall newInstance = constructor.newInstance(l, l2, str, str2, str3, str4, num, str5, map, num2, str6, num3, map2, num4, num5, str7, l3, str8, str9, str10, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NetworkCapturedCall networkCapturedCall) {
        zq3.h(hVar, "writer");
        if (networkCapturedCall == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("dur");
        this.nullableLongAdapter.mo197toJson(hVar, networkCapturedCall.getDuration());
        hVar.C("et");
        this.nullableLongAdapter.mo197toJson(hVar, networkCapturedCall.getEndTime());
        hVar.C(QueryKeys.MAX_SCROLL_DEPTH);
        this.nullableStringAdapter.mo197toJson(hVar, networkCapturedCall.getHttpMethod());
        hVar.C("mu");
        this.nullableStringAdapter.mo197toJson(hVar, networkCapturedCall.getMatchedUrl());
        hVar.C("id");
        this.stringAdapter.mo197toJson(hVar, networkCapturedCall.getNetworkId());
        hVar.C("qb");
        this.nullableStringAdapter.mo197toJson(hVar, networkCapturedCall.getRequestBody());
        hVar.C("qi");
        this.nullableIntAdapter.mo197toJson(hVar, networkCapturedCall.getRequestBodySize());
        hVar.C("qq");
        this.nullableStringAdapter.mo197toJson(hVar, networkCapturedCall.getRequestQuery());
        hVar.C("qh");
        this.nullableMapOfStringStringAdapter.mo197toJson(hVar, networkCapturedCall.getRequestQueryHeaders());
        hVar.C("qz");
        this.nullableIntAdapter.mo197toJson(hVar, networkCapturedCall.getRequestSize());
        hVar.C("sb");
        this.nullableStringAdapter.mo197toJson(hVar, networkCapturedCall.getResponseBody());
        hVar.C("si");
        this.nullableIntAdapter.mo197toJson(hVar, networkCapturedCall.getResponseBodySize());
        hVar.C("sh");
        this.nullableMapOfStringStringAdapter.mo197toJson(hVar, networkCapturedCall.getResponseHeaders());
        hVar.C("sz");
        this.nullableIntAdapter.mo197toJson(hVar, networkCapturedCall.getResponseSize());
        hVar.C("sc");
        this.nullableIntAdapter.mo197toJson(hVar, networkCapturedCall.getResponseStatus());
        hVar.C("sid");
        this.nullableStringAdapter.mo197toJson(hVar, networkCapturedCall.getSessionId());
        hVar.C("st");
        this.nullableLongAdapter.mo197toJson(hVar, networkCapturedCall.getStartTime());
        hVar.C("url");
        this.nullableStringAdapter.mo197toJson(hVar, networkCapturedCall.getUrl());
        hVar.C(Tag.EM);
        this.nullableStringAdapter.mo197toJson(hVar, networkCapturedCall.getErrorMessage());
        hVar.C("ne");
        this.nullableStringAdapter.mo197toJson(hVar, networkCapturedCall.getEncryptedPayload());
        hVar.l();
    }
}
