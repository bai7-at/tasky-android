package com.google.android.gms.internal.pal;

import defpackage.g0a;
import defpackage.h0a;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class zzagf extends h0a implements Serializable, g0a {
    private volatile long zza;

    protected zzagf(long j) {
        this.zza = j;
    }

    @Override // defpackage.g0a
    public final long zzd() {
        return this.zza;
    }
}
