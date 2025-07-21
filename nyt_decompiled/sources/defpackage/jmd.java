package defpackage;

import com.google.android.gms.internal.ads.zzgaf;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class jmd implements v3f {
    private final l4f a;
    private final l4f b;

    public jmd(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgaf v;
        uld a = wld.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.zzb();
        if (((Boolean) pla.c().a(mpa.V3)).booleanValue()) {
            v = zzgaf.w(new iod(a, ((Integer) pla.c().a(mpa.W3)).intValue(), scheduledExecutorService));
        } else {
            v = zzgaf.v();
        }
        d4f.b(v);
        return v;
    }
}
