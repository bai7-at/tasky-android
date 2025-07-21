package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes2.dex */
final class zzap extends zzbu {
    private final Integer downloadBandwidthKbps;

    zzap(Integer num) {
        this.downloadBandwidthKbps = num;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbu
    public Integer downloadBandwidthKbps() {
        return this.downloadBandwidthKbps;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbu) {
            return this.downloadBandwidthKbps.equals(((zzbu) obj).downloadBandwidthKbps());
        }
        return false;
    }

    public int hashCode() {
        return this.downloadBandwidthKbps.hashCode() ^ 1000003;
    }

    public String toString() {
        return "VideoEnvironmentData{downloadBandwidthKbps=" + this.downloadBandwidthKbps + "}";
    }
}
