package io.embrace.android.embracesdk.network.logging;

import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.NetworkSessionV2;
import io.embrace.android.embracesdk.session.MemoryCleanerListener;
import io.embrace.android.embracesdk.utils.NetworkUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class EmbraceDomainCountLimiter implements MemoryCleanerListener, DomainCountLimiter {
    private final ConcurrentHashMap<String, NetworkSessionV2.DomainCount> callsPerDomainSuffix;
    private final ConfigService configService;
    private int defaultPerDomainSuffixCallLimit;
    private final ConcurrentHashMap<String, DomainSettings> domainSetting;
    private Map<String, Integer> domainSuffixCallLimits;
    private final AtomicInteger ipAddressNetworkCallCount;
    private final Object lock;
    private final InternalEmbraceLogger logger;
    private final AtomicInteger untrackedNetworkCallCount;

    public EmbraceDomainCountLimiter(ConfigService configService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(configService, "configService");
        zq3.h(internalEmbraceLogger, "logger");
        this.configService = configService;
        this.logger = internalEmbraceLogger;
        this.domainSetting = new ConcurrentHashMap<>();
        this.callsPerDomainSuffix = new ConcurrentHashMap<>();
        this.ipAddressNetworkCallCount = new AtomicInteger(0);
        this.untrackedNetworkCallCount = new AtomicInteger(0);
        this.defaultPerDomainSuffixCallLimit = configService.getNetworkBehavior().getNetworkCaptureLimit();
        this.domainSuffixCallLimits = configService.getNetworkBehavior().getNetworkCallLimitsPerDomainSuffix();
        this.lock = new Object();
    }

    private final void clearNetworkCalls() {
        this.domainSetting.clear();
        this.callsPerDomainSuffix.clear();
        this.ipAddressNetworkCallCount.set(0);
        this.untrackedNetworkCallCount.set(0);
    }

    private final void createLimitForDomain(String str) {
        try {
            for (Map.Entry<String, Integer> entry : this.domainSuffixCallLimits.entrySet()) {
                String key = entry.getKey();
                int intValue = entry.getValue().intValue();
                if (h.v(str, key, false, 2, null)) {
                    this.domainSetting.put(str, new DomainSettings(intValue, key));
                }
            }
            if (this.domainSetting.containsKey(str)) {
                return;
            }
            this.domainSetting.put(str, new DomainSettings(this.defaultPerDomainSuffixCallLimit, str));
        } catch (Exception e) {
            this.logger.log("Failed to determine limits for domain: " + str, InternalEmbraceLogger.Severity.DEBUG, e, true);
        }
    }

    @Override // io.embrace.android.embracesdk.network.logging.DomainCountLimiter
    public boolean canLogNetworkRequest(String str) {
        zq3.h(str, "domain");
        synchronized (this.lock) {
            if (NetworkUtils.isIpAddress(str)) {
                return this.ipAddressNetworkCallCount.getAndIncrement() < this.defaultPerDomainSuffixCallLimit;
            }
            if (!this.domainSetting.containsKey(str)) {
                createLimitForDomain(str);
            }
            DomainSettings domainSettings = this.domainSetting.get(str);
            if (domainSettings == null) {
                return this.untrackedNetworkCallCount.getAndIncrement() < this.defaultPerDomainSuffixCallLimit;
            }
            String suffix = domainSettings.getSuffix();
            int limit = domainSettings.getLimit();
            NetworkSessionV2.DomainCount domainCount = this.callsPerDomainSuffix.get(suffix);
            if (domainCount == null) {
                domainCount = new NetworkSessionV2.DomainCount(0, limit);
            }
            if (suffix != null) {
                this.callsPerDomainSuffix.put(suffix, new NetworkSessionV2.DomainCount(domainCount.getRequestCount() + 1, limit));
            }
            return domainCount.getRequestCount() < limit;
        }
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        synchronized (this.lock) {
            clearNetworkCalls();
            this.defaultPerDomainSuffixCallLimit = this.configService.getNetworkBehavior().getNetworkCaptureLimit();
            this.domainSuffixCallLimits = this.configService.getNetworkBehavior().getNetworkCallLimitsPerDomainSuffix();
            ww8 ww8Var = ww8.a;
        }
    }
}
