package defpackage;

import com.google.android.gms.internal.ads.ue;
import com.google.android.gms.internal.ads.zzgus;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class iwe {
    private static final eue a = eue.b(new cue() { // from class: ewe
        @Override // defpackage.cue
        public final Object a(ble bleVar) {
            return new gxe((dwe) bleVar);
        }
    }, dwe.class, wve.class);
    private static final eue b = eue.b(new cue() { // from class: fwe
        @Override // defpackage.cue
        public final Object a(ble bleVar) {
            return qze.b((dwe) bleVar);
        }
    }, dwe.class, ole.class);
    private static final cle c = zse.c("type.googleapis.com/google.crypto.tink.HmacKey", ole.class, zzgus.SYMMETRIC, ue.S());
    private static final ite d = new ite() { // from class: gwe
    };
    private static final gte e = new gte() { // from class: hwe
        @Override // defpackage.gte
        public final ble a(ple pleVar, Integer num) {
            owe oweVar = (owe) pleVar;
            bwe bweVar = new bwe(null);
            bweVar.c(oweVar);
            bweVar.b(uze.c(oweVar.c()));
            bweVar.a(null);
            return bweVar.d();
        }
    };

    public static void a(boolean z) {
        int i = lxe.h;
        lxe.e(ste.d());
        pte.a().e(a);
        pte.a().e(b);
        ote b2 = ote.b();
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", dxe.a);
        kwe kweVar = new kwe(null);
        kweVar.b(32);
        kweVar.c(16);
        mwe mweVar = mwe.e;
        kweVar.d(mweVar);
        lwe lweVar = lwe.d;
        kweVar.a(lweVar);
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", kweVar.e());
        kwe kweVar2 = new kwe(null);
        kweVar2.b(32);
        kweVar2.c(32);
        mwe mweVar2 = mwe.b;
        kweVar2.d(mweVar2);
        kweVar2.a(lweVar);
        hashMap.put("HMAC_SHA256_256BITTAG", kweVar2.e());
        kwe kweVar3 = new kwe(null);
        kweVar3.b(32);
        kweVar3.c(32);
        kweVar3.d(mweVar);
        kweVar3.a(lweVar);
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", kweVar3.e());
        kwe kweVar4 = new kwe(null);
        kweVar4.b(64);
        kweVar4.c(16);
        kweVar4.d(mweVar2);
        lwe lweVar2 = lwe.f;
        kweVar4.a(lweVar2);
        hashMap.put("HMAC_SHA512_128BITTAG", kweVar4.e());
        kwe kweVar5 = new kwe(null);
        kweVar5.b(64);
        kweVar5.c(16);
        kweVar5.d(mweVar);
        kweVar5.a(lweVar2);
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", kweVar5.e());
        kwe kweVar6 = new kwe(null);
        kweVar6.b(64);
        kweVar6.c(32);
        kweVar6.d(mweVar2);
        kweVar6.a(lweVar2);
        hashMap.put("HMAC_SHA512_256BITTAG", kweVar6.e());
        kwe kweVar7 = new kwe(null);
        kweVar7.b(64);
        kweVar7.c(32);
        kweVar7.d(mweVar);
        kweVar7.a(lweVar2);
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", kweVar7.e());
        hashMap.put("HMAC_SHA512_512BITTAG", dxe.d);
        kwe kweVar8 = new kwe(null);
        kweVar8.b(64);
        kweVar8.c(64);
        kweVar8.d(mweVar);
        kweVar8.a(lweVar2);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", kweVar8.e());
        b2.d(Collections.unmodifiableMap(hashMap));
        hte.b().c(e, owe.class);
        jte.a().b(d, owe.class);
        qse.c().f(c, 2, true);
    }
}
