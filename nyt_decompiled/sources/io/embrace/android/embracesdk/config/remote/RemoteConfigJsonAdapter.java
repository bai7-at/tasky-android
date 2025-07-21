package io.embrace.android.embracesdk.config.remote;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.Session;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class RemoteConfigJsonAdapter extends JsonAdapter<RemoteConfig> {
    private volatile Constructor<RemoteConfig> constructorRef;
    private final JsonAdapter<AnrRemoteConfig> nullableAnrRemoteConfigAdapter;
    private final JsonAdapter<AppExitInfoConfig> nullableAppExitInfoConfigAdapter;
    private final JsonAdapter<BackgroundActivityRemoteConfig> nullableBackgroundActivityRemoteConfigAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<DataRemoteConfig> nullableDataRemoteConfigAdapter;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<KillSwitchRemoteConfig> nullableKillSwitchRemoteConfigAdapter;
    private final JsonAdapter<LogRemoteConfig> nullableLogRemoteConfigAdapter;
    private final JsonAdapter<Map<String, Long>> nullableMapOfStringLongAdapter;
    private final JsonAdapter<NetworkRemoteConfig> nullableNetworkRemoteConfigAdapter;
    private final JsonAdapter<NetworkSpanForwardingRemoteConfig> nullableNetworkSpanForwardingRemoteConfigAdapter;
    private final JsonAdapter<OTelRemoteConfig> nullableOTelRemoteConfigAdapter;
    private final JsonAdapter<SessionRemoteConfig> nullableSessionRemoteConfigAdapter;
    private final JsonAdapter<Set<NetworkCaptureRuleRemoteConfig>> nullableSetOfNetworkCaptureRuleRemoteConfigAdapter;
    private final JsonAdapter<Set<String>> nullableSetOfStringAdapter;
    private final JsonAdapter<UiRemoteConfig> nullableUiRemoteConfigAdapter;
    private final JsonAdapter<WebViewVitals> nullableWebViewVitalsAdapter;
    private final JsonReader.b options;

    public RemoteConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("threshold", "offset", "event_limits", "disabled_event_and_log_patterns", "disabled_url_patterns", "network_capture", "ui", "network", "session_control", "logs", "anr", "data", "killswitch", "internal_exception_capture_enabled", "pct_beta_features_enabled", "app_exit_info", Session.APPLICATION_STATE_BACKGROUND, "max_session_properties", "network_span_forwarding", "webview_vitals_beta", "pct_defer_service_init", "otel_config");
        zq3.g(a, "JsonReader.Options.of(\"t…ice_init\", \"otel_config\")");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "threshold");
        zq3.g(f, "moshi.adapter(Int::class… emptySet(), \"threshold\")");
        this.nullableIntAdapter = f;
        JsonAdapter<Map<String, Long>> f2 = iVar.f(j.j(Map.class, String.class, Long.class), b0.e(), "eventLimits");
        zq3.g(f2, "moshi.adapter(Types.newP…mptySet(), \"eventLimits\")");
        this.nullableMapOfStringLongAdapter = f2;
        JsonAdapter<Set<String>> f3 = iVar.f(j.j(Set.class, String.class), b0.e(), "disabledEventAndLogPatterns");
        zq3.g(f3, "moshi.adapter(Types.newP…bledEventAndLogPatterns\")");
        this.nullableSetOfStringAdapter = f3;
        JsonAdapter<Set<NetworkCaptureRuleRemoteConfig>> f4 = iVar.f(j.j(Set.class, NetworkCaptureRuleRemoteConfig.class), b0.e(), "networkCaptureRules");
        zq3.g(f4, "moshi.adapter(Types.newP…), \"networkCaptureRules\")");
        this.nullableSetOfNetworkCaptureRuleRemoteConfigAdapter = f4;
        JsonAdapter<UiRemoteConfig> f5 = iVar.f(UiRemoteConfig.class, b0.e(), "uiConfig");
        zq3.g(f5, "moshi.adapter(UiRemoteCo…, emptySet(), \"uiConfig\")");
        this.nullableUiRemoteConfigAdapter = f5;
        JsonAdapter<NetworkRemoteConfig> f6 = iVar.f(NetworkRemoteConfig.class, b0.e(), "networkConfig");
        zq3.g(f6, "moshi.adapter(NetworkRem…tySet(), \"networkConfig\")");
        this.nullableNetworkRemoteConfigAdapter = f6;
        JsonAdapter<SessionRemoteConfig> f7 = iVar.f(SessionRemoteConfig.class, b0.e(), "sessionConfig");
        zq3.g(f7, "moshi.adapter(SessionRem…tySet(), \"sessionConfig\")");
        this.nullableSessionRemoteConfigAdapter = f7;
        JsonAdapter<LogRemoteConfig> f8 = iVar.f(LogRemoteConfig.class, b0.e(), "logConfig");
        zq3.g(f8, "moshi.adapter(LogRemoteC… emptySet(), \"logConfig\")");
        this.nullableLogRemoteConfigAdapter = f8;
        JsonAdapter<AnrRemoteConfig> f9 = iVar.f(AnrRemoteConfig.class, b0.e(), "anrConfig");
        zq3.g(f9, "moshi.adapter(AnrRemoteC… emptySet(), \"anrConfig\")");
        this.nullableAnrRemoteConfigAdapter = f9;
        JsonAdapter<DataRemoteConfig> f10 = iVar.f(DataRemoteConfig.class, b0.e(), "dataConfig");
        zq3.g(f10, "moshi.adapter(DataRemote…emptySet(), \"dataConfig\")");
        this.nullableDataRemoteConfigAdapter = f10;
        JsonAdapter<KillSwitchRemoteConfig> f11 = iVar.f(KillSwitchRemoteConfig.class, b0.e(), "killSwitchConfig");
        zq3.g(f11, "moshi.adapter(KillSwitch…et(), \"killSwitchConfig\")");
        this.nullableKillSwitchRemoteConfigAdapter = f11;
        JsonAdapter<Boolean> f12 = iVar.f(Boolean.class, b0.e(), "internalExceptionCaptureEnabled");
        zq3.g(f12, "moshi.adapter(Boolean::c…ExceptionCaptureEnabled\")");
        this.nullableBooleanAdapter = f12;
        JsonAdapter<Float> f13 = iVar.f(Float.class, b0.e(), "pctBetaFeaturesEnabled");
        zq3.g(f13, "moshi.adapter(Float::cla…\"pctBetaFeaturesEnabled\")");
        this.nullableFloatAdapter = f13;
        JsonAdapter<AppExitInfoConfig> f14 = iVar.f(AppExitInfoConfig.class, b0.e(), "appExitInfoConfig");
        zq3.g(f14, "moshi.adapter(AppExitInf…t(), \"appExitInfoConfig\")");
        this.nullableAppExitInfoConfigAdapter = f14;
        JsonAdapter<BackgroundActivityRemoteConfig> f15 = iVar.f(BackgroundActivityRemoteConfig.class, b0.e(), "backgroundActivityConfig");
        zq3.g(f15, "moshi.adapter(Background…ackgroundActivityConfig\")");
        this.nullableBackgroundActivityRemoteConfigAdapter = f15;
        JsonAdapter<NetworkSpanForwardingRemoteConfig> f16 = iVar.f(NetworkSpanForwardingRemoteConfig.class, b0.e(), "networkSpanForwardingRemoteConfig");
        zq3.g(f16, "moshi.adapter(NetworkSpa…nForwardingRemoteConfig\")");
        this.nullableNetworkSpanForwardingRemoteConfigAdapter = f16;
        JsonAdapter<WebViewVitals> f17 = iVar.f(WebViewVitals.class, b0.e(), "webViewVitals");
        zq3.g(f17, "moshi.adapter(WebViewVit…tySet(), \"webViewVitals\")");
        this.nullableWebViewVitalsAdapter = f17;
        JsonAdapter<OTelRemoteConfig> f18 = iVar.f(OTelRemoteConfig.class, b0.e(), "oTelConfig");
        zq3.g(f18, "moshi.adapter(OTelRemote…emptySet(), \"oTelConfig\")");
        this.nullableOTelRemoteConfigAdapter = f18;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RemoteConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public RemoteConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        int i = -1;
        Integer num2 = null;
        Map map = null;
        Set set = null;
        Set set2 = null;
        Set set3 = null;
        UiRemoteConfig uiRemoteConfig = null;
        NetworkRemoteConfig networkRemoteConfig = null;
        SessionRemoteConfig sessionRemoteConfig = null;
        LogRemoteConfig logRemoteConfig = null;
        AnrRemoteConfig anrRemoteConfig = null;
        DataRemoteConfig dataRemoteConfig = null;
        KillSwitchRemoteConfig killSwitchRemoteConfig = null;
        Boolean bool = null;
        Float f = null;
        AppExitInfoConfig appExitInfoConfig = null;
        BackgroundActivityRemoteConfig backgroundActivityRemoteConfig = null;
        Integer num3 = null;
        NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig = null;
        WebViewVitals webViewVitals = null;
        Float f2 = null;
        OTelRemoteConfig oTelRemoteConfig = null;
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
                    map = (Map) this.nullableMapOfStringLongAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                    break;
                case 3:
                    set = (Set) this.nullableSetOfStringAdapter.fromJson(jsonReader);
                    j = 4294967287L;
                    break;
                case 4:
                    set2 = (Set) this.nullableSetOfStringAdapter.fromJson(jsonReader);
                    j = 4294967279L;
                    break;
                case 5:
                    set3 = (Set) this.nullableSetOfNetworkCaptureRuleRemoteConfigAdapter.fromJson(jsonReader);
                    j = 4294967263L;
                    break;
                case 6:
                    uiRemoteConfig = (UiRemoteConfig) this.nullableUiRemoteConfigAdapter.fromJson(jsonReader);
                    j = 4294967231L;
                    break;
                case 7:
                    networkRemoteConfig = (NetworkRemoteConfig) this.nullableNetworkRemoteConfigAdapter.fromJson(jsonReader);
                    j = 4294967167L;
                    break;
                case 8:
                    sessionRemoteConfig = (SessionRemoteConfig) this.nullableSessionRemoteConfigAdapter.fromJson(jsonReader);
                    j = 4294967039L;
                    break;
                case 9:
                    logRemoteConfig = (LogRemoteConfig) this.nullableLogRemoteConfigAdapter.fromJson(jsonReader);
                    j = 4294966783L;
                    break;
                case 10:
                    anrRemoteConfig = (AnrRemoteConfig) this.nullableAnrRemoteConfigAdapter.fromJson(jsonReader);
                    j = 4294966271L;
                    break;
                case 11:
                    dataRemoteConfig = (DataRemoteConfig) this.nullableDataRemoteConfigAdapter.fromJson(jsonReader);
                    j = 4294965247L;
                    break;
                case 12:
                    killSwitchRemoteConfig = (KillSwitchRemoteConfig) this.nullableKillSwitchRemoteConfigAdapter.fromJson(jsonReader);
                    j = 4294963199L;
                    break;
                case 13:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294959103L;
                    break;
                case 14:
                    f = (Float) this.nullableFloatAdapter.fromJson(jsonReader);
                    j = 4294950911L;
                    break;
                case 15:
                    appExitInfoConfig = (AppExitInfoConfig) this.nullableAppExitInfoConfigAdapter.fromJson(jsonReader);
                    j = 4294934527L;
                    break;
                case 16:
                    backgroundActivityRemoteConfig = (BackgroundActivityRemoteConfig) this.nullableBackgroundActivityRemoteConfigAdapter.fromJson(jsonReader);
                    j = 4294901759L;
                    break;
                case 17:
                    num3 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294836223L;
                    break;
                case 18:
                    networkSpanForwardingRemoteConfig = (NetworkSpanForwardingRemoteConfig) this.nullableNetworkSpanForwardingRemoteConfigAdapter.fromJson(jsonReader);
                    j = 4294705151L;
                    break;
                case 19:
                    webViewVitals = (WebViewVitals) this.nullableWebViewVitalsAdapter.fromJson(jsonReader);
                    j = 4294443007L;
                    break;
                case 20:
                    f2 = (Float) this.nullableFloatAdapter.fromJson(jsonReader);
                    j = 4293918719L;
                    break;
                case 21:
                    i &= (int) 4292870143L;
                    oTelRemoteConfig = (OTelRemoteConfig) this.nullableOTelRemoteConfigAdapter.fromJson(jsonReader);
                    continue;
            }
            i &= (int) j;
        }
        jsonReader.h();
        if (i == ((int) 4290772992L)) {
            return new RemoteConfig(num, num2, map, set, set2, set3, uiRemoteConfig, networkRemoteConfig, sessionRemoteConfig, logRemoteConfig, anrRemoteConfig, dataRemoteConfig, killSwitchRemoteConfig, bool, f, appExitInfoConfig, backgroundActivityRemoteConfig, num3, networkSpanForwardingRemoteConfig, webViewVitals, f2, oTelRemoteConfig);
        }
        Constructor<RemoteConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = RemoteConfig.class.getDeclaredConstructor(Integer.class, Integer.class, Map.class, Set.class, Set.class, Set.class, UiRemoteConfig.class, NetworkRemoteConfig.class, SessionRemoteConfig.class, LogRemoteConfig.class, AnrRemoteConfig.class, DataRemoteConfig.class, KillSwitchRemoteConfig.class, Boolean.class, Float.class, AppExitInfoConfig.class, BackgroundActivityRemoteConfig.class, Integer.class, NetworkSpanForwardingRemoteConfig.class, WebViewVitals.class, Float.class, OTelRemoteConfig.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "RemoteConfig::class.java…his.constructorRef = it }");
        }
        RemoteConfig newInstance = constructor.newInstance(num, num2, map, set, set2, set3, uiRemoteConfig, networkRemoteConfig, sessionRemoteConfig, logRemoteConfig, anrRemoteConfig, dataRemoteConfig, killSwitchRemoteConfig, bool, f, appExitInfoConfig, backgroundActivityRemoteConfig, num3, networkSpanForwardingRemoteConfig, webViewVitals, f2, oTelRemoteConfig, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, RemoteConfig remoteConfig) {
        zq3.h(hVar, "writer");
        if (remoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("threshold");
        this.nullableIntAdapter.mo197toJson(hVar, remoteConfig.getThreshold());
        hVar.C("offset");
        this.nullableIntAdapter.mo197toJson(hVar, remoteConfig.getOffset());
        hVar.C("event_limits");
        this.nullableMapOfStringLongAdapter.mo197toJson(hVar, remoteConfig.getEventLimits());
        hVar.C("disabled_event_and_log_patterns");
        this.nullableSetOfStringAdapter.mo197toJson(hVar, remoteConfig.getDisabledEventAndLogPatterns());
        hVar.C("disabled_url_patterns");
        this.nullableSetOfStringAdapter.mo197toJson(hVar, remoteConfig.getDisabledUrlPatterns());
        hVar.C("network_capture");
        this.nullableSetOfNetworkCaptureRuleRemoteConfigAdapter.mo197toJson(hVar, remoteConfig.getNetworkCaptureRules());
        hVar.C("ui");
        this.nullableUiRemoteConfigAdapter.mo197toJson(hVar, remoteConfig.getUiConfig());
        hVar.C("network");
        this.nullableNetworkRemoteConfigAdapter.mo197toJson(hVar, remoteConfig.getNetworkConfig());
        hVar.C("session_control");
        this.nullableSessionRemoteConfigAdapter.mo197toJson(hVar, remoteConfig.getSessionConfig());
        hVar.C("logs");
        this.nullableLogRemoteConfigAdapter.mo197toJson(hVar, remoteConfig.getLogConfig());
        hVar.C("anr");
        this.nullableAnrRemoteConfigAdapter.mo197toJson(hVar, remoteConfig.getAnrConfig());
        hVar.C("data");
        this.nullableDataRemoteConfigAdapter.mo197toJson(hVar, remoteConfig.getDataConfig());
        hVar.C("killswitch");
        this.nullableKillSwitchRemoteConfigAdapter.mo197toJson(hVar, remoteConfig.getKillSwitchConfig());
        hVar.C("internal_exception_capture_enabled");
        this.nullableBooleanAdapter.mo197toJson(hVar, remoteConfig.getInternalExceptionCaptureEnabled());
        hVar.C("pct_beta_features_enabled");
        this.nullableFloatAdapter.mo197toJson(hVar, remoteConfig.getPctBetaFeaturesEnabled());
        hVar.C("app_exit_info");
        this.nullableAppExitInfoConfigAdapter.mo197toJson(hVar, remoteConfig.getAppExitInfoConfig());
        hVar.C(Session.APPLICATION_STATE_BACKGROUND);
        this.nullableBackgroundActivityRemoteConfigAdapter.mo197toJson(hVar, remoteConfig.getBackgroundActivityConfig());
        hVar.C("max_session_properties");
        this.nullableIntAdapter.mo197toJson(hVar, remoteConfig.getMaxSessionProperties());
        hVar.C("network_span_forwarding");
        this.nullableNetworkSpanForwardingRemoteConfigAdapter.mo197toJson(hVar, remoteConfig.getNetworkSpanForwardingRemoteConfig());
        hVar.C("webview_vitals_beta");
        this.nullableWebViewVitalsAdapter.mo197toJson(hVar, remoteConfig.getWebViewVitals());
        hVar.C("pct_defer_service_init");
        this.nullableFloatAdapter.mo197toJson(hVar, remoteConfig.getPctDeferServiceInitEnabled());
        hVar.C("otel_config");
        this.nullableOTelRemoteConfigAdapter.mo197toJson(hVar, remoteConfig.getOTelConfig());
        hVar.l();
    }
}
