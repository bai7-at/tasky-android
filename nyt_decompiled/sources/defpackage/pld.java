package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zb;

/* loaded from: classes3.dex */
public final class pld implements gqd {
    private final kxd a;

    pld(kxd kxdVar) {
        this.a = kxdVar;
    }

    final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("key_schema", this.a.a());
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 15;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        kxd kxdVar = this.a;
        fqd fqdVar = null;
        if (kxdVar != null && kxdVar.a() != null && !kxdVar.a().isEmpty()) {
            fqdVar = new fqd() { // from class: old
                @Override // defpackage.fqd
                public final void a(Object obj) {
                    pld.this.a((Bundle) obj);
                }
            };
        }
        return zb.h(fqdVar);
    }
}
