package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.chartbeat.androidsdk.QueryKeys;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzlg extends zzmh {
    private static final zzmi zzi = new zzmi();
    private final Context zzj;

    public zzlg(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2, Context context) {
        super(zzktVar, "jH9XgSzl7KHhnRe7J3c+Zt4PeEKYSmdAWNcYgXyxs+5ioo7J6O+3ac27zdpp298L", "VkNyQ5JGx5xmkDjEjraYmsVaF+kJmAJRMUseQBBtHhA=", zzafVar, i, 29);
        this.zzj = context;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzn(QueryKeys.ENGAGED_SECONDS);
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                try {
                    if (zza.get() == null) {
                        zza.set((String) this.zzf.invoke(null, this.zzj));
                    }
                } finally {
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zze) {
            this.zze.zzn(zzia.zza(str.getBytes(), true));
        }
    }
}
