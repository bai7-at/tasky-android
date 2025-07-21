package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NetworkCallV2JsonAdapter extends JsonAdapter<NetworkCallV2> {
    private volatile Constructor<NetworkCallV2> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public NetworkCallV2JsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("url", QueryKeys.SCROLL_POSITION_TOP, "rc", "bo", "bi", "st", "et", "dur", QueryKeys.TOKEN, "ed", "de", "w3c_traceparent");
        zq3.g(a, "JsonReader.Options.of(\"u… \"de\", \"w3c_traceparent\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "url");
        zq3.g(f, "moshi.adapter(String::cl…\n      emptySet(), \"url\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.class, b0.e(), "responseCode");
        zq3.g(f2, "moshi.adapter(Int::class…ptySet(), \"responseCode\")");
        this.nullableIntAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.TYPE, b0.e(), "bytesSent");
        zq3.g(f3, "moshi.adapter(Long::clas…Set(),\n      \"bytesSent\")");
        this.longAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NetworkCallV2");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NetworkCallV2 fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        Long l = 0L;
        jsonReader.b();
        int i = -1;
        Long l2 = l;
        Long l3 = l2;
        Long l4 = l3;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Long l5 = l4;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    i &= (int) 4294967294L;
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 1:
                    i &= (int) 4294967293L;
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 2:
                    i &= (int) 4294967291L;
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                case 3:
                    Long l6 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l6 == null) {
                        JsonDataException x = c29.x("bytesSent", "bo", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"byt…o\",\n              reader)");
                        throw x;
                    }
                    i &= (int) 4294967287L;
                    l2 = l6;
                    continue;
                case 4:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException x2 = c29.x("bytesReceived", "bi", jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"byt…            \"bi\", reader)");
                        throw x2;
                    }
                    j = 4294967279L;
                    break;
                case 5:
                    l5 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l5 == null) {
                        JsonDataException x3 = c29.x("startTime", "st", jsonReader);
                        zq3.g(x3, "Util.unexpectedNull(\"sta…t\",\n              reader)");
                        throw x3;
                    }
                    j = 4294967263L;
                    break;
                case 6:
                    Long l7 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l7 == null) {
                        JsonDataException x4 = c29.x("endTime", "et", jsonReader);
                        zq3.g(x4, "Util.unexpectedNull(\"end…t\",\n              reader)");
                        throw x4;
                    }
                    i &= (int) 4294967231L;
                    l3 = l7;
                    continue;
                case 7:
                    Long l8 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l8 == null) {
                        JsonDataException x5 = c29.x("duration", "dur", jsonReader);
                        zq3.g(x5, "Util.unexpectedNull(\"dur…r\",\n              reader)");
                        throw x5;
                    }
                    i &= (int) 4294967167L;
                    l4 = l8;
                    continue;
                case 8:
                    i &= (int) 4294967039L;
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 9:
                    i &= (int) 4294966783L;
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 10:
                    i &= (int) 4294966271L;
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 11:
                    i &= (int) 4294965247L;
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
            }
            i &= (int) j;
        }
        jsonReader.h();
        if (i == ((int) 4294963200L)) {
            return new NetworkCallV2(str, str2, num, l2.longValue(), l.longValue(), l5.longValue(), l3.longValue(), l4.longValue(), str3, str4, str5, str6);
        }
        Constructor<NetworkCallV2> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Long.TYPE;
            constructor = NetworkCallV2.class.getDeclaredConstructor(String.class, String.class, Integer.class, cls, cls, cls, cls, cls, String.class, String.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "NetworkCallV2::class.jav…his.constructorRef = it }");
        }
        NetworkCallV2 newInstance = constructor.newInstance(str, str2, num, l2, l, l5, l3, l4, str3, str4, str5, str6, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NetworkCallV2 networkCallV2) {
        zq3.h(hVar, "writer");
        if (networkCallV2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("url");
        this.nullableStringAdapter.mo197toJson(hVar, networkCallV2.getUrl());
        hVar.C(QueryKeys.SCROLL_POSITION_TOP);
        this.nullableStringAdapter.mo197toJson(hVar, networkCallV2.getHttpMethod());
        hVar.C("rc");
        this.nullableIntAdapter.mo197toJson(hVar, networkCallV2.getResponseCode());
        hVar.C("bo");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(networkCallV2.getBytesSent()));
        hVar.C("bi");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(networkCallV2.getBytesReceived()));
        hVar.C("st");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(networkCallV2.getStartTime()));
        hVar.C("et");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(networkCallV2.getEndTime()));
        hVar.C("dur");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(networkCallV2.getDuration()));
        hVar.C(QueryKeys.TOKEN);
        this.nullableStringAdapter.mo197toJson(hVar, networkCallV2.getTraceId());
        hVar.C("ed");
        this.nullableStringAdapter.mo197toJson(hVar, networkCallV2.getErrorType());
        hVar.C("de");
        this.nullableStringAdapter.mo197toJson(hVar, networkCallV2.getErrorMessage());
        hVar.C("w3c_traceparent");
        this.nullableStringAdapter.mo197toJson(hVar, networkCallV2.getW3cTraceparent());
        hVar.l();
    }
}
