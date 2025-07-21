package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
public final class vbd implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;

    public vbd(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.a.zzb();
        zzcei a = ((sob) this.b).a();
        bic bicVar = (bic) this.c.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new ubd(context, a, bicVar, kkeVar);
    }
}
