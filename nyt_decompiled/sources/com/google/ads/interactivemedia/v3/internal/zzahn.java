package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzahn implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzaho zzb;

    zzahn(zzaho zzahoVar) {
        zzafh zzafhVar;
        this.zzb = zzahoVar;
        zzafhVar = zzahoVar.zza;
        this.zza = zzafhVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
