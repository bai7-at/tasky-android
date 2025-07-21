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
public final class SdkLocalConfigJsonAdapter extends JsonAdapter<SdkLocalConfig> {
    private volatile Constructor<SdkLocalConfig> constructorRef;
    private final JsonAdapter<AnrLocalConfig> nullableAnrLocalConfigAdapter;
    private final JsonAdapter<AppExitInfoLocalConfig> nullableAppExitInfoLocalConfigAdapter;
    private final JsonAdapter<AppLocalConfig> nullableAppLocalConfigAdapter;
    private final JsonAdapter<AutomaticDataCaptureLocalConfig> nullableAutomaticDataCaptureLocalConfigAdapter;
    private final JsonAdapter<BackgroundActivityLocalConfig> nullableBackgroundActivityLocalConfigAdapter;
    private final JsonAdapter<BaseUrlLocalConfig> nullableBaseUrlLocalConfigAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<ComposeLocalConfig> nullableComposeLocalConfigAdapter;
    private final JsonAdapter<CrashHandlerLocalConfig> nullableCrashHandlerLocalConfigAdapter;
    private final JsonAdapter<NetworkLocalConfig> nullableNetworkLocalConfigAdapter;
    private final JsonAdapter<SessionLocalConfig> nullableSessionLocalConfigAdapter;
    private final JsonAdapter<StartupMomentLocalConfig> nullableStartupMomentLocalConfigAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TapsLocalConfig> nullableTapsLocalConfigAdapter;
    private final JsonAdapter<ViewLocalConfig> nullableViewLocalConfigAdapter;
    private final JsonAdapter<WebViewLocalConfig> nullableWebViewLocalConfigAdapter;
    private final JsonReader.b options;

    public SdkLocalConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("automatic_data_capture", "taps", "view_config", "webview", "beta_features_enabled", "crash_handler", "compose", "capture_fcm_pii_data", "networking", "capture_public_key", "anr", "app", "background_activity", "base_urls", "startup_moment", "session", "sig_handler_detection", "app_exit_info");
        zq3.g(a, "JsonReader.Options.of(\"a…\",\n      \"app_exit_info\")");
        this.options = a;
        JsonAdapter<AutomaticDataCaptureLocalConfig> f = iVar.f(AutomaticDataCaptureLocalConfig.class, b0.e(), "automaticDataCaptureConfig");
        zq3.g(f, "moshi.adapter(AutomaticD…omaticDataCaptureConfig\")");
        this.nullableAutomaticDataCaptureLocalConfigAdapter = f;
        JsonAdapter<TapsLocalConfig> f2 = iVar.f(TapsLocalConfig.class, b0.e(), "taps");
        zq3.g(f2, "moshi.adapter(TapsLocalC…java, emptySet(), \"taps\")");
        this.nullableTapsLocalConfigAdapter = f2;
        JsonAdapter<ViewLocalConfig> f3 = iVar.f(ViewLocalConfig.class, b0.e(), "viewConfig");
        zq3.g(f3, "moshi.adapter(ViewLocalC…emptySet(), \"viewConfig\")");
        this.nullableViewLocalConfigAdapter = f3;
        JsonAdapter<WebViewLocalConfig> f4 = iVar.f(WebViewLocalConfig.class, b0.e(), "webViewConfig");
        zq3.g(f4, "moshi.adapter(WebViewLoc…tySet(), \"webViewConfig\")");
        this.nullableWebViewLocalConfigAdapter = f4;
        JsonAdapter<Boolean> f5 = iVar.f(Boolean.class, b0.e(), "betaFeaturesEnabled");
        zq3.g(f5, "moshi.adapter(Boolean::c…), \"betaFeaturesEnabled\")");
        this.nullableBooleanAdapter = f5;
        JsonAdapter<CrashHandlerLocalConfig> f6 = iVar.f(CrashHandlerLocalConfig.class, b0.e(), "crashHandler");
        zq3.g(f6, "moshi.adapter(CrashHandl…ptySet(), \"crashHandler\")");
        this.nullableCrashHandlerLocalConfigAdapter = f6;
        JsonAdapter<ComposeLocalConfig> f7 = iVar.f(ComposeLocalConfig.class, b0.e(), "composeConfig");
        zq3.g(f7, "moshi.adapter(ComposeLoc…tySet(), \"composeConfig\")");
        this.nullableComposeLocalConfigAdapter = f7;
        JsonAdapter<NetworkLocalConfig> f8 = iVar.f(NetworkLocalConfig.class, b0.e(), "networking");
        zq3.g(f8, "moshi.adapter(NetworkLoc…emptySet(), \"networking\")");
        this.nullableNetworkLocalConfigAdapter = f8;
        JsonAdapter<String> f9 = iVar.f(String.class, b0.e(), "capturePublicKey");
        zq3.g(f9, "moshi.adapter(String::cl…et(), \"capturePublicKey\")");
        this.nullableStringAdapter = f9;
        JsonAdapter<AnrLocalConfig> f10 = iVar.f(AnrLocalConfig.class, b0.e(), "anr");
        zq3.g(f10, "moshi.adapter(AnrLocalCo….java, emptySet(), \"anr\")");
        this.nullableAnrLocalConfigAdapter = f10;
        JsonAdapter<AppLocalConfig> f11 = iVar.f(AppLocalConfig.class, b0.e(), "app");
        zq3.g(f11, "moshi.adapter(AppLocalCo….java, emptySet(), \"app\")");
        this.nullableAppLocalConfigAdapter = f11;
        JsonAdapter<BackgroundActivityLocalConfig> f12 = iVar.f(BackgroundActivityLocalConfig.class, b0.e(), "backgroundActivityConfig");
        zq3.g(f12, "moshi.adapter(Background…ackgroundActivityConfig\")");
        this.nullableBackgroundActivityLocalConfigAdapter = f12;
        JsonAdapter<BaseUrlLocalConfig> f13 = iVar.f(BaseUrlLocalConfig.class, b0.e(), "baseUrls");
        zq3.g(f13, "moshi.adapter(BaseUrlLoc…, emptySet(), \"baseUrls\")");
        this.nullableBaseUrlLocalConfigAdapter = f13;
        JsonAdapter<StartupMomentLocalConfig> f14 = iVar.f(StartupMomentLocalConfig.class, b0.e(), "startupMoment");
        zq3.g(f14, "moshi.adapter(StartupMom…tySet(), \"startupMoment\")");
        this.nullableStartupMomentLocalConfigAdapter = f14;
        JsonAdapter<SessionLocalConfig> f15 = iVar.f(SessionLocalConfig.class, b0.e(), "sessionConfig");
        zq3.g(f15, "moshi.adapter(SessionLoc…tySet(), \"sessionConfig\")");
        this.nullableSessionLocalConfigAdapter = f15;
        JsonAdapter<AppExitInfoLocalConfig> f16 = iVar.f(AppExitInfoLocalConfig.class, b0.e(), "appExitInfoConfig");
        zq3.g(f16, "moshi.adapter(AppExitInf…t(), \"appExitInfoConfig\")");
        this.nullableAppExitInfoLocalConfigAdapter = f16;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SdkLocalConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public SdkLocalConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        AutomaticDataCaptureLocalConfig automaticDataCaptureLocalConfig = null;
        int i = -1;
        TapsLocalConfig tapsLocalConfig = null;
        ViewLocalConfig viewLocalConfig = null;
        WebViewLocalConfig webViewLocalConfig = null;
        Boolean bool = null;
        CrashHandlerLocalConfig crashHandlerLocalConfig = null;
        ComposeLocalConfig composeLocalConfig = null;
        Boolean bool2 = null;
        NetworkLocalConfig networkLocalConfig = null;
        String str = null;
        AnrLocalConfig anrLocalConfig = null;
        AppLocalConfig appLocalConfig = null;
        BackgroundActivityLocalConfig backgroundActivityLocalConfig = null;
        BaseUrlLocalConfig baseUrlLocalConfig = null;
        StartupMomentLocalConfig startupMomentLocalConfig = null;
        SessionLocalConfig sessionLocalConfig = null;
        Boolean bool3 = null;
        AppExitInfoLocalConfig appExitInfoLocalConfig = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    automaticDataCaptureLocalConfig = (AutomaticDataCaptureLocalConfig) this.nullableAutomaticDataCaptureLocalConfigAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                    break;
                case 1:
                    i &= (int) 4294967293L;
                    tapsLocalConfig = (TapsLocalConfig) this.nullableTapsLocalConfigAdapter.fromJson(jsonReader);
                    continue;
                case 2:
                    viewLocalConfig = (ViewLocalConfig) this.nullableViewLocalConfigAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                    break;
                case 3:
                    webViewLocalConfig = (WebViewLocalConfig) this.nullableWebViewLocalConfigAdapter.fromJson(jsonReader);
                    j = 4294967287L;
                    break;
                case 4:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294967279L;
                    break;
                case 5:
                    crashHandlerLocalConfig = (CrashHandlerLocalConfig) this.nullableCrashHandlerLocalConfigAdapter.fromJson(jsonReader);
                    j = 4294967263L;
                    break;
                case 6:
                    composeLocalConfig = (ComposeLocalConfig) this.nullableComposeLocalConfigAdapter.fromJson(jsonReader);
                    j = 4294967231L;
                    break;
                case 7:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294967167L;
                    break;
                case 8:
                    networkLocalConfig = (NetworkLocalConfig) this.nullableNetworkLocalConfigAdapter.fromJson(jsonReader);
                    j = 4294967039L;
                    break;
                case 9:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294966783L;
                    break;
                case 10:
                    anrLocalConfig = (AnrLocalConfig) this.nullableAnrLocalConfigAdapter.fromJson(jsonReader);
                    j = 4294966271L;
                    break;
                case 11:
                    appLocalConfig = (AppLocalConfig) this.nullableAppLocalConfigAdapter.fromJson(jsonReader);
                    j = 4294965247L;
                    break;
                case 12:
                    backgroundActivityLocalConfig = (BackgroundActivityLocalConfig) this.nullableBackgroundActivityLocalConfigAdapter.fromJson(jsonReader);
                    j = 4294963199L;
                    break;
                case 13:
                    baseUrlLocalConfig = (BaseUrlLocalConfig) this.nullableBaseUrlLocalConfigAdapter.fromJson(jsonReader);
                    j = 4294959103L;
                    break;
                case 14:
                    startupMomentLocalConfig = (StartupMomentLocalConfig) this.nullableStartupMomentLocalConfigAdapter.fromJson(jsonReader);
                    j = 4294950911L;
                    break;
                case 15:
                    sessionLocalConfig = (SessionLocalConfig) this.nullableSessionLocalConfigAdapter.fromJson(jsonReader);
                    j = 4294934527L;
                    break;
                case 16:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294901759L;
                    break;
                case 17:
                    i &= (int) 4294836223L;
                    appExitInfoLocalConfig = (AppExitInfoLocalConfig) this.nullableAppExitInfoLocalConfigAdapter.fromJson(jsonReader);
                    continue;
            }
            i &= (int) j;
        }
        jsonReader.h();
        if (i == ((int) 4294705152L)) {
            return new SdkLocalConfig(automaticDataCaptureLocalConfig, tapsLocalConfig, viewLocalConfig, webViewLocalConfig, bool, crashHandlerLocalConfig, composeLocalConfig, bool2, networkLocalConfig, str, anrLocalConfig, appLocalConfig, backgroundActivityLocalConfig, baseUrlLocalConfig, startupMomentLocalConfig, sessionLocalConfig, bool3, appExitInfoLocalConfig);
        }
        Constructor<SdkLocalConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SdkLocalConfig.class.getDeclaredConstructor(AutomaticDataCaptureLocalConfig.class, TapsLocalConfig.class, ViewLocalConfig.class, WebViewLocalConfig.class, Boolean.class, CrashHandlerLocalConfig.class, ComposeLocalConfig.class, Boolean.class, NetworkLocalConfig.class, String.class, AnrLocalConfig.class, AppLocalConfig.class, BackgroundActivityLocalConfig.class, BaseUrlLocalConfig.class, StartupMomentLocalConfig.class, SessionLocalConfig.class, Boolean.class, AppExitInfoLocalConfig.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "SdkLocalConfig::class.ja…his.constructorRef = it }");
        }
        SdkLocalConfig newInstance = constructor.newInstance(automaticDataCaptureLocalConfig, tapsLocalConfig, viewLocalConfig, webViewLocalConfig, bool, crashHandlerLocalConfig, composeLocalConfig, bool2, networkLocalConfig, str, anrLocalConfig, appLocalConfig, backgroundActivityLocalConfig, baseUrlLocalConfig, startupMomentLocalConfig, sessionLocalConfig, bool3, appExitInfoLocalConfig, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, SdkLocalConfig sdkLocalConfig) {
        zq3.h(hVar, "writer");
        if (sdkLocalConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("automatic_data_capture");
        this.nullableAutomaticDataCaptureLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getAutomaticDataCaptureConfig());
        hVar.C("taps");
        this.nullableTapsLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getTaps());
        hVar.C("view_config");
        this.nullableViewLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getViewConfig());
        hVar.C("webview");
        this.nullableWebViewLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getWebViewConfig());
        hVar.C("beta_features_enabled");
        this.nullableBooleanAdapter.mo197toJson(hVar, sdkLocalConfig.getBetaFeaturesEnabled());
        hVar.C("crash_handler");
        this.nullableCrashHandlerLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getCrashHandler());
        hVar.C("compose");
        this.nullableComposeLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getComposeConfig());
        hVar.C("capture_fcm_pii_data");
        this.nullableBooleanAdapter.mo197toJson(hVar, sdkLocalConfig.getCaptureFcmPiiData());
        hVar.C("networking");
        this.nullableNetworkLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getNetworking());
        hVar.C("capture_public_key");
        this.nullableStringAdapter.mo197toJson(hVar, sdkLocalConfig.getCapturePublicKey());
        hVar.C("anr");
        this.nullableAnrLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getAnr());
        hVar.C("app");
        this.nullableAppLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getApp());
        hVar.C("background_activity");
        this.nullableBackgroundActivityLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getBackgroundActivityConfig());
        hVar.C("base_urls");
        this.nullableBaseUrlLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getBaseUrls());
        hVar.C("startup_moment");
        this.nullableStartupMomentLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getStartupMoment());
        hVar.C("session");
        this.nullableSessionLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getSessionConfig());
        hVar.C("sig_handler_detection");
        this.nullableBooleanAdapter.mo197toJson(hVar, sdkLocalConfig.getSigHandlerDetection());
        hVar.C("app_exit_info");
        this.nullableAppExitInfoLocalConfigAdapter.mo197toJson(hVar, sdkLocalConfig.getAppExitInfoConfig());
        hVar.l();
    }
}
