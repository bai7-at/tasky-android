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
public final class AppExitInfoLocalConfigJsonAdapter extends JsonAdapter<AppExitInfoLocalConfig> {
    private volatile Constructor<AppExitInfoLocalConfig> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.b options;

    public AppExitInfoLocalConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("app_exit_info_traces_limit", "aei_enabled");
        zq3.g(a, "JsonReader.Options.of(\"a…it\",\n      \"aei_enabled\")");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "appExitInfoTracesLimit");
        zq3.g(f, "moshi.adapter(Int::class…\"appExitInfoTracesLimit\")");
        this.nullableIntAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.class, b0.e(), "aeiCaptureEnabled");
        zq3.g(f2, "moshi.adapter(Boolean::c…t(), \"aeiCaptureEnabled\")");
        this.nullableBooleanAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AppExitInfoLocalConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AppExitInfoLocalConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Boolean bool = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
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
            return new AppExitInfoLocalConfig(num, bool);
        }
        Constructor<AppExitInfoLocalConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AppExitInfoLocalConfig.class.getDeclaredConstructor(Integer.class, Boolean.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "AppExitInfoLocalConfig::…his.constructorRef = it }");
        }
        AppExitInfoLocalConfig newInstance = constructor.newInstance(num, bool, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AppExitInfoLocalConfig appExitInfoLocalConfig) {
        zq3.h(hVar, "writer");
        if (appExitInfoLocalConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("app_exit_info_traces_limit");
        this.nullableIntAdapter.mo197toJson(hVar, appExitInfoLocalConfig.getAppExitInfoTracesLimit());
        hVar.C("aei_enabled");
        this.nullableBooleanAdapter.mo197toJson(hVar, appExitInfoLocalConfig.getAeiCaptureEnabled());
        hVar.l();
    }
}
