package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzer extends WebViewClient {
    final /* synthetic */ zzes zza;

    zzer(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.zza.zzb.zza(str);
        Iterator it2 = this.zza.zzc.iterator();
        while (it2.hasNext()) {
            ((CompanionAdSlot.ClickListener) it2.next()).onCompanionAdClick();
        }
        return true;
    }
}
