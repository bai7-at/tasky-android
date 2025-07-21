package defpackage;

import android.os.Build;
import com.google.android.gms.internal.ads.d0;
import com.google.android.gms.internal.ads.zzapd;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class oae {
    protected static final byte[] c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    protected static final byte[] d = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};
    private final byte[] a = d;
    private final byte[] b = c;

    public final boolean a(File file) {
        try {
            X509Certificate[][] a = d0.a(file.getAbsolutePath());
            if (a.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(a[0][0].getEncoded());
            if (Arrays.equals(this.b, digest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.a, digest);
        } catch (zzapd e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException | RuntimeException e2) {
            throw new GeneralSecurityException("Failed to verify signatures", e2);
        }
    }
}
