package defpackage;

import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.he;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.ke;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
abstract class hpe {
    private static final tze a;
    private static final aue b;
    private static final wte c;
    private static final yse d;
    private static final use e;
    public static final /* synthetic */ int f = 0;

    static {
        tze a2 = bve.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        a = a2;
        b = aue.b(new yte() { // from class: bpe
            @Override // defpackage.yte
            public final sue a(ple pleVar) {
                return hpe.d((ape) pleVar);
            }
        }, ape.class, mue.class);
        c = wte.b(new ute() { // from class: cpe
            @Override // defpackage.ute
            public final ple a(sue sueVar) {
                return hpe.b((mue) sueVar);
            }
        }, a2, mue.class);
        d = yse.b(new wse() { // from class: dpe
            @Override // defpackage.wse
            public final sue a(ble bleVar, dme dmeVar) {
                return hpe.c((roe) bleVar, dmeVar);
            }
        }, roe.class, lue.class);
        e = use.b(new sse() { // from class: epe
            @Override // defpackage.sse
            public final ble a(sue sueVar, dme dmeVar) {
                return hpe.a((lue) sueVar, dmeVar);
            }
        }, a2, lue.class);
    }

    public static /* synthetic */ roe a(lue lueVar, dme dmeVar) {
        if (!lueVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            he O = he.O(lueVar.d(), ph.a());
            if (O.L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            xoe xoeVar = new xoe(null);
            xoeVar.a(O.P().g());
            xoeVar.b(f(lueVar.c()));
            ape c2 = xoeVar.c();
            poe poeVar = new poe(null);
            poeVar.c(c2);
            poeVar.b(uze.b(O.P().a(), dmeVar));
            poeVar.a(lueVar.e());
            return poeVar.d();
        } catch (zzhag unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ ape b(mue mueVar) {
        if (!mueVar.c().R().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(mueVar.c().R())));
        }
        try {
            ke P = ke.P(mueVar.c().Q(), ph.a());
            if (P.M() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            xoe xoeVar = new xoe(null);
            xoeVar.a(P.L());
            xoeVar.b(f(mueVar.c().P()));
            return xoeVar.c();
        } catch (zzhag e2) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
        }
    }

    public static /* synthetic */ lue c(roe roeVar, dme dmeVar) {
        ge M = he.M();
        byte[] d2 = roeVar.c().d(dmeVar);
        M.n(zzgyl.D(d2, 0, d2.length));
        return lue.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((he) M.i()).f(), zzgus.SYMMETRIC, g(roeVar.a().c()), roeVar.d());
    }

    public static /* synthetic */ mue d(ape apeVar) {
        gf L = hf.L();
        L.o("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        je N = ke.N();
        N.n(apeVar.b());
        L.p(((ke) N.i()).f());
        L.n(g(apeVar.c()));
        return mue.b((hf) L.i());
    }

    public static void e(ste steVar) {
        steVar.j(b);
        steVar.i(c);
        steVar.h(d);
        steVar.g(e);
    }

    private static yoe f(zzgvz zzgvzVar) {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int ordinal = zzgvzVar.ordinal();
        if (ordinal == 1) {
            return yoe.b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return yoe.d;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return yoe.c;
    }

    private static zzgvz g(yoe yoeVar) {
        if (yoe.b.equals(yoeVar)) {
            return zzgvz.TINK;
        }
        if (yoe.c.equals(yoeVar)) {
            return zzgvz.CRUNCHY;
        }
        if (yoe.d.equals(yoeVar)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(yoeVar)));
    }
}
