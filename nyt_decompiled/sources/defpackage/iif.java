package defpackage;

import com.google.android.gms.internal.pal.e5;
import com.google.android.gms.internal.pal.f5;
import com.google.android.gms.internal.pal.h5;
import com.google.android.gms.internal.pal.i5;
import com.google.android.gms.internal.pal.zzaby;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class iif extends kof {
    final /* synthetic */ lif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    iif(lif lifVar, Class cls) {
        super(cls);
        this.b = lifVar;
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ zx9 a(zx9 zx9Var) {
        e5 t = f5.t();
        t.k(zzaby.u(d7g.a(((i5) zx9Var).s())));
        t.l(0);
        return (f5) t.g();
    }

    @Override // defpackage.kof
    public final /* synthetic */ zx9 b(zzaby zzabyVar) {
        return i5.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.kof
    public final Map c() {
        HashMap hashMap = new HashMap();
        h5 t = i5.t();
        t.k(64);
        hashMap.put("AES256_SIV", new hof((i5) t.g(), 1));
        h5 t2 = i5.t();
        t2.k(64);
        hashMap.put("AES256_SIV_RAW", new hof((i5) t2.g(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ void d(zx9 zx9Var) {
        i5 i5Var = (i5) zx9Var;
        if (i5Var.s() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + i5Var.s() + ". Valid keys must have 64 bytes.");
    }
}
