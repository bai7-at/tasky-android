package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzead extends Exception {
    private final int zza;

    public zzead(int i) {
        this.zza = i;
    }

    public final int a() {
        return this.zza;
    }

    public zzead(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzead(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
