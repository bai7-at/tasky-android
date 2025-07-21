package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class a4c implements v3f {
    private final l4f a;
    private final l4f b;

    public a4c(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new tfc((ybc) this.a.zzb(), (Executor) this.b.zzb());
    }
}
