package defpackage;

import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.rd;
import com.google.android.gms.internal.ads.sd;
import com.google.android.gms.internal.ads.ud;
import com.google.android.gms.internal.ads.vd;
import com.google.android.gms.internal.ads.xd;
import com.google.android.gms.internal.ads.yd;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
abstract class yne {
    private static final tze a;
    private static final aue b;
    private static final wte c;
    private static final yse d;
    private static final use e;
    public static final /* synthetic */ int f = 0;

    static {
        tze a2 = bve.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        a = a2;
        b = aue.b(new yte() { // from class: une
            @Override // defpackage.yte
            public final sue a(ple pleVar) {
                return yne.d((tne) pleVar);
            }
        }, tne.class, mue.class);
        c = wte.b(new ute() { // from class: vne
            @Override // defpackage.ute
            public final ple a(sue sueVar) {
                return yne.b((mue) sueVar);
            }
        }, a2, mue.class);
        d = yse.b(new wse() { // from class: wne
            @Override // defpackage.wse
            public final sue a(ble bleVar, dme dmeVar) {
                return yne.c((lne) bleVar, dmeVar);
            }
        }, lne.class, lue.class);
        e = use.b(new sse() { // from class: xne
            @Override // defpackage.sse
            public final ble a(sue sueVar, dme dmeVar) {
                return yne.a((lue) sueVar, dmeVar);
            }
        }, a2, lue.class);
    }

    public static /* synthetic */ lne a(lue lueVar, dme dmeVar) {
        if (!lueVar.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            sd O = sd.O(lueVar.d(), ph.a());
            if (O.L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            qne qneVar = new qne(null);
            qneVar.b(O.Q().g());
            qneVar.a(O.P().L());
            qneVar.c(16);
            qneVar.d(f(lueVar.c()));
            tne e2 = qneVar.e();
            jne jneVar = new jne(null);
            jneVar.c(e2);
            jneVar.b(uze.b(O.Q().a(), dmeVar));
            jneVar.a(lueVar.e());
            return jneVar.d();
        } catch (zzhag unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ tne b(mue mueVar) {
        if (!mueVar.c().R().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(mueVar.c().R())));
        }
        try {
            vd O = vd.O(mueVar.c().Q(), ph.a());
            qne qneVar = new qne(null);
            qneVar.b(O.L());
            qneVar.a(O.P().L());
            qneVar.c(16);
            qneVar.d(f(mueVar.c().P()));
            return qneVar.e();
        } catch (zzhag e2) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e2);
        }
    }

    public static /* synthetic */ lue c(lne lneVar, dme dmeVar) {
        rd M = sd.M();
        M.o(g(lneVar.a()));
        byte[] d2 = lneVar.c().d(dmeVar);
        M.n(zzgyl.D(d2, 0, d2.length));
        return lue.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((sd) M.i()).f(), zzgus.SYMMETRIC, h(lneVar.a().d()), lneVar.d());
    }

    public static /* synthetic */ mue d(tne tneVar) {
        gf L = hf.L();
        L.o("type.googleapis.com/google.crypto.tink.AesEaxKey");
        ud M = vd.M();
        M.o(g(tneVar));
        M.n(tneVar.c());
        L.p(((vd) M.i()).f());
        L.n(h(tneVar.d()));
        return mue.b((hf) L.i());
    }

    public static void e(ste steVar) {
        steVar.j(b);
        steVar.i(c);
        steVar.h(d);
        steVar.g(e);
    }

    private static rne f(zzgvz zzgvzVar) {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int ordinal = zzgvzVar.ordinal();
        if (ordinal == 1) {
            return rne.b;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return rne.d;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return rne.c;
    }

    private static yd g(tne tneVar) {
        xd M = yd.M();
        M.n(tneVar.b());
        return (yd) M.i();
    }

    private static zzgvz h(rne rneVar) {
        if (rne.b.equals(rneVar)) {
            return zzgvz.TINK;
        }
        if (rne.c.equals(rneVar)) {
            return zzgvz.CRUNCHY;
        }
        if (rne.d.equals(rneVar)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(rneVar)));
    }
}
