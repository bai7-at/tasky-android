package defpackage;

import com.google.android.gms.internal.pal.p8;
import com.google.android.gms.internal.pal.r8;
import com.google.android.gms.internal.pal.u8;
import com.google.android.gms.internal.pal.zzaby;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class jgf extends kof {
    final /* synthetic */ lgf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jgf(lgf lgfVar, Class cls) {
        super(cls);
        this.b = lgfVar;
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ zx9 a(zx9 zx9Var) {
        p8 t = r8.t();
        t.l(0);
        t.k(zzaby.u(d7g.a(32)));
        return (r8) t.g();
    }

    @Override // defpackage.kof
    public final /* synthetic */ zx9 b(zzaby zzabyVar) {
        return u8.u(zzabyVar, ev9.a());
    }

    @Override // defpackage.kof
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new hof(u8.t(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new hof(u8.t(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ void d(zx9 zx9Var) {
    }
}
