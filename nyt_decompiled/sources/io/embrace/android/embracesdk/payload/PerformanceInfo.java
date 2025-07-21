package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class PerformanceInfo {
    private final List<AppExitInfoData> appExitInfoData;
    private final DiskUsage diskUsage;
    private final List<Long> googleAnrTimestamps;
    private final List<NativeThreadAnrInterval> nativeThreadAnrIntervals;
    private final NetworkRequests networkRequests;
    private final List<ResponsivenessSnapshot> responsivenessMonitorSnapshots;

    public PerformanceInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ PerformanceInfo copy$default(PerformanceInfo performanceInfo, DiskUsage diskUsage, List list, List list2, List list3, NetworkRequests networkRequests, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            diskUsage = performanceInfo.diskUsage;
        }
        if ((i & 2) != 0) {
            list = performanceInfo.googleAnrTimestamps;
        }
        List list5 = list;
        if ((i & 4) != 0) {
            list2 = performanceInfo.appExitInfoData;
        }
        List list6 = list2;
        if ((i & 8) != 0) {
            list3 = performanceInfo.nativeThreadAnrIntervals;
        }
        List list7 = list3;
        if ((i & 16) != 0) {
            networkRequests = performanceInfo.networkRequests;
        }
        NetworkRequests networkRequests2 = networkRequests;
        if ((i & 32) != 0) {
            list4 = performanceInfo.responsivenessMonitorSnapshots;
        }
        return performanceInfo.copy(diskUsage, list5, list6, list7, networkRequests2, list4);
    }

    public final DiskUsage component1() {
        return this.diskUsage;
    }

    public final List<Long> component2() {
        return this.googleAnrTimestamps;
    }

    public final List<AppExitInfoData> component3() {
        return this.appExitInfoData;
    }

    public final List<NativeThreadAnrInterval> component4() {
        return this.nativeThreadAnrIntervals;
    }

    public final NetworkRequests component5() {
        return this.networkRequests;
    }

    public final List<ResponsivenessSnapshot> component6() {
        return this.responsivenessMonitorSnapshots;
    }

    public final PerformanceInfo copy(@bt3(name = "ds") DiskUsage diskUsage, @bt3(name = "ga") List<Long> list, @bt3(name = "aei") List<AppExitInfoData> list2, @bt3(name = "nst") List<NativeThreadAnrInterval> list3, @bt3(name = "nr") NetworkRequests networkRequests, @bt3(name = "rms") List<ResponsivenessSnapshot> list4) {
        return new PerformanceInfo(diskUsage, list, list2, list3, networkRequests, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceInfo)) {
            return false;
        }
        PerformanceInfo performanceInfo = (PerformanceInfo) obj;
        return zq3.c(this.diskUsage, performanceInfo.diskUsage) && zq3.c(this.googleAnrTimestamps, performanceInfo.googleAnrTimestamps) && zq3.c(this.appExitInfoData, performanceInfo.appExitInfoData) && zq3.c(this.nativeThreadAnrIntervals, performanceInfo.nativeThreadAnrIntervals) && zq3.c(this.networkRequests, performanceInfo.networkRequests) && zq3.c(this.responsivenessMonitorSnapshots, performanceInfo.responsivenessMonitorSnapshots);
    }

    public final List<AppExitInfoData> getAppExitInfoData() {
        return this.appExitInfoData;
    }

    public final DiskUsage getDiskUsage() {
        return this.diskUsage;
    }

    public final List<Long> getGoogleAnrTimestamps() {
        return this.googleAnrTimestamps;
    }

    public final List<NativeThreadAnrInterval> getNativeThreadAnrIntervals() {
        return this.nativeThreadAnrIntervals;
    }

    public final NetworkRequests getNetworkRequests() {
        return this.networkRequests;
    }

    public final List<ResponsivenessSnapshot> getResponsivenessMonitorSnapshots() {
        return this.responsivenessMonitorSnapshots;
    }

    public int hashCode() {
        DiskUsage diskUsage = this.diskUsage;
        int hashCode = (diskUsage != null ? diskUsage.hashCode() : 0) * 31;
        List<Long> list = this.googleAnrTimestamps;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<AppExitInfoData> list2 = this.appExitInfoData;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<NativeThreadAnrInterval> list3 = this.nativeThreadAnrIntervals;
        int hashCode4 = (hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        NetworkRequests networkRequests = this.networkRequests;
        int hashCode5 = (hashCode4 + (networkRequests != null ? networkRequests.hashCode() : 0)) * 31;
        List<ResponsivenessSnapshot> list4 = this.responsivenessMonitorSnapshots;
        return hashCode5 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        return "PerformanceInfo(diskUsage=" + this.diskUsage + ", googleAnrTimestamps=" + this.googleAnrTimestamps + ", appExitInfoData=" + this.appExitInfoData + ", nativeThreadAnrIntervals=" + this.nativeThreadAnrIntervals + ", networkRequests=" + this.networkRequests + ", responsivenessMonitorSnapshots=" + this.responsivenessMonitorSnapshots + ")";
    }

    public PerformanceInfo(@bt3(name = "ds") DiskUsage diskUsage, @bt3(name = "ga") List<Long> list, @bt3(name = "aei") List<AppExitInfoData> list2, @bt3(name = "nst") List<NativeThreadAnrInterval> list3, @bt3(name = "nr") NetworkRequests networkRequests, @bt3(name = "rms") List<ResponsivenessSnapshot> list4) {
        this.diskUsage = diskUsage;
        this.googleAnrTimestamps = list;
        this.appExitInfoData = list2;
        this.nativeThreadAnrIntervals = list3;
        this.networkRequests = networkRequests;
        this.responsivenessMonitorSnapshots = list4;
    }

    public /* synthetic */ PerformanceInfo(DiskUsage diskUsage, List list, List list2, List list3, NetworkRequests networkRequests, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : diskUsage, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : networkRequests, (i & 32) != 0 ? null : list4);
    }
}
