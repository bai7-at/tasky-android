package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class hnc implements v3f {
    private final anc a;
    private final l4f b;
    private final l4f c;

    public hnc(anc ancVar, l4f l4fVar, l4f l4fVar2) {
        this.a = ancVar;
        this.b = l4fVar;
        this.c = l4fVar2;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new tfc(((qqc) this.b).zzb(), (Executor) this.c.zzb());
    }
}
