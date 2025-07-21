package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class qjd implements gqd {
    private final j64 a;
    private final Executor b;

    public qjd(j64 j64Var, Executor executor) {
        this.a = j64Var;
        this.b = executor;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 6;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return zb.n(this.a, new ake() { // from class: pjd
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                final String str = (String) obj;
                return zb.h(new fqd() { // from class: ojd
                    @Override // defpackage.fqd
                    public final void a(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.b);
    }
}
