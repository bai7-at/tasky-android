package defpackage;

import com.google.android.gms.internal.pal.j3;
import com.google.android.gms.internal.pal.k3;
import com.google.android.gms.internal.pal.m3;
import com.google.android.gms.internal.pal.n3;
import com.google.android.gms.internal.pal.p3;
import com.google.android.gms.internal.pal.q3;
import com.google.android.gms.internal.pal.zzaby;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class etf extends kof {
    etf(gtf gtfVar, Class cls) {
        super(cls);
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ zx9 a(zx9 zx9Var) {
        n3 n3Var = (n3) zx9Var;
        j3 t = k3.t();
        t.m(0);
        t.k(zzaby.u(d7g.a(n3Var.s())));
        t.l(n3Var.w());
        return (k3) t.g();
    }

    @Override // defpackage.kof
    public final /* synthetic */ zx9 b(zzaby zzabyVar) {
        return n3.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.kof
    public final Map c() {
        HashMap hashMap = new HashMap();
        m3 t = n3.t();
        t.k(32);
        p3 t2 = q3.t();
        t2.k(16);
        t.l((q3) t2.g());
        hashMap.put("AES_CMAC", new hof((n3) t.g(), 1));
        m3 t3 = n3.t();
        t3.k(32);
        p3 t4 = q3.t();
        t4.k(16);
        t3.l((q3) t4.g());
        hashMap.put("AES256_CMAC", new hof((n3) t3.g(), 1));
        m3 t5 = n3.t();
        t5.k(32);
        p3 t6 = q3.t();
        t6.k(16);
        t5.l((q3) t6.g());
        hashMap.put("AES256_CMAC_RAW", new hof((n3) t5.g(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ void d(zx9 zx9Var) {
        n3 n3Var = (n3) zx9Var;
        gtf.m(n3Var.w());
        gtf.n(n3Var.s());
    }
}
