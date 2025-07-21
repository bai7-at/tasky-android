package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
public final class q4c implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public q4c(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.a.zzb();
        final zzcei a = ((sob) this.b).a();
        final s1e a2 = ((n6c) this.c).a();
        return new gge() { // from class: p4c
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                v0e v0eVar = (v0e) obj;
                rda rdaVar = new rda(context);
                rdaVar.p(v0eVar.C);
                rdaVar.q(v0eVar.D.toString());
                rdaVar.o(a.zza);
                rdaVar.n(a2.f);
                return rdaVar;
            }
        };
    }
}
