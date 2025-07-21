package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class dhc implements v3f {
    private final chc a;
    private final l4f b;

    public dhc(chc chcVar, l4f l4fVar) {
        this.a = chcVar;
        this.b = l4fVar;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new tfc((t4c) this.b.zzb(), pgb.f));
        d4f.b(singleton);
        return singleton;
    }
}
