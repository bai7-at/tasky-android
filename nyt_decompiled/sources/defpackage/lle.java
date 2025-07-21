package defpackage;

import com.google.android.gms.internal.ads.of;
import com.google.android.gms.internal.ads.pf;
import com.google.android.gms.internal.ads.rf;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.ads.tf;
import com.google.android.gms.internal.ads.uf;
import com.google.android.gms.internal.ads.zzgpl;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class lle {
    private final pf a;
    private final List b;
    private final pxe c;

    private lle(pf pfVar, List list, pxe pxeVar) {
        this.a = pfVar;
        this.b = list;
        this.c = pxeVar;
    }

    static final lle a(pf pfVar) {
        i(pfVar);
        return new lle(pfVar, h(pfVar));
    }

    static final lle b(pf pfVar, pxe pxeVar) {
        i(pfVar);
        return new lle(pfVar, h(pfVar), pxeVar);
    }

    public static final lle c(ple pleVar) {
        ile ileVar = new ile();
        gle gleVar = new gle(pleVar, null);
        gleVar.e();
        gleVar.d();
        ileVar.a(gleVar);
        return ileVar.b();
    }

    private static lue f(of ofVar) {
        try {
            return lue.a(ofVar.M().Q(), ofVar.M().P(), ofVar.M().M(), ofVar.P(), ofVar.P() == zzgvz.RAW ? null : Integer.valueOf(ofVar.L()));
        } catch (GeneralSecurityException e) {
            throw new zzgpl("Creating a protokey serialization failed", e);
        }
    }

    private static Object g(ose oseVar, of ofVar, Class cls) {
        try {
            return cme.c(ofVar.M(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e) {
            if (e.getMessage().contains("No key manager found for key type ") || e.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e;
        }
    }

    private static List h(pf pfVar) {
        dle dleVar;
        ArrayList arrayList = new ArrayList(pfVar.L());
        for (of ofVar : pfVar.R()) {
            int L = ofVar.L();
            try {
                ble b = ste.d().b(f(ofVar), dme.a());
                int U = ofVar.U() - 2;
                if (U == 1) {
                    dleVar = dle.b;
                } else if (U == 2) {
                    dleVar = dle.c;
                } else {
                    if (U != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    dleVar = dle.d;
                }
                arrayList.add(new kle(b, dleVar, L, L == pfVar.M(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void i(pf pfVar) {
        if (pfVar == null || pfVar.L() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static final Object j(ose oseVar, ble bleVar, Class cls) {
        try {
            return pte.a().c(bleVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    final pf d() {
        return this.a;
    }

    public final Object e(uke ukeVar, Class cls) {
        Class b = cme.b(cls);
        if (b == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        pf pfVar = this.a;
        Charset charset = gme.a;
        int M = pfVar.M();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        for (of ofVar : pfVar.R()) {
            if (ofVar.U() == 3) {
                if (!ofVar.T()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(ofVar.L())));
                }
                if (ofVar.P() == zzgvz.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(ofVar.L())));
                }
                if (ofVar.U() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(ofVar.L())));
                }
                if (ofVar.L() == M) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                z &= ofVar.M().M() == zzgus.ASYMMETRIC_PUBLIC;
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z2 && !z) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        rle rleVar = new rle(b, null);
        rleVar.c(this.c);
        for (int i2 = 0; i2 < this.a.L(); i2++) {
            of O = this.a.O(i2);
            if (O.U() == 3) {
                ose oseVar = (ose) ukeVar;
                Object g = g(oseVar, O, b);
                Object j = this.b.get(i2) != null ? j(oseVar, ((kle) this.b.get(i2)).a(), b) : null;
                if (j == null && g == null) {
                    throw new GeneralSecurityException("Unable to get primitive " + b.toString() + " for key of type " + O.M().Q());
                }
                if (O.L() == this.a.M()) {
                    rleVar.b(j, g, O);
                } else {
                    rleVar.a(j, g, O);
                }
            }
        }
        return pte.a().d(rleVar.d(), cls);
    }

    public final String toString() {
        Charset charset = gme.a;
        pf pfVar = this.a;
        rf L = uf.L();
        L.o(pfVar.M());
        for (of ofVar : pfVar.R()) {
            sf L2 = tf.L();
            L2.p(ofVar.M().Q());
            L2.q(ofVar.U());
            L2.o(ofVar.P());
            L2.n(ofVar.L());
            L.n((tf) L2.i());
        }
        return ((uf) L.i()).toString();
    }

    private lle(pf pfVar, List list) {
        this.a = pfVar;
        this.b = list;
        this.c = pxe.b;
    }
}
