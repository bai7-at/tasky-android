package com.google.ads.interactivemedia.omid.library.adsession;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzc {
    private final zzi zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzd zzg;

    private zzc(zzi zziVar, WebView webView, String str, List list, String str2, String str3, zzd zzdVar) {
        this.zza = zziVar;
        this.zzb = webView;
        this.zzg = zzdVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzc zzb(zzi zziVar, WebView webView, String str, String str2) {
        if (str2.length() <= 256) {
            return new zzc(zziVar, webView, null, null, str, str2, zzd.JAVASCRIPT);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzd zzc() {
        return this.zzg;
    }

    public final zzi zzd() {
        return this.zza;
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final List zzg() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzh() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
