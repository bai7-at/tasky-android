package com.google.ads.interactivemedia.v3.api;

import com.amazonaws.services.s3.model.InstructionFileId;

/* loaded from: classes2.dex */
public final class VersionInfo {
    private final int zza;
    private final int zzb;
    private final int zzc;

    public VersionInfo(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public int getMajorVersion() {
        return this.zza;
    }

    public int getMicroVersion() {
        return this.zzc;
    }

    public int getMinorVersion() {
        return this.zzb;
    }

    public String toString() {
        return this.zza + InstructionFileId.DOT + this.zzb + InstructionFileId.DOT + this.zzc;
    }
}
