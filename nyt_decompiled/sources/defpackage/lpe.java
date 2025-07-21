package defpackage;

import com.google.android.gms.internal.ads.ne;
import com.google.android.gms.internal.ads.zzgus;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class lpe {
    private static final eue a = eue.b(new cue() { // from class: jpe
        @Override // defpackage.cue
        public final Object a(ble bleVar) {
            return sye.a((ipe) bleVar);
        }
    }, ipe.class, qke.class);
    private static final gte b = new gte() { // from class: kpe
        @Override // defpackage.gte
        public final ble a(ple pleVar, Integer num) {
            int i = lpe.d;
            return ipe.a(((npe) pleVar).b(), uze.c(32), null);
        }
    };
    private static final cle c = zse.c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", qke.class, zzgus.SYMMETRIC, ne.Q());
    public static final /* synthetic */ int d = 0;

    public static void a(boolean z) {
        int i = spe.f;
        spe.e(ste.d());
        pte.a().e(a);
        hte.b().c(b, npe.class);
        ote b2 = ote.b();
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", npe.c(mpe.b));
        hashMap.put("CHACHA20_POLY1305_RAW", npe.c(mpe.d));
        b2.d(Collections.unmodifiableMap(hashMap));
        cme.e(c, true);
    }
}
