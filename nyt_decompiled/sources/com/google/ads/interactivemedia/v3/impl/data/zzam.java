package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes2.dex */
final class zzam extends zzbq {
    private final Integer height;
    private final Integer width;

    zzam(Integer num, Integer num2) {
        this.width = num;
        this.height = num2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbq) {
            zzbq zzbqVar = (zzbq) obj;
            if (this.width.equals(zzbqVar.width()) && this.height.equals(zzbqVar.height())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.height.hashCode() ^ ((this.width.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbq
    public Integer height() {
        return this.height;
    }

    public String toString() {
        return "SizeData{width=" + this.width + ", height=" + this.height + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbq
    public Integer width() {
        return this.width;
    }
}
