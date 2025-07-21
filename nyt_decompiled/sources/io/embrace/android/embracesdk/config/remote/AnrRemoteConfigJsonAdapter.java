package io.embrace.android.embracesdk.config.remote;

import com.comscore.streaming.EventType;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.remote.AnrRemoteConfig;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class AnrRemoteConfigJsonAdapter extends JsonAdapter<AnrRemoteConfig> {
    private volatile Constructor<AnrRemoteConfig> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<AnrRemoteConfig.AllowedNdkSampleMethod>> nullableListOfAllowedNdkSampleMethodAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public AnrRemoteConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("pct_enabled", "pct_pe_enabled", "pct_bg_enabled", "interval", "anr_pe_interval", "anr_pe_delay", "anr_pe_sc_extra_time", "per_interval", "max_depth", "per_session", "main_thread_only", "priority", "min_duration", "white_list", "black_list", "unity_ndk_sampling_factor", "unity_ndk_sampling_unwinder", "pct_unity_thread_capture_enabled", "ndk_sampling_offset_enabled", "pct_idle_handler_enabled", "pct_strictmode_listener_enabled", "strictmode_violation_limit", "ignore_unity_ndk_sampling_allowlist", "unity_ndk_sampling_allowlist", "google_pct_enabled", "monitor_thread_priority");
        zq3.g(a, "JsonReader.Options.of(\"p…monitor_thread_priority\")");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "pctEnabled");
        zq3.g(f, "moshi.adapter(Int::class…emptySet(), \"pctEnabled\")");
        this.nullableIntAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.class, b0.e(), "sampleIntervalMs");
        zq3.g(f2, "moshi.adapter(Long::clas…et(), \"sampleIntervalMs\")");
        this.nullableLongAdapter = f2;
        JsonAdapter<Boolean> f3 = iVar.f(Boolean.class, b0.e(), "mainThreadOnly");
        zq3.g(f3, "moshi.adapter(Boolean::c…ySet(), \"mainThreadOnly\")");
        this.nullableBooleanAdapter = f3;
        JsonAdapter<List<String>> f4 = iVar.f(j.j(List.class, String.class), b0.e(), "allowList");
        zq3.g(f4, "moshi.adapter(Types.newP…Set(),\n      \"allowList\")");
        this.nullableListOfStringAdapter = f4;
        JsonAdapter<String> f5 = iVar.f(String.class, b0.e(), "nativeThreadAnrSamplingUnwinder");
        zq3.g(f5, "moshi.adapter(String::cl…readAnrSamplingUnwinder\")");
        this.nullableStringAdapter = f5;
        JsonAdapter<Float> f6 = iVar.f(Float.class, b0.e(), "pctNativeThreadAnrSamplingEnabled");
        zq3.g(f6, "moshi.adapter(Float::cla…hreadAnrSamplingEnabled\")");
        this.nullableFloatAdapter = f6;
        JsonAdapter<List<AnrRemoteConfig.AllowedNdkSampleMethod>> f7 = iVar.f(j.j(List.class, AnrRemoteConfig.AllowedNdkSampleMethod.class), b0.e(), "nativeThreadAnrSamplingAllowlist");
        zq3.g(f7, "moshi.adapter(Types.newP…eadAnrSamplingAllowlist\")");
        this.nullableListOfAllowedNdkSampleMethodAdapter = f7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AnrRemoteConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AnrRemoteConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        int i = -1;
        Integer num2 = null;
        Integer num3 = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Boolean bool = null;
        Integer num7 = null;
        Integer num8 = null;
        List list = null;
        List list2 = null;
        Integer num9 = null;
        String str = null;
        Float f = null;
        Boolean bool2 = null;
        Float f2 = null;
        Float f3 = null;
        Integer num10 = null;
        Boolean bool3 = null;
        List list3 = null;
        Integer num11 = null;
        Integer num12 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                    break;
                case 1:
                    i &= (int) 4294967293L;
                    num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                case 2:
                    num3 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                    break;
                case 3:
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    j = 4294967287L;
                    break;
                case 4:
                    l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    j = 4294967279L;
                    break;
                case 5:
                    l3 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    j = 4294967263L;
                    break;
                case 6:
                    l4 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    j = 4294967231L;
                    break;
                case 7:
                    num4 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967167L;
                    break;
                case 8:
                    num5 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967039L;
                    break;
                case 9:
                    num6 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294966783L;
                    break;
                case 10:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294966271L;
                    break;
                case 11:
                    num7 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294965247L;
                    break;
                case 12:
                    num8 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294963199L;
                    break;
                case 13:
                    list = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
                    j = 4294959103L;
                    break;
                case 14:
                    list2 = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
                    j = 4294950911L;
                    break;
                case 15:
                    num9 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294934527L;
                    break;
                case 16:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294901759L;
                    break;
                case 17:
                    f = (Float) this.nullableFloatAdapter.fromJson(jsonReader);
                    j = 4294836223L;
                    break;
                case 18:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294705151L;
                    break;
                case 19:
                    f2 = (Float) this.nullableFloatAdapter.fromJson(jsonReader);
                    j = 4294443007L;
                    break;
                case 20:
                    f3 = (Float) this.nullableFloatAdapter.fromJson(jsonReader);
                    j = 4293918719L;
                    break;
                case 21:
                    num10 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4292870143L;
                    break;
                case 22:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4290772991L;
                    break;
                case 23:
                    list3 = (List) this.nullableListOfAllowedNdkSampleMethodAdapter.fromJson(jsonReader);
                    j = 4286578687L;
                    break;
                case 24:
                    num11 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4278190079L;
                    break;
                case EventType.SUBS /* 25 */:
                    i &= (int) 4261412863L;
                    num12 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
            }
            i &= (int) j;
        }
        jsonReader.h();
        if (i == ((int) 4227858432L)) {
            return new AnrRemoteConfig(num, num2, num3, l, l2, l3, l4, num4, num5, num6, bool, num7, num8, list, list2, num9, str, f, bool2, f2, f3, num10, bool3, list3, num11, num12);
        }
        Constructor<AnrRemoteConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AnrRemoteConfig.class.getDeclaredConstructor(Integer.class, Integer.class, Integer.class, Long.class, Long.class, Long.class, Long.class, Integer.class, Integer.class, Integer.class, Boolean.class, Integer.class, Integer.class, List.class, List.class, Integer.class, String.class, Float.class, Boolean.class, Float.class, Float.class, Integer.class, Boolean.class, List.class, Integer.class, Integer.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "AnrRemoteConfig::class.j…his.constructorRef = it }");
        }
        AnrRemoteConfig newInstance = constructor.newInstance(num, num2, num3, l, l2, l3, l4, num4, num5, num6, bool, num7, num8, list, list2, num9, str, f, bool2, f2, f3, num10, bool3, list3, num11, num12, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AnrRemoteConfig anrRemoteConfig) {
        zq3.h(hVar, "writer");
        if (anrRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("pct_enabled");
        this.nullableIntAdapter.mo197toJson(hVar, anrRemoteConfig.getPctEnabled());
        hVar.C("pct_pe_enabled");
        this.nullableIntAdapter.mo197toJson(hVar, anrRemoteConfig.getPctAnrProcessErrorsEnabled());
        hVar.C("pct_bg_enabled");
        this.nullableIntAdapter.mo197toJson(hVar, anrRemoteConfig.getPctBgEnabled());
        hVar.C("interval");
        this.nullableLongAdapter.mo197toJson(hVar, anrRemoteConfig.getSampleIntervalMs());
        hVar.C("anr_pe_interval");
        this.nullableLongAdapter.mo197toJson(hVar, anrRemoteConfig.getAnrProcessErrorsIntervalMs());
        hVar.C("anr_pe_delay");
        this.nullableLongAdapter.mo197toJson(hVar, anrRemoteConfig.getAnrProcessErrorsDelayMs());
        hVar.C("anr_pe_sc_extra_time");
        this.nullableLongAdapter.mo197toJson(hVar, anrRemoteConfig.getAnrProcessErrorsSchedulerExtraTimeAllowance());
        hVar.C("per_interval");
        this.nullableIntAdapter.mo197toJson(hVar, anrRemoteConfig.getMaxStacktracesPerInterval());
        hVar.C("max_depth");
        this.nullableIntAdapter.mo197toJson(hVar, anrRemoteConfig.getStacktraceFrameLimit());
        hVar.C("per_session");
        this.nullableIntAdapter.mo197toJson(hVar, anrRemoteConfig.getAnrPerSession());
        hVar.C("main_thread_only");
        this.nullableBooleanAdapter.mo197toJson(hVar, anrRemoteConfig.getMainThreadOnly());
        hVar.C("priority");
        this.nullableIntAdapter.mo197toJson(hVar, anrRemoteConfig.getMinThreadPriority());
        hVar.C("min_duration");
        this.nullableIntAdapter.mo197toJson(hVar, anrRemoteConfig.getMinDuration());
        hVar.C("white_list");
        this.nullableListOfStringAdapter.mo197toJson(hVar, anrRemoteConfig.getAllowList());
        hVar.C("black_list");
        this.nullableListOfStringAdapter.mo197toJson(hVar, anrRemoteConfig.getBlockList());
        hVar.C("unity_ndk_sampling_factor");
        this.nullableIntAdapter.mo197toJson(hVar, anrRemoteConfig.getNativeThreadAnrSamplingFactor());
        hVar.C("unity_ndk_sampling_unwinder");
        this.nullableStringAdapter.mo197toJson(hVar, anrRemoteConfig.getNativeThreadAnrSamplingUnwinder());
        hVar.C("pct_unity_thread_capture_enabled");
        this.nullableFloatAdapter.mo197toJson(hVar, anrRemoteConfig.getPctNativeThreadAnrSamplingEnabled());
        hVar.C("ndk_sampling_offset_enabled");
        this.nullableBooleanAdapter.mo197toJson(hVar, anrRemoteConfig.getNativeThreadAnrSamplingOffsetEnabled());
        hVar.C("pct_idle_handler_enabled");
        this.nullableFloatAdapter.mo197toJson(hVar, anrRemoteConfig.getPctIdleHandlerEnabled());
        hVar.C("pct_strictmode_listener_enabled");
        this.nullableFloatAdapter.mo197toJson(hVar, anrRemoteConfig.getPctStrictModeListenerEnabled());
        hVar.C("strictmode_violation_limit");
        this.nullableIntAdapter.mo197toJson(hVar, anrRemoteConfig.getStrictModeViolationLimit());
        hVar.C("ignore_unity_ndk_sampling_allowlist");
        this.nullableBooleanAdapter.mo197toJson(hVar, anrRemoteConfig.getIgnoreNativeThreadAnrSamplingAllowlist());
        hVar.C("unity_ndk_sampling_allowlist");
        this.nullableListOfAllowedNdkSampleMethodAdapter.mo197toJson(hVar, anrRemoteConfig.getNativeThreadAnrSamplingAllowlist());
        hVar.C("google_pct_enabled");
        this.nullableIntAdapter.mo197toJson(hVar, anrRemoteConfig.getGooglePctEnabled());
        hVar.C("monitor_thread_priority");
        this.nullableIntAdapter.mo197toJson(hVar, anrRemoteConfig.getMonitorThreadPriority());
        hVar.l();
    }
}
