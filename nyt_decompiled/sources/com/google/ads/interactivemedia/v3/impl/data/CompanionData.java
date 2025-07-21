package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzo.class)
/* loaded from: classes2.dex */
public abstract class CompanionData {
    private String companionId;

    private static CompanionData create(String str, String str2, String str3, zzav zzavVar) {
        return new zzo(str, str2, str3, zzavVar);
    }

    public abstract String clickThroughUrl();

    public String companionId() {
        return this.companionId;
    }

    public abstract String size();

    public abstract String src();

    public final String toString() {
        return "CompanionData [companionId=" + companionId() + ", size=" + size() + ", src=" + src() + ", clickThroughUrl=" + clickThroughUrl() + ", type=" + String.valueOf(type()) + "]";
    }

    public abstract zzav type();

    public static CompanionData create(String str, String str2, String str3, String str4, zzav zzavVar) {
        CompanionData create = create(str2, str3, str4, zzavVar);
        create.companionId = str;
        return create;
    }
}
