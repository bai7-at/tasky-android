package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class zzaab extends zzaad {
    final /* synthetic */ boolean zza;
    final /* synthetic */ Method zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzxi zzd;
    final /* synthetic */ zzwm zze;
    final /* synthetic */ zzact zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ boolean zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaab(zzaag zzaagVar, String str, Field field, boolean z, boolean z2, boolean z3, Method method, boolean z4, zzxi zzxiVar, zzwm zzwmVar, zzact zzactVar, boolean z5, boolean z6) {
        super(str, field, z, z2);
        this.zza = z3;
        this.zzb = method;
        this.zzc = z4;
        this.zzd = zzxiVar;
        this.zze = zzwmVar;
        this.zzf = zzactVar;
        this.zzg = z5;
        this.zzh = z6;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaad
    final void zza(zzacv zzacvVar, int i, Object[] objArr) throws IOException, zzwv {
        Object read = this.zzd.read(zzacvVar);
        if (read != null || !this.zzg) {
            objArr[i] = read;
            return;
        }
        throw new zzwv("null is not allowed as value for record component '" + this.zzk + "' of primitive type; at path " + zzacvVar.zze());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaad
    final void zzb(zzacv zzacvVar, Object obj) throws IOException, IllegalAccessException {
        Object read = this.zzd.read(zzacvVar);
        if (read == null && this.zzg) {
            return;
        }
        if (this.zza) {
            zzaag.zzb(obj, this.zzj);
        } else if (this.zzh) {
            throw new zzws("Cannot set value of 'static final' ".concat(zzacg.zze(this.zzj, false)));
        }
        this.zzj.set(obj, read);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaad
    final void zzc(zzacx zzacxVar, Object obj) throws IOException, IllegalAccessException {
        Object obj2;
        if (this.zzl) {
            if (this.zza) {
                Method method = this.zzb;
                if (method == null) {
                    zzaag.zzb(obj, this.zzj);
                } else {
                    zzaag.zzb(obj, method);
                }
            }
            Method method2 = this.zzb;
            if (method2 != null) {
                try {
                    obj2 = method2.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new zzws("Accessor " + zzacg.zze(this.zzb, false) + " threw exception", e.getCause());
                }
            } else {
                obj2 = this.zzj.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            zzacxVar.zze(this.zzi);
            (this.zzc ? this.zzd : new zzaam(this.zze, this.zzd, this.zzf.zzd())).write(zzacxVar, obj2);
        }
    }
}
