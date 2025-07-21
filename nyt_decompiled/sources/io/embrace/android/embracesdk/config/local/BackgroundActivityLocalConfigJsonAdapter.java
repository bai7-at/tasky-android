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
public final class BackgroundActivityLocalConfigJsonAdapter extends JsonAdapter<BackgroundActivityLocalConfig> {
    private volatile Constructor<BackgroundActivityLocalConfig> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.b options;

    public BackgroundActivityLocalConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("capture_enabled", "manual_background_activity_limit", "min_background_activity_duration", "max_cached_activities");
        zq3.g(a, "JsonReader.Options.of(\"c… \"max_cached_activities\")");
        this.options = a;
        JsonAdapter<Boolean> f = iVar.f(Boolean.class, b0.e(), "backgroundActivityCaptureEnabled");
        zq3.g(f, "moshi.adapter(Boolean::c…dActivityCaptureEnabled\")");
        this.nullableBooleanAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.class, b0.e(), "manualBackgroundActivityLimit");
        zq3.g(f2, "moshi.adapter(Int::class…BackgroundActivityLimit\")");
        this.nullableIntAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.class, b0.e(), "minBackgroundActivityDuration");
        zq3.g(f3, "moshi.adapter(Long::clas…kgroundActivityDuration\")");
        this.nullableLongAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BackgroundActivityLocalConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public BackgroundActivityLocalConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Boolean bool = null;
        Integer num = null;
        Long l = null;
        Integer num2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                } else if (P == 2) {
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                } else if (P == 3) {
                    num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
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
            return new BackgroundActivityLocalConfig(bool, num, l, num2);
        }
        Constructor<BackgroundActivityLocalConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BackgroundActivityLocalConfig.class.getDeclaredConstructor(Boolean.class, Integer.class, Long.class, Integer.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "BackgroundActivityLocalC…his.constructorRef = it }");
        }
        BackgroundActivityLocalConfig newInstance = constructor.newInstance(bool, num, l, num2, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, BackgroundActivityLocalConfig backgroundActivityLocalConfig) {
        zq3.h(hVar, "writer");
        if (backgroundActivityLocalConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("capture_enabled");
        this.nullableBooleanAdapter.mo197toJson(hVar, backgroundActivityLocalConfig.getBackgroundActivityCaptureEnabled());
        hVar.C("manual_background_activity_limit");
        this.nullableIntAdapter.mo197toJson(hVar, backgroundActivityLocalConfig.getManualBackgroundActivityLimit());
        hVar.C("min_background_activity_duration");
        this.nullableLongAdapter.mo197toJson(hVar, backgroundActivityLocalConfig.getMinBackgroundActivityDuration());
        hVar.C("max_cached_activities");
        this.nullableIntAdapter.mo197toJson(hVar, backgroundActivityLocalConfig.getMaxCachedActivities());
        hVar.l();
    }
}
