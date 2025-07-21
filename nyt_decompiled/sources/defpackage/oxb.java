package defpackage;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class oxb implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public oxb(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        gxb gxbVar = (gxb) this.a.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        Set emptySet = ((JSONObject) this.c.zzb()) == null ? Collections.emptySet() : Collections.singleton(new tfc(gxbVar, kkeVar));
        d4f.b(emptySet);
        return emptySet;
    }
}
