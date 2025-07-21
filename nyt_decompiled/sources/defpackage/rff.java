package defpackage;

import com.google.android.gms.internal.pal.k5;
import com.google.android.gms.internal.pal.l5;
import com.google.android.gms.internal.pal.o5;
import com.google.android.gms.internal.pal.zzaby;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class rff extends kof {
    final /* synthetic */ sff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    rff(sff sffVar, Class cls) {
        super(cls);
        this.b = sffVar;
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ zx9 a(zx9 zx9Var) {
        k5 t = l5.t();
        t.l(0);
        t.k(zzaby.u(d7g.a(32)));
        return (l5) t.g();
    }

    @Override // defpackage.kof
    public final /* synthetic */ zx9 b(zzaby zzabyVar) {
        return o5.u(zzabyVar, ev9.a());
    }

    @Override // defpackage.kof
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new hof(o5.t(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new hof(o5.t(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ void d(zx9 zx9Var) {
    }
}
