package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zb;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class pkd implements gqd {
    private final Executor a;
    private final kfb b;

    pkd(Executor executor, kfb kfbVar) {
        this.a = executor;
        this.b = kfbVar;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 10;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        if (((Boolean) pla.c().a(mpa.B2)).booleanValue()) {
            return zb.h(null);
        }
        kfb kfbVar = this.b;
        return zb.m(kfbVar.k(), new gge() { // from class: okd
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new fqd() { // from class: nkd
                    @Override // defpackage.fqd
                    public final void a(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.a);
    }
}
