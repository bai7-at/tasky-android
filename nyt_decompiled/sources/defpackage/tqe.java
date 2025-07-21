package defpackage;

import com.google.android.gms.internal.ads.cg;
import com.google.android.gms.internal.ads.dg;
import com.google.android.gms.internal.ads.fg;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.gg;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class tqe {
    private static final tze a;
    private static final aue b;
    private static final wte c;
    private static final yse d;
    private static final use e;
    public static final /* synthetic */ int f = 0;

    static {
        tze a2 = bve.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        a = a2;
        b = aue.b(new yte() { // from class: pqe
            @Override // defpackage.yte
            public final sue a(ple pleVar) {
                return tqe.d((oqe) pleVar);
            }
        }, oqe.class, mue.class);
        c = wte.b(new ute() { // from class: qqe
            @Override // defpackage.ute
            public final ple a(sue sueVar) {
                return tqe.b((mue) sueVar);
            }
        }, a2, mue.class);
        d = yse.b(new wse() { // from class: rqe
            @Override // defpackage.wse
            public final sue a(ble bleVar, dme dmeVar) {
                return tqe.c((jqe) bleVar, dmeVar);
            }
        }, jqe.class, lue.class);
        e = use.b(new sse() { // from class: sqe
            @Override // defpackage.sse
            public final ble a(sue sueVar, dme dmeVar) {
                return tqe.a((lue) sueVar, dmeVar);
            }
        }, a2, lue.class);
    }

    public static /* synthetic */ jqe a(lue lueVar, dme dmeVar) {
        if (!lueVar.f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            dg O = dg.O(lueVar.d(), ph.a());
            if (lueVar.c() != zzgvz.RAW) {
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with OutputPrefixType RAW, got " + String.valueOf(O));
            }
            if (O.L() == 0) {
                return jqe.a(f(O.P()));
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(O));
        } catch (zzhag e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
        }
    }

    public static /* synthetic */ oqe b(mue mueVar) {
        if (!mueVar.c().R().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(mueVar.c().R())));
        }
        try {
            return f(gg.P(mueVar.c().Q(), ph.a()));
        } catch (zzhag e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    public static /* synthetic */ lue c(jqe jqeVar, dme dmeVar) {
        cg M = dg.M();
        M.n(g(jqeVar.b()));
        return lue.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((dg) M.i()).f(), zzgus.REMOTE, zzgvz.RAW, null);
    }

    public static /* synthetic */ mue d(oqe oqeVar) {
        gf L = hf.L();
        L.o("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        L.p(g(oqeVar).f());
        L.n(zzgvz.RAW);
        return mue.b((hf) L.i());
    }

    public static void e(ste steVar) {
        steVar.j(b);
        steVar.i(c);
        steVar.h(d);
        steVar.g(e);
    }

    private static oqe f(gg ggVar) {
        mqe mqeVar;
        gf L = hf.L();
        L.o(ggVar.L().R());
        L.p(ggVar.L().Q());
        L.n(zzgvz.RAW);
        ple a2 = fme.a(((hf) L.i()).i());
        if (a2 instanceof noe) {
            mqeVar = mqe.b;
        } else if (a2 instanceof npe) {
            mqeVar = mqe.d;
        } else if (a2 instanceof hre) {
            mqeVar = mqe.c;
        } else if (a2 instanceof ane) {
            mqeVar = mqe.e;
        } else if (a2 instanceof tne) {
            mqeVar = mqe.f;
        } else {
            if (!(a2 instanceof ape)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(a2.toString()));
            }
            mqeVar = mqe.g;
        }
        lqe lqeVar = new lqe(null);
        lqeVar.c(ggVar.Q());
        lqeVar.a((jme) a2);
        lqeVar.b(mqeVar);
        return lqeVar.d();
    }

    private static gg g(oqe oqeVar) {
        try {
            hf O = hf.O(fme.b(oqeVar.b()), ph.a());
            fg M = gg.M();
            M.o(oqeVar.c());
            M.n(O);
            return (gg) M.i();
        } catch (zzhag e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }
}
