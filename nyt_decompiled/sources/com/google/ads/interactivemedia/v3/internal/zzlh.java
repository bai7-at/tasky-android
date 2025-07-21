package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.cgf;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzlh extends zzmh {
    private static final zzmi zzi = new zzmi();
    private final Context zzj;

    public zzlh(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2, Context context, zzy zzyVar) {
        super(zzktVar, "V4y6sZwh4RdVNxpWxdt5cB3zHM/o72UxaS3FR8ryJ97Kzv92GLUKmmmoeiIEn2h0", "jF9g1ur6WV7u99T9DTRuiTzvsmxG0ZkqXVny5oCesvg=", zzafVar, i, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzbc zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzaj()) {
                return null;
            }
            return zzc.zzg();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzib zzibVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            try {
                zzib zzibVar2 = (zzib) zza.get();
                if (zzibVar2 == null || zzkw.zzd(zzibVar2.zza) || zzibVar2.zza.equals(QueryKeys.ENGAGED_SECONDS) || zzibVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzkw.zzd(null)) {
                        zzkw.zzd(null);
                        i = 3;
                    } else {
                        i = 5;
                    }
                    Boolean valueOf = Boolean.valueOf(i == 3);
                    Boolean bool = (Boolean) zznc.zzc().zzb(zznr.zzcd);
                    String zzb = ((Boolean) zznc.zzc().zzb(zznr.zzcc)).booleanValue() ? zzb() : null;
                    if (bool.booleanValue() && this.zzb.zzp() && zzkw.zzd(zzb)) {
                        zzb = zzc();
                    }
                    zzib zzibVar3 = new zzib((String) this.zzf.invoke(null, this.zzj, valueOf, zzb));
                    if (zzkw.zzd(zzibVar3.zza) || zzibVar3.zza.equals(QueryKeys.ENGAGED_SECONDS)) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            String zzc = zzc();
                            if (!zzkw.zzd(zzc)) {
                                zzibVar3.zza = zzc;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    zza.set(zzibVar3);
                }
                zzibVar = (zzib) zza.get();
            } finally {
            }
        }
        synchronized (this.zze) {
            if (zzibVar != null) {
                try {
                    this.zze.zzx(zzibVar.zza);
                    this.zze.zzX(zzibVar.zzb);
                    this.zze.zzZ(zzibVar.zzc);
                    this.zze.zzi(zzibVar.zzd);
                    this.zze.zzw(zzibVar.zze);
                } finally {
                }
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzkw.zzf((String) zznc.zzc().zzb(zznr.zzce));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzkw.zzf((String) zznc.zzc().zzb(zznr.zzcf)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(QueryKeys.SCREEN_WIDTH)) {
                return null;
            }
            final zzvx zzp = zzvx.zzp();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzmj
                public final void onChecksumsReady(List list) {
                    int type2;
                    byte[] value;
                    zzvx zzvxVar = zzvx.this;
                    if (list == null) {
                        zzvxVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum a = cgf.a(list.get(i));
                            type2 = a.getType();
                            if (type2 == 8) {
                                value = a.getValue();
                                zzvxVar.zzc(zzkw.zzb(value));
                                return;
                            }
                        }
                        zzvxVar.zzc(null);
                    } catch (Throwable unused) {
                        zzvxVar.zzc(null);
                    }
                }
            });
            return (String) zzp.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
