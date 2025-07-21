package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzgx {
    private final Context zza;
    private final boolean zzb;
    private final long zzc;
    private final zzgu zzd;
    private final zzgp zze;

    public zzgx(Context context, zzgu zzguVar, zzhc zzhcVar) {
        this.zza = context;
        this.zzb = !zzguVar.zza;
        long j = zzguVar.zzb;
        this.zzc = j <= 0 ? 150L : j;
        this.zzd = zzguVar;
        this.zze = new zzgp(context, zzguVar.zzf, zzhcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.impl.data.zzbc zza(com.google.ads.interactivemedia.v3.api.BaseRequest r12) {
        /*
            r11 = this;
            java.lang.String r0 = ""
            r1 = 0
            android.content.Context r2 = r11.zza     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r2 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = r2.getId()     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.isLimitAdTrackingEnabled()     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = "adid"
            r7 = r2
            r5 = r3
        L15:
            r6 = r4
            goto L3e
        L17:
            r3 = r0
            r2 = r1
        L19:
            android.content.Context r4 = r11.zza     // Catch: android.provider.Settings.SettingNotFoundException -> L36
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: android.provider.Settings.SettingNotFoundException -> L36
            java.lang.String r5 = "advertising_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r4, r5)     // Catch: android.provider.Settings.SettingNotFoundException -> L36
            java.lang.String r6 = "limit_ad_tracking"
            int r2 = android.provider.Settings.Secure.getInt(r4, r6)     // Catch: android.provider.Settings.SettingNotFoundException -> L36
            r3 = 1
            if (r2 != r3) goto L30
            r2 = r3
            goto L31
        L30:
            r2 = r1
        L31:
            java.lang.String r4 = "afai"
            r7 = r2
            goto L15
        L35:
            r3 = r5
        L36:
            java.lang.String r4 = "Failed to get advertising ID."
            com.google.ads.interactivemedia.v3.internal.zzhd.zzd(r4)
            r6 = r0
            r7 = r2
            r5 = r3
        L3e:
            boolean r2 = r11.zzb
            if (r2 == 0) goto L6f
            android.content.Context r2 = r11.zza     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L68
            vm r2 = defpackage.um.a(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L68
            og8 r2 = r2.b()     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L68
            long r3 = r11.zzc     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L68
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L68
            java.lang.Object r2 = defpackage.vg8.b(r2, r3, r8)     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L68
            wm r2 = (defpackage.wm) r2     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L68
            java.lang.String r3 = r2.a()     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L68
            int r1 = r2.b()     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L69
        L5e:
            r9 = r1
            r8 = r3
            goto L71
        L61:
            r3 = r0
        L62:
            java.lang.String r2 = "Unable to contact the App Set SDK."
            com.google.ads.interactivemedia.v3.internal.zzhd.zzd(r2)
            goto L5e
        L68:
            r3 = r0
        L69:
            java.lang.String r2 = "Timeout getting AppSet ID."
            com.google.ads.interactivemedia.v3.internal.zzhd.zzd(r2)
            goto L5e
        L6f:
            r8 = r0
            r9 = r1
        L71:
            com.google.ads.interactivemedia.v3.internal.zzgv r12 = r12.zza()
            com.google.ads.interactivemedia.v3.internal.zzgu r1 = r11.zzd
            boolean r12 = r12.zza(r1, r7)
            if (r12 == 0) goto L83
            com.google.ads.interactivemedia.v3.internal.zzgp r11 = r11.zze
            java.lang.String r0 = r11.zza()
        L83:
            r10 = r0
            com.google.ads.interactivemedia.v3.impl.data.zzbc r11 = com.google.ads.interactivemedia.v3.impl.data.zzbc.create(r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzgx.zza(com.google.ads.interactivemedia.v3.api.BaseRequest):com.google.ads.interactivemedia.v3.impl.data.zzbc");
    }
}
