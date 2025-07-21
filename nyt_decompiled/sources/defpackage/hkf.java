package defpackage;

import com.google.android.gms.internal.pal.a4;
import com.google.android.gms.internal.pal.e5;
import com.google.android.gms.internal.pal.f5;
import com.google.android.gms.internal.pal.i5;
import com.google.android.gms.internal.pal.j6;
import com.google.android.gms.internal.pal.k6;
import com.google.android.gms.internal.pal.k7;
import com.google.android.gms.internal.pal.r4;
import com.google.android.gms.internal.pal.s3;
import com.google.android.gms.internal.pal.s4;
import com.google.android.gms.internal.pal.t3;
import com.google.android.gms.internal.pal.v4;
import com.google.android.gms.internal.pal.w3;
import com.google.android.gms.internal.pal.z3;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzadi;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class hkf implements w4g {
    private final String a;
    private final int b;
    private s4 c;
    private t3 d;
    private int e;
    private f5 f;

    hkf(k7 k7Var) {
        String w = k7Var.w();
        this.a = w;
        if (w.equals(ydf.b)) {
            try {
                v4 v = v4.v(k7Var.v(), ev9.a());
                this.c = (s4) rdf.d(k7Var);
                this.b = v.s();
                return;
            } catch (zzadi e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (w.equals(ydf.a)) {
            try {
                w3 u = w3.u(k7Var.v(), ev9.a());
                this.d = (t3) rdf.d(k7Var);
                this.e = u.v().s();
                this.b = this.e + u.w().s();
                return;
            } catch (zzadi e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        }
        if (!w.equals(oif.a)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(w)));
        }
        try {
            i5 v2 = i5.v(k7Var.v(), ev9.a());
            this.f = (f5) rdf.d(k7Var);
            this.b = v2.s();
        } catch (zzadi e3) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
        }
    }

    @Override // defpackage.w4g
    public final jnf a(byte[] bArr) {
        if (bArr.length != this.b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.a.equals(ydf.b)) {
            r4 t = s4.t();
            t.e(this.c);
            t.k(zzaby.v(bArr, 0, this.b));
            return new jnf((haf) rdf.h(this.a, (s4) t.g(), haf.class));
        }
        if (!this.a.equals(ydf.a)) {
            if (!this.a.equals(oif.a)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            e5 t2 = f5.t();
            t2.e(this.f);
            t2.k(zzaby.v(bArr, 0, this.b));
            return new jnf((kaf) rdf.h(this.a, (f5) t2.g(), kaf.class));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.e);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.e, this.b);
        z3 t3 = a4.t();
        t3.e(this.d.w());
        t3.k(zzaby.u(copyOfRange));
        a4 a4Var = (a4) t3.g();
        j6 t4 = k6.t();
        t4.e(this.d.x());
        t4.k(zzaby.u(copyOfRange2));
        k6 k6Var = (k6) t4.g();
        s3 t5 = t3.t();
        t5.m(this.d.s());
        t5.k(a4Var);
        t5.l(k6Var);
        return new jnf((haf) rdf.h(this.a, (t3) t5.g(), haf.class));
    }

    @Override // defpackage.w4g
    public final int zza() {
        return this.b;
    }
}
