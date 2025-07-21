package com.nytimes.android.hybrid.integration.timing;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class HybridWebViewInfoJsonAdapter extends JsonAdapter<HybridWebViewInfo> {
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<WebViewPerformanceTiming> webViewPerformanceTimingAdapter;

    public HybridWebViewInfoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("title", "timing", "firstContentfulPaintTiming");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "title");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<WebViewPerformanceTiming> f2 = iVar.f(WebViewPerformanceTiming.class, b0.e(), "timing");
        zq3.g(f2, "adapter(...)");
        this.webViewPerformanceTimingAdapter = f2;
        JsonAdapter<Double> f3 = iVar.f(Double.TYPE, b0.e(), "firstContentfulPaintTiming");
        zq3.g(f3, "adapter(...)");
        this.doubleAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HybridWebViewInfo fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        WebViewPerformanceTiming webViewPerformanceTiming = null;
        Double d = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("title", "title", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                webViewPerformanceTiming = (WebViewPerformanceTiming) this.webViewPerformanceTimingAdapter.fromJson(jsonReader);
                if (webViewPerformanceTiming == null) {
                    JsonDataException x2 = c29.x("timing", "timing", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2 && (d = (Double) this.doubleAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("firstContentfulPaintTiming", "firstContentfulPaintTiming", jsonReader);
                zq3.g(x3, "unexpectedNull(...)");
                throw x3;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("title", "title", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (webViewPerformanceTiming == null) {
            JsonDataException o2 = c29.o("timing", "timing", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        if (d != null) {
            return new HybridWebViewInfo(str, webViewPerformanceTiming, d.doubleValue());
        }
        JsonDataException o3 = c29.o("firstContentfulPaintTiming", "firstContentfulPaintTiming", jsonReader);
        zq3.g(o3, "missingProperty(...)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, HybridWebViewInfo hybridWebViewInfo) {
        zq3.h(hVar, "writer");
        if (hybridWebViewInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("title");
        this.stringAdapter.mo197toJson(hVar, hybridWebViewInfo.c());
        hVar.C("timing");
        this.webViewPerformanceTimingAdapter.mo197toJson(hVar, hybridWebViewInfo.b());
        hVar.C("firstContentfulPaintTiming");
        this.doubleAdapter.mo197toJson(hVar, Double.valueOf(hybridWebViewInfo.a()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("HybridWebViewInfo");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
