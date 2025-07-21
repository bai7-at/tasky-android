package defpackage;

import android.util.Base64;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.bh;
import com.google.android.gms.internal.ads.zzgyl;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class g2e {
    public g2e() {
        try {
            hme.a();
        } catch (GeneralSecurityException e) {
            pzc.k("Failed to Configure Aead. ".concat(e.toString()));
            dyf.q().w(e, "CryptoUtils.registerAead");
        }
    }

    public static final String a() {
        bh B = zzgyl.B();
        try {
            tke.b(lle.c(ele.a(ote.b().a("AES128_GCM"))), ske.b(B));
        } catch (IOException | GeneralSecurityException e) {
            pzc.k("Failed to generate key".concat(e.toString()));
            dyf.q().w(e, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(B.b().a(), 11);
        B.d();
        return encodeToString;
    }

    public static final String b(byte[] bArr, byte[] bArr2, String str, uuc uucVar) {
        lle c = c(str);
        if (c == null) {
            return null;
        }
        try {
            byte[] zza = ((qke) c.e(rue.a(), qke.class)).zza(bArr, bArr2);
            uucVar.a().put("ds", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            return new String(zza, Constants.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e) {
            pzc.k("Failed to decrypt ".concat(e.toString()));
            dyf.q().w(e, "CryptoUtils.decrypt");
            uucVar.a().put("dsf", e.toString());
            return null;
        }
    }

    private static final lle c(String str) {
        try {
            return tke.a(rke.b(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            pzc.k("Failed to get keysethandle".concat(e.toString()));
            dyf.q().w(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
