package defpackage;

import com.google.android.gms.internal.ads.dd;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class ume {
    private static final eue a = eue.b(new cue() { // from class: rme
        @Override // defpackage.cue
        public final Object a(ble bleVar) {
            return tye.a((qme) bleVar);
        }
    }, qme.class, qke.class);
    private static final cle b = zse.c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", qke.class, zzgus.SYMMETRIC, dd.R());
    private static final ite c = new ite() { // from class: sme
    };
    private static final gte d = new gte() { // from class: tme
        @Override // defpackage.gte
        public final ble a(ple pleVar, Integer num) {
            ane aneVar = (ane) pleVar;
            int i = ume.e;
            if (aneVar.b() != 16 && aneVar.b() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            ome omeVar = new ome(null);
            omeVar.d(aneVar);
            omeVar.c(null);
            omeVar.a(uze.c(aneVar.b()));
            omeVar.b(uze.c(aneVar.c()));
            return omeVar.e();
        }
    };
    public static final /* synthetic */ int e = 0;

    public static void a(boolean z) {
        int i = hne.f;
        hne.e(ste.d());
        pte.a().e(a);
        ote b2 = ote.b();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", are.e);
        wme wmeVar = new wme(null);
        wmeVar.a(16);
        wmeVar.c(32);
        wmeVar.e(16);
        wmeVar.d(16);
        xme xmeVar = xme.d;
        wmeVar.b(xmeVar);
        yme ymeVar = yme.d;
        wmeVar.f(ymeVar);
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", wmeVar.g());
        hashMap.put("AES256_CTR_HMAC_SHA256", are.f);
        wme wmeVar2 = new wme(null);
        wmeVar2.a(32);
        wmeVar2.c(32);
        wmeVar2.e(32);
        wmeVar2.d(16);
        wmeVar2.b(xmeVar);
        wmeVar2.f(ymeVar);
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", wmeVar2.g());
        b2.d(Collections.unmodifiableMap(hashMap));
        jte.a().b(c, ane.class);
        hte.b().c(d, ane.class);
        qse.c().f(b, 2, true);
    }
}
