package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaag implements zzxj {
    private final zzyl zza;
    private final zzwf zzb;
    private final zzyn zzc;
    private final zzzt zzd;
    private final List zze;

    public zzaag(zzyl zzylVar, zzwf zzwfVar, zzyn zzynVar, zzzt zzztVar, List list) {
        this.zza = zzylVar;
        this.zzb = zzwfVar;
        this.zzc = zzynVar;
        this.zzd = zzztVar;
        this.zze = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ void zzb(Object obj, AccessibleObject accessibleObject) {
        if (true == Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!zzze.zza(accessibleObject, obj)) {
            throw new zzws(zzacg.zze(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map zzc(com.google.ads.interactivemedia.v3.internal.zzwm r38, com.google.ads.interactivemedia.v3.internal.zzact r39, java.lang.Class r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzaag.zzc(com.google.ads.interactivemedia.v3.internal.zzwm, com.google.ads.interactivemedia.v3.internal.zzact, java.lang.Class, boolean, boolean):java.util.Map");
    }

    private final boolean zzd(Field field, boolean z) {
        return (this.zzc.zzc(field.getType(), z) || this.zzc.zzd(field, z)) ? false : true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Class zzc = zzactVar.zzc();
        if (!Object.class.isAssignableFrom(zzc)) {
            return null;
        }
        int zze = zzze.zze(this.zze, zzc);
        if (zze != 4) {
            boolean z = zze == 3;
            return zzacg.zzi(zzc) ? new zzaaf(zzc, zzc(zzwmVar, zzactVar, zzc, z, true), z) : new zzaae(this.zza.zza(zzactVar), zzc(zzwmVar, zzactVar, zzc, z, false));
        }
        throw new zzws("ReflectionAccessFilter does not permit using reflection for " + String.valueOf(zzc) + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
