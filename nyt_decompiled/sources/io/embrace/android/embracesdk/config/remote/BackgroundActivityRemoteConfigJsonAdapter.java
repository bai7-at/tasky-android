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
public final class BackgroundActivityRemoteConfigJsonAdapter extends JsonAdapter<BackgroundActivityRemoteConfig> {
    private volatile Constructor<BackgroundActivityRemoteConfig> constructorRef;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonReader.b options;

    public BackgroundActivityRemoteConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("threshold");
        zq3.g(a, "JsonReader.Options.of(\"threshold\")");
        this.options = a;
        JsonAdapter<Float> f = iVar.f(Float.class, b0.e(), "threshold");
        zq3.g(f, "moshi.adapter(Float::cla… emptySet(), \"threshold\")");
        this.nullableFloatAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BackgroundActivityRemoteConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public BackgroundActivityRemoteConfig fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Float f = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                f = (Float) this.nullableFloatAdapter.fromJson(jsonReader);
                i &= (int) 4294967294L;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967294L)) {
            return new BackgroundActivityRemoteConfig(f);
        }
        Constructor<BackgroundActivityRemoteConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BackgroundActivityRemoteConfig.class.getDeclaredConstructor(Float.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "BackgroundActivityRemote…his.constructorRef = it }");
        }
        BackgroundActivityRemoteConfig newInstance = constructor.newInstance(f, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, BackgroundActivityRemoteConfig backgroundActivityRemoteConfig) {
        zq3.h(hVar, "writer");
        if (backgroundActivityRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("threshold");
        this.nullableFloatAdapter.mo197toJson(hVar, backgroundActivityRemoteConfig.getThreshold());
        hVar.l();
    }
}
