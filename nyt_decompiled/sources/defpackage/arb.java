package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
final class arb implements bxd {
    private final Context a;
    private final zzq b;
    private final String c;
    private final gqb d;
    private final arb e = this;
    private final e4f f;
    private final e4f g;
    private final e4f h;
    private final e4f i;
    private final e4f j;
    private final e4f k;

    /* synthetic */ arb(gqb gqbVar, Context context, String str, zzq zzqVar, zqb zqbVar) {
        e4f e4fVar;
        e4f e4fVar2;
        e4f e4fVar3;
        this.d = gqbVar;
        this.a = context;
        this.b = zzqVar;
        this.c = str;
        v3f a = w3f.a(context);
        this.f = a;
        v3f a2 = w3f.a(zzqVar);
        this.g = a2;
        e4fVar = gqbVar.o;
        e4f b = u3f.b(new zhd(e4fVar));
        this.h = b;
        e4f b2 = u3f.b(eid.a());
        this.i = b2;
        e4f b3 = u3f.b(pcc.a());
        this.j = b3;
        e4fVar2 = gqbVar.p;
        e4fVar3 = gqbVar.V;
        this.k = u3f.b(new wwd(a, e4fVar2, a2, e4fVar3, b, b2, u1e.a(), b3));
    }

    @Override // defpackage.bxd
    public final ahd zza() {
        dob dobVar;
        e4f e4fVar;
        vwd vwdVar = (vwd) this.k.zzb();
        yhd yhdVar = (yhd) this.h.zzb();
        dobVar = this.d.b;
        zzcei d = dobVar.d();
        d4f.b(d);
        e4fVar = this.d.a0;
        return new ahd(this.a, this.b, this.c, vwdVar, yhdVar, d, (zuc) e4fVar.zzb());
    }
}
