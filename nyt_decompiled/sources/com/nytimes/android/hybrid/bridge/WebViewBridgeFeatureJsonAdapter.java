package com.nytimes.android.hybrid.bridge;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class WebViewBridgeFeatureJsonAdapter extends JsonAdapter<WebViewBridgeFeature> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader.b options;

    public WebViewBridgeFeatureJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("enabled");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Boolean> f = iVar.f(Boolean.TYPE, b0.e(), "enabled");
        zq3.g(f, "adapter(...)");
        this.booleanAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public WebViewBridgeFeature fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (bool = (Boolean) this.booleanAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("enabled", "enabled", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (bool != null) {
            return new WebViewBridgeFeature(bool.booleanValue());
        }
        JsonDataException o = c29.o("enabled", "enabled", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, WebViewBridgeFeature webViewBridgeFeature) {
        zq3.h(hVar, "writer");
        if (webViewBridgeFeature == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("enabled");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(webViewBridgeFeature.a()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("WebViewBridgeFeature");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
