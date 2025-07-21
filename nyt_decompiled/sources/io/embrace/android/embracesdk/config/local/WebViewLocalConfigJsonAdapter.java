package io.embrace.android.embracesdk.config.local;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class WebViewLocalConfigJsonAdapter extends JsonAdapter<WebViewLocalConfig> {
    private volatile Constructor<WebViewLocalConfig> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.b options;

    public WebViewLocalConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("enable", "capture_query_params");
        zq3.g(a, "JsonReader.Options.of(\"e…, \"capture_query_params\")");
        this.options = a;
        JsonAdapter<Boolean> f = iVar.f(Boolean.class, b0.e(), "captureWebViews");
        zq3.g(f, "moshi.adapter(Boolean::c…Set(), \"captureWebViews\")");
        this.nullableBooleanAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("WebViewLocalConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public WebViewLocalConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Boolean bool = null;
        Boolean bool2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967292L)) {
            return new WebViewLocalConfig(bool, bool2);
        }
        Constructor<WebViewLocalConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = WebViewLocalConfig.class.getDeclaredConstructor(Boolean.class, Boolean.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "WebViewLocalConfig::clas…his.constructorRef = it }");
        }
        WebViewLocalConfig newInstance = constructor.newInstance(bool, bool2, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, WebViewLocalConfig webViewLocalConfig) {
        zq3.h(hVar, "writer");
        if (webViewLocalConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("enable");
        this.nullableBooleanAdapter.mo197toJson(hVar, webViewLocalConfig.getCaptureWebViews());
        hVar.C("capture_query_params");
        this.nullableBooleanAdapter.mo197toJson(hVar, webViewLocalConfig.getCaptureQueryParams());
        hVar.l();
    }
}
