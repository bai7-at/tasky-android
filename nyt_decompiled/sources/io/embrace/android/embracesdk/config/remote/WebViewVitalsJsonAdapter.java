package io.embrace.android.embracesdk.config.remote;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class WebViewVitalsJsonAdapter extends JsonAdapter<WebViewVitals> {
    private volatile Constructor<WebViewVitals> constructorRef;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.b options;

    public WebViewVitalsJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("pct_enabled", "max_vitals");
        zq3.g(a, "JsonReader.Options.of(\"pct_enabled\", \"max_vitals\")");
        this.options = a;
        JsonAdapter<Float> f = iVar.f(Float.class, b0.e(), "pctEnabled");
        zq3.g(f, "moshi.adapter(Float::cla…emptySet(), \"pctEnabled\")");
        this.nullableFloatAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.class, b0.e(), "maxVitals");
        zq3.g(f2, "moshi.adapter(Int::class… emptySet(), \"maxVitals\")");
        this.nullableIntAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("WebViewVitals");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public WebViewVitals fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Float f = null;
        Integer num = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    f = (Float) this.nullableFloatAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
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
            return new WebViewVitals(f, num);
        }
        Constructor<WebViewVitals> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = WebViewVitals.class.getDeclaredConstructor(Float.class, Integer.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "WebViewVitals::class.jav…his.constructorRef = it }");
        }
        WebViewVitals newInstance = constructor.newInstance(f, num, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, WebViewVitals webViewVitals) {
        zq3.h(hVar, "writer");
        if (webViewVitals == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("pct_enabled");
        this.nullableFloatAdapter.mo197toJson(hVar, webViewVitals.getPctEnabled());
        hVar.C("max_vitals");
        this.nullableIntAdapter.mo197toJson(hVar, webViewVitals.getMaxVitals());
        hVar.l();
    }
}
