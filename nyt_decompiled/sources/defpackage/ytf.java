package defpackage;

import com.google.android.gms.internal.pal.j6;
import com.google.android.gms.internal.pal.k6;
import com.google.android.gms.internal.pal.n6;
import com.google.android.gms.internal.pal.zzaby;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class ytf extends kof {
    final /* synthetic */ auf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ytf(auf aufVar, Class cls) {
        super(cls);
        this.b = aufVar;
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ zx9 a(zx9 zx9Var) {
        n6 n6Var = (n6) zx9Var;
        j6 t = k6.t();
        t.m(0);
        t.l(n6Var.x());
        t.k(zzaby.u(d7g.a(n6Var.s())));
        return (k6) t.g();
    }

    @Override // defpackage.kof
    public final /* synthetic */ zx9 b(zzaby zzabyVar) {
        return n6.w(zzabyVar, ev9.a());
    }

    @Override // defpackage.kof
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", auf.m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", auf.m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", auf.m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", auf.m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", auf.m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", auf.m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", auf.m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", auf.m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", auf.m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", auf.m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ void d(zx9 zx9Var) {
        n6 n6Var = (n6) zx9Var;
        if (n6Var.s() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        auf.n(n6Var.x());
    }
}
