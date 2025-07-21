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
public final class UiRemoteConfigJsonAdapter extends JsonAdapter<UiRemoteConfig> {
    private volatile Constructor<UiRemoteConfig> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.b options;

    public UiRemoteConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("breadcrumbs", "taps", "views", "web_views", "fragments");
        zq3.g(a, "JsonReader.Options.of(\"b…\"web_views\", \"fragments\")");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "breadcrumbs");
        zq3.g(f, "moshi.adapter(Int::class…mptySet(), \"breadcrumbs\")");
        this.nullableIntAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("UiRemoteConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UiRemoteConfig fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                i &= (int) 4294967294L;
            } else if (P == 1) {
                i &= (int) 4294967293L;
                num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                i &= (int) 4294967291L;
                num3 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            } else if (P == 3) {
                i &= (int) 4294967287L;
                num4 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            } else if (P == 4) {
                i &= (int) 4294967279L;
                num5 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967264L)) {
            return new UiRemoteConfig(num, num2, num3, num4, num5);
        }
        Constructor<UiRemoteConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UiRemoteConfig.class.getDeclaredConstructor(Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "UiRemoteConfig::class.ja…his.constructorRef = it }");
        }
        UiRemoteConfig newInstance = constructor.newInstance(num, num2, num3, num4, num5, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, UiRemoteConfig uiRemoteConfig) {
        zq3.h(hVar, "writer");
        if (uiRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("breadcrumbs");
        this.nullableIntAdapter.mo197toJson(hVar, uiRemoteConfig.getBreadcrumbs());
        hVar.C("taps");
        this.nullableIntAdapter.mo197toJson(hVar, uiRemoteConfig.getTaps());
        hVar.C("views");
        this.nullableIntAdapter.mo197toJson(hVar, uiRemoteConfig.getViews());
        hVar.C("web_views");
        this.nullableIntAdapter.mo197toJson(hVar, uiRemoteConfig.getWebViews());
        hVar.C("fragments");
        this.nullableIntAdapter.mo197toJson(hVar, uiRemoteConfig.getFragments());
        hVar.l();
    }
}
