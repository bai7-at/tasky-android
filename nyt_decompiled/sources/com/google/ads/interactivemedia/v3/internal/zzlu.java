package com.google.ads.interactivemedia.v3.internal;

import com.chartbeat.androidsdk.QueryKeys;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzlu extends zzmh {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzlu(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2) {
        super(zzktVar, "QBqMoqZOjZFV4YW5/t2Hbr0v3w8hv3Wy4gQeBCCG/svvv/IrCLMfoAtJdbejm8Rb", "9iQ8bStDvC5YUevNAeLLiqH5g88BBvTFio+X4540C94=", zzafVar, i, 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzB(QueryKeys.ENGAGED_SECONDS);
        if (zzi == null) {
            synchronized (zzj) {
                try {
                    if (zzi == null) {
                        zzi = (String) this.zzf.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzB(zzi);
        }
    }
}
