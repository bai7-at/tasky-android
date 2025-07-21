package defpackage;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zb;

/* loaded from: classes3.dex */
public final class hjd implements gqd {
    private final Clock a;
    private final s1e b;

    hjd(Clock clock, s1e s1eVar) {
        this.a = clock;
        this.b = s1eVar;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 4;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return zb.h(new ijd(this.b, this.a.currentTimeMillis()));
    }
}
