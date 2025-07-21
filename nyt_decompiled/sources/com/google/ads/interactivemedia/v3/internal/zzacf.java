package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class zzacf extends zzacb {
    private final Method zza;
    private final Method zzb;
    private final Method zzc;
    private final Method zzd;

    private zzacf() throws NoSuchMethodException {
        super(null);
        this.zza = Class.class.getMethod("isRecord", null);
        this.zzb = Class.class.getMethod("getRecordComponents", null);
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacb
    public final Constructor zza(Class cls) {
        try {
            Object[] objArr = (Object[]) this.zzb.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.zzd.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw zzacg.zza(e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacb
    public final Method zzb(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw zzacg.zza(e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacb
    final boolean zzc(Class cls) {
        try {
            return ((Boolean) this.zza.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw zzacg.zza(e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacb
    final String[] zzd(Class cls) {
        try {
            Object[] objArr = (Object[]) this.zzb.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.zzc.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw zzacg.zza(e);
        }
    }

    /* synthetic */ zzacf(zzace zzaceVar) {
        super(null);
        this.zza = Class.class.getMethod("isRecord", null);
        Method method = Class.class.getMethod("getRecordComponents", null);
        this.zzb = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.zzc = componentType.getMethod("getName", null);
        this.zzd = componentType.getMethod("getType", null);
    }
}
