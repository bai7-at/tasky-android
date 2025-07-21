package defpackage;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class myb implements v3f {
    private final l4f a;
    private final l4f b;

    public myb(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w9c zzb() {
        return new w9c((ScheduledExecutorService) this.a.zzb(), (Clock) this.b.zzb());
    }
}
