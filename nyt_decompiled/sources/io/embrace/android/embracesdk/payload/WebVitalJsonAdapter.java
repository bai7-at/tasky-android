package io.embrace.android.embracesdk.payload;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.AuthenticationTokenClaims;
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
public final class WebVitalJsonAdapter extends JsonAdapter<WebVital> {
    private volatile Constructor<WebVital> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Double> nullableDoubleAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<WebVitalType> webVitalTypeAdapter;

    public WebVitalJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.TOKEN, QueryKeys.IS_NEW_USER, "st", QueryKeys.SUBDOMAIN, "p", "s");
        zq3.g(a, "JsonReader.Options.of(\"t…\"n\", \"st\", \"d\", \"p\", \"s\")");
        this.options = a;
        JsonAdapter<WebVitalType> f = iVar.f(WebVitalType.class, b0.e(), TransferTable.COLUMN_TYPE);
        zq3.g(f, "moshi.adapter(WebVitalTy…java, emptySet(), \"type\")");
        this.webVitalTypeAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f2, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.stringAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.TYPE, b0.e(), "startTime");
        zq3.g(f3, "moshi.adapter(Long::clas…Set(),\n      \"startTime\")");
        this.longAdapter = f3;
        JsonAdapter<Long> f4 = iVar.f(Long.class, b0.e(), "duration");
        zq3.g(f4, "moshi.adapter(Long::clas…  emptySet(), \"duration\")");
        this.nullableLongAdapter = f4;
        JsonAdapter<Map<String, Object>> f5 = iVar.f(j.j(Map.class, String.class, Object.class), b0.e(), "properties");
        zq3.g(f5, "moshi.adapter(Types.newP…emptySet(), \"properties\")");
        this.nullableMapOfStringAnyAdapter = f5;
        JsonAdapter<Double> f6 = iVar.f(Double.class, b0.e(), "score");
        zq3.g(f6, "moshi.adapter(Double::cl…ype, emptySet(), \"score\")");
        this.nullableDoubleAdapter = f6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("WebVital");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public WebVital fromJson(JsonReader jsonReader) {
        String str;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        WebVitalType webVitalType = null;
        int i = -1;
        String str2 = null;
        Long l = null;
        Long l2 = null;
        Map map = null;
        Double d = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    webVitalType = (WebVitalType) this.webVitalTypeAdapter.fromJson(jsonReader);
                    if (webVitalType == null) {
                        JsonDataException x = c29.x(TransferTable.COLUMN_TYPE, QueryKeys.TOKEN, jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"typ… \"t\",\n            reader)");
                        throw x;
                    }
                    break;
                case 1:
                    String str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x2 = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, QueryKeys.IS_NEW_USER, jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"name\", \"n\", reader)");
                        throw x2;
                    }
                    str2 = str3;
                    break;
                case 2:
                    Long l3 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l3 == null) {
                        JsonDataException x3 = c29.x("startTime", "st", jsonReader);
                        zq3.g(x3, "Util.unexpectedNull(\"sta…            \"st\", reader)");
                        throw x3;
                    }
                    l = l3;
                    break;
                case 3:
                    i &= (int) 4294967287L;
                    l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    i &= (int) 4294967279L;
                    map = (Map) this.nullableMapOfStringAnyAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    i &= (int) 4294967263L;
                    d = (Double) this.nullableDoubleAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967239L)) {
            if (webVitalType == null) {
                JsonDataException o = c29.o(TransferTable.COLUMN_TYPE, QueryKeys.TOKEN, jsonReader);
                zq3.g(o, "Util.missingProperty(\"type\", \"t\", reader)");
                throw o;
            }
            if (str2 == null) {
                JsonDataException o2 = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, QueryKeys.IS_NEW_USER, jsonReader);
                zq3.g(o2, "Util.missingProperty(\"name\", \"n\", reader)");
                throw o2;
            }
            if (l != null) {
                return new WebVital(webVitalType, str2, l.longValue(), l2, map, d);
            }
            JsonDataException o3 = c29.o("startTime", "st", jsonReader);
            zq3.g(o3, "Util.missingProperty(\"startTime\", \"st\", reader)");
            throw o3;
        }
        Constructor<WebVital> constructor = this.constructorRef;
        if (constructor == null) {
            str = "Util.missingProperty(\"name\", \"n\", reader)";
            constructor = WebVital.class.getDeclaredConstructor(WebVitalType.class, String.class, Long.TYPE, Long.class, Map.class, Double.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "WebVital::class.java.get…his.constructorRef = it }");
        } else {
            str = "Util.missingProperty(\"name\", \"n\", reader)";
        }
        Constructor<WebVital> constructor2 = constructor;
        if (webVitalType == null) {
            JsonDataException o4 = c29.o(TransferTable.COLUMN_TYPE, QueryKeys.TOKEN, jsonReader);
            zq3.g(o4, "Util.missingProperty(\"type\", \"t\", reader)");
            throw o4;
        }
        if (str2 == null) {
            JsonDataException o5 = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, QueryKeys.IS_NEW_USER, jsonReader);
            zq3.g(o5, str);
            throw o5;
        }
        if (l == null) {
            JsonDataException o6 = c29.o("startTime", "st", jsonReader);
            zq3.g(o6, "Util.missingProperty(\"startTime\", \"st\", reader)");
            throw o6;
        }
        WebVital newInstance = constructor2.newInstance(webVitalType, str2, l, l2, map, d, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, WebVital webVital) {
        zq3.h(hVar, "writer");
        if (webVital == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.TOKEN);
        this.webVitalTypeAdapter.mo197toJson(hVar, webVital.getType());
        hVar.C(QueryKeys.IS_NEW_USER);
        this.stringAdapter.mo197toJson(hVar, webVital.getName());
        hVar.C("st");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webVital.getStartTime()));
        hVar.C(QueryKeys.SUBDOMAIN);
        this.nullableLongAdapter.mo197toJson(hVar, webVital.getDuration());
        hVar.C("p");
        this.nullableMapOfStringAnyAdapter.mo197toJson(hVar, webVital.getProperties());
        hVar.C("s");
        this.nullableDoubleAdapter.mo197toJson(hVar, webVital.getScore());
        hVar.l();
    }
}
