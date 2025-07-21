package com.google.ads.interactivemedia.pal;

import defpackage.e7f;
import defpackage.y5f;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes2.dex */
final class zzo extends Thread {
    final /* synthetic */ String zza;

    zzo(zzs zzsVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str = this.zza;
        try {
            e7f a = y5f.a();
            try {
                URLConnection b = a.b(new URL(str), 26624);
                ((HttpURLConnection) b).setConnectTimeout(zzat.zzb);
                ((HttpURLConnection) b).setReadTimeout(zzat.zzc);
                ((HttpURLConnection) b).setDoInput(false);
                ((HttpURLConnection) b).setUseCaches(false);
                ((HttpURLConnection) b).getResponseCode();
                a.close();
            } catch (Throwable th) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
    }
}
