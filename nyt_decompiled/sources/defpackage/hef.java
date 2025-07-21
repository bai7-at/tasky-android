package defpackage;

import com.google.android.gms.internal.pal.a4;
import com.google.android.gms.internal.pal.k6;
import com.google.android.gms.internal.pal.s3;
import com.google.android.gms.internal.pal.t3;
import com.google.android.gms.internal.pal.w3;
import com.google.android.gms.internal.pal.zzaby;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class hef extends kof {
    final /* synthetic */ ief b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hef(ief iefVar, Class cls) {
        super(cls);
        this.b = iefVar;
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ zx9 a(zx9 zx9Var) {
        w3 w3Var = (w3) zx9Var;
        new mef();
        a4 g = kef.g(w3Var.v());
        zx9 a = new auf().a().a(w3Var.w());
        s3 t = t3.t();
        t.k(g);
        t.l((k6) a);
        t.m(0);
        return (t3) t.g();
    }

    @Override // defpackage.kof
    public final /* synthetic */ zx9 b(zzaby zzabyVar) {
        return w3.u(zzabyVar, ev9.a());
    }

    @Override // defpackage.kof
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", ief.k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", ief.k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", ief.k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", ief.k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ void d(zx9 zx9Var) {
        w3 w3Var = (w3) zx9Var;
        ((kef) new mef().a()).d(w3Var.v());
        new auf().a().d(w3Var.w());
        h7g.a(w3Var.v().s());
    }
}
