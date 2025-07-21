package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
public final class s6c implements v3f {
    private final r6c a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;

    public s6c(r6c r6cVar, l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4) {
        this.a = r6cVar;
        this.b = l4fVar;
        this.c = l4fVar2;
        this.d = l4fVar3;
        this.e = l4fVar4;
    }

    @Override // defpackage.l4f
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.b.zzb();
        zzcei a = ((sob) this.c).a();
        v0e a2 = ((l1c) this.d).a();
        hdb hdbVar = new hdb();
        zzcbp zzcbpVar = a2.B;
        if (zzcbpVar == null) {
            return null;
        }
        z0e z0eVar = a2.t;
        return new gdb(context, a, zzcbpVar, z0eVar == null ? null : z0eVar.b, hdbVar);
    }
}
