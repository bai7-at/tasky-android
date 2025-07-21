package io.embrace.android.embracesdk.network.logging;

import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.config.remote.NetworkCaptureRuleRemoteConfig;
import io.embrace.android.embracesdk.event.LogMessageService;
import io.embrace.android.embracesdk.internal.network.http.NetworkCaptureData;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.NetworkCapturedCall;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.c;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class EmbraceNetworkCaptureService implements NetworkCaptureService {
    public static final Companion Companion = new Companion(null);
    public static final int NETWORK_ERROR_CODE = -1;
    private final ConfigService configService;
    private final LogMessageService logMessageService;
    private final InternalEmbraceLogger logger;
    private final MetadataService metadataService;
    private final c04 networkCaptureEncryptionManager;
    private final PreferencesService preferencesService;
    private final EmbraceSerializer serializer;
    private final SessionIdTracker sessionIdTracker;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceNetworkCaptureService(MetadataService metadataService, SessionIdTracker sessionIdTracker, PreferencesService preferencesService, LogMessageService logMessageService, ConfigService configService, EmbraceSerializer embraceSerializer, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(metadataService, "metadataService");
        zq3.h(sessionIdTracker, "sessionIdTracker");
        zq3.h(preferencesService, "preferencesService");
        zq3.h(logMessageService, "logMessageService");
        zq3.h(configService, "configService");
        zq3.h(embraceSerializer, "serializer");
        zq3.h(internalEmbraceLogger, "logger");
        this.metadataService = metadataService;
        this.sessionIdTracker = sessionIdTracker;
        this.preferencesService = preferencesService;
        this.logMessageService = logMessageService;
        this.configService = configService;
        this.serializer = embraceSerializer;
        this.logger = internalEmbraceLogger;
        this.networkCaptureEncryptionManager = c.a(new qs2() { // from class: io.embrace.android.embracesdk.network.logging.EmbraceNetworkCaptureService$networkCaptureEncryptionManager$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final NetworkCaptureEncryptionManager mo865invoke() {
                InternalEmbraceLogger internalEmbraceLogger2;
                internalEmbraceLogger2 = EmbraceNetworkCaptureService.this.logger;
                return new NetworkCaptureEncryptionManager(internalEmbraceLogger2);
            }
        });
    }

    private final String encryptNetworkCall(NetworkCapturedCall networkCapturedCall) {
        String capturePublicKey = this.configService.getNetworkBehavior().getCapturePublicKey();
        if (capturePublicKey == null) {
            return null;
        }
        return ((NetworkCaptureEncryptionManager) this.networkCaptureEncryptionManager.getValue()).encrypt(this.serializer.toJson(networkCapturedCall), capturePublicKey);
    }

    private final NetworkCapturedCall getNetworkPayload(NetworkCapturedCall networkCapturedCall) {
        return this.configService.getNetworkBehavior().isCaptureBodyEncryptionEnabled() ? new NetworkCapturedCall(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, encryptNetworkCall(networkCapturedCall), 524287, null) : networkCapturedCall;
    }

    private final String parseBody(byte[] bArr, long j) {
        if (bArr != null) {
            return h.s(bArr, 0, (((long) bArr.length) > j ? Long.valueOf(j) : Integer.valueOf(bArr.length)).intValue(), false);
        }
        return null;
    }

    private final boolean shouldApplyRule(NetworkCaptureRuleRemoteConfig networkCaptureRuleRemoteConfig, long j, int i) {
        Long duration;
        if (networkCaptureRuleRemoteConfig.getStatusCodes().contains(Integer.valueOf(i))) {
            return networkCaptureRuleRemoteConfig.getDuration() == null || ((duration = networkCaptureRuleRemoteConfig.getDuration()) != null && duration.longValue() == 0) || j >= networkCaptureRuleRemoteConfig.getDuration().longValue();
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.network.logging.NetworkCaptureService
    public Set<NetworkCaptureRuleRemoteConfig> getNetworkCaptureRules(String str, String str2) {
        zq3.h(str, "url");
        zq3.h(str2, "method");
        Set b1 = i.b1(this.configService.getNetworkBehavior().getNetworkCaptureRules());
        if (b1.isEmpty()) {
            this.logger.log("No network capture rules", InternalEmbraceLogger.Severity.DEBUG, null, true);
            return b0.e();
        }
        if (str.contentEquals(this.configService.getSdkEndpointBehavior().getData(this.metadataService.getAppId()))) {
            this.logger.log("Cannot intercept Embrace endpoints", InternalEmbraceLogger.Severity.DEBUG, null, true);
            return b0.e();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : b1) {
            NetworkCaptureRuleRemoteConfig networkCaptureRuleRemoteConfig = (NetworkCaptureRuleRemoteConfig) obj;
            if (h.P(networkCaptureRuleRemoteConfig.getMethod(), str2, false, 2, null) && new Regex(networkCaptureRuleRemoteConfig.getUrlRegex()).a(str) && networkCaptureRuleRemoteConfig.getExpiresIn() > 0) {
                arrayList.add(obj);
            }
        }
        Set<NetworkCaptureRuleRemoteConfig> b12 = i.b1(arrayList);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (NetworkCaptureRuleRemoteConfig networkCaptureRuleRemoteConfig2 : b12) {
            if (this.preferencesService.isNetworkCaptureRuleOver(networkCaptureRuleRemoteConfig2.getId())) {
                linkedHashSet.add(networkCaptureRuleRemoteConfig2);
            }
        }
        b1.removeAll(linkedHashSet);
        b12.removeAll(linkedHashSet);
        this.logger.log("Capture rule is: " + b12, InternalEmbraceLogger.Severity.DEBUG, null, true);
        return b12;
    }

    @Override // io.embrace.android.embracesdk.network.logging.NetworkCaptureService
    public void logNetworkCapturedData(String str, String str2, int i, long j, long j2, NetworkCaptureData networkCaptureData, String str3) {
        String parseBody;
        zq3.h(str, "url");
        zq3.h(str2, "httpMethod");
        long max = Math.max(j2 - j, 0L);
        for (NetworkCaptureRuleRemoteConfig networkCaptureRuleRemoteConfig : getNetworkCaptureRules(str, str2)) {
            if (shouldApplyRule(networkCaptureRuleRemoteConfig, max, i)) {
                String parseBody2 = parseBody(networkCaptureData != null ? networkCaptureData.getCapturedRequestBody() : null, networkCaptureRuleRemoteConfig.getMaxSize());
                if (networkCaptureData == null || (parseBody = networkCaptureData.getDataCaptureErrorMessage()) == null) {
                    parseBody = parseBody(networkCaptureData != null ? networkCaptureData.getCapturedResponseBody() : null, networkCaptureRuleRemoteConfig.getMaxSize());
                }
                String str4 = parseBody;
                this.preferencesService.decreaseNetworkCaptureRuleRemainingCount(networkCaptureRuleRemoteConfig.getId(), networkCaptureRuleRemoteConfig.getMaxCount());
                this.logMessageService.logNetwork(getNetworkPayload(new NetworkCapturedCall(Long.valueOf(max), Long.valueOf(j2), str2, networkCaptureRuleRemoteConfig.getUrlRegex(), null, parseBody2, networkCaptureData != null ? Integer.valueOf(networkCaptureData.getRequestBodySize()) : null, networkCaptureData != null ? networkCaptureData.getRequestQueryParams() : null, networkCaptureData != null ? networkCaptureData.getRequestHeaders() : null, networkCaptureData != null ? Integer.valueOf(networkCaptureData.getRequestBodySize()) : null, str4, networkCaptureData != null ? Integer.valueOf(networkCaptureData.getResponseBodySize()) : null, networkCaptureData != null ? networkCaptureData.getResponseHeaders() : null, networkCaptureData != null ? Integer.valueOf(networkCaptureData.getResponseBodySize()) : null, Integer.valueOf(i), this.sessionIdTracker.getActiveSessionId(), Long.valueOf(j), str, str3, null, 524304, null)));
                return;
            }
            this.logger.log("The captured data doesn't match the rule criteria", InternalEmbraceLogger.Severity.DEBUG, null, true);
        }
    }
}
