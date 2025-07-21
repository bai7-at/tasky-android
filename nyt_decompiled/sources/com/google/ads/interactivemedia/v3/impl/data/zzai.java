package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
final class zzai extends zzbm {
    private final boolean attached;
    private final zzau bounds;
    private final String detailedReason;
    private final boolean hidden;
    private final FriendlyObstructionPurpose purpose;

    /* renamed from: type, reason: collision with root package name */
    private final String f42type;

    private zzai(boolean z, zzau zzauVar, String str, boolean z2, FriendlyObstructionPurpose friendlyObstructionPurpose, String str2) {
        this.attached = z;
        this.bounds = zzauVar;
        this.detailedReason = str;
        this.hidden = z2;
        this.purpose = friendlyObstructionPurpose;
        this.f42type = str2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    boolean attached() {
        return this.attached;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    zzau bounds() {
        return this.bounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbm) {
            zzbm zzbmVar = (zzbm) obj;
            if (this.attached == zzbmVar.attached() && this.bounds.equals(zzbmVar.bounds()) && ((str = this.detailedReason) != null ? str.equals(zzbmVar.detailedReason()) : zzbmVar.detailedReason() == null) && this.hidden == zzbmVar.hidden() && this.purpose.equals(zzbmVar.purpose()) && this.f42type.equals(zzbmVar.type())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((true != this.attached ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.bounds.hashCode();
        String str = this.detailedReason;
        return this.f42type.hashCode() ^ (((((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.hidden ? 1237 : 1231)) * 1000003) ^ this.purpose.hashCode()) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    boolean hidden() {
        return this.hidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    public String toString() {
        return "ObstructionData{attached=" + this.attached + ", bounds=" + String.valueOf(this.bounds) + ", detailedReason=" + this.detailedReason + ", hidden=" + this.hidden + ", purpose=" + String.valueOf(this.purpose) + ", type=" + this.f42type + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    String type() {
        return this.f42type;
    }
}
