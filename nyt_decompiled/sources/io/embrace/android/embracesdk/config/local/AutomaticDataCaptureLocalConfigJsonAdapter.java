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
public final class AutomaticDataCaptureLocalConfigJsonAdapter extends JsonAdapter<AutomaticDataCaptureLocalConfig> {
    private volatile Constructor<AutomaticDataCaptureLocalConfig> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.b options;

    public AutomaticDataCaptureLocalConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("memory_info", "power_save_mode_info", "network_connectivity_info", "anr_info");
        zq3.g(a, "JsonReader.Options.of(\"m…tivity_info\", \"anr_info\")");
        this.options = a;
        JsonAdapter<Boolean> f = iVar.f(Boolean.class, b0.e(), "memoryServiceEnabled");
        zq3.g(f, "moshi.adapter(Boolean::c…, \"memoryServiceEnabled\")");
        this.nullableBooleanAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AutomaticDataCaptureLocalConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AutomaticDataCaptureLocalConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
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
                } else if (P == 2) {
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                } else if (P == 3) {
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294967287L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967280L)) {
            return new AutomaticDataCaptureLocalConfig(bool, bool2, bool3, bool4);
        }
        Constructor<AutomaticDataCaptureLocalConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AutomaticDataCaptureLocalConfig.class.getDeclaredConstructor(Boolean.class, Boolean.class, Boolean.class, Boolean.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "AutomaticDataCaptureLoca…his.constructorRef = it }");
        }
        AutomaticDataCaptureLocalConfig newInstance = constructor.newInstance(bool, bool2, bool3, bool4, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AutomaticDataCaptureLocalConfig automaticDataCaptureLocalConfig) {
        zq3.h(hVar, "writer");
        if (automaticDataCaptureLocalConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("memory_info");
        this.nullableBooleanAdapter.mo197toJson(hVar, automaticDataCaptureLocalConfig.getMemoryServiceEnabled());
        hVar.C("power_save_mode_info");
        this.nullableBooleanAdapter.mo197toJson(hVar, automaticDataCaptureLocalConfig.getPowerSaveModeServiceEnabled());
        hVar.C("network_connectivity_info");
        this.nullableBooleanAdapter.mo197toJson(hVar, automaticDataCaptureLocalConfig.getNetworkConnectivityServiceEnabled());
        hVar.C("anr_info");
        this.nullableBooleanAdapter.mo197toJson(hVar, automaticDataCaptureLocalConfig.getAnrServiceEnabled());
        hVar.l();
    }
}
