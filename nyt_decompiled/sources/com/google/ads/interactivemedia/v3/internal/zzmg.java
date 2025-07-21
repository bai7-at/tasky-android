package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzmg {
    protected static final String zza = "zzmg";
    private final zzkt zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzmg(zzkt zzktVar, String str, String str2, Class... clsArr) {
        this.zzb = zzktVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzktVar.zzk().submit(new zzmf(this));
    }

    static /* bridge */ /* synthetic */ void zzb(zzmg zzmgVar) {
        CountDownLatch countDownLatch;
        Class<?> loadClass;
        try {
            try {
                zzkt zzktVar = zzmgVar.zzb;
                loadClass = zzktVar.zzi().loadClass(zzmgVar.zzc(zzktVar.zzu(), zzmgVar.zzc));
            } catch (zzjx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (loadClass == null) {
                countDownLatch = zzmgVar.zzg;
            } else {
                zzmgVar.zze = loadClass.getMethod(zzmgVar.zzc(zzmgVar.zzb.zzu(), zzmgVar.zzd), zzmgVar.zzf);
                if (zzmgVar.zze == null) {
                    countDownLatch = zzmgVar.zzg;
                }
                countDownLatch = zzmgVar.zzg;
            }
        } catch (NullPointerException unused2) {
            countDownLatch = zzmgVar.zzg;
        } catch (Throwable th) {
            zzmgVar.zzg.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzjx, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), Constants.DEFAULT_ENCODING);
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
