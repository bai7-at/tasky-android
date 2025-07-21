package defpackage;

import com.google.android.gms.internal.pal.k3;
import com.google.android.gms.internal.pal.q3;
import com.google.android.gms.internal.pal.zzadi;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
abstract class utf {
    private static final n7g a;
    private static final wqf b;
    private static final nqf c;
    private static final eof d;
    private static final vnf e;
    public static final /* synthetic */ int f = 0;

    static {
        n7g a2 = vsf.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = a2;
        b = wqf.c(mtf.a, ktf.class, irf.class);
        c = nqf.c(otf.a, a2, irf.class);
        d = eof.c(qtf.a, ysf.class, frf.class);
        e = vnf.b(new pnf() { // from class: stf
            @Override // defpackage.pnf
            public final cbf a(lrf lrfVar, tdf tdfVar) {
                itf itfVar;
                int i = utf.f;
                if (!((frf) lrfVar).d().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    k3 v = k3.v(((frf) lrfVar).b(), ev9.a());
                    if (v.s() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    q3 w = v.w();
                    int f2 = ((frf) lrfVar).f();
                    int s = w.s();
                    int i2 = f2 - 2;
                    if (i2 == 1) {
                        itfVar = itf.b;
                    } else if (i2 == 2) {
                        itfVar = itf.d;
                    } else if (i2 == 3) {
                        itfVar = itf.e;
                    } else {
                        if (i2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + b3g.a(f2));
                        }
                        itfVar = itf.c;
                    }
                    return ysf.b(ktf.b(s, itfVar), p7g.b(v.x().A(), tdfVar), ((frf) lrfVar).c());
                } catch (zzadi | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
        }, a2, frf.class);
    }

    public static void a() {
        eqf b2 = eqf.b();
        b2.f(b);
        b2.e(c);
        b2.d(d);
        b2.c(e);
    }
}
