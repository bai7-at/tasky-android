package com.google.android.gms.ads;

import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.d59;
import defpackage.f8b;
import defpackage.fc5;
import defpackage.fgb;
import defpackage.oeb;
import defpackage.v9d;

/* loaded from: classes2.dex */
public class MobileAds {
    public static d59 a() {
        v9d.b();
        String[] split = TextUtils.split("23.0.0", "\\.");
        if (split.length != 3) {
            return new d59(0, 0, 0);
        }
        try {
            return new d59(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new d59(0, 0, 0);
        }
    }

    public static void b(WebView webView) {
        v9d.b();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (webView == null) {
            fgb.d("The webview to be registered cannot be null.");
            return;
        }
        oeb a = f8b.a(webView.getContext());
        if (a == null) {
            fgb.d("Internal error, query info generator is null.");
            return;
        }
        try {
            a.J(fc5.l3(webView));
        } catch (RemoteException e) {
            fgb.e("", e);
        }
    }

    @KeepForSdk
    private static void setPlugin(String str) {
        v9d.b().c(str);
    }
}
