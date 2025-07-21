package defpackage;

import com.google.android.gms.internal.ads.af;
import com.google.android.gms.internal.ads.cd;
import com.google.android.gms.internal.ads.dd;
import com.google.android.gms.internal.ads.fd;
import com.google.android.gms.internal.ads.gd;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.id;
import com.google.android.gms.internal.ads.jd;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.md;
import com.google.android.gms.internal.ads.od;
import com.google.android.gms.internal.ads.pd;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.te;
import com.google.android.gms.internal.ads.ue;
import com.google.android.gms.internal.ads.we;
import com.google.android.gms.internal.ads.xe;
import com.google.android.gms.internal.ads.ze;
import com.google.android.gms.internal.ads.zzguf;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
abstract class hne {
    private static final tze a;
    private static final aue b;
    private static final wte c;
    private static final yse d;
    private static final use e;
    public static final /* synthetic */ int f = 0;

    static {
        tze a2 = bve.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        a = a2;
        b = aue.b(new yte() { // from class: dne
            @Override // defpackage.yte
            public final sue a(ple pleVar) {
                return hne.d((ane) pleVar);
            }
        }, ane.class, mue.class);
        c = wte.b(new ute() { // from class: ene
            @Override // defpackage.ute
            public final ple a(sue sueVar) {
                return hne.b((mue) sueVar);
            }
        }, a2, mue.class);
        d = yse.b(new wse() { // from class: fne
            @Override // defpackage.wse
            public final sue a(ble bleVar, dme dmeVar) {
                return hne.c((qme) bleVar, dmeVar);
            }
        }, qme.class, lue.class);
        e = use.b(new sse() { // from class: gne
            @Override // defpackage.sse
            public final ble a(sue sueVar, dme dmeVar) {
                return hne.a((lue) sueVar, dmeVar);
            }
        }, a2, lue.class);
    }

    public static /* synthetic */ qme a(lue lueVar, dme dmeVar) {
        if (!lueVar.f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            dd O = dd.O(lueVar.d(), ph.a());
            if (O.L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (O.P().L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (O.Q().L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            wme wmeVar = new wme(null);
            wmeVar.a(O.P().Q().g());
            wmeVar.c(O.Q().R().g());
            wmeVar.d(O.P().P().L());
            wmeVar.e(O.Q().Q().L());
            wmeVar.b(f(O.Q().Q().M()));
            wmeVar.f(g(lueVar.c()));
            ane g = wmeVar.g();
            ome omeVar = new ome(null);
            omeVar.d(g);
            omeVar.a(uze.b(O.P().Q().a(), dmeVar));
            omeVar.b(uze.b(O.Q().R().a(), dmeVar));
            omeVar.c(lueVar.e());
            return omeVar.e();
        } catch (zzhag unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ ane b(mue mueVar) {
        if (!mueVar.c().R().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(mueVar.c().R())));
        }
        try {
            gd N = gd.N(mueVar.c().Q(), ph.a());
            if (N.P().M() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            wme wmeVar = new wme(null);
            wmeVar.a(N.O().L());
            wmeVar.c(N.P().L());
            wmeVar.d(N.O().P().L());
            wmeVar.e(N.P().R().L());
            wmeVar.b(f(N.P().R().M()));
            wmeVar.f(g(mueVar.c().P()));
            return wmeVar.g();
        } catch (zzhag e2) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
        }
    }

    public static /* synthetic */ lue c(qme qmeVar, dme dmeVar) {
        cd M = dd.M();
        id M2 = jd.M();
        od M3 = pd.M();
        M3.n(qmeVar.a().d());
        M2.o((pd) M3.i());
        byte[] d2 = qmeVar.c().d(dmeVar);
        M2.n(zzgyl.D(d2, 0, d2.length));
        M.n((jd) M2.i());
        te M4 = ue.M();
        M4.o(h(qmeVar.a()));
        byte[] d3 = qmeVar.d().d(dmeVar);
        M4.n(zzgyl.D(d3, 0, d3.length));
        M.o((ue) M4.i());
        return lue.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((dd) M.i()).f(), zzgus.SYMMETRIC, i(qmeVar.a().g()), qmeVar.e());
    }

    public static /* synthetic */ mue d(ane aneVar) {
        gf L = hf.L();
        L.o("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        fd L2 = gd.L();
        ld M = md.M();
        od M2 = pd.M();
        M2.n(aneVar.d());
        M.o((pd) M2.i());
        M.n(aneVar.b());
        L2.n((md) M.i());
        we N = xe.N();
        N.o(h(aneVar));
        N.n(aneVar.c());
        L2.o((xe) N.i());
        L.p(((gd) L2.i()).f());
        L.n(i(aneVar.g()));
        return mue.b((hf) L.i());
    }

    public static void e(ste steVar) {
        steVar.j(b);
        steVar.i(c);
        steVar.h(d);
        steVar.g(e);
    }

    private static xme f(zzguf zzgufVar) {
        zzguf zzgufVar2 = zzguf.UNKNOWN_HASH;
        zzgvz zzgvzVar = zzgvz.UNKNOWN_PREFIX;
        int ordinal = zzgufVar.ordinal();
        if (ordinal == 1) {
            return xme.b;
        }
        if (ordinal == 2) {
            return xme.e;
        }
        if (ordinal == 3) {
            return xme.d;
        }
        if (ordinal == 4) {
            return xme.f;
        }
        if (ordinal == 5) {
            return xme.c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzgufVar.zza());
    }

    private static yme g(zzgvz zzgvzVar) {
        zzguf zzgufVar = zzguf.UNKNOWN_HASH;
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int ordinal = zzgvzVar.ordinal();
        if (ordinal == 1) {
            return yme.b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return yme.d;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return yme.c;
    }

    private static af h(ane aneVar) {
        zzguf zzgufVar;
        ze N = af.N();
        N.o(aneVar.e());
        xme f2 = aneVar.f();
        if (xme.b.equals(f2)) {
            zzgufVar = zzguf.SHA1;
        } else if (xme.c.equals(f2)) {
            zzgufVar = zzguf.SHA224;
        } else if (xme.d.equals(f2)) {
            zzgufVar = zzguf.SHA256;
        } else if (xme.e.equals(f2)) {
            zzgufVar = zzguf.SHA384;
        } else {
            if (!xme.f.equals(f2)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(f2)));
            }
            zzgufVar = zzguf.SHA512;
        }
        N.n(zzgufVar);
        return (af) N.i();
    }

    private static zzgvz i(yme ymeVar) {
        if (yme.b.equals(ymeVar)) {
            return zzgvz.TINK;
        }
        if (yme.c.equals(ymeVar)) {
            return zzgvz.CRUNCHY;
        }
        if (yme.d.equals(ymeVar)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ymeVar)));
    }
}
