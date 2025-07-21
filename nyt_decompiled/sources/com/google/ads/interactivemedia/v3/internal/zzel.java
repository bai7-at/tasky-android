package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzel extends zzeb {
    private final int appVersion;
    private final String packageName;

    zzel(int i, String str) {
        this.appVersion = i;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.packageName = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzeb
    public int appVersion() {
        return this.appVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeb) {
            zzeb zzebVar = (zzeb) obj;
            if (this.appVersion == zzebVar.appVersion() && this.packageName.equals(zzebVar.packageName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.packageName.hashCode() ^ ((this.appVersion ^ 1000003) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzeb
    public String packageName() {
        return this.packageName;
    }

    public String toString() {
        return "MarketAppInfo{appVersion=" + this.appVersion + ", packageName=" + this.packageName + "}";
    }
}
