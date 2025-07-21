package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzjp implements Runnable, zzjl {
    private Context zzc;
    private final zzoy zzd;
    private final Executor zze;
    private final zzm zzf;
    private final boolean zzg;
    private final AtomicReference zzb = new AtomicReference();
    final CountDownLatch zza = new CountDownLatch(1);
    private final List zzh = new ArrayList();

    public zzjp(Context context, Executor executor, zzm zzmVar) {
        this.zzf = zzmVar;
        this.zzc = context;
        this.zze = executor;
        zznr.zza(context);
        boolean z = ((Boolean) zznc.zzc().zzb(zznr.zzca)).booleanValue() && zzmVar.zzh();
        this.zzg = z;
        this.zzd = zzoy.zza(context, executor, z);
        executor.execute(this);
    }

    private final void zzd() {
        if (this.zzh.isEmpty() || this.zzb.get() == null) {
            return;
        }
        for (Object[] objArr : this.zzh) {
            int length = objArr.length;
            if (length == 1) {
                ((zzjl) this.zzb.get()).zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                ((zzjl) this.zzb.get()).zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzh.clear();
    }

    private final boolean zzi() {
        AtomicReference atomicReference = this.zzb;
        String zzc = this.zzf.zzc();
        Context zzj = zzj(this.zzc);
        boolean zzg = this.zzf.zzg();
        zzjq.zzr(zzj, zzg);
        atomicReference.set(new zzjr(zzj, zzc, zzg));
        return true;
    }

    private static final Context zzj(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[Catch: all -> 0x0049, NullPointerException -> 0x004b, TryCatch #0 {NullPointerException -> 0x004b, blocks: (B:4:0x0005, B:7:0x004d, B:9:0x0051, B:11:0x005c, B:16:0x0067, B:18:0x008c, B:20:0x0094, B:21:0x0013, B:23:0x003e), top: B:3:0x0005, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051 A[Catch: all -> 0x0049, NullPointerException -> 0x004b, TryCatch #0 {NullPointerException -> 0x004b, blocks: (B:4:0x0005, B:7:0x004d, B:9:0x0051, B:11:0x005c, B:16:0x0067, B:18:0x008c, B:20:0x0094, B:21:0x0013, B:23:0x003e), top: B:3:0x0005, outer: #1 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.zzm r3 = r11.zzf     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            int r3 = r3.zzk()     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            int r3 = r3 + (-1)
            r4 = 3
            r5 = 2
            if (r3 == r5) goto L13
        L11:
            r3 = r5
            goto L4d
        L13:
            android.content.Context r3 = r11.zzc     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            com.google.ads.interactivemedia.v3.internal.zzoy r6 = r11.zzd     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            com.google.ads.interactivemedia.v3.internal.zzjo r7 = new com.google.ads.interactivemedia.v3.internal.zzjo     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            com.google.ads.interactivemedia.v3.internal.zzqi r8 = new com.google.ads.interactivemedia.v3.internal.zzqi     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            android.content.Context r9 = r11.zzc     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            int r3 = com.google.ads.interactivemedia.v3.internal.zzpq.zzb(r3, r6)     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            com.google.ads.interactivemedia.v3.internal.zznj r6 = com.google.ads.interactivemedia.v3.internal.zznr.zzbX     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            com.google.ads.interactivemedia.v3.internal.zznp r10 = com.google.ads.interactivemedia.v3.internal.zznc.zzc()     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            java.lang.Object r6 = r10.zzb(r6)     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            r8.<init>(r9, r3, r7, r6)     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            r3 = 1
            boolean r3 = r8.zzd(r3)     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            if (r3 != 0) goto L47
            com.google.ads.interactivemedia.v3.internal.zzm r3 = r11.zzf     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            boolean r3 = r3.zzi()     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            if (r3 == 0) goto L47
            goto L11
        L47:
            r3 = r4
            goto L4d
        L49:
            r0 = move-exception
            goto Lbb
        L4b:
            r3 = move-exception
            goto L9f
        L4d:
            int r3 = r3 + (-1)
            if (r3 == r5) goto L67
            r11.zzi()     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            com.google.ads.interactivemedia.v3.internal.zzm r3 = r11.zzf     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            int r3 = r3.zzk()     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            if (r3 != r4) goto L97
            java.util.concurrent.Executor r3 = r11.zze     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            com.google.ads.interactivemedia.v3.internal.zzjn r4 = new com.google.ads.interactivemedia.v3.internal.zzjn     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            r4.<init>()     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            r3.execute(r4)     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            goto L97
        L67:
            com.google.ads.interactivemedia.v3.internal.zzm r3 = r11.zzf     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            java.lang.String r3 = r3.zzc()     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            android.content.Context r4 = r11.zzc     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            android.content.Context r4 = zzj(r4)     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            java.util.concurrent.Executor r5 = r11.zze     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            com.google.ads.interactivemedia.v3.internal.zzm r6 = r11.zzf     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            boolean r6 = r6.zzg()     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            boolean r7 = r11.zzg     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            com.google.ads.interactivemedia.v3.internal.zzji r3 = com.google.ads.interactivemedia.v3.internal.zzji.zzb(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            java.util.concurrent.atomic.AtomicReference r4 = r11.zzb     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            r4.set(r3)     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            boolean r3 = r3.zzr()     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            if (r3 != 0) goto L97
            com.google.ads.interactivemedia.v3.internal.zzm r3 = r11.zzf     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            boolean r3 = r3.zzi()     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
            if (r3 == 0) goto L97
            r11.zzi()     // Catch: java.lang.Throwable -> L49 java.lang.NullPointerException -> L4b
        L97:
            r11.zzc = r2
            java.util.concurrent.CountDownLatch r11 = r11.zza
        L9b:
            r11.countDown()
            return
        L9f:
            com.google.ads.interactivemedia.v3.internal.zzm r4 = r11.zzf     // Catch: java.lang.Throwable -> L49
            boolean r4 = r4.zzi()     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto Laa
            r11.zzi()     // Catch: java.lang.Throwable -> L49
        Laa:
            com.google.ads.interactivemedia.v3.internal.zzoy r4 = r11.zzd     // Catch: java.lang.Throwable -> L49
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L49
            long r5 = r5 - r0
            r0 = 2031(0x7ef, float:2.846E-42)
            r4.zzc(r0, r5, r3)     // Catch: java.lang.Throwable -> L49
            r11.zzc = r2
            java.util.concurrent.CountDownLatch r11 = r11.zza
            goto L9b
        Lbb:
            r11.zzc = r2
            java.util.concurrent.CountDownLatch r11 = r11.zza
            r11.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzjp.run():void");
    }

    public final zzjl zza() {
        return (zzjl) this.zzb.get();
    }

    final /* synthetic */ void zzc() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzji.zza(this.zzf.zzc(), zzj(this.zzc), this.zzf.zzg(), this.zzg).zzo();
        } catch (NullPointerException e) {
            this.zzd.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    @Deprecated
    public final String zze(Context context, String str, View view, Activity activity) {
        if (!zzs()) {
            return "";
        }
        zzd();
        return ((zzjl) this.zzb.get()).zze(zzj(context), str, view, activity);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzf(Context context) {
        return zzg(context, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzg(Context context, byte[] bArr) {
        if (!zzs()) {
            return "";
        }
        zzd();
        return ((zzjl) this.zzb.get()).zzf(zzj(context));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzh(Context context, View view, Activity activity) {
        return zzs() ? ((zzjl) this.zzb.get()).zzh(context, view, activity) : "";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzk(MotionEvent motionEvent) {
        if (this.zzb.get() == null) {
            this.zzh.add(new Object[]{motionEvent});
        } else {
            zzd();
            ((zzjl) this.zzb.get()).zzk(motionEvent);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzl(int i, int i2, int i3) {
        if (this.zzb.get() == null) {
            this.zzh.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            zzd();
            ((zzjl) this.zzb.get()).zzl(i, i2, i3);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzn(View view) {
        if (this.zzb.get() != null) {
            ((zzjl) this.zzb.get()).zzn(view);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final boolean zzq() {
        return this.zza.getCount() == 0 && this.zzb.get() != null && ((zzjl) this.zzb.get()).zzq();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final boolean zzs() {
        try {
            this.zza.await();
            if (this.zzb.get() != null) {
                if (((zzjl) this.zzb.get()).zzs()) {
                    return true;
                }
            }
        } catch (InterruptedException unused) {
        }
        return false;
    }
}
