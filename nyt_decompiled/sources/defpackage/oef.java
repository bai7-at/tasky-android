package defpackage;

import com.google.android.gms.internal.pal.i4;
import com.google.android.gms.internal.pal.j4;
import com.google.android.gms.internal.pal.m4;
import com.google.android.gms.internal.pal.zzaby;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class oef extends kof {
    final /* synthetic */ pef b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    oef(pef pefVar, Class cls) {
        super(cls);
        this.b = pefVar;
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ zx9 a(zx9 zx9Var) {
        m4 m4Var = (m4) zx9Var;
        i4 t = j4.t();
        t.k(zzaby.u(d7g.a(m4Var.s())));
        t.l(m4Var.w());
        t.m(0);
        return (j4) t.g();
    }

    @Override // defpackage.kof
    public final /* synthetic */ zx9 b(zzaby zzabyVar) {
        return m4.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.kof
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", pef.k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", pef.k(16, 16, 3));
        hashMap.put("AES256_EAX", pef.k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", pef.k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ void d(zx9 zx9Var) {
        m4 m4Var = (m4) zx9Var;
        h7g.a(m4Var.s());
        if (m4Var.w().s() != 12 && m4Var.w().s() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
