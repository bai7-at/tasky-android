package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzaig {
    private static final ThreadLocal zza = new ThreadLocal();
    private int zzb = 17;

    public zzaig(int i, int i2) {
    }

    public static int zza(Object obj, String... strArr) {
        zzaig zzaigVar = new zzaig(17, 37);
        Class<?> cls = obj.getClass();
        zze(obj, cls, zzaigVar, false, strArr);
        while (cls.getSuperclass() != null) {
            cls = cls.getSuperclass();
            zze(obj, cls, zzaigVar, false, strArr);
        }
        return zzaigVar.zzb;
    }

    static Set zzb() {
        return (Set) zza.get();
    }

    private static void zze(Object obj, Class cls, zzaig zzaigVar, boolean z, String[] strArr) {
        Set zzb = zzb();
        if (zzb == null || !zzb.contains(new zzaii(obj))) {
            try {
                Set zzb2 = zzb();
                if (zzb2 == null) {
                    zzb2 = new HashSet();
                    zza.set(zzb2);
                }
                zzb2.add(new zzaii(obj));
                Field[] declaredFields = cls.getDeclaredFields();
                AccessibleObject.setAccessible(declaredFields, true);
                for (Field field : declaredFields) {
                    if (!zzaic.zza(strArr, field.getName()) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(zzaih.class)) {
                        try {
                            zzaigVar.zzd(field.get(obj));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
                zzf(obj);
            } catch (Throwable th) {
                zzf(obj);
                throw th;
            }
        }
    }

    private static void zzf(Object obj) {
        Set zzb = zzb();
        if (zzb != null) {
            zzb.remove(new zzaii(obj));
            if (zzb.isEmpty()) {
                zza.remove();
            }
        }
    }

    public final int hashCode() {
        return this.zzb;
    }

    public final zzaig zzc(long j) {
        this.zzb = (this.zzb * 37) + ((int) (j ^ (j >> 32)));
        return this;
    }

    public final zzaig zzd(Object obj) {
        if (obj == null) {
            this.zzb *= 37;
        } else if (obj.getClass().isArray()) {
            int i = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length = jArr.length;
                while (i < length) {
                    zzc(jArr[i]);
                    i++;
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length2 = iArr.length;
                while (i < length2) {
                    this.zzb = (this.zzb * 37) + iArr[i];
                    i++;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length3 = sArr.length;
                while (i < length3) {
                    this.zzb = (this.zzb * 37) + sArr[i];
                    i++;
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                int length4 = cArr.length;
                while (i < length4) {
                    this.zzb = (this.zzb * 37) + cArr[i];
                    i++;
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length5 = bArr.length;
                while (i < length5) {
                    this.zzb = (this.zzb * 37) + bArr[i];
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length6 = dArr.length;
                while (i < length6) {
                    zzc(Double.doubleToLongBits(dArr[i]));
                    i++;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                int length7 = fArr.length;
                while (i < length7) {
                    this.zzb = (this.zzb * 37) + Float.floatToIntBits(fArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length8 = zArr.length;
                while (i < length8) {
                    this.zzb = (this.zzb * 37) + (!zArr[i] ? 1 : 0);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length9 = objArr.length;
                while (i < length9) {
                    zzd(objArr[i]);
                    i++;
                }
            }
        } else {
            this.zzb = (this.zzb * 37) + obj.hashCode();
        }
        return this;
    }

    public zzaig() {
    }
}
