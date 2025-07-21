package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import defpackage.xuf;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzcb implements ServiceConnection {
    final /* synthetic */ zzcc zza;
    private volatile boolean zzb;
    private volatile zzey zzc;

    protected zzcb(zzcc zzccVar) {
        this.zza = zzccVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[Catch: all -> 0x0017, TRY_ENTER, TryCatch #2 {all -> 0x0017, blocks: (B:5:0x0008, B:12:0x001b, B:14:0x0027, B:16:0x0031, B:18:0x0039, B:28:0x0054, B:20:0x0068, B:22:0x006c, B:26:0x0082, B:33:0x004b, B:34:0x0034, B:35:0x0041), top: B:3:0x0006, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            java.lang.String r3 = "AnalyticsServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r3)
            monitor-enter(r2)
            if (r4 != 0) goto L1a
            com.google.android.gms.internal.gtm.zzcc r3 = r2.zza     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = "Service connected with null binder"
            r3.zzJ(r4)     // Catch: java.lang.Throwable -> L17
            r2.notifyAll()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r3 = move-exception
            goto L8d
        L17:
            r3 = move-exception
            goto L89
        L1a:
            r3 = 0
            java.lang.String r0 = r4.getInterfaceDescriptor()     // Catch: java.lang.Throwable -> L17 android.os.RemoteException -> L4a
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L17 android.os.RemoteException -> L4a
            if (r1 == 0) goto L41
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)     // Catch: java.lang.Throwable -> L17 android.os.RemoteException -> L4a
            boolean r1 = r0 instanceof com.google.android.gms.internal.gtm.zzey     // Catch: java.lang.Throwable -> L17 android.os.RemoteException -> L4a
            if (r1 == 0) goto L34
            com.google.android.gms.internal.gtm.zzey r0 = (com.google.android.gms.internal.gtm.zzey) r0     // Catch: java.lang.Throwable -> L17 android.os.RemoteException -> L4a
            goto L39
        L34:
            com.google.android.gms.internal.gtm.zzey r0 = new com.google.android.gms.internal.gtm.zzey     // Catch: java.lang.Throwable -> L17 android.os.RemoteException -> L4a
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L17 android.os.RemoteException -> L4a
        L39:
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: java.lang.Throwable -> L17 android.os.RemoteException -> L4b
            java.lang.String r1 = "Bound to IAnalyticsService interface"
            r4.zzO(r1)     // Catch: java.lang.Throwable -> L17 android.os.RemoteException -> L4b
            goto L52
        L41:
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: java.lang.Throwable -> L17 android.os.RemoteException -> L4a
            java.lang.String r1 = "Got binder with a wrong descriptor"
            r4.zzK(r1, r0)     // Catch: java.lang.Throwable -> L17 android.os.RemoteException -> L4a
            r0 = r3
            goto L52
        L4a:
            r0 = r3
        L4b:
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "Service connect failed to get IAnalyticsService"
            r4.zzJ(r1)     // Catch: java.lang.Throwable -> L17
        L52:
            if (r0 != 0) goto L68
            com.google.android.gms.common.stats.ConnectionTracker r3 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch: java.lang.Throwable -> L17 java.lang.IllegalArgumentException -> L84
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: java.lang.Throwable -> L17 java.lang.IllegalArgumentException -> L84
            android.content.Context r4 = r4.zzo()     // Catch: java.lang.Throwable -> L17 java.lang.IllegalArgumentException -> L84
            com.google.android.gms.internal.gtm.zzcc r0 = r2.zza     // Catch: java.lang.Throwable -> L17 java.lang.IllegalArgumentException -> L84
            com.google.android.gms.internal.gtm.zzcb r0 = com.google.android.gms.internal.gtm.zzcc.zza(r0)     // Catch: java.lang.Throwable -> L17 java.lang.IllegalArgumentException -> L84
            r3.unbindService(r4, r0)     // Catch: java.lang.Throwable -> L17 java.lang.IllegalArgumentException -> L84
            goto L84
        L68:
            boolean r4 = r2.zzb     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L82
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "onServiceConnected received after the timeout limit"
            r4.zzR(r1)     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: java.lang.Throwable -> L17
            xuf r4 = r4.zzq()     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.gtm.zzbz r1 = new com.google.android.gms.internal.gtm.zzbz     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L17
            r4.e(r1)     // Catch: java.lang.Throwable -> L17
            goto L84
        L82:
            r2.zzc = r0     // Catch: java.lang.Throwable -> L17
        L84:
            r2.notifyAll()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return
        L89:
            r2.notifyAll()     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L14
        L8d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcb.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceDisconnected");
        this.zza.zzq().e(new zzca(this, componentName));
    }

    public final zzey zza() {
        zzcb zzcbVar;
        xuf.d();
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        Context zzo = this.zza.zzo();
        intent.putExtra("app_package_name", zzo.getPackageName());
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            this.zzc = null;
            this.zzb = true;
            zzcbVar = this.zza.zza;
            boolean bindService = connectionTracker.bindService(zzo, intent, zzcbVar, 129);
            this.zza.zzP("Bind to service requested", Boolean.valueOf(bindService));
            if (!bindService) {
                this.zzb = false;
                return null;
            }
            try {
                this.zza.zzw();
                wait(zzeu.zzL.zzb().longValue());
            } catch (InterruptedException unused) {
                this.zza.zzR("Wait for service connect was interrupted");
            }
            this.zzb = false;
            zzey zzeyVar = this.zzc;
            this.zzc = null;
            if (zzeyVar == null) {
                this.zza.zzJ("Successfully bound to service but never got onServiceConnected callback");
            }
            return zzeyVar;
        }
    }
}
