package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.internal.pal.s7;
import com.google.android.gms.internal.pal.t7;
import com.google.android.gms.internal.pal.v7;
import com.google.android.gms.internal.pal.w7;
import com.google.android.gms.internal.pal.x7;
import com.google.android.gms.internal.pal.y7;
import com.google.android.gms.internal.pal.zzvn;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
abstract class vdf {
    public static final Charset a = Charset.forName(Constants.DEFAULT_ENCODING);

    public static y7 a(t7 t7Var) {
        v7 s = y7.s();
        s.l(t7Var.t());
        for (s7 s7Var : t7Var.x()) {
            w7 s2 = x7.s();
            s2.l(s7Var.t().x());
            s2.n(s7Var.E());
            s2.m(s7Var.F());
            s2.k(s7Var.s());
            s.k((x7) s2.g());
        }
        return (y7) s.g();
    }

    public static void b(t7 t7Var) {
        int t = t7Var.t();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (s7 s7Var : t7Var.x()) {
            if (s7Var.E() == 3) {
                if (!s7Var.C()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(s7Var.s())));
                }
                if (s7Var.F() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(s7Var.s())));
                }
                if (s7Var.E() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(s7Var.s())));
                }
                if (s7Var.s() == t) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= s7Var.t().t() == zzvn.ASYMMETRIC_PUBLIC;
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }

    public static byte[] c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
