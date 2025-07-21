package io.embrace.android.embracesdk.comms.api;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class ApiRequestJsonAdapter extends JsonAdapter<ApiRequest> {
    private volatile Constructor<ApiRequest> constructorRef;
    private final JsonAdapter<EmbraceUrl> embraceUrlAdapter;
    private final JsonAdapter<HttpMethod> httpMethodAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public ApiRequestJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("contentType", "userAgent", "contentEncoding", "accept", "acceptEncoding", "appId", "deviceId", "eventId", "logId", "url", "httpMethod", "eTag");
        zq3.g(a, "JsonReader.Options.of(\"c…    \"httpMethod\", \"eTag\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "contentType");
        zq3.g(f, "moshi.adapter(String::cl…t(),\n      \"contentType\")");
        this.stringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "contentEncoding");
        zq3.g(f2, "moshi.adapter(String::cl…Set(), \"contentEncoding\")");
        this.nullableStringAdapter = f2;
        JsonAdapter<EmbraceUrl> f3 = iVar.f(EmbraceUrl.class, b0.e(), "url");
        zq3.g(f3, "moshi.adapter(EmbraceUrl…\n      emptySet(), \"url\")");
        this.embraceUrlAdapter = f3;
        JsonAdapter<HttpMethod> f4 = iVar.f(HttpMethod.class, b0.e(), "httpMethod");
        zq3.g(f4, "moshi.adapter(HttpMethod…emptySet(), \"httpMethod\")");
        this.httpMethodAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ApiRequest");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ApiRequest fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        EmbraceUrl embraceUrl = null;
        HttpMethod httpMethod = null;
        String str10 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("contentType", "contentType", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"con…   \"contentType\", reader)");
                        throw x;
                    }
                    j = 4294967294L;
                    break;
                case 1:
                    String str11 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str11 == null) {
                        JsonDataException x2 = c29.x("userAgent", "userAgent", jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"use…     \"userAgent\", reader)");
                        throw x2;
                    }
                    i &= (int) 4294967293L;
                    str2 = str11;
                    continue;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                    break;
                case 3:
                    String str12 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str12 == null) {
                        JsonDataException x3 = c29.x("accept", "accept", jsonReader);
                        zq3.g(x3, "Util.unexpectedNull(\"acc…t\",\n              reader)");
                        throw x3;
                    }
                    str4 = str12;
                    j = 4294967287L;
                    break;
                case 4:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967279L;
                    break;
                case 5:
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967263L;
                    break;
                case 6:
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967231L;
                    break;
                case 7:
                    str8 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967167L;
                    break;
                case 8:
                    str9 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967039L;
                    break;
                case 9:
                    EmbraceUrl embraceUrl2 = (EmbraceUrl) this.embraceUrlAdapter.fromJson(jsonReader);
                    if (embraceUrl2 == null) {
                        JsonDataException x4 = c29.x("url", "url", jsonReader);
                        zq3.g(x4, "Util.unexpectedNull(\"url…url\",\n            reader)");
                        throw x4;
                    }
                    embraceUrl = embraceUrl2;
                    continue;
                case 10:
                    HttpMethod httpMethod2 = (HttpMethod) this.httpMethodAdapter.fromJson(jsonReader);
                    if (httpMethod2 == null) {
                        JsonDataException x5 = c29.x("httpMethod", "httpMethod", jsonReader);
                        zq3.g(x5, "Util.unexpectedNull(\"htt…    \"httpMethod\", reader)");
                        throw x5;
                    }
                    httpMethod = httpMethod2;
                    j = 4294966271L;
                    break;
                case 11:
                    str10 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294965247L;
                    break;
            }
            i &= (int) j;
        }
        jsonReader.h();
        if (i == ((int) 4294963712L)) {
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (str4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (embraceUrl != null) {
                if (httpMethod != null) {
                    return new ApiRequest(str, str2, str3, str4, str5, str6, str7, str8, str9, embraceUrl, httpMethod, str10);
                }
                throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.network.http.HttpMethod");
            }
            JsonDataException o = c29.o("url", "url", jsonReader);
            zq3.g(o, "Util.missingProperty(\"url\", \"url\", reader)");
            throw o;
        }
        Constructor<ApiRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ApiRequest.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, EmbraceUrl.class, HttpMethod.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "ApiRequest::class.java.g…his.constructorRef = it }");
        }
        if (embraceUrl == null) {
            JsonDataException o2 = c29.o("url", "url", jsonReader);
            zq3.g(o2, "Util.missingProperty(\"url\", \"url\", reader)");
            throw o2;
        }
        ApiRequest newInstance = constructor.newInstance(str, str2, str3, str4, str5, str6, str7, str8, str9, embraceUrl, httpMethod, str10, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ApiRequest apiRequest) {
        zq3.h(hVar, "writer");
        if (apiRequest == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("contentType");
        this.stringAdapter.mo197toJson(hVar, apiRequest.getContentType());
        hVar.C("userAgent");
        this.stringAdapter.mo197toJson(hVar, apiRequest.getUserAgent());
        hVar.C("contentEncoding");
        this.nullableStringAdapter.mo197toJson(hVar, apiRequest.getContentEncoding());
        hVar.C("accept");
        this.stringAdapter.mo197toJson(hVar, apiRequest.getAccept());
        hVar.C("acceptEncoding");
        this.nullableStringAdapter.mo197toJson(hVar, apiRequest.getAcceptEncoding());
        hVar.C("appId");
        this.nullableStringAdapter.mo197toJson(hVar, apiRequest.getAppId());
        hVar.C("deviceId");
        this.nullableStringAdapter.mo197toJson(hVar, apiRequest.getDeviceId());
        hVar.C("eventId");
        this.nullableStringAdapter.mo197toJson(hVar, apiRequest.getEventId());
        hVar.C("logId");
        this.nullableStringAdapter.mo197toJson(hVar, apiRequest.getLogId());
        hVar.C("url");
        this.embraceUrlAdapter.mo197toJson(hVar, apiRequest.getUrl());
        hVar.C("httpMethod");
        this.httpMethodAdapter.mo197toJson(hVar, apiRequest.getHttpMethod());
        hVar.C("eTag");
        this.nullableStringAdapter.mo197toJson(hVar, apiRequest.getETag());
        hVar.l();
    }
}
