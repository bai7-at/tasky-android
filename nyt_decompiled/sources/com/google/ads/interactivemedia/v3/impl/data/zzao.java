package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes2.dex */
final class zzao extends zzbr {
    private final long currentTime;
    private final long duration;
    private final String timeUnit = "ms";

    zzao(long j, long j2, String str) {
        this.currentTime = j;
        this.duration = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbr
    public long currentTime() {
        return this.currentTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbr
    public long duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbr) {
            zzbr zzbrVar = (zzbr) obj;
            if (this.currentTime == zzbrVar.currentTime() && this.duration == zzbrVar.duration() && this.timeUnit.equals(zzbrVar.timeUnit())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.currentTime;
        long j2 = j ^ (j >>> 32);
        long j3 = this.duration;
        return this.timeUnit.hashCode() ^ ((((((int) j2) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbr
    public String timeUnit() {
        return this.timeUnit;
    }

    public String toString() {
        return "TimeUpdateData{currentTime=" + this.currentTime + ", duration=" + this.duration + ", timeUnit=" + this.timeUnit + "}";
    }
}
