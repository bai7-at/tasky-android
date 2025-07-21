package defpackage;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* loaded from: classes3.dex */
public final class y2e implements v3f {
    private final x2e a;

    public y2e(x2e x2eVar) {
        this.a = x2eVar;
    }

    @Override // defpackage.l4f
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        d4f.b(defaultClock);
        return defaultClock;
    }
}
