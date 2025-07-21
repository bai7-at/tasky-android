package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzaaf extends zzaac {
    static final Map zzb;
    private final Constructor zzc;
    private final Object[] zzd;
    private final Map zze;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        zzb = hashMap;
    }

    zzaaf(Class cls, Map map, boolean z) {
        super(map);
        this.zze = new HashMap();
        Constructor zzf = zzacg.zzf(cls);
        this.zzc = zzf;
        if (z) {
            zzaag.zzb(null, zzf);
        } else {
            zzacg.zzh(zzf);
        }
        String[] zzj = zzacg.zzj(cls);
        for (int i = 0; i < zzj.length; i++) {
            this.zze.put(zzj[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.zzc.getParameterTypes();
        this.zzd = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.zzd[i2] = zzb.get(parameterTypes[i2]);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaac
    final /* bridge */ /* synthetic */ Object zza() {
        return (Object[]) this.zzd.clone();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaac
    final /* bridge */ /* synthetic */ void zzc(Object obj, zzacv zzacvVar, zzaad zzaadVar) throws IllegalAccessException, IOException {
        Object[] objArr = (Object[]) obj;
        Integer num = (Integer) this.zze.get(zzaadVar.zzk);
        if (num != null) {
            zzaadVar.zza(zzacvVar, num.intValue(), objArr);
            return;
        }
        throw new IllegalStateException("Could not find the index in the constructor '" + zzacg.zzc(this.zzc) + "' for field with name '" + zzaadVar.zzk + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.zzaac
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Object zzb(Object[] objArr) {
        try {
            return this.zzc.newInstance(objArr);
        } catch (IllegalAccessException e) {
            throw zzacg.zzb(e);
        } catch (IllegalArgumentException | InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + zzacg.zzc(this.zzc) + "' with args " + Arrays.toString(objArr), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + zzacg.zzc(this.zzc) + "' with args " + Arrays.toString(objArr), e3.getCause());
        }
    }
}
