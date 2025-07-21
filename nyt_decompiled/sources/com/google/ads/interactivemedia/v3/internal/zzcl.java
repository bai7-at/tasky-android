package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;

/* loaded from: classes2.dex */
final class zzcl implements Runnable {
    final /* synthetic */ zzcm zza;
    private final WebView zzb;

    zzcl(zzcm zzcmVar) {
        WebView webView;
        this.zza = zzcmVar;
        webView = zzcmVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
