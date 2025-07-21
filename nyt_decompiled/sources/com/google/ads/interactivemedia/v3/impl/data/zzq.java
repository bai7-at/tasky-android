package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes2.dex */
final class zzq extends CuePointData {
    private final double end;
    private final boolean played;
    private final double start;

    zzq(double d, double d2, boolean z) {
        this.start = d;
        this.end = d2;
        this.played = z;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CuePointData
    public double end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CuePointData) {
            CuePointData cuePointData = (CuePointData) obj;
            if (Double.doubleToLongBits(this.start) == Double.doubleToLongBits(cuePointData.start()) && Double.doubleToLongBits(this.end) == Double.doubleToLongBits(cuePointData.end()) && this.played == cuePointData.played()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (true != this.played ? 1237 : 1231) ^ ((((((int) ((Double.doubleToLongBits(this.start) >>> 32) ^ Double.doubleToLongBits(this.start))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.end) >>> 32) ^ Double.doubleToLongBits(this.end)))) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CuePointData
    public boolean played() {
        return this.played;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CuePointData
    public double start() {
        return this.start;
    }

    public String toString() {
        return "CuePointData{start=" + this.start + ", end=" + this.end + ", played=" + this.played + "}";
    }
}
