package defpackage;

import com.google.android.gms.internal.pal.a7;
import com.google.android.gms.internal.pal.c7;
import com.google.android.gms.internal.pal.d7;
import com.google.android.gms.internal.pal.u6;
import com.google.android.gms.internal.pal.z6;
import com.google.android.gms.internal.pal.zzaby;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class imf extends kof {
    final /* synthetic */ lmf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    imf(lmf lmfVar, Class cls) {
        super(cls);
        this.b = lmfVar;
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ zx9 a(zx9 zx9Var) {
        byte[] b = j7g.b();
        byte[] c = j7g.c(b);
        c7 u = d7.u();
        u.m(0);
        u.k(((u6) zx9Var).v());
        u.l(zzaby.u(c));
        d7 d7Var = (d7) u.g();
        z6 t = a7.t();
        t.m(0);
        t.l(d7Var);
        t.k(zzaby.u(b));
        return (a7) t.g();
    }

    @Override // defpackage.kof
    public final /* synthetic */ zx9 b(zzaby zzabyVar) {
        return u6.u(zzabyVar, ev9.a());
    }

    @Override // defpackage.kof
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", lmf.k(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", lmf.k(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", lmf.k(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", lmf.k(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", lmf.k(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", lmf.k(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", lmf.k(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", lmf.k(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", lmf.k(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", lmf.k(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", lmf.k(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", lmf.k(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", lmf.k(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", lmf.k(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", lmf.k(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", lmf.k(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", lmf.k(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", lmf.k(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.kof
    public final /* synthetic */ void d(zx9 zx9Var) {
        umf.a(((u6) zx9Var).v());
    }
}
