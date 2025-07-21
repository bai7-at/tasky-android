package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzlx extends zzmh {
    private List zzi;
    private final Context zzj;

    public zzlx(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2, Context context) {
        super(zzktVar, "K2yt7sMugiuzyW5oDmhKskHNQBBOsHDDPcpPCPcBdPJWVC2ztIWYwYMcSE9mqAdn", "qN3ycr+d8i2SnhKKiTJ61fKGYnOxAv7mkp7XRiCE7xg=", zzafVar, i, 31);
        this.zzi = null;
        this.zzj = context;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzW(-1L);
        this.zze.zzS(-1L);
        Context context = this.zzj;
        if (context == null) {
            context = this.zzb.zzb();
        }
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke(null, context);
        }
        List list = this.zzi;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zze) {
            this.zze.zzW(((Long) this.zzi.get(0)).longValue());
            this.zze.zzS(((Long) this.zzi.get(1)).longValue());
        }
    }
}
