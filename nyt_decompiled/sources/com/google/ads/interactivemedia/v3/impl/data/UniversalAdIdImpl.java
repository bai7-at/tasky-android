package com.google.ads.interactivemedia.v3.impl.data;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.google.ads.interactivemedia.v3.api.UniversalAdId;
import com.google.ads.interactivemedia.v3.internal.zzaie;
import com.google.ads.interactivemedia.v3.internal.zzaig;
import com.google.android.gms.common.annotation.KeepForSdk;

/* loaded from: classes2.dex */
public class UniversalAdIdImpl implements UniversalAdId {
    private String adIdValue = DatasetUtils.UNKNOWN_IDENTITY_ID;
    private String adIdRegistry = DatasetUtils.UNKNOWN_IDENTITY_ID;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaie.zzf(this, obj, false, null, false, new String[0]);
    }

    @Override // com.google.ads.interactivemedia.v3.api.UniversalAdId
    public String getAdIdRegistry() {
        return this.adIdRegistry;
    }

    @Override // com.google.ads.interactivemedia.v3.api.UniversalAdId
    public String getAdIdValue() {
        return this.adIdValue;
    }

    public int hashCode() {
        return zzaig.zza(this, new String[0]);
    }

    @KeepForSdk
    public void setAdIdRegistry(String str) {
        this.adIdRegistry = str;
    }

    @KeepForSdk
    public void setAdIdValue(String str) {
        this.adIdValue = str;
    }

    public String toString() {
        return "UniversalAdId [adIdValue=" + this.adIdValue + ", adIdRegistry=" + this.adIdRegistry + "]";
    }
}
