package com.google.android.gms.internal.ads;

import defpackage.zze;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class yi extends ah {
    final aj a;
    zze b = b();
    final /* synthetic */ zzhbx c;

    yi(zzhbx zzhbxVar) {
        this.c = zzhbxVar;
        this.a = new aj(zzhbxVar, null);
    }

    private final zze b() {
        aj ajVar = this.a;
        if (ajVar.hasNext()) {
            return ajVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // defpackage.zze
    public final byte zza() {
        zze zzeVar = this.b;
        if (zzeVar == null) {
            throw new NoSuchElementException();
        }
        byte zza = zzeVar.zza();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return zza;
    }
}
