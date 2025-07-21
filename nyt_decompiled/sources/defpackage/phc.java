package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class phc implements v3f {
    private final chc a;
    private final l4f b;

    public phc(chc chcVar, l4f l4fVar) {
        this.a = chcVar;
        this.b = l4fVar;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set f = this.a.f((t4c) this.b.zzb());
        d4f.b(f);
        return f;
    }
}
