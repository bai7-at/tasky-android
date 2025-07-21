package defpackage;

import com.google.android.gms.internal.pal.k6;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
final class wtf extends zqf {
    wtf(Class cls) {
        super(cls);
    }

    @Override // defpackage.zqf
    public final /* bridge */ /* synthetic */ Object a(zx9 zx9Var) {
        k6 k6Var = (k6) zx9Var;
        int x = k6Var.x().x();
        SecretKeySpec secretKeySpec = new SecretKeySpec(k6Var.C().A(), "HMAC");
        int s = k6Var.x().s();
        int i = x - 2;
        if (i == 1) {
            return new z6g(new x6g("HMACSHA1", secretKeySpec), s);
        }
        if (i == 2) {
            return new z6g(new x6g("HMACSHA384", secretKeySpec), s);
        }
        if (i == 3) {
            return new z6g(new x6g("HMACSHA256", secretKeySpec), s);
        }
        if (i == 4) {
            return new z6g(new x6g("HMACSHA512", secretKeySpec), s);
        }
        if (i == 5) {
            return new z6g(new x6g("HMACSHA224", secretKeySpec), s);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
