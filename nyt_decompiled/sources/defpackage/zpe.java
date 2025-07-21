package defpackage;

import com.google.android.gms.internal.ads.dg;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class zpe {
    private static final cle a = zse.c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", qke.class, zzgus.SYMMETRIC, dg.Q());
    private static final gte b = new gte() { // from class: xpe
        @Override // defpackage.gte
        public final ble a(ple pleVar, Integer num) {
            return jqe.a((oqe) pleVar);
        }
    };
    private static final eue c = eue.b(new cue() { // from class: ype
        @Override // defpackage.cue
        public final Object a(ble bleVar) {
            jqe jqeVar = (jqe) bleVar;
            int i = zpe.d;
            try {
                hf.O(fme.b(jqeVar.b().b()), ph.a());
                nle.a(jqeVar.b().c());
                throw null;
            } catch (zzhag e) {
                throw new GeneralSecurityException("Parsing of DEK key template failed: ", e);
            }
        }
    }, jqe.class, qke.class);
    public static final /* synthetic */ int d = 0;

    public static void a(boolean z) {
        int i = tqe.f;
        tqe.e(ste.d());
        hte.b().c(b, oqe.class);
        pte.a().e(c);
        cme.e(a, true);
    }
}
