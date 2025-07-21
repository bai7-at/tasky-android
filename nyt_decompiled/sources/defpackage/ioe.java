package defpackage;

import com.google.android.gms.internal.ads.be;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class ioe {
    private static final eue a = eue.b(new cue() { // from class: foe
        @Override // defpackage.cue
        public final Object a(ble bleVar) {
            return qye.a((coe) bleVar);
        }
    }, coe.class, qke.class);
    private static final cle b = zse.c("type.googleapis.com/google.crypto.tink.AesGcmKey", qke.class, zzgus.SYMMETRIC, be.Q());
    private static final ite c = new ite() { // from class: goe
    };
    private static final gte d = new gte() { // from class: hoe
        @Override // defpackage.gte
        public final ble a(ple pleVar, Integer num) {
            noe noeVar = (noe) pleVar;
            int i = ioe.e;
            if (noeVar.b() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            aoe aoeVar = new aoe(null);
            aoeVar.c(noeVar);
            aoeVar.a(null);
            aoeVar.b(uze.c(noeVar.b()));
            return aoeVar.d();
        }
    };
    public static final /* synthetic */ int e = 0;

    public static void a(boolean z) {
        int i = ore.f;
        ore.e(ste.d());
        pte.a().e(a);
        ote b2 = ote.b();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", are.a);
        koe koeVar = new koe(null);
        koeVar.a(12);
        koeVar.b(16);
        koeVar.c(16);
        loe loeVar = loe.d;
        koeVar.d(loeVar);
        hashMap.put("AES128_GCM_RAW", koeVar.e());
        hashMap.put("AES256_GCM", are.b);
        koe koeVar2 = new koe(null);
        koeVar2.a(12);
        koeVar2.b(32);
        koeVar2.c(16);
        koeVar2.d(loeVar);
        hashMap.put("AES256_GCM_RAW", koeVar2.e());
        b2.d(Collections.unmodifiableMap(hashMap));
        jte.a().b(c, noe.class);
        hte.b().c(d, noe.class);
        qse.c().f(b, 2, true);
    }
}
