package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.l2;
import com.google.android.gms.internal.ads.m3;
import com.google.android.gms.internal.ads.r4;
import com.google.android.gms.internal.ads.s4;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
public final class vsc implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;

    public vsc(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a = ((gob) this.a).a();
        final String zzb = ((t0d) this.b).zzb();
        zzcei a2 = ((sob) this.c).a();
        final zzbbz zzbbzVar = (zzbbz) this.d.zzb();
        final String str = (String) this.e.zzb();
        ina inaVar = new ina(new ona(a));
        r4 L = s4.L();
        L.n(a2.zzb);
        L.p(a2.zzc);
        L.o(true != a2.zzd ? 2 : 0);
        final s4 s4Var = (s4) L.i();
        inaVar.b(new hna() { // from class: usc
            @Override // defpackage.hna
            public final void a(m3 m3Var) {
                l2 l2Var = (l2) m3Var.n().l();
                l2Var.n(zzbbz.this);
                m3Var.r(l2Var);
                g3 g3Var = (g3) m3Var.o().l();
                g3Var.n(zzb);
                g3Var.o(s4Var);
                m3Var.t(g3Var);
                m3Var.u(str);
            }
        });
        return inaVar;
    }
}
