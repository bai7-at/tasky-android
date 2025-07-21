package defpackage;

import com.google.android.gms.internal.ads.ad;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.tc;
import com.google.android.gms.internal.ads.uc;
import com.google.android.gms.internal.ads.wc;
import com.google.android.gms.internal.ads.xc;
import com.google.android.gms.internal.ads.zc;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
abstract class vve {
    private static final tze a;
    private static final aue b;
    private static final wte c;
    private static final yse d;
    private static final use e;
    public static final /* synthetic */ int f = 0;

    static {
        tze a2 = bve.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = a2;
        b = aue.b(new yte() { // from class: rve
            @Override // defpackage.yte
            public final sue a(ple pleVar) {
                return vve.b((ove) pleVar);
            }
        }, ove.class, mue.class);
        c = wte.b(new ute() { // from class: sve
            @Override // defpackage.ute
            public final ple a(sue sueVar) {
                return vve.d((mue) sueVar);
            }
        }, a2, mue.class);
        d = yse.b(new wse() { // from class: tve
            @Override // defpackage.wse
            public final sue a(ble bleVar, dme dmeVar) {
                return vve.a((fve) bleVar, dmeVar);
            }
        }, fve.class, lue.class);
        e = use.b(new sse() { // from class: uve
            @Override // defpackage.sse
            public final ble a(sue sueVar, dme dmeVar) {
                return vve.c((lue) sueVar, dmeVar);
            }
        }, a2, lue.class);
    }

    public static /* synthetic */ lue a(fve fveVar, dme dmeVar) {
        tc M = uc.M();
        M.o(g(fveVar.c()));
        byte[] d2 = fveVar.d().d(dmeVar);
        M.n(zzgyl.D(d2, 0, d2.length));
        return lue.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((uc) M.i()).f(), zzgus.SYMMETRIC, h(fveVar.c().e()), fveVar.e());
    }

    public static /* synthetic */ mue b(ove oveVar) {
        gf L = hf.L();
        L.o("type.googleapis.com/google.crypto.tink.AesCmacKey");
        wc M = xc.M();
        M.o(g(oveVar));
        M.n(oveVar.c());
        L.p(((xc) M.i()).f());
        L.n(h(oveVar.e()));
        return mue.b((hf) L.i());
    }

    public static /* synthetic */ fve c(lue lueVar, dme dmeVar) {
        if (!lueVar.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            uc O = uc.O(lueVar.d(), ph.a());
            if (O.L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            lve lveVar = new lve(null);
            lveVar.a(O.Q().g());
            lveVar.b(O.P().L());
            lveVar.c(f(lueVar.c()));
            ove d2 = lveVar.d();
            dve dveVar = new dve(null);
            dveVar.c(d2);
            dveVar.a(uze.b(O.Q().a(), dmeVar));
            dveVar.b(lueVar.e());
            return dveVar.d();
        } catch (zzhag | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ ove d(mue mueVar) {
        if (!mueVar.c().R().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(mueVar.c().R())));
        }
        try {
            xc O = xc.O(mueVar.c().Q(), ph.a());
            lve lveVar = new lve(null);
            lveVar.a(O.L());
            lveVar.b(O.P().L());
            lveVar.c(f(mueVar.c().P()));
            return lveVar.d();
        } catch (zzhag e2) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e2);
        }
    }

    public static void e(ste steVar) {
        steVar.j(b);
        steVar.i(c);
        steVar.h(d);
        steVar.g(e);
    }

    private static mve f(zzgvz zzgvzVar) {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int ordinal = zzgvzVar.ordinal();
        if (ordinal == 1) {
            return mve.b;
        }
        if (ordinal == 2) {
            return mve.d;
        }
        if (ordinal == 3) {
            return mve.e;
        }
        if (ordinal == 4) {
            return mve.c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
    }

    private static ad g(ove oveVar) {
        zc M = ad.M();
        M.n(oveVar.b());
        return (ad) M.i();
    }

    private static zzgvz h(mve mveVar) {
        if (mve.b.equals(mveVar)) {
            return zzgvz.TINK;
        }
        if (mve.c.equals(mveVar)) {
            return zzgvz.CRUNCHY;
        }
        if (mve.e.equals(mveVar)) {
            return zzgvz.RAW;
        }
        if (mve.d.equals(mveVar)) {
            return zzgvz.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(mveVar)));
    }
}
