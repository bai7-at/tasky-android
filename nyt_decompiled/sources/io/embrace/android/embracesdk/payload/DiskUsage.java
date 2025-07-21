package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class DiskUsage {
    private final Long appDiskUsage;
    private final Long deviceDiskFree;

    public DiskUsage(@bt3(name = "as") Long l, @bt3(name = "fs") Long l2) {
        this.appDiskUsage = l;
        this.deviceDiskFree = l2;
    }

    public static /* synthetic */ DiskUsage copy$default(DiskUsage diskUsage, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = diskUsage.appDiskUsage;
        }
        if ((i & 2) != 0) {
            l2 = diskUsage.deviceDiskFree;
        }
        return diskUsage.copy(l, l2);
    }

    public final Long component1() {
        return this.appDiskUsage;
    }

    public final Long component2() {
        return this.deviceDiskFree;
    }

    public final DiskUsage copy(@bt3(name = "as") Long l, @bt3(name = "fs") Long l2) {
        return new DiskUsage(l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiskUsage)) {
            return false;
        }
        DiskUsage diskUsage = (DiskUsage) obj;
        return zq3.c(this.appDiskUsage, diskUsage.appDiskUsage) && zq3.c(this.deviceDiskFree, diskUsage.deviceDiskFree);
    }

    public final Long getAppDiskUsage() {
        return this.appDiskUsage;
    }

    public final Long getDeviceDiskFree() {
        return this.deviceDiskFree;
    }

    public int hashCode() {
        Long l = this.appDiskUsage;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.deviceDiskFree;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "DiskUsage(appDiskUsage=" + this.appDiskUsage + ", deviceDiskFree=" + this.deviceDiskFree + ")";
    }
}
