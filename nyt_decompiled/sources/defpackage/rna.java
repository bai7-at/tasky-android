package defpackage;

import android.os.Handler;
import android.util.Log;
import com.google.ads.interactivemedia.pal.NonceLoaderException;
import com.google.ads.interactivemedia.pal.zzat;
import com.google.android.gms.internal.pal.zzagc;
import com.google.android.gms.internal.pal.zzil;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class rna extends ipa {
    public rna(Handler handler, ExecutorService executorService) {
        super(handler, executorService, zzagc.b(2L));
    }

    private static acf g() {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL("https://imasdk.googleapis.com/pal/key/public.json").openConnection();
                try {
                    try {
                        httpURLConnection2.setConnectTimeout(zzat.zzb);
                        httpURLConnection2.setReadTimeout(zzat.zzc);
                        httpURLConnection2.setDoInput(true);
                        httpURLConnection2.setUseCaches(false);
                        httpURLConnection2.connect();
                        if (httpURLConnection2.getResponseCode() != 200) {
                            Log.w("NonceGenerator", "Failed keystore response: " + httpURLConnection2.getResponseCode());
                            throw NonceLoaderException.zzb(202);
                        }
                        InputStream inputStream = httpURLConnection2.getInputStream();
                        try {
                            acf b = acf.b(oaf.a(inputStream));
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            httpURLConnection2.disconnect();
                            return b;
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th2) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (IOException | GeneralSecurityException e) {
                    e = e;
                    httpURLConnection = httpURLConnection2;
                    Log.e("NonceGenerator", "Failed to read keyset handle: " + e.toString());
                    throw new NonceLoaderException(203, e);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException | GeneralSecurityException e2) {
            e = e2;
        }
    }

    @Override // defpackage.ipa
    final zzil a() {
        try {
            mjf.a();
            return zzil.f(new sma((naf) g().c(naf.class)));
        } catch (GeneralSecurityException e) {
            Log.e("NonceGenerator", "Can't access the cryptography library.", e);
            throw new NonceLoaderException(201, e);
        }
    }
}
