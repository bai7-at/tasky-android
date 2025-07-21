package defpackage;

import com.google.android.gms.internal.pal.s7;
import com.google.android.gms.internal.pal.t7;
import com.google.android.gms.internal.pal.zzadi;
import com.google.android.gms.internal.pal.zzvn;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class fcf {
    public static final acf a(byte[] bArr) {
        try {
            t7 w = t7.w(bArr, ev9.a());
            for (s7 s7Var : w.x()) {
                if (s7Var.t().t() == zzvn.UNKNOWN_KEYMATERIAL || s7Var.t().t() == zzvn.SYMMETRIC || s7Var.t().t() == zzvn.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return acf.a(w);
        } catch (zzadi unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
