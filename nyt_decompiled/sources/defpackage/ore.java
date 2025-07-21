package defpackage;

import com.google.android.gms.internal.ads.ae;
import com.google.android.gms.internal.ads.be;
import com.google.android.gms.internal.ads.de;
import com.google.android.gms.internal.ads.ee;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class ore {
    private static final tze a;
    private static final aue b;
    private static final wte c;
    private static final yse d;
    private static final use e;
    public static final /* synthetic */ int f = 0;

    static {
        tze a2 = bve.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        a = a2;
        b = aue.b(new yte() { // from class: ire
            @Override // defpackage.yte
            public final sue a(ple pleVar) {
                return ore.d((noe) pleVar);
            }
        }, noe.class, mue.class);
        c = wte.b(new ute() { // from class: lre
            @Override // defpackage.ute
            public final ple a(sue sueVar) {
                return ore.b((mue) sueVar);
            }
        }, a2, mue.class);
        d = yse.b(new wse() { // from class: mre
            @Override // defpackage.wse
            public final sue a(ble bleVar, dme dmeVar) {
                return ore.c((coe) bleVar, dmeVar);
            }
        }, coe.class, lue.class);
        e = use.b(new sse() { // from class: nre
            @Override // defpackage.sse
            public final ble a(sue sueVar, dme dmeVar) {
                return ore.a((lue) sueVar, dmeVar);
            }
        }, a2, lue.class);
    }

    public static /* synthetic */ coe a(lue lueVar, dme dmeVar) {
        if (!lueVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            be O = be.O(lueVar.d(), ph.a());
            if (O.L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            koe c2 = noe.c();
            c2.b(O.P().g());
            c2.a(12);
            c2.c(16);
            c2.d(f(lueVar.c()));
            noe e2 = c2.e();
            aoe a2 = coe.a();
            a2.c(e2);
            a2.b(uze.b(O.P().a(), dmeVar));
            a2.a(lueVar.e());
            return a2.d();
        } catch (zzhag unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ noe b(mue mueVar) {
        if (!mueVar.c().R().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(mueVar.c().R())));
        }
        try {
            ee P = ee.P(mueVar.c().Q(), ph.a());
            if (P.M() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            koe c2 = noe.c();
            c2.b(P.L());
            c2.a(12);
            c2.c(16);
            c2.d(f(mueVar.c().P()));
            return c2.e();
        } catch (zzhag e2) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e2);
        }
    }

    public static /* synthetic */ lue c(coe coeVar, dme dmeVar) {
        ae M = be.M();
        byte[] d2 = coeVar.d().d(dmeVar);
        M.n(zzgyl.D(d2, 0, d2.length));
        return lue.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((be) M.i()).f(), zzgus.SYMMETRIC, g(coeVar.b().d()), coeVar.e());
    }

    public static /* synthetic */ mue d(noe noeVar) {
        gf L = hf.L();
        L.o("type.googleapis.com/google.crypto.tink.AesGcmKey");
        de N = ee.N();
        N.n(noeVar.b());
        L.p(((ee) N.i()).f());
        L.n(g(noeVar.d()));
        return mue.b((hf) L.i());
    }

    public static void e(ste steVar) {
        steVar.j(b);
        steVar.i(c);
        steVar.h(d);
        steVar.g(e);
    }

    private static loe f(zzgvz zzgvzVar) {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int ordinal = zzgvzVar.ordinal();
        if (ordinal == 1) {
            return loe.b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return loe.d;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return loe.c;
    }

    private static zzgvz g(loe loeVar) {
        if (loe.b.equals(loeVar)) {
            return zzgvz.TINK;
        }
        if (loe.c.equals(loeVar)) {
            return zzgvz.CRUNCHY;
        }
        if (loe.d.equals(loeVar)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(loeVar)));
    }
}
