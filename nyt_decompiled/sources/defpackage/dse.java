package defpackage;

import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qg;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class dse {
    private static final tze a;
    private static final aue b;
    private static final wte c;
    private static final yse d;
    private static final use e;
    public static final /* synthetic */ int f = 0;

    static {
        tze a2 = bve.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        a = a2;
        b = aue.b(new yte() { // from class: zre
            @Override // defpackage.yte
            public final sue a(ple pleVar) {
                return dse.d((hre) pleVar);
            }
        }, hre.class, mue.class);
        c = wte.b(new ute() { // from class: ase
            @Override // defpackage.ute
            public final ple a(sue sueVar) {
                return dse.b((mue) sueVar);
            }
        }, a2, mue.class);
        d = yse.b(new wse() { // from class: bse
            @Override // defpackage.wse
            public final sue a(ble bleVar, dme dmeVar) {
                return dse.c((bre) bleVar, dmeVar);
            }
        }, bre.class, lue.class);
        e = use.b(new sse() { // from class: cse
            @Override // defpackage.sse
            public final ble a(sue sueVar, dme dmeVar) {
                return dse.a((lue) sueVar, dmeVar);
            }
        }, a2, lue.class);
    }

    public static /* synthetic */ bre a(lue lueVar, dme dmeVar) {
        if (!lueVar.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            ng O = ng.O(lueVar.d(), ph.a());
            if (O.L() == 0) {
                return bre.a(f(lueVar.c()), uze.b(O.P().a(), dmeVar), lueVar.e());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhag unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ hre b(mue mueVar) {
        if (!mueVar.c().R().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(mueVar.c().R())));
        }
        try {
            if (qg.O(mueVar.c().Q(), ph.a()).L() == 0) {
                return hre.c(f(mueVar.c().P()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzhag e2) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
        }
    }

    public static /* synthetic */ lue c(bre breVar, dme dmeVar) {
        mg M = ng.M();
        byte[] d2 = breVar.d().d(dmeVar);
        M.n(zzgyl.D(d2, 0, d2.length));
        return lue.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((ng) M.i()).f(), zzgus.SYMMETRIC, g(breVar.b().b()), breVar.e());
    }

    public static /* synthetic */ mue d(hre hreVar) {
        gf L = hf.L();
        L.o("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        L.p(qg.N().f());
        L.n(g(hreVar.b()));
        return mue.b((hf) L.i());
    }

    public static void e(ste steVar) {
        steVar.j(b);
        steVar.i(c);
        steVar.h(d);
        steVar.g(e);
    }

    private static gre f(zzgvz zzgvzVar) {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int ordinal = zzgvzVar.ordinal();
        if (ordinal == 1) {
            return gre.b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return gre.d;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return gre.c;
    }

    private static zzgvz g(gre greVar) {
        if (gre.b.equals(greVar)) {
            return zzgvz.TINK;
        }
        if (gre.c.equals(greVar)) {
            return zzgvz.CRUNCHY;
        }
        if (gre.d.equals(greVar)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(greVar.toString()));
    }
}
