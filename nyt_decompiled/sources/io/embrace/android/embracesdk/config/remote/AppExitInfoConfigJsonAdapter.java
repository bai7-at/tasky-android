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
public final class AppExitInfoConfigJsonAdapter extends JsonAdapter<AppExitInfoConfig> {
    private volatile Constructor<AppExitInfoConfig> constructorRef;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.b options;

    public AppExitInfoConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("app_exit_info_traces_limit", "pct_aei_enabled_v2", "aei_max_num");
        zq3.g(a, "JsonReader.Options.of(\"a…abled_v2\", \"aei_max_num\")");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "appExitInfoTracesLimit");
        zq3.g(f, "moshi.adapter(Int::class…\"appExitInfoTracesLimit\")");
        this.nullableIntAdapter = f;
        JsonAdapter<Float> f2 = iVar.f(Float.class, b0.e(), "pctAeiCaptureEnabled");
        zq3.g(f2, "moshi.adapter(Float::cla…, \"pctAeiCaptureEnabled\")");
        this.nullableFloatAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AppExitInfoConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AppExitInfoConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Float f = null;
        Integer num2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    f = (Float) this.nullableFloatAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                } else if (P == 2) {
                    num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967288L)) {
            return new AppExitInfoConfig(num, f, num2);
        }
        Constructor<AppExitInfoConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AppExitInfoConfig.class.getDeclaredConstructor(Integer.class, Float.class, Integer.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "AppExitInfoConfig::class…his.constructorRef = it }");
        }
        AppExitInfoConfig newInstance = constructor.newInstance(num, f, num2, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AppExitInfoConfig appExitInfoConfig) {
        zq3.h(hVar, "writer");
        if (appExitInfoConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("app_exit_info_traces_limit");
        this.nullableIntAdapter.mo197toJson(hVar, appExitInfoConfig.getAppExitInfoTracesLimit());
        hVar.C("pct_aei_enabled_v2");
        this.nullableFloatAdapter.mo197toJson(hVar, appExitInfoConfig.getPctAeiCaptureEnabled());
        hVar.C("aei_max_num");
        this.nullableIntAdapter.mo197toJson(hVar, appExitInfoConfig.getAeiMaxNum());
        hVar.l();
    }
}
