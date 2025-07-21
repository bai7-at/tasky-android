package com.google.android.gms.internal.ads;

import defpackage.d4f;
import defpackage.kke;
import defpackage.l4f;
import defpackage.pgb;
import defpackage.v3f;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class t6 implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public t6(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new s6(kkeVar, (ScheduledExecutorService) this.b.zzb(), ((u6) this.c).zzb());
    }
}
