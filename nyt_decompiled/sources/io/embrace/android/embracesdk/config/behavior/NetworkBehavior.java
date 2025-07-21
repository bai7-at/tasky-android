package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.local.DomainLocalConfig;
import io.embrace.android.embracesdk.config.local.NetworkLocalConfig;
import io.embrace.android.embracesdk.config.local.SdkLocalConfig;
import io.embrace.android.embracesdk.config.remote.NetworkCaptureRuleRemoteConfig;
import io.embrace.android.embracesdk.config.remote.NetworkRemoteConfig;
import io.embrace.android.embracesdk.config.remote.RemoteConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;

/* loaded from: classes5.dex */
public final class NetworkBehavior extends MergedConfigBehavior<SdkLocalConfig, RemoteConfig> {
    public static final boolean CAPTURE_REQUEST_CONTENT_LENGTH = false;
    public static final String CONFIG_TRACE_ID_HEADER_DEFAULT_VALUE = "x-emb-trace-id";
    public static final int DEFAULT_NETWORK_CALL_LIMIT = 1000;
    public static final boolean ENABLE_NATIVE_MONITORING_DEFAULT = true;
    public static final Companion Companion = new Companion(null);
    private static final List<String> dirtyKeyList = i.o("-----BEGIN PUBLIC KEY-----", "-----END PUBLIC KEY-----", "\\r", "\\n", "\\t", " ");

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var, qs2 qs2Var2) {
        super(behaviorThresholdCheck, qs2Var, qs2Var2);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "localSupplier");
        zq3.h(qs2Var2, "remoteSupplier");
    }

    private final int getLimitCeiling() {
        NetworkRemoteConfig networkConfig;
        Integer defaultCaptureLimit;
        RemoteConfig remote = getRemote();
        return (remote == null || (networkConfig = remote.getNetworkConfig()) == null || (defaultCaptureLimit = networkConfig.getDefaultCaptureLimit()) == null) ? DEFAULT_NETWORK_CALL_LIMIT : defaultCaptureLimit.intValue();
    }

    public final String getCapturePublicKey() {
        SdkLocalConfig local = getLocal();
        String capturePublicKey = local != null ? local.getCapturePublicKey() : null;
        if (capturePublicKey != null) {
            Iterator<String> it2 = dirtyKeyList.iterator();
            while (it2.hasNext()) {
                capturePublicKey = capturePublicKey != null ? new Regex(it2.next()).e(capturePublicKey, "") : null;
            }
        }
        return capturePublicKey;
    }

    public final Map<String, Integer> getNetworkCallLimitsPerDomainSuffix() {
        Map<String, Integer> linkedHashMap;
        NetworkLocalConfig networking;
        List<DomainLocalConfig> domains;
        NetworkRemoteConfig networkConfig;
        Map<String, Integer> domainLimits;
        int limitCeiling = getLimitCeiling();
        RemoteConfig remote = getRemote();
        if (remote == null || (networkConfig = remote.getNetworkConfig()) == null || (domainLimits = networkConfig.getDomainLimits()) == null || (linkedHashMap = t.x(domainLimits)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        SdkLocalConfig local = getLocal();
        if (local != null && (networking = local.getNetworking()) != null && (domains = networking.getDomains()) != null) {
            for (DomainLocalConfig domainLocalConfig : domains) {
                if (domainLocalConfig.getDomain() != null && domainLocalConfig.getLimit() != null) {
                    String domain = domainLocalConfig.getDomain();
                    Integer num = linkedHashMap.get(domainLocalConfig.getDomain());
                    linkedHashMap.put(domain, Integer.valueOf(num != null ? Math.min(num.intValue(), domainLocalConfig.getLimit().intValue()) : Math.min(limitCeiling, domainLocalConfig.getLimit().intValue())));
                }
            }
        }
        return linkedHashMap;
    }

    public final int getNetworkCaptureLimit() {
        NetworkLocalConfig networking;
        Integer defaultCaptureLimit;
        int limitCeiling = getLimitCeiling();
        SdkLocalConfig local = getLocal();
        return Math.min(limitCeiling, (local == null || (networking = local.getNetworking()) == null || (defaultCaptureLimit = networking.getDefaultCaptureLimit()) == null) ? limitCeiling : defaultCaptureLimit.intValue());
    }

    public final Set<NetworkCaptureRuleRemoteConfig> getNetworkCaptureRules() {
        Set<NetworkCaptureRuleRemoteConfig> networkCaptureRules;
        RemoteConfig remote = getRemote();
        return (remote == null || (networkCaptureRules = remote.getNetworkCaptureRules()) == null) ? b0.e() : networkCaptureRules;
    }

    public final String getTraceIdHeader() {
        NetworkLocalConfig networking;
        String traceIdHeader;
        SdkLocalConfig local = getLocal();
        return (local == null || (networking = local.getNetworking()) == null || (traceIdHeader = networking.getTraceIdHeader()) == null) ? CONFIG_TRACE_ID_HEADER_DEFAULT_VALUE : traceIdHeader;
    }

    public final boolean isCaptureBodyEncryptionEnabled() {
        return getCapturePublicKey() != null;
    }

    public final boolean isNativeNetworkingMonitoringEnabled() {
        NetworkLocalConfig networking;
        Boolean enableNativeMonitoring;
        SdkLocalConfig local = getLocal();
        if (local == null || (networking = local.getNetworking()) == null || (enableNativeMonitoring = networking.getEnableNativeMonitoring()) == null) {
            return true;
        }
        return enableNativeMonitoring.booleanValue();
    }

    public final boolean isRequestContentLengthCaptureEnabled() {
        NetworkLocalConfig networking;
        Boolean captureRequestContentLength;
        SdkLocalConfig local = getLocal();
        if (local == null || (networking = local.getNetworking()) == null || (captureRequestContentLength = networking.getCaptureRequestContentLength()) == null) {
            return false;
        }
        return captureRequestContentLength.booleanValue();
    }

    public final boolean isUrlEnabled(String str) {
        Collection<String> disabledUrlPatterns;
        NetworkLocalConfig networking;
        Object b;
        Set<String> disabledUrlPatterns2;
        zq3.h(str, "url");
        RemoteConfig remote = getRemote();
        if (remote == null || (disabledUrlPatterns2 = remote.getDisabledUrlPatterns()) == null) {
            SdkLocalConfig local = getLocal();
            disabledUrlPatterns = (local == null || (networking = local.getNetworking()) == null) ? null : networking.getDisabledUrlPatterns();
        } else {
            disabledUrlPatterns = disabledUrlPatterns2;
        }
        if (disabledUrlPatterns == null) {
            disabledUrlPatterns = b0.e();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : disabledUrlPatterns) {
            try {
                Result.a aVar = Result.a;
                b = Result.b(Pattern.compile(str2));
            } catch (Throwable th) {
                Result.a aVar2 = Result.a;
                b = Result.b(f.a(th));
            }
            if (Result.g(b)) {
                b = null;
            }
            Pattern pattern = (Pattern) b;
            if (pattern != null) {
                arrayList.add(pattern);
            }
        }
        Set c1 = i.c1(arrayList);
        if ((c1 instanceof Collection) && c1.isEmpty()) {
            return true;
        }
        Iterator it2 = c1.iterator();
        while (it2.hasNext()) {
            if (((Pattern) it2.next()).matcher(str).find()) {
                return false;
            }
        }
        return true;
    }
}
