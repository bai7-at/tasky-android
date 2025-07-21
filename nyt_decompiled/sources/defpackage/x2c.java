package defpackage;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class x2c implements v3f {
    private final l4f a;
    private final l4f b;

    public x2c(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new w2c((Clock) this.a.zzb(), (dfb) this.b.zzb());
    }
}
