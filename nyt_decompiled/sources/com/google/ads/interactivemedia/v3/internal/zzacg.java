package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class zzacg {
    public static final /* synthetic */ int zza = 0;
    private static final zzacb zzb;

    static {
        zzacb zzacdVar;
        try {
            zzacdVar = new zzacf(null);
        } catch (NoSuchMethodException unused) {
            zzacdVar = new zzacd(null);
        }
        zzb = zzacdVar;
    }

    static /* bridge */ /* synthetic */ RuntimeException zza(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson ${project.version}). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException zzb(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson ${project.version}). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String zzc(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        zzk(constructor, sb);
        return sb.toString();
    }

    public static String zzd(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String zze(AccessibleObject accessibleObject, boolean z) {
        String concat;
        if (accessibleObject instanceof Field) {
            concat = "field '" + zzd((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            zzk(method, sb);
            String sb2 = sb.toString();
            concat = "method '" + method.getDeclaringClass().getName() + "#" + sb2 + "'";
        } else if (accessibleObject instanceof Constructor) {
            concat = "constructor '" + zzc((Constructor) accessibleObject) + "'";
        } else {
            concat = "<unknown AccessibleObject> ".concat(String.valueOf(accessibleObject.toString()));
        }
        if (!z || !Character.isLowerCase(concat.charAt(0))) {
            return concat;
        }
        return Character.toUpperCase(concat.charAt(0)) + concat.substring(1);
    }

    public static Constructor zzf(Class cls) {
        return zzb.zza(cls);
    }

    public static Method zzg(Class cls, Field field) {
        return zzb.zzb(cls, field);
    }

    public static void zzh(AccessibleObject accessibleObject) throws zzws {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            throw new zzws("Failed making " + zze(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", e);
        }
    }

    public static boolean zzi(Class cls) {
        return zzb.zzc(cls);
    }

    public static String[] zzj(Class cls) {
        return zzb.zzd(cls);
    }

    private static void zzk(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }
}
