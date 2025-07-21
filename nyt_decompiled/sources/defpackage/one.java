package defpackage;

import com.google.android.gms.internal.ads.sd;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class one {
    private static final eue a = eue.b(new cue() { // from class: mne
        @Override // defpackage.cue
        public final Object a(ble bleVar) {
            return pye.a((lne) bleVar);
        }
    }, lne.class, qke.class);
    private static final cle b = zse.c("type.googleapis.com/google.crypto.tink.AesEaxKey", qke.class, zzgus.SYMMETRIC, sd.R());
    private static final gte c = new gte() { // from class: nne
        @Override // defpackage.gte
        public final ble a(ple pleVar, Integer num) {
            tne tneVar = (tne) pleVar;
            int i = one.d;
            if (tneVar.c() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            jne jneVar = new jne(null);
            jneVar.c(tneVar);
            jneVar.a(null);
            jneVar.b(uze.c(tneVar.c()));
            return jneVar.d();
        }
    };
    public static final /* synthetic */ int d = 0;

    public static void a(boolean z) {
        int i = yne.f;
        yne.e(ste.d());
        pte.a().e(a);
        ote b2 = ote.b();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", are.c);
        qne qneVar = new qne(null);
        qneVar.a(16);
        qneVar.b(16);
        qneVar.c(16);
        rne rneVar = rne.d;
        qneVar.d(rneVar);
        hashMap.put("AES128_EAX_RAW", qneVar.e());
        hashMap.put("AES256_EAX", are.d);
        qne qneVar2 = new qne(null);
        qneVar2.a(16);
        qneVar2.b(32);
        qneVar2.c(16);
        qneVar2.d(rneVar);
        hashMap.put("AES256_EAX_RAW", qneVar2.e());
        b2.d(Collections.unmodifiableMap(hashMap));
        hte.b().c(c, tne.class);
        cme.e(b, true);
    }
}
