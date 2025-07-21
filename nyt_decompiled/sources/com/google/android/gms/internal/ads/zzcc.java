package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzcc extends IOException {
    public final boolean zza;
    public final int zzb;

    protected zzcc(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzcc a(String str, Throwable th) {
        return new zzcc(str, th, true, 1);
    }

    public static zzcc b(String str, Throwable th) {
        return new zzcc(str, th, true, 0);
    }

    public static zzcc c(String str) {
        return new zzcc(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.zza + ", dataType=" + this.zzb + "}";
    }
}
