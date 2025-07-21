package defpackage;

import com.google.android.gms.internal.ads.he;
import com.google.android.gms.internal.ads.zzgus;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes3.dex */
public abstract class voe {
    private static final eue a = eue.b(new cue() { // from class: soe
        @Override // defpackage.cue
        public final Object a(ble bleVar) {
            return fse.a((roe) bleVar);
        }
    }, roe.class, qke.class);
    private static final gte b = new gte() { // from class: toe
        @Override // defpackage.gte
        public final ble a(ple pleVar, Integer num) {
            ape apeVar = (ape) pleVar;
            poe poeVar = new poe(null);
            poeVar.c(apeVar);
            poeVar.a(null);
            poeVar.b(uze.c(apeVar.b()));
            return poeVar.d();
        }
    };
    private static final ite c = new ite() { // from class: uoe
    };
    private static final cle d = zse.c("type.googleapis.com/google.crypto.tink.AesGcmSivKey", qke.class, zzgus.SYMMETRIC, he.Q());

    public static void a(boolean z) {
        int i = hpe.f;
        hpe.e(ste.d());
        if (b()) {
            pte.a().e(a);
            ote b2 = ote.b();
            HashMap hashMap = new HashMap();
            xoe xoeVar = new xoe(null);
            xoeVar.a(16);
            yoe yoeVar = yoe.b;
            xoeVar.b(yoeVar);
            hashMap.put("AES128_GCM_SIV", xoeVar.c());
            xoe xoeVar2 = new xoe(null);
            xoeVar2.a(16);
            yoe yoeVar2 = yoe.d;
            xoeVar2.b(yoeVar2);
            hashMap.put("AES128_GCM_SIV_RAW", xoeVar2.c());
            xoe xoeVar3 = new xoe(null);
            xoeVar3.a(32);
            xoeVar3.b(yoeVar);
            hashMap.put("AES256_GCM_SIV", xoeVar3.c());
            xoe xoeVar4 = new xoe(null);
            xoeVar4.a(32);
            xoeVar4.b(yoeVar2);
            hashMap.put("AES256_GCM_SIV_RAW", xoeVar4.c());
            b2.d(Collections.unmodifiableMap(hashMap));
            jte.a().b(c, ape.class);
            hte.b().c(b, ape.class);
            cme.e(d, true);
        }
    }

    private static boolean b() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
