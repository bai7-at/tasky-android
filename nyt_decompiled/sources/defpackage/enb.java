package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class enb extends emb {
    public enb(wlb wlbVar, ina inaVar, boolean z, l8d l8dVar) {
        super(wlbVar, inaVar, z, new p6b(wlbVar, wlbVar.D(), new roa(wlbVar.getContext())), null, l8dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse Q0(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof wlb)) {
            fgb.g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        wlb wlbVar = (wlb) webView;
        kdb kdbVar = this.L;
        if (kdbVar != null) {
            kdbVar.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.d0(str, map);
        }
        if (wlbVar.zzN() != null) {
            wlbVar.zzN().h();
        }
        if (wlbVar.zzO().i()) {
            str2 = (String) pla.c().a(mpa.O);
        } else if (wlbVar.p()) {
            str2 = (String) pla.c().a(mpa.N);
        } else {
            str2 = (String) pla.c().a(mpa.M);
        }
        dyf.r();
        return wxf.Y(wlbVar.getContext(), wlbVar.zzn().zza, str2);
    }

    @Override // defpackage.emb, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        super.onPageStarted(webView, str, bitmap);
    }
}
