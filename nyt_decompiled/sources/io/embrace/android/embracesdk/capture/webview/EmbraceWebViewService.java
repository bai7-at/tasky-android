package io.embrace.android.embracesdk.capture.webview;

import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.WebViewInfo;
import io.embrace.android.embracesdk.payload.WebVital;
import io.embrace.android.embracesdk.payload.WebVitalType;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class EmbraceWebViewService implements WebViewService {
    public static final Companion Companion = new Companion(null);
    private static final String MESSAGE_KEY_FOR_METRICS = "EMBRACE_METRIC";
    private static final int SCRIPT_MESSAGE_MAXIMUM_ALLOWED_LENGTH = 2000;
    private final ConfigService configService;
    private final InternalEmbraceLogger logger;
    private final EmbraceSerializer serializer;
    private final HashMap<String, WebViewInfo> webViewInfoMap;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebVitalType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[WebVitalType.CLS.ordinal()] = 1;
            iArr[WebVitalType.LCP.ordinal()] = 2;
        }
    }

    public EmbraceWebViewService(ConfigService configService, EmbraceSerializer embraceSerializer, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(configService, "configService");
        zq3.h(embraceSerializer, "serializer");
        zq3.h(internalEmbraceLogger, "logger");
        this.configService = configService;
        this.serializer = embraceSerializer;
        this.logger = internalEmbraceLogger;
        this.webViewInfoMap = new HashMap<>();
    }

    private final void collectWebVital(String str, String str2) {
        if (this.webViewInfoMap.size() >= this.configService.getWebViewVitalsBehavior().getMaxWebViewVitals()) {
            this.logger.log("Max webview vitals per session exceeded", InternalEmbraceLogger.Severity.DEBUG, null, true);
            return;
        }
        WebViewInfo parseWebVital = parseWebVital(str);
        if (parseWebVital != null) {
            if (this.webViewInfoMap.get(parseWebVital.getUrl() + parseWebVital.getStartTime()) == null) {
                this.webViewInfoMap.put(parseWebVital.getUrl() + parseWebVital.getStartTime(), WebViewInfo.copy$default(parseWebVital, str2, null, null, 0L, new EnumMap(WebVitalType.class), 14, null));
            }
            HashMap<String, WebViewInfo> hashMap = this.webViewInfoMap;
            String str3 = parseWebVital.getUrl() + parseWebVital.getStartTime();
            WebViewInfo webViewInfo = this.webViewInfoMap.get(parseWebVital.getUrl() + parseWebVital.getStartTime());
            if (webViewInfo == null) {
                throw new IllegalStateException("Required value was null.");
            }
            hashMap.put(str3, processVitalList(parseWebVital, webViewInfo));
        }
    }

    private final WebViewInfo parseWebVital(String str) {
        try {
        } catch (Exception e) {
            this.logger.log("Cannot parse Web Vital", InternalEmbraceLogger.Severity.ERROR, e, false);
        }
        if (str.length() < SCRIPT_MESSAGE_MAXIMUM_ALLOWED_LENGTH) {
            return (WebViewInfo) this.serializer.fromJson(str, WebViewInfo.class);
        }
        this.logger.log("Web Vital info is too large to parse", InternalEmbraceLogger.Severity.ERROR, null, false);
        return null;
    }

    private final WebViewInfo processVitalList(WebViewInfo webViewInfo, WebViewInfo webViewInfo2) {
        for (WebVital webVital : webViewInfo.getWebVitals()) {
            WebVital webVital2 = webViewInfo2.getWebVitalMap().get(webVital.getType());
            if (webVital2 == null) {
                webViewInfo2.getWebVitalMap().put(webVital.getType(), webVital);
            } else {
                int i = WhenMappings.$EnumSwitchMapping$0[webVital2.getType().ordinal()];
                if (i == 1) {
                    Long duration = webVital.getDuration();
                    long longValue = duration != null ? duration.longValue() : 0L;
                    Long duration2 = webVital2.getDuration();
                    if (longValue > (duration2 != null ? duration2.longValue() : 0L)) {
                        webViewInfo2.getWebVitalMap().put(webVital2.getType(), webVital);
                    }
                } else if (i == 2 && webVital.getStartTime() > webVital2.getStartTime()) {
                    webViewInfo2.getWebVitalMap().put(webVital2.getType(), webVital);
                }
            }
        }
        return WebViewInfo.copy$default(webViewInfo2, null, i.a1(webViewInfo2.getWebVitalMap().values()), null, 0L, null, 29, null);
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        this.webViewInfoMap.clear();
    }

    @Override // io.embrace.android.embracesdk.capture.webview.WebViewService
    public void collectWebData(String str, String str2) {
        zq3.h(str, "tag");
        zq3.h(str2, "message");
        if (h.P(str2, MESSAGE_KEY_FOR_METRICS, false, 2, null)) {
            collectWebVital(str2, str);
        } else {
            this.logger.log("WebView console message ignored.", InternalEmbraceLogger.Severity.DEBUG, null, true);
        }
    }

    public final ConfigService getConfigService() {
        return this.configService;
    }

    @Override // io.embrace.android.embracesdk.arch.DataCaptureService
    public List<? extends WebViewInfo> getCapturedData() {
        Collection<WebViewInfo> values = this.webViewInfoMap.values();
        zq3.g(values, "webViewInfoMap.values");
        return i.P0(i.X0(values), this.configService.getWebViewVitalsBehavior().getMaxWebViewVitals());
    }
}
