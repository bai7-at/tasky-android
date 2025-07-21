package defpackage;

import com.google.android.gms.internal.pal.a6;
import com.google.android.gms.internal.pal.b6;
import com.google.android.gms.internal.pal.d6;
import com.google.android.gms.internal.pal.e6;
import com.google.android.gms.internal.pal.u5;
import com.google.android.gms.internal.pal.zzaby;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class ajf extends kof {
    final /* synthetic */ djf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ajf(djf djfVar, Class cls) {
        super(cls);
        this.b = djfVar;
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ zx9 a(zx9 zx9Var) {
        u5 u5Var = (u5) zx9Var;
        KeyPair c = h5g.c(h5g.k(ekf.c(u5Var.v().w().x())));
        ECPublicKey eCPublicKey = (ECPublicKey) c.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) c.getPrivate();
        ECPoint w = eCPublicKey.getW();
        d6 u = e6.u();
        u.l(0);
        u.k(u5Var.v());
        u.m(zzaby.u(w.getAffineX().toByteArray()));
        u.n(zzaby.u(w.getAffineY().toByteArray()));
        e6 e6Var = (e6) u.g();
        a6 t = b6.t();
        t.m(0);
        t.l(e6Var);
        t.k(zzaby.u(eCPrivateKey.getS().toByteArray()));
        return (b6) t.g();
    }

    @Override // defpackage.kof
    public final /* synthetic */ zx9 b(zzaby zzabyVar) {
        return u5.u(zzabyVar, ev9.a());
    }

    @Override // defpackage.kof
    public final Map c() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        xbf a = ybf.a("AES128_GCM");
        bArr = djf.e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", djf.l(4, 5, 3, a, bArr, 1));
        xbf a2 = ybf.a("AES128_GCM");
        bArr2 = djf.e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", djf.l(4, 5, 3, a2, bArr2, 3));
        xbf a3 = ybf.a("AES128_GCM");
        bArr3 = djf.e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", djf.l(4, 5, 4, a3, bArr3, 1));
        xbf a4 = ybf.a("AES128_GCM");
        bArr4 = djf.e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", djf.l(4, 5, 4, a4, bArr4, 3));
        xbf a5 = ybf.a("AES128_GCM");
        bArr5 = djf.e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", djf.l(4, 5, 4, a5, bArr5, 3));
        xbf a6 = ybf.a("AES128_CTR_HMAC_SHA256");
        bArr6 = djf.e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", djf.l(4, 5, 3, a6, bArr6, 1));
        xbf a7 = ybf.a("AES128_CTR_HMAC_SHA256");
        bArr7 = djf.e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", djf.l(4, 5, 3, a7, bArr7, 3));
        xbf a8 = ybf.a("AES128_CTR_HMAC_SHA256");
        bArr8 = djf.e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", djf.l(4, 5, 4, a8, bArr8, 1));
        xbf a9 = ybf.a("AES128_CTR_HMAC_SHA256");
        bArr9 = djf.e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", djf.l(4, 5, 4, a9, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.kof
    public final /* synthetic */ void d(zx9 zx9Var) {
        ekf.a(((u5) zx9Var).v());
    }
}
