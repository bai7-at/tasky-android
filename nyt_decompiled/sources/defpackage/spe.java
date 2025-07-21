package defpackage;

import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.me;
import com.google.android.gms.internal.ads.ne;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
abstract class spe {
    private static final tze a;
    private static final aue b;
    private static final wte c;
    private static final yse d;
    private static final use e;
    public static final /* synthetic */ int f = 0;

    static {
        tze a2 = bve.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        a = a2;
        b = aue.b(new yte() { // from class: ope
            @Override // defpackage.yte
            public final sue a(ple pleVar) {
                return spe.d((npe) pleVar);
            }
        }, npe.class, mue.class);
        c = wte.b(new ute() { // from class: ppe
            @Override // defpackage.ute
            public final ple a(sue sueVar) {
                return spe.b((mue) sueVar);
            }
        }, a2, mue.class);
        d = yse.b(new wse() { // from class: qpe
            @Override // defpackage.wse
            public final sue a(ble bleVar, dme dmeVar) {
                return spe.c((ipe) bleVar, dmeVar);
            }
        }, ipe.class, lue.class);
        e = use.b(new sse() { // from class: rpe
            @Override // defpackage.sse
            public final ble a(sue sueVar, dme dmeVar) {
                return spe.a((lue) sueVar, dmeVar);
            }
        }, a2, lue.class);
    }

    public static /* synthetic */ ipe a(lue lueVar, dme dmeVar) {
        if (!lueVar.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            ne O = ne.O(lueVar.d(), ph.a());
            if (O.L() == 0) {
                return ipe.a(f(lueVar.c()), uze.b(O.P().a(), dmeVar), lueVar.e());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhag unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ npe b(mue mueVar) {
        if (!mueVar.c().R().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(mueVar.c().R())));
        }
        try {
            qe.N(mueVar.c().Q(), ph.a());
            return npe.c(f(mueVar.c().P()));
        } catch (zzhag e2) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e2);
        }
    }

    public static /* synthetic */ lue c(ipe ipeVar, dme dmeVar) {
        me M = ne.M();
        byte[] d2 = ipeVar.d().d(dmeVar);
        M.n(zzgyl.D(d2, 0, d2.length));
        return lue.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((ne) M.i()).f(), zzgus.SYMMETRIC, g(ipeVar.b().b()), ipeVar.e());
    }

    public static /* synthetic */ mue d(npe npeVar) {
        gf L = hf.L();
        L.o("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        L.p(qe.M().f());
        L.n(g(npeVar.b()));
        return mue.b((hf) L.i());
    }

    public static void e(ste steVar) {
        steVar.j(b);
        steVar.i(c);
        steVar.h(d);
        steVar.g(e);
    }

    private static mpe f(zzgvz zzgvzVar) {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int ordinal = zzgvzVar.ordinal();
        if (ordinal == 1) {
            return mpe.b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return mpe.d;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return mpe.c;
    }

    private static zzgvz g(mpe mpeVar) {
        if (mpe.b.equals(mpeVar)) {
            return zzgvz.TINK;
        }
        if (mpe.c.equals(mpeVar)) {
            return zzgvz.CRUNCHY;
        }
        if (mpe.d.equals(mpeVar)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(mpeVar.toString()));
    }
}
