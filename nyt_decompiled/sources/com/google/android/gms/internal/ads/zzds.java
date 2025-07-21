package com.google.android.gms.internal.ads;

import defpackage.cpc;

/* loaded from: classes3.dex */
public final class zzds extends Exception {
    public final cpc zza;

    public zzds(String str, cpc cpcVar) {
        super("Unhandled input format: ".concat(String.valueOf(cpcVar)));
        this.zza = cpcVar;
    }
}
