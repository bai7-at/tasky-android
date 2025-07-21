package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes2.dex */
final class zzp extends zzaw {
    private final String addtlConsent;
    private final String gdprApplies;
    private final String tcString;
    private final String uspString;

    zzp(String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null gdprApplies");
        }
        this.gdprApplies = str;
        if (str2 == null) {
            throw new NullPointerException("Null tcString");
        }
        this.tcString = str2;
        if (str3 == null) {
            throw new NullPointerException("Null addtlConsent");
        }
        this.addtlConsent = str3;
        if (str4 == null) {
            throw new NullPointerException("Null uspString");
        }
        this.uspString = str4;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaw
    public String addtlConsent() {
        return this.addtlConsent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzaw) {
            zzaw zzawVar = (zzaw) obj;
            if (this.gdprApplies.equals(zzawVar.gdprApplies()) && this.tcString.equals(zzawVar.tcString()) && this.addtlConsent.equals(zzawVar.addtlConsent()) && this.uspString.equals(zzawVar.uspString())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaw
    public String gdprApplies() {
        return this.gdprApplies;
    }

    public int hashCode() {
        return this.uspString.hashCode() ^ ((((((this.gdprApplies.hashCode() ^ 1000003) * 1000003) ^ this.tcString.hashCode()) * 1000003) ^ this.addtlConsent.hashCode()) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaw
    public String tcString() {
        return this.tcString;
    }

    public String toString() {
        return "ConsentSettings{gdprApplies=" + this.gdprApplies + ", tcString=" + this.tcString + ", addtlConsent=" + this.addtlConsent + ", uspString=" + this.uspString + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaw
    public String uspString() {
        return this.uspString;
    }
}
