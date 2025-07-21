package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.webkit.WebView;
import defpackage.fs3;
import defpackage.oe9;
import defpackage.td9;

/* loaded from: classes2.dex */
final class zzfp implements oe9.a {
    final /* synthetic */ zzft zza;

    zzfp(zzft zzftVar) {
        this.zza = zzftVar;
    }

    @Override // oe9.a
    public final void onPostMessage(WebView webView, td9 td9Var, Uri uri, boolean z, fs3 fs3Var) {
        this.zza.zzf(td9Var.a(), "4");
    }
}
