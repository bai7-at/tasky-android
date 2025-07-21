package defpackage;

import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.zzflg;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class h1a implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public h1a(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((s6) this.a.zzb()).b(zzflg.GENERATE_SIGNALS, ((b6c) this.c).zzb().c()).f(((d5a) this.b).zzb()).i(((Integer) pla.c().a(mpa.x5)).intValue(), TimeUnit.SECONDS).a();
    }
}
