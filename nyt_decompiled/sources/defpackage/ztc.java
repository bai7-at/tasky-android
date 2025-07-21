package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.m3;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ztc implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;

    public ztc(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String str = (String) this.a.zzb();
        Context a = ((gob) this.b).a();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        Map zzb = ((z3f) this.d).zzb();
        if (((Boolean) pla.c().a(mpa.O4)).booleanValue()) {
            ina inaVar = new ina(new ona(a));
            inaVar.b(new hna() { // from class: auc
                @Override // defpackage.hna
                public final void a(m3 m3Var) {
                    m3Var.u(str);
                }
            });
            emptySet = Collections.singleton(new tfc(new cuc(inaVar, zzb), kkeVar));
        } else {
            emptySet = Collections.emptySet();
        }
        d4f.b(emptySet);
        return emptySet;
    }
}
