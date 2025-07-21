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
public final class CrashHandlerLocalConfigJsonAdapter extends JsonAdapter<CrashHandlerLocalConfig> {
    private volatile Constructor<CrashHandlerLocalConfig> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.b options;

    public CrashHandlerLocalConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("enabled");
        zq3.g(a, "JsonReader.Options.of(\"enabled\")");
        this.options = a;
        JsonAdapter<Boolean> f = iVar.f(Boolean.class, b0.e(), "enabled");
        zq3.g(f, "moshi.adapter(Boolean::c…e, emptySet(), \"enabled\")");
        this.nullableBooleanAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CrashHandlerLocalConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CrashHandlerLocalConfig fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Boolean bool = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                i &= (int) 4294967294L;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967294L)) {
            return new CrashHandlerLocalConfig(bool);
        }
        Constructor<CrashHandlerLocalConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CrashHandlerLocalConfig.class.getDeclaredConstructor(Boolean.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "CrashHandlerLocalConfig:…his.constructorRef = it }");
        }
        CrashHandlerLocalConfig newInstance = constructor.newInstance(bool, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, CrashHandlerLocalConfig crashHandlerLocalConfig) {
        zq3.h(hVar, "writer");
        if (crashHandlerLocalConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("enabled");
        this.nullableBooleanAdapter.mo197toJson(hVar, crashHandlerLocalConfig.getEnabled());
        hVar.l();
    }
}
