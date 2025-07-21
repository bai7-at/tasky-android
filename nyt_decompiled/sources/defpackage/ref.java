package defpackage;

import com.google.android.gms.internal.pal.r4;
import com.google.android.gms.internal.pal.s4;
import com.google.android.gms.internal.pal.v4;
import com.google.android.gms.internal.pal.zzaby;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class ref extends kof {
    final /* synthetic */ tef b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ref(tef tefVar, Class cls) {
        super(cls);
        this.b = tefVar;
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ zx9 a(zx9 zx9Var) {
        r4 t = s4.t();
        t.k(zzaby.u(d7g.a(((v4) zx9Var).s())));
        t.l(0);
        return (s4) t.g();
    }

    @Override // defpackage.kof
    public final /* synthetic */ zx9 b(zzaby zzabyVar) {
        return v4.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.kof
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", tef.k(16, 1));
        hashMap.put("AES128_GCM_RAW", tef.k(16, 3));
        hashMap.put("AES256_GCM", tef.k(32, 1));
        hashMap.put("AES256_GCM_RAW", tef.k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.kof
    public final /* synthetic */ void d(zx9 zx9Var) {
        h7g.a(((v4) zx9Var).s());
    }
}
