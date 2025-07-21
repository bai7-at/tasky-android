package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.pal.PlatformSignalCollector;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import defpackage.bs7;
import defpackage.og8;
import defpackage.qg8;
import defpackage.ue5;
import defpackage.vf5;
import defpackage.vg8;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzhg {
    private final Context zza;
    private final ExecutorService zzb;
    private final PlatformSignalCollector zzc;
    private final zzhc zzd;
    private final qg8 zze;

    public zzhg(Context context, ExecutorService executorService, zzhc zzhcVar, TestingConfiguration testingConfiguration) {
        bs7 bs7Var = !zzgq.zzb(context, testingConfiguration) ? null : new bs7();
        this.zze = new qg8();
        this.zza = context;
        this.zzb = executorService;
        this.zzd = zzhcVar;
        this.zzc = bs7Var;
    }

    public final og8 zza() {
        return this.zze.a();
    }

    public final void zzb(Integer num) {
        PlatformSignalCollector platformSignalCollector = this.zzc;
        if (platformSignalCollector == null || num == null) {
            this.zze.c(null);
            return;
        }
        og8 j = vg8.j(platformSignalCollector.collectSignals(this.zza, this.zzb), num.intValue(), TimeUnit.MILLISECONDS);
        final qg8 qg8Var = this.zze;
        j.f(new vf5() { // from class: com.google.ads.interactivemedia.v3.internal.zzhe
            @Override // defpackage.vf5
            public final void onSuccess(Object obj) {
                qg8.this.c((Map) obj);
            }
        });
        j.d(new ue5() { // from class: com.google.ads.interactivemedia.v3.internal.zzhf
            @Override // defpackage.ue5
            public final void onFailure(Exception exc) {
                zzhg.this.zzc(exc);
            }
        });
    }

    final /* synthetic */ void zzc(Exception exc) {
        this.zzd.zzb(com.google.ads.interactivemedia.v3.impl.data.zzbe.PLATFORM_SIGNAL_COLLECTOR, com.google.ads.interactivemedia.v3.impl.data.zzbf.PLATFORM_COLLECT_SIGNALS, exc);
        this.zze.b(exc);
    }
}
