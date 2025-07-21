package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes2.dex */
final class zzy extends zzbc {
    private final String adsIdentityToken;
    private final String appSetId;
    private final int appSetIdScope;
    private final String deviceId;
    private final String idType;
    private final boolean isLimitedAdTracking;

    zzy(String str, String str2, boolean z, String str3, int i, String str4) {
        this.deviceId = str;
        this.idType = str2;
        this.isLimitedAdTracking = z;
        if (str3 == null) {
            throw new NullPointerException("Null appSetId");
        }
        this.appSetId = str3;
        this.appSetIdScope = i;
        if (str4 == null) {
            throw new NullPointerException("Null adsIdentityToken");
        }
        this.adsIdentityToken = str4;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbc
    public String adsIdentityToken() {
        return this.adsIdentityToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbc
    public String appSetId() {
        return this.appSetId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbc
    public int appSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbc
    public String deviceId() {
        return this.deviceId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbc) {
            zzbc zzbcVar = (zzbc) obj;
            String str = this.deviceId;
            if (str != null ? str.equals(zzbcVar.deviceId()) : zzbcVar.deviceId() == null) {
                if (this.idType.equals(zzbcVar.idType()) && this.isLimitedAdTracking == zzbcVar.isLimitedAdTracking() && this.appSetId.equals(zzbcVar.appSetId()) && this.appSetIdScope == zzbcVar.appSetIdScope() && this.adsIdentityToken.equals(zzbcVar.adsIdentityToken())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.deviceId;
        return this.adsIdentityToken.hashCode() ^ (((((((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.idType.hashCode()) * 1000003) ^ (true != this.isLimitedAdTracking ? 1237 : 1231)) * 1000003) ^ this.appSetId.hashCode()) * 1000003) ^ this.appSetIdScope) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbc
    public String idType() {
        return this.idType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbc
    public boolean isLimitedAdTracking() {
        return this.isLimitedAdTracking;
    }

    public String toString() {
        return "IdentifierInfo{deviceId=" + this.deviceId + ", idType=" + this.idType + ", isLimitedAdTracking=" + this.isLimitedAdTracking + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ", adsIdentityToken=" + this.adsIdentityToken + "}";
    }
}
