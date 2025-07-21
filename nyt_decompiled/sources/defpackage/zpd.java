package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zb;

/* loaded from: classes3.dex */
public final class zpd implements gqd {
    private final boolean a;

    zpd(kyd kydVar) {
        this.a = kydVar != null;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 36;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return zb.h(this.a ? new fqd() { // from class: ypd
            @Override // defpackage.fqd
            public final void a(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
