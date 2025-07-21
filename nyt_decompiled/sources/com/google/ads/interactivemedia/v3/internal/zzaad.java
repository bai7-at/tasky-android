package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
abstract class zzaad {
    final String zzi;
    final Field zzj;
    final String zzk;
    final boolean zzl;
    final boolean zzm;

    protected zzaad(String str, Field field, boolean z, boolean z2) {
        this.zzi = str;
        this.zzj = field;
        this.zzk = field.getName();
        this.zzl = z;
        this.zzm = z2;
    }

    abstract void zza(zzacv zzacvVar, int i, Object[] objArr) throws IOException, zzwv;

    abstract void zzb(zzacv zzacvVar, Object obj) throws IOException, IllegalAccessException;

    abstract void zzc(zzacx zzacxVar, Object obj) throws IOException, IllegalAccessException;
}
