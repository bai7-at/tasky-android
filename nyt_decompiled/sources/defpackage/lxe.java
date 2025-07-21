package defpackage;

import com.google.android.gms.internal.ads.af;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.hf;
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
public abstract class lxe {
    private static final tze a;
    private static final nse b;
    private static final nse c;
    private static final aue d;
    private static final wte e;
    private static final yse f;
    private static final use g;
    public static final /* synthetic */ int h = 0;

    static {
        tze a2 = bve.a("type.googleapis.com/google.crypto.tink.HmacKey");
        a = a2;
        jse a3 = nse.a();
        a3.a(zzgvz.RAW, mwe.e);
        a3.a(zzgvz.TINK, mwe.b);
        a3.a(zzgvz.LEGACY, mwe.d);
        a3.a(zzgvz.CRUNCHY, mwe.c);
        b = a3.b();
        jse a4 = nse.a();
        a4.a(zzguf.SHA1, lwe.b);
        a4.a(zzguf.SHA224, lwe.c);
        a4.a(zzguf.SHA256, lwe.d);
        a4.a(zzguf.SHA384, lwe.e);
        a4.a(zzguf.SHA512, lwe.f);
        c = a4.b();
        d = aue.b(new yte() { // from class: hxe
            @Override // defpackage.yte
            public final sue a(ple pleVar) {
                return lxe.b((owe) pleVar);
            }
        }, owe.class, mue.class);
        e = wte.b(new ute() { // from class: ixe
            @Override // defpackage.ute
            public final ple a(sue sueVar) {
                return lxe.d((mue) sueVar);
            }
        }, a2, mue.class);
        f = yse.b(new wse() { // from class: jxe
            @Override // defpackage.wse
            public final sue a(ble bleVar, dme dmeVar) {
                return lxe.a((dwe) bleVar, dmeVar);
            }
        }, dwe.class, lue.class);
        g = use.b(new sse() { // from class: kxe
            @Override // defpackage.sse
            public final ble a(sue sueVar, dme dmeVar) {
                return lxe.c((lue) sueVar, dmeVar);
            }
        }, a2, lue.class);
    }

    public static /* synthetic */ lue a(dwe dweVar, dme dmeVar) {
        te M = ue.M();
        M.o(f(dweVar.d()));
        byte[] d2 = dweVar.e().d(dmeVar);
        M.n(zzgyl.D(d2, 0, d2.length));
        return lue.a("type.googleapis.com/google.crypto.tink.HmacKey", ((ue) M.i()).f(), zzgus.SYMMETRIC, (zzgvz) b.b(dweVar.d().g()), dweVar.f());
    }

    public static /* synthetic */ mue b(owe oweVar) {
        gf L = hf.L();
        L.o("type.googleapis.com/google.crypto.tink.HmacKey");
        we N = xe.N();
        N.o(f(oweVar));
        N.n(oweVar.c());
        L.p(((xe) N.i()).f());
        L.n((zzgvz) b.b(oweVar.g()));
        return mue.b((hf) L.i());
    }

    public static /* synthetic */ dwe c(lue lueVar, dme dmeVar) {
        if (!lueVar.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            ue P = ue.P(lueVar.d(), ph.a());
            if (P.L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            kwe e2 = owe.e();
            e2.b(P.R().g());
            e2.c(P.Q().L());
            e2.a((lwe) c.c(P.Q().M()));
            e2.d((mwe) b.c(lueVar.c()));
            owe e3 = e2.e();
            bwe c2 = dwe.c();
            c2.c(e3);
            c2.b(uze.b(P.R().a(), dmeVar));
            c2.a(lueVar.e());
            return c2.d();
        } catch (zzhag | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ owe d(mue mueVar) {
        if (!mueVar.c().R().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(mueVar.c().R())));
        }
        try {
            xe Q = xe.Q(mueVar.c().Q(), ph.a());
            if (Q.M() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + Q.M());
            }
            kwe e2 = owe.e();
            e2.b(Q.L());
            e2.c(Q.R().L());
            e2.a((lwe) c.c(Q.R().M()));
            e2.d((mwe) b.c(mueVar.c().P()));
            return e2.e();
        } catch (zzhag e3) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e3);
        }
    }

    public static void e(ste steVar) {
        steVar.j(d);
        steVar.i(e);
        steVar.h(f);
        steVar.g(g);
    }

    private static af f(owe oweVar) {
        ze N = af.N();
        N.o(oweVar.b());
        N.n((zzguf) c.b(oweVar.f()));
        return (af) N.i();
    }
}
