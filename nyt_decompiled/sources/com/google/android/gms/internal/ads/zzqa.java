package com.google.android.gms.internal.ads;

import defpackage.l6a;

/* loaded from: classes3.dex */
public final class zzqa extends Exception {
    public final int zza;
    public final boolean zzb;
    public final l6a zzc;

    public zzqa(int i, l6a l6aVar, boolean z) {
        super("AudioTrack write failed: " + i);
        this.zzb = z;
        this.zza = i;
        this.zzc = l6aVar;
    }
}
