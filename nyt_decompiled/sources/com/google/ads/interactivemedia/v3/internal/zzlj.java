package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzlj extends zzmh {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzlj(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2) {
        super(zzktVar, "yrcfg1v6g7Xfc1bJfjdHrWcfs6H5wlnb5cQACCBTWhjZWXMjNh5RS5PwuXj6zIsG", "1FBC0qfwqJwU5yoeSbm8P5bbcTmsB1kmNOMpJ31v8D0=", zzafVar, i, 44);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                try {
                    if (zzi == null) {
                        zzi = (Long) this.zzf.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzo(zzi.longValue());
        }
    }
}
