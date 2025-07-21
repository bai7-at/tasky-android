package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ezb implements v3f {
    private final uyb a;
    private final l4f b;

    public ezb(uyb uybVar, l4f l4fVar) {
        this.a = uybVar;
        this.b = l4fVar;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new tfc((h0c) this.b.zzb(), pgb.f));
        d4f.b(singleton);
        return singleton;
    }
}
