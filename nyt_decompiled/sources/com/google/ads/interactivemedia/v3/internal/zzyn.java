package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzyn implements Cloneable, zzxj {
    public static final zzyn zza = new zzyn();
    private List zzb = Collections.emptyList();
    private final List zzc = Collections.emptyList();

    private final boolean zzf(Class cls, boolean z) {
        for (zzqz zzqzVar : z ? this.zzb : this.zzc) {
        }
        return false;
    }

    private static final boolean zzg(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        boolean z;
        boolean z2;
        Class zzc = zzactVar.zzc();
        boolean zzg = zzg(zzc);
        if (zzg) {
            z = true;
        } else {
            zzf(zzc, true);
            z = false;
        }
        if (zzg) {
            z2 = true;
        } else {
            zzf(zzc, false);
            z2 = false;
        }
        if (z) {
            return new zzym(this, z2, true, zzwmVar, zzactVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzyn clone() {
        try {
            return (zzyn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean zzc(Class cls, boolean z) {
        if (zzg(cls)) {
            return true;
        }
        zzf(cls, z);
        return false;
    }

    public final boolean zzd(Field field, boolean z) {
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || zzg(field.getType())) {
            return true;
        }
        List<zzqz> list = z ? this.zzb : this.zzc;
        if (list.isEmpty()) {
            return false;
        }
        for (zzqz zzqzVar : list) {
            zzqy zzqyVar = (zzqy) zzwd.zza(field).getAnnotation(zzqy.class);
            if (zzqyVar != null && Arrays.asList(zzqyVar.zzb()).contains(zzwd.zzb(field))) {
                return true;
            }
        }
        return false;
    }

    public final zzyn zze(zzqz zzqzVar, boolean z, boolean z2) {
        zzyn clone = clone();
        ArrayList arrayList = new ArrayList(this.zzb);
        clone.zzb = arrayList;
        arrayList.add(zzqzVar);
        return clone;
    }
}
