package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcm extends zzcj {
    private WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzcm(Map map, String str) {
        this.zzc = map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcj
    public final void zzc() {
        super.zzc();
        new Handler().postDelayed(new zzcl(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcj
    public final void zzf(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar, com.google.ads.interactivemedia.omid.library.adsession.zzc zzcVar) {
        JSONObject jSONObject = new JSONObject();
        Map zzh = zzcVar.zzh();
        for (String str : zzh.keySet()) {
            zzcn.zze(jSONObject, str, (com.google.ads.interactivemedia.omid.library.adsession.zzj) zzh.get(str));
        }
        zzg(zzeVar, zzcVar, jSONObject);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcj
    public final void zzj() {
        WebView webView = new WebView(zzca.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        zzi(this.zza);
        WebView webView2 = this.zza;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it2 = this.zzc.keySet().iterator();
        if (!it2.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }
}
