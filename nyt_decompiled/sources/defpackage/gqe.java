package defpackage;

import com.google.android.gms.internal.ads.ag;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.wf;
import com.google.android.gms.internal.ads.xf;
import com.google.android.gms.internal.ads.zf;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
abstract class gqe {
    private static final tze a;
    private static final aue b;
    private static final wte c;
    private static final yse d;
    private static final use e;
    public static final /* synthetic */ int f = 0;

    static {
        tze a2 = bve.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        a = a2;
        b = aue.b(new yte() { // from class: cqe
            @Override // defpackage.yte
            public final sue a(ple pleVar) {
                int i = gqe.f;
                gf L = hf.L();
                L.o("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                zf L2 = ag.L();
                L2.n(((bqe) pleVar).c());
                L.p(((ag) L2.i()).f());
                L.n(zzgvz.RAW);
                return mue.b((hf) L.i());
            }
        }, bqe.class, mue.class);
        c = wte.b(new ute() { // from class: dqe
            @Override // defpackage.ute
            public final ple a(sue sueVar) {
                int i = gqe.f;
                mue mueVar = (mue) sueVar;
                if (!mueVar.c().R().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(mueVar.c().R())));
                }
                try {
                    ag O = ag.O(((mue) sueVar).c().Q(), ph.a());
                    if (mueVar.c().P() == zzgvz.RAW) {
                        return bqe.b(O.P());
                    }
                    throw new GeneralSecurityException("Only key templates with RAW are accepted, but got " + String.valueOf(mueVar.c().P()) + " with format " + String.valueOf(O));
                } catch (zzhag e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
                }
            }
        }, a2, mue.class);
        d = yse.b(new wse() { // from class: eqe
            @Override // defpackage.wse
            public final sue a(ble bleVar, dme dmeVar) {
                int i = gqe.f;
                wf M = xf.M();
                zf L = ag.L();
                L.n(((aqe) bleVar).b().c());
                M.n((ag) L.i());
                return lue.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((xf) M.i()).f(), zzgus.REMOTE, zzgvz.RAW, null);
            }
        }, aqe.class, lue.class);
        e = use.b(new sse() { // from class: fqe
            @Override // defpackage.sse
            public final ble a(sue sueVar, dme dmeVar) {
                int i = gqe.f;
                lue lueVar = (lue) sueVar;
                if (!lueVar.f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                if (lueVar.c() != zzgvz.RAW) {
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with RAW, got ".concat(String.valueOf(lueVar.c())));
                }
                try {
                    xf O = xf.O(((lue) sueVar).d(), ph.a());
                    if (O.L() == 0) {
                        return aqe.a(bqe.b(O.P().P()));
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(O));
                } catch (zzhag e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
                }
            }
        }, a2, lue.class);
    }

    public static void a(ste steVar) {
        steVar.j(b);
        steVar.i(c);
        steVar.h(d);
        steVar.g(e);
    }
}
