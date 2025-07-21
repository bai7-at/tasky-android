package io.embrace.android.embracesdk.gating;

import defpackage.zq3;
import io.embrace.android.embracesdk.payload.DiskUsage;
import io.embrace.android.embracesdk.payload.NetworkRequests;
import io.embrace.android.embracesdk.payload.PerformanceInfo;
import io.embrace.android.embracesdk.payload.ResponsivenessSnapshot;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class PerformanceInfoSanitizer implements Sanitizable<PerformanceInfo> {
    private final Set<String> enabledComponents;
    private final PerformanceInfo info;

    public PerformanceInfoSanitizer(PerformanceInfo performanceInfo, Set<String> set) {
        zq3.h(set, "enabledComponents");
        this.info = performanceInfo;
        this.enabledComponents = set;
    }

    private final DiskUsage diskUsage(PerformanceInfo performanceInfo) {
        if (shouldSendCurrentDiskUsage()) {
            return performanceInfo.getDiskUsage();
        }
        return null;
    }

    private final NetworkRequests networkRequests(PerformanceInfo performanceInfo) {
        if (shouldSendCapturedNetwork()) {
            return performanceInfo.getNetworkRequests();
        }
        return null;
    }

    private final boolean shouldSendANRs() {
        return this.enabledComponents.contains(SessionGatingKeys.PERFORMANCE_ANR);
    }

    private final boolean shouldSendCapturedNetwork() {
        return this.enabledComponents.contains(SessionGatingKeys.PERFORMANCE_NETWORK);
    }

    private final boolean shouldSendCurrentDiskUsage() {
        return this.enabledComponents.contains(SessionGatingKeys.PERFORMANCE_CURRENT_DISK_USAGE);
    }

    private final List<ResponsivenessSnapshot> threadMonitorSnapshots(PerformanceInfo performanceInfo) {
        if (shouldSendANRs()) {
            return performanceInfo.getResponsivenessMonitorSnapshots();
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.embrace.android.embracesdk.gating.Sanitizable
    public PerformanceInfo sanitize() {
        PerformanceInfo performanceInfo = this.info;
        if (performanceInfo != null) {
            return PerformanceInfo.copy$default(performanceInfo, diskUsage(performanceInfo), null, null, null, networkRequests(this.info), threadMonitorSnapshots(this.info), 14, null);
        }
        return null;
    }
}
