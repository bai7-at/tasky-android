package defpackage;

import com.google.android.gms.internal.pal.c5;
import com.google.android.gms.internal.pal.x4;
import com.google.android.gms.internal.pal.y4;
import com.google.android.gms.internal.pal.zzaby;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class vef extends kof {
    final /* synthetic */ nff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    vef(nff nffVar, Class cls) {
        super(cls);
        this.b = nffVar;
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ zx9 a(zx9 zx9Var) {
        x4 t = y4.t();
        t.k(zzaby.u(d7g.a(((c5) zx9Var).s())));
        t.l(0);
        return (y4) t.g();
    }

    @Override // defpackage.kof
    public final /* synthetic */ zx9 b(zzaby zzabyVar) {
        return c5.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.kof
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", nff.l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", nff.l(16, 3));
        hashMap.put("AES256_GCM_SIV", nff.l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", nff.l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.kof
    public final /* synthetic */ void d(zx9 zx9Var) {
        h7g.a(((c5) zx9Var).s());
    }
}
