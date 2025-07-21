package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
final class zzvi {
    private static final zzth zza = zzth.zzb().zzc(new zzve()).zza();

    static Object zza(zzvf zzvfVar, Future future, Class cls) throws Exception {
        zzvfVar.zza(cls);
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw zzc(cls, e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof Error) {
                throw new zzut((Error) cause);
            }
            if (cause instanceof RuntimeException) {
                throw new zzwa(cause);
            }
            throw zzc(cls, cause);
        }
    }

    static void zzb(Class cls) {
        zzrm.zzf(!RuntimeException.class.isAssignableFrom(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        zzrm.zzf(zze(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    private static Exception zzc(Class cls, Throwable th) {
        List asList = Arrays.asList(cls.getConstructors());
        zzth zzthVar = zza;
        if (!(asList instanceof Collection)) {
            Iterator it2 = asList.iterator();
            ArrayList arrayList = new ArrayList();
            it2.getClass();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            asList = arrayList;
        }
        Object[] array = asList.toArray();
        Arrays.sort(array, zzthVar);
        List asList2 = Arrays.asList(array);
        asList2.getClass();
        Iterator it3 = new ArrayList(asList2).iterator();
        while (it3.hasNext()) {
            Exception exc = (Exception) zzd((Constructor) it3.next(), th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls.toString() + " in response to chained exception", th);
    }

    private static Object zzd(Constructor constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean zze(Class cls) {
        try {
            zzc(cls, new Exception());
            return true;
        } catch (Error | RuntimeException unused) {
            return false;
        }
    }
}
