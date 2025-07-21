package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class WebViewBreadcrumbJsonAdapter extends JsonAdapter<WebViewBreadcrumb> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public WebViewBreadcrumbJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.USER_ID, "st");
        zq3.g(a, "JsonReader.Options.of(\"u\", \"st\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "url");
        zq3.g(f, "moshi.adapter(String::cl… emptySet(),\n      \"url\")");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "startTime");
        zq3.g(f2, "moshi.adapter(Long::clas…Set(),\n      \"startTime\")");
        this.longAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("WebViewBreadcrumb");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public WebViewBreadcrumb fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Long l = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("url", QueryKeys.USER_ID, jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"url\", \"u\", reader)");
                    throw x;
                }
            } else if (P == 1 && (l = (Long) this.longAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("startTime", "st", jsonReader);
                zq3.g(x2, "Util.unexpectedNull(\"sta…            \"st\", reader)");
                throw x2;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("url", QueryKeys.USER_ID, jsonReader);
            zq3.g(o, "Util.missingProperty(\"url\", \"u\", reader)");
            throw o;
        }
        if (l != null) {
            return new WebViewBreadcrumb(str, l.longValue());
        }
        JsonDataException o2 = c29.o("startTime", "st", jsonReader);
        zq3.g(o2, "Util.missingProperty(\"startTime\", \"st\", reader)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, WebViewBreadcrumb webViewBreadcrumb) {
        zq3.h(hVar, "writer");
        if (webViewBreadcrumb == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.USER_ID);
        this.stringAdapter.mo197toJson(hVar, webViewBreadcrumb.getUrl());
        hVar.C("st");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(webViewBreadcrumb.getStartTime$embrace_android_sdk_release()));
        hVar.l();
    }
}
