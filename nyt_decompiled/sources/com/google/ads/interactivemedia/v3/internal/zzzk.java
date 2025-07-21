package com.google.ads.interactivemedia.v3.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class zzzk {
    public static final zzzk zzc;

    static {
        zzzk zzzjVar;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    zzzjVar = new zzzg(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    zzzjVar = new zzzj();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                zzzjVar = new zzzi(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            zzzjVar = new zzzh(declaredMethod3, intValue);
        }
        zzc = zzzjVar;
    }

    static /* bridge */ /* synthetic */ void zzb(Class cls) {
        String zzb = zzyl.zzb(cls);
        if (zzb != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(zzb));
        }
    }

    public abstract Object zza(Class cls) throws Exception;
}
