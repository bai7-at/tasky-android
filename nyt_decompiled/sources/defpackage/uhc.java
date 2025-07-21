package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class uhc implements v3f {
    private final chc a;
    private final l4f b;

    public uhc(chc chcVar, l4f l4fVar) {
        this.a = chcVar;
        this.b = l4fVar;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.a.d((Executor) this.b.zzb());
    }
}
