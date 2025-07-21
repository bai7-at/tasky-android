package defpackage;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class i3c implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;

    public i3c(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new h3c((Clock) this.a.zzb(), (j3c) this.b.zzb(), ((n6c) this.c).a(), (String) this.d.zzb());
    }
}
