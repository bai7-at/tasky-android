package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzlw extends zzmh {
    public zzlw(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2) {
        super(zzktVar, "4QA96k7kU+TEBvZ6Vs0skN4JRvLlH5fRQQCjtxifVFniF3kHpb6WYIXzoqorvEyw", "0muaWUHzKRAgkCJ0R9TiJ7nEPK8cDnTRY2bsBoH2Q6c=", zzafVar, i, 73);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzaf zzafVar = this.zze;
            int i = 1;
            if (true == booleanValue) {
                i = 2;
            }
            zzafVar.zzaf(i);
        } catch (InvocationTargetException unused) {
            this.zze.zzaf(3);
        }
    }
}
