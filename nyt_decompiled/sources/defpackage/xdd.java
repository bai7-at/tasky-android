package defpackage;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class xdd implements v3f {
    private final wdd a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;

    public xdd(wdd wddVar, l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4) {
        this.a = wddVar;
        this.b = l4fVar;
        this.c = l4fVar2;
        this.d = l4fVar3;
        this.e = l4fVar4;
    }

    @Override // defpackage.l4f
    public final /* synthetic */ Object zzb() {
        return this.a.a((Clock) this.b.zzb(), ((rdd) this.c).zzb(), (k9d) this.d.zzb(), (d8e) this.e.zzb());
    }
}
