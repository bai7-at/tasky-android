package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class zzji implements zzjl {
    private static zzji zzb;
    private final Context zzc;
    private final zzqb zzd;
    private final zzqi zze;
    private final zzqk zzf;
    private final zzkn zzg;
    private final zzoy zzh;
    private final Executor zzi;
    private final zzqh zzj;
    private final zzlc zzl;
    private final zzku zzm;
    private final zzkl zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    zzji(Context context, zzoy zzoyVar, zzqb zzqbVar, zzqi zzqiVar, zzqk zzqkVar, zzkn zzknVar, Executor executor, zzot zzotVar, int i, zzlc zzlcVar, zzku zzkuVar, zzkl zzklVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzoyVar;
        this.zzd = zzqbVar;
        this.zze = zzqiVar;
        this.zzf = zzqkVar;
        this.zzg = zzknVar;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzlcVar;
        this.zzm = zzkuVar;
        this.zzn = zzklVar;
        this.zzq = false;
        this.zzj = new zzjg(this, zzotVar);
    }

    public static synchronized zzji zza(String str, Context context, boolean z, boolean z2) {
        zzji zzb2;
        synchronized (zzji.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzji zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        zzji zzjiVar;
        synchronized (zzji.class) {
            try {
                if (zzb == null) {
                    zzoz zza = zzpa.zza();
                    zza.zza(str);
                    zza.zzc(z);
                    zzpa zzd = zza.zzd();
                    zzoy zza2 = zzoy.zza(context, executor, z2);
                    zzjw zzc = ((Boolean) zznc.zzc().zzb(zznr.zzcW)).booleanValue() ? zzjw.zzc(context) : null;
                    zzlc zzd2 = ((Boolean) zznc.zzc().zzb(zznr.zzcX)).booleanValue() ? zzlc.zzd(context, executor) : null;
                    zzku zzkuVar = ((Boolean) zznc.zzc().zzb(zznr.zzco)).booleanValue() ? new zzku() : null;
                    zzkl zzklVar = ((Boolean) zznc.zzc().zzb(zznr.zzcq)).booleanValue() ? new zzkl() : null;
                    zzpp zze = zzpp.zze(context, executor, zza2, zzd);
                    zzkm zzkmVar = new zzkm(context);
                    zzkn zzknVar = new zzkn(zzd, zze, new zzla(context, zzkmVar), zzkmVar, zzc, zzd2, zzkuVar, zzklVar);
                    int zzb2 = zzpq.zzb(context, zza2);
                    zzot zzotVar = new zzot();
                    zzji zzjiVar2 = new zzji(context, zza2, new zzqb(context, zzb2), new zzqi(context, zzb2, new zzjf(zza2), ((Boolean) zznc.zzc().zzb(zznr.zzbX)).booleanValue()), new zzqk(context, zzknVar, zza2, zzotVar), zzknVar, executor, zzotVar, zzb2, zzd2, zzkuVar, zzklVar);
                    zzb = zzjiVar2;
                    zzjiVar2.zzm();
                    zzb.zzo();
                }
                zzjiVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzjiVar;
    }

    static /* bridge */ /* synthetic */ void zzj(zzji zzjiVar) {
        String str;
        String str2;
        CountDownLatch countDownLatch;
        int length;
        boolean zza;
        long currentTimeMillis = System.currentTimeMillis();
        zzqa zzu = zzjiVar.zzu(1);
        if (zzu != null) {
            String zzk = zzu.zza().zzk();
            str2 = zzu.zza().zzi();
            str = zzk;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                zzqf zza2 = zzpi.zza(zzjiVar.zzc, 1, zzjiVar.zzr, str, str2, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, zzjiVar.zzh);
                byte[] bArr = zza2.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzjiVar.zzh.zzd(5009, System.currentTimeMillis() - currentTimeMillis);
                    countDownLatch = zzjiVar.zzk;
                } else {
                    try {
                        zzmm zzb2 = zzmm.zzb(zzadr.zzs(bArr, 0, length), zzaef.zza());
                        if (!zzb2.zzc().zzk().isEmpty() && !zzb2.zzc().zzi().isEmpty() && zzb2.zzd().zzx().length != 0) {
                            zzqa zzu2 = zzjiVar.zzu(1);
                            if (zzu2 != null) {
                                zzmp zza3 = zzu2.zza();
                                if (zzb2.zzc().zzk().equals(zza3.zzk())) {
                                    if (!zzb2.zzc().zzi().equals(zza3.zzi())) {
                                    }
                                }
                            }
                            zzqh zzqhVar = zzjiVar.zzj;
                            int i = zza2.zzc;
                            if (!((Boolean) zznc.zzc().zzb(zznr.zzbV)).booleanValue()) {
                                zza = zzjiVar.zzd.zza(zzb2, zzqhVar);
                            } else if (i == 3) {
                                zza = zzjiVar.zze.zza(zzb2);
                            } else {
                                if (i == 4) {
                                    zza = zzjiVar.zze.zzb(zzb2, zzqhVar);
                                }
                                zzjiVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                                countDownLatch = zzjiVar.zzk;
                            }
                            if (zza) {
                                zzqa zzu3 = zzjiVar.zzu(1);
                                if (zzu3 != null) {
                                    if (zzjiVar.zzf.zzc(zzu3)) {
                                        zzjiVar.zzq = true;
                                    }
                                    zzjiVar.zza = System.currentTimeMillis() / 1000;
                                }
                                countDownLatch = zzjiVar.zzk;
                            }
                            zzjiVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                            countDownLatch = zzjiVar.zzk;
                        }
                        zzjiVar.zzh.zzd(5010, System.currentTimeMillis() - currentTimeMillis);
                        countDownLatch = zzjiVar.zzk;
                    } catch (NullPointerException unused) {
                        zzjiVar.zzh.zzd(2030, System.currentTimeMillis() - currentTimeMillis);
                        countDownLatch = zzjiVar.zzk;
                    }
                }
            } catch (zzafc e) {
                zzjiVar.zzh.zzc(4002, System.currentTimeMillis() - currentTimeMillis, e);
                countDownLatch = zzjiVar.zzk;
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            zzjiVar.zzk.countDown();
            throw th;
        }
    }

    private final void zzt() {
        zzlc zzlcVar = this.zzl;
        if (zzlcVar != null) {
            zzlcVar.zzh();
        }
    }

    private final zzqa zzu(int i) {
        if (zzpq.zza(this.zzr)) {
            return ((Boolean) zznc.zzc().zzb(zznr.zzbV)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zze(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) zznc.zzc().zzb(zznr.zzco)).booleanValue()) {
            this.zzm.zzi();
        }
        zzo();
        zzpb zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza2 = zza.zza(context, null, str, view, activity);
        this.zzh.zzf(CrashReportManager.TIME_WINDOW, System.currentTimeMillis() - currentTimeMillis, zza2, null);
        return zza2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzf(Context context) {
        zzt();
        if (((Boolean) zznc.zzc().zzb(zznr.zzco)).booleanValue()) {
            this.zzm.zzj();
        }
        zzo();
        zzpb zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc = zza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
        return zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzg(Context context, byte[] bArr) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzh(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) zznc.zzc().zzb(zznr.zzco)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzo();
        zzpb zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb2 = zza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
        return zzb2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzk(MotionEvent motionEvent) {
        zzpb zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzqj e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzl(int i, int i2, int i3) {
    }

    final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzqa zzu = zzu(1);
        if (zzu == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zzc(zzu)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzn(View view) {
        this.zzg.zzd(view);
    }

    public final void zzo() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            try {
                if (!this.zzp) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzqa zzb2 = this.zzf.zzb();
                    if ((zzb2 == null || zzb2.zzd(3600L)) && zzpq.zza(this.zzr)) {
                        this.zzi.execute(new zzjh(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final boolean zzq() {
        return zzr();
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final boolean zzs() {
        try {
            this.zzk.await();
        } catch (InterruptedException unused) {
        }
        return zzr();
    }
}
