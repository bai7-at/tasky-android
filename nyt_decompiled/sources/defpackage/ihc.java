package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
public final class ihc implements v3f {
    private final chc a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;

    public ihc(chc chcVar, l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4) {
        this.a = chcVar;
        this.b = l4fVar;
        this.c = l4fVar2;
        this.d = l4fVar3;
        this.e = l4fVar4;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.b.zzb();
        final zzcei a = ((sob) this.c).a();
        final v0e a2 = ((l1c) this.d).a();
        final s1e a3 = ((n6c) this.e).a();
        return new tfc(new r8c() { // from class: ahc
            @Override // defpackage.r8c
            public final void zzr() {
                dyf.u().n(context, a.zza, a2.D.toString(), a3.f);
            }
        }, pgb.f);
    }
}
