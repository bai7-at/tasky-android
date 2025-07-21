package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzcj {
    private zzdh zza;
    private long zzb;
    private int zzc;

    public zzcj() {
        zzb();
        this.zza = new zzdh(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j) {
        if (j < this.zzb || this.zzc == 3) {
            return;
        }
        this.zzc = 3;
        zzcc.zza().zzf(zza(), str);
    }

    public final void zze(String str, long j) {
        if (j >= this.zzb) {
            this.zzc = 2;
            zzcc.zza().zzf(zza(), str);
        }
    }

    public void zzf(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar, com.google.ads.interactivemedia.omid.library.adsession.zzc zzcVar) {
        zzg(zzeVar, zzcVar, null);
    }

    protected final void zzg(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar, com.google.ads.interactivemedia.omid.library.adsession.zzc zzcVar, JSONObject jSONObject) {
        String zzi = zzeVar.zzi();
        JSONObject jSONObject2 = new JSONObject();
        zzcn.zze(jSONObject2, "environment", "app");
        zzcn.zze(jSONObject2, "adSessionType", zzcVar.zzc());
        JSONObject jSONObject3 = new JSONObject();
        zzcn.zze(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzcn.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzcn.zze(jSONObject3, "os", "Android");
        zzcn.zze(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzcn.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzcn.zze(jSONObject4, "partnerName", zzcVar.zzd().zzb());
        zzcn.zze(jSONObject4, "partnerVersion", zzcVar.zzd().zzc());
        zzcn.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzcn.zze(jSONObject5, "libraryVersion", "1.3.37-google_20220829");
        zzcn.zze(jSONObject5, "appId", zzca.zzb().zza().getApplicationContext().getPackageName());
        zzcn.zze(jSONObject2, "app", jSONObject5);
        if (zzcVar.zze() != null) {
            zzcn.zze(jSONObject2, "contentUrl", zzcVar.zze());
        }
        zzcn.zze(jSONObject2, "customReferenceData", zzcVar.zzf());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it2 = zzcVar.zzg().iterator();
        if (it2.hasNext()) {
            throw null;
        }
        zzcc.zza().zzg(zza(), zzi, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzh(float f) {
        zzcc.zza().zze(zza(), f);
    }

    final void zzi(WebView webView) {
        this.zza = new zzdh(webView);
    }

    public void zzj() {
    }

    public final boolean zzk() {
        return this.zza.get() != 0;
    }
}
