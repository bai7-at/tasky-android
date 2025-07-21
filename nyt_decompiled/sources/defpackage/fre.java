package defpackage;

import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.zzgus;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class fre {
    private static final eue a = eue.b(new cue() { // from class: cre
        @Override // defpackage.cue
        public final Object a(ble bleVar) {
            return sze.a((bre) bleVar);
        }
    }, bre.class, qke.class);
    private static final cle b = zse.c("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", qke.class, zzgus.SYMMETRIC, ng.Q());
    private static final ite c = new ite() { // from class: dre
    };
    private static final gte d = new gte() { // from class: ere
        @Override // defpackage.gte
        public final ble a(ple pleVar, Integer num) {
            int i = fre.e;
            return bre.a(((hre) pleVar).b(), uze.c(32), null);
        }
    };
    public static final /* synthetic */ int e = 0;

    public static void a(boolean z) {
        int i = dse.f;
        dse.e(ste.d());
        pte.a().e(a);
        ote b2 = ote.b();
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", hre.c(gre.b));
        hashMap.put("XCHACHA20_POLY1305_RAW", hre.c(gre.d));
        b2.d(Collections.unmodifiableMap(hashMap));
        hte.b().c(d, hre.class);
        jte.a().b(c, hre.class);
        cme.e(b, true);
    }
}
