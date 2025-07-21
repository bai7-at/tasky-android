package defpackage;

import android.util.Base64;
import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;
import com.google.ads.interactivemedia.pal.NonceLoaderException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final class sma implements ola {
    private final naf a;

    sma(naf nafVar) {
        this.a = nafVar;
    }

    @Override // defpackage.ola
    public final String a(String str) {
        try {
            return Base64.encodeToString(this.a.zza(str.getBytes(Constants.DEFAULT_ENCODING), new byte[0]), 10);
        } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e) {
            Log.e("NonceGenerator", "Failed to encrypt the string.", e);
            throw new NonceLoaderException(204, e);
        }
    }
}
