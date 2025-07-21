package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.ku8;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class WebViewInfoJsonAdapter extends JsonAdapter<WebViewInfo> {
    private volatile Constructor<WebViewInfo> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<WebVital>> mutableListOfWebVitalAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public WebViewInfoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.TOKEN, "vt", QueryKeys.USER_ID, "ts");
        zq3.g(a, "JsonReader.Options.of(\"t\", \"vt\", \"u\", \"ts\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "tag");
        zq3.g(f, "moshi.adapter(String::cl…\n      emptySet(), \"tag\")");
        this.nullableStringAdapter = f;
        JsonAdapter<List<WebVital>> f2 = iVar.f(j.j(List.class, WebVital.class), b0.e(), "webVitals");
        zq3.g(f2, "moshi.adapter(Types.newP… emptySet(), \"webVitals\")");
        this.mutableListOfWebVitalAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "url");
        zq3.g(f3, "moshi.adapter(String::cl… emptySet(),\n      \"url\")");
        this.stringAdapter = f3;
        JsonAdapter<Long> f4 = iVar.f(Long.TYPE, b0.e(), "startTime");
        zq3.g(f4, "moshi.adapter(Long::clas…Set(),\n      \"startTime\")");
        this.longAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("WebViewInfo");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public WebViewInfo fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        List list = null;
        String str2 = null;
        Long l = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    list = (List) this.mutableListOfWebVitalAdapter.fromJson(jsonReader);
                    if (list == null) {
                        JsonDataException x = c29.x("webVitals", "vt", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"webVitals\", \"vt\", reader)");
                        throw x;
                    }
                    j = 4294967293L;
                } else if (P == 2) {
                    String str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x2 = c29.x("url", QueryKeys.USER_ID, jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"url\", \"u\", reader)");
                        throw x2;
                    }
                    str2 = str3;
                } else if (P == 3) {
                    Long l2 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        JsonDataException x3 = c29.x("startTime", "ts", jsonReader);
                        zq3.g(x3, "Util.unexpectedNull(\"sta…            \"ts\", reader)");
                        throw x3;
                    }
                    l = l2;
                } else {
                    continue;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967292L)) {
            if (list == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<io.embrace.android.embracesdk.payload.WebVital>");
            }
            List c = ku8.c(list);
            if (str2 == null) {
                JsonDataException o = c29.o("url", QueryKeys.USER_ID, jsonReader);
                zq3.g(o, "Util.missingProperty(\"url\", \"u\", reader)");
                throw o;
            }
            if (l != null) {
                return new WebViewInfo(str, c, str2, l.longValue(), null, 16, null);
            }
            JsonDataException o2 = c29.o("startTime", "ts", jsonReader);
            zq3.g(o2, "Util.missingProperty(\"startTime\", \"ts\", reader)");
            throw o2;
        }
        Constructor<WebViewInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = WebViewInfo.class.getDeclaredConstructor(String.class, List.class, String.class, Long.TYPE, Map.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "WebViewInfo::class.java.…his.constructorRef = it }");
        }
        if (str2 == null) {
            JsonDataException o3 = c29.o("url", QueryKeys.USER_ID, jsonReader);
            zq3.g(o3, "Util.missingProperty(\"url\", \"u\", reader)");
            throw o3;
        }
        if (l == null) {
            JsonDataException o4 = c29.o("startTime", "ts", jsonReader);
            zq3.g(o4, "Util.missingProperty(\"startTime\", \"ts\", reader)");
            throw o4;
        }
        WebViewInfo newInstance = constructor.newInstance(str, list, str2, l, null, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, WebViewInfo webViewInfo) {
        zq3.h(hVar, "writer");
        if (webViewInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.TOKEN);
        this.nullableStringAdapter.mo197toJson(hVar, webViewInfo.getTag());
        hVar.C("vt");
        this.mutableListOfWebVitalAdapter.mo197toJson(hVar, webViewInfo.getWebVitals());
        hVar.C(QueryKeys.USER_ID);
        this.stringAdapter.mo197toJson(hVar, webViewInfo.getUrl());
        hVar.C("ts");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewInfo.getStartTime()));
        hVar.l();
    }
}
