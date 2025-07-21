package defpackage;

import com.google.android.gms.internal.ads.uc;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class jve {
    private static final gte a = new gte() { // from class: gve
        @Override // defpackage.gte
        public final ble a(ple pleVar, Integer num) {
            return jve.b((ove) pleVar, null);
        }
    };
    private static final eue b = eue.b(new cue() { // from class: hve
        @Override // defpackage.cue
        public final Object a(ble bleVar) {
            return jve.c((fve) bleVar);
        }
    }, fve.class, wve.class);
    private static final eue c = eue.b(new cue() { // from class: ive
        @Override // defpackage.cue
        public final Object a(ble bleVar) {
            return jve.a((fve) bleVar);
        }
    }, fve.class, ole.class);
    private static final cle d = zse.c("type.googleapis.com/google.crypto.tink.AesCmacKey", ole.class, zzgus.SYMMETRIC, uc.R());

    public static /* synthetic */ ole a(fve fveVar) {
        e(fveVar.c());
        return qze.a(fveVar);
    }

    public static /* synthetic */ fve b(ove oveVar, Integer num) {
        e(oveVar);
        dve dveVar = new dve(null);
        dveVar.c(oveVar);
        dveVar.a(uze.c(oveVar.c()));
        dveVar.b(null);
        return dveVar.d();
    }

    public static /* synthetic */ wve c(fve fveVar) {
        e(fveVar.c());
        return new fxe(fveVar);
    }

    public static void d(boolean z) {
        int i = vve.f;
        vve.e(ste.d());
        hte.b().c(a, ove.class);
        pte.a().e(b);
        pte.a().e(c);
        ote b2 = ote.b();
        HashMap hashMap = new HashMap();
        ove oveVar = dxe.e;
        hashMap.put("AES_CMAC", oveVar);
        hashMap.put("AES256_CMAC", oveVar);
        lve lveVar = new lve(null);
        lveVar.a(32);
        lveVar.b(16);
        lveVar.c(mve.e);
        hashMap.put("AES256_CMAC_RAW", lveVar.d());
        b2.d(Collections.unmodifiableMap(hashMap));
        cme.e(d, true);
    }

    private static void e(ove oveVar) {
        if (oveVar.c() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
