package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zznp implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;

    @VisibleForTesting
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();

    private final void zzf() {
        if (this.zze == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzns.zza(new zzrp() { // from class: com.google.ads.interactivemedia.v3.internal.zznn
                @Override // com.google.ads.interactivemedia.v3.internal.zzrp
                public final Object zza() {
                    return zznp.this.zzd();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final Object zzb(final zznj zznjVar) {
        if (!this.zzc.block(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zznjVar.zzk();
            }
        }
        if (zznjVar.zzd() != 2) {
            return (zznjVar.zzd() == 1 && this.zzh.has(zznjVar.zzl())) ? zznjVar.zza(this.zzh) : zzns.zza(new zzrp() { // from class: com.google.ads.interactivemedia.v3.internal.zznm
                @Override // com.google.ads.interactivemedia.v3.internal.zzrp
                public final Object zza() {
                    return zznp.this.zzc(zznjVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zznjVar.zzk() : zznjVar.zzb(bundle);
    }

    final /* synthetic */ Object zzc(zznj zznjVar) {
        return zznjVar.zzc(this.zze);
    }

    final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", "{}");
    }

    public final void zze(Context context) {
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzd) {
                    return;
                }
                if (!this.zza) {
                    this.zza = true;
                }
                Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                this.zzg = applicationContext;
                try {
                    this.zzf = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                    if (remoteContext != null || (remoteContext = context.getApplicationContext()) != null) {
                        context = remoteContext;
                    }
                    if (context == null) {
                        return;
                    }
                    zznc.zzb();
                    SharedPreferences sharedPreferences = context.getSharedPreferences("google_ads_flags", 0);
                    this.zze = sharedPreferences;
                    if (sharedPreferences != null) {
                        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                    }
                    zzny.zzc(new zzno(this));
                    zzf();
                    this.zzd = true;
                } finally {
                    this.zza = false;
                    this.zzc.open();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
