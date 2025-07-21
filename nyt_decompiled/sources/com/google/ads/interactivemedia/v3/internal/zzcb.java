package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;

/* loaded from: classes2.dex */
final class zzcb implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    zzcb(zzcc zzccVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.loadUrl(this.zzb);
    }
}
