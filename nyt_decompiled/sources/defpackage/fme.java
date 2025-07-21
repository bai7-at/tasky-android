package defpackage;

import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.ph;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class fme {
    public static ple a(byte[] bArr) {
        try {
            hf O = hf.O(bArr, ph.a());
            ste d = ste.d();
            mue a = mue.a(O);
            return !d.k(a) ? new cte(a) : d.c(a);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] b(ple pleVar) {
        return ((mue) ste.d().f(pleVar, mue.class)).c().i();
    }
}
