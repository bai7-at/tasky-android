package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Handler;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.oe9;
import defpackage.re9;

@SuppressLint({"SetJavaScriptEnabled", "NewApi"})
/* loaded from: classes2.dex */
public final class zzft {
    private final WebView zza;
    private final Handler zzb;
    private zzfq zzc;
    private boolean zzd = false;

    zzft(Handler handler, WebView webView, Uri uri) {
        this.zzb = handler;
        this.zza = webView;
        webView.setBackgroundColor(0);
        webView.getSettings().setMixedContentMode(0);
        webView.getSettings().setJavaScriptEnabled(true);
        if (re9.a("WEB_MESSAGE_LISTENER")) {
            String format = String.format("%s://%s", uri.getScheme(), uri.getHost());
            oe9.a(webView, "androidWebViewCompatSender", zzst.zzm(uri.getPort() != -1 ? String.format("%s:%s", format, Integer.valueOf(uri.getPort())) : format), new zzfp(this));
        }
        webView.setWebViewClient(new zzfs(this));
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(webView, true);
    }

    public final WebView zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzfn
            @Override // java.lang.Runnable
            public final void run() {
                zzft.this.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        this.zzd = true;
        this.zza.destroy();
    }

    final /* synthetic */ void zzd(zzff zzffVar) {
        String zzg = zzffVar.zzg();
        if (this.zzd) {
            zzhd.zzd("Attempted to send bridge message after cleanup: " + zzffVar.toString() + "; " + zzg);
            return;
        }
        zzhd.zzc("Sending Javascript msg: " + zzffVar.toString() + "; URL: " + zzg);
        try {
            this.zza.evaluateJavascript(zzg, null);
        } catch (IllegalStateException unused) {
            this.zza.loadUrl(zzg);
        }
    }

    public final void zze(String str) {
        this.zza.loadUrl(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032 A[Catch: Exception -> 0x0030, IllegalArgumentException -> 0x006f, TryCatch #2 {IllegalArgumentException -> 0x006f, Exception -> 0x0030, blocks: (B:3:0x0002, B:14:0x0036, B:19:0x002b, B:20:0x0032), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzf(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = ", Message Type: "
            int r1 = r7.hashCode()     // Catch: java.lang.Exception -> L30 java.lang.IllegalArgumentException -> L6f
            r2 = 48
            r3 = 1
            if (r1 == r2) goto L1a
            r2 = 52
            if (r1 == r2) goto L10
            goto L24
        L10:
            java.lang.String r1 = "4"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L24
            r1 = r3
            goto L25
        L1a:
            java.lang.String r1 = "0"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L24
            r1 = 0
            goto L25
        L24:
            r1 = -1
        L25:
            if (r1 == 0) goto L32
            if (r1 == r3) goto L2b
            r1 = 0
            goto L36
        L2b:
            com.google.ads.interactivemedia.v3.internal.zzff r1 = com.google.ads.interactivemedia.v3.internal.zzff.zzd(r6)     // Catch: java.lang.Exception -> L30 java.lang.IllegalArgumentException -> L6f
            goto L36
        L30:
            r5 = move-exception
            goto L54
        L32:
            com.google.ads.interactivemedia.v3.internal.zzff r1 = com.google.ads.interactivemedia.v3.internal.zzff.zzc(r6)     // Catch: java.lang.Exception -> L30 java.lang.IllegalArgumentException -> L6f
        L36:
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L30 java.lang.IllegalArgumentException -> L6f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30 java.lang.IllegalArgumentException -> L6f
            r3.<init>()     // Catch: java.lang.Exception -> L30 java.lang.IllegalArgumentException -> L6f
            java.lang.String r4 = "Received Javascript msg: "
            r3.append(r4)     // Catch: java.lang.Exception -> L30 java.lang.IllegalArgumentException -> L6f
            r3.append(r2)     // Catch: java.lang.Exception -> L30 java.lang.IllegalArgumentException -> L6f
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L30 java.lang.IllegalArgumentException -> L6f
            com.google.ads.interactivemedia.v3.internal.zzhd.zzc(r2)     // Catch: java.lang.Exception -> L30 java.lang.IllegalArgumentException -> L6f
            com.google.ads.interactivemedia.v3.internal.zzfq r5 = r5.zzc
            r5.zzl(r1)
            return
        L54:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid internal message. Message could not be be parsed: "
            r1.append(r2)
            r1.append(r6)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            com.google.ads.interactivemedia.v3.internal.zzhd.zzb(r6, r5)
            return
        L6f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Invalid internal message. Make sure the Google IMA SDK library is up to date. Message: "
            r5.append(r1)
            r5.append(r6)
            r5.append(r0)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.google.ads.interactivemedia.v3.internal.zzhd.zzd(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzft.zzf(java.lang.String, java.lang.String):void");
    }

    protected final void zzg(zzfq zzfqVar) {
        this.zzc = zzfqVar;
    }

    public final void zzh(final zzff zzffVar) {
        this.zzb.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzfo
            @Override // java.lang.Runnable
            public final void run() {
                zzft.this.zzd(zzffVar);
            }
        });
    }
}
